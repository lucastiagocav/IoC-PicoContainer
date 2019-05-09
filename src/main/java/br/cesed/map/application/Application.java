package br.cesed.map.application;

import org.picocontainer.MutablePicoContainer;

import br.cesed.map.AppPoolWatcher;
import br.cesed.map.SMSSender;

public class Application {
	public static void main(String[] args) {
		MutablePicoContainer pico = new org.picocontainer.DefaultPicoContainer();
		pico.addComponent(SMSSender.class); 
		
		AppPoolWatcher app = new AppPoolWatcher();
		
		SMSSender sms = pico.getComponent(SMSSender.class);
		app.setNotification(sms);
		
		app.getNotification().actOnNotification();
		
	}

}
