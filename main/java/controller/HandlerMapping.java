package controller;

public class HandlerMapping {
	private static HandlerMapping instance = new HandlerMapping();
	private HandlerMapping() {}
	public static HandlerMapping getInstance() {
		return instance;
	}
	
	public Controller create(String command) {
		Controller controller = null;
		if(command.contentEquals("totalcount")) {
			controller = new TotalCountController();
		}else if(command.contentEquals("signin")) {
			controller = new SignInController();
		}else if(command.contentEquals("idcheck")) {
			controller = new CheckDuplicatedIdController();
		}else if(command.contentEquals("login")) {
			controller = new LoginController();
		}else if(command.contentEquals("logout")) {
			controller = new LogoutController();
		}
		
		return controller;
	}
}
