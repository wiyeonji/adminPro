package model;

public class adminDTO {
	private String id;
	private String password;
	private String name;
	private String no;
	
	@Override
	public String toString() {
		return "adminDTO [id=" + id + ", password=" + password + ", name=" + name + ", no=" + no + "]";
	}
	
	public adminDTO() {
		super();
	}
	
	public adminDTO(String id, String password) {
		this.id = id;
		this.password = password;
	}
	
	public adminDTO(String id, String password, String name, String no) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.no = no;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	

}
