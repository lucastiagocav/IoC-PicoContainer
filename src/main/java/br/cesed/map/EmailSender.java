package br.cesed.map;

public class EmailSender implements INotificationAction{

	public void actOnNotification() {
		System.out.println("Novo Email");
	}

}
