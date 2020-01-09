package creational.DependencyInjection;

interface MessageService {
	public void sendMessage();
}

class EmailService implements MessageService {

	@Override
	public void sendMessage() {

		System.out.println("Sending email message!!!");
	}

}

class SMSService implements MessageService {

	@Override
	public void sendMessage() {

		System.out.println("Sending SMS message!!!");
	}

}