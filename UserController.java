package creational.DependencyInjection;

public class UserController {
	MessageService messageService;

	public UserController(MessageService messageService) {
		super();
		this.messageService = messageService;
	}
	
	public void send() {
		messageService.sendMessage();
	}
}
