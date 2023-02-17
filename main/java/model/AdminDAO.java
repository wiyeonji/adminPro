package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

//싱글톤 패턴 적용
//DBCP 사용
public class AdminDAO {
	private static AdminDAO instance = new AdminDAO();
	
	private DataSource dataSource;
	
	private AdminDAO() {
		this.dataSource = DataSourceManager.getInstance().getDataSource();

	}
	
	public static AdminDAO getInstance() {
		return instance;
	}
	
	public void closeAll(PreparedStatement pstmt, Connection conn) throws SQLException{
		if (pstmt != null)
				pstmt.close();
		if(conn != null)
				conn.close();
	}
	
	public void closeAll(ResultSet rs, PreparedStatement pstmt, Connection conn) throws SQLException{
		if(rs != null)
			rs.close();
		
		closeAll(pstmt, conn);
	}
	//회원가입
	public int totalAdminCount() throws SQLException{
		int count = 0;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = dataSource.getConnection();
			
			String sql = "SELECT COUNT(*) FROM adminpro";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				count = rs.getInt(1);
			}
		} finally {
			closeAll(rs, pstmt, conn);
		}
		return count;
	}
	
	
	public void signIn(adminDTO dto) throws SQLException{
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = dataSource.getConnection();
			String sql = "INSERT INTO adminpro VALUES (?,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getId());
			pstmt.setString(2, dto.getPassword());
			pstmt.setString(3, dto.getName());
			pstmt.setString(4, dto.getNo());
			pstmt.executeUpdate();
		}finally {
			closeAll(pstmt, conn);
		}
	}
	
	//아이디 중복확인
	public boolean checkDuplicatedId(String id) throws SQLException {
		boolean flag = true;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = dataSource.getConnection();
			String sql = "SELECT COUNT(*) FROM adminpro WHERE id=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if(rs.next() && rs.getInt(1)>0) {
			flag=false;
		}
		
	}finally {
		closeAll(rs, pstmt, conn);
	}
		return flag;
}

	public adminDTO login(adminDTO inputDTO) throws SQLException{
		adminDTO dto = null;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = dataSource.getConnection();
			String sql = "SELECT id, name, no,"
							+ "FROM adminpro"
							+ "WHERE id = ? AND password=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, inputDTO.getId());
			pstmt.setString(2, inputDTO.getPassword());
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				dto = new adminDTO(rs.getString(1), null, rs.getString(2),
						rs.getString(3));
						
			}
			
		}finally {
			closeAll(rs, pstmt, conn);
			
		}
		return dto;
	}

}

	