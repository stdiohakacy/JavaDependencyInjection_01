package creational.DependencyInjection;

public class Client {
	public static void main(String[] args) {
		MessageService emailService = new EmailService();
		UserController userController = new UserController(emailService);
		userController.send();
	}
}
