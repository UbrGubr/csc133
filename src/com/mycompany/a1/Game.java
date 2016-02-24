package com.mycompany.a1;

import com.codename1.ui.Form;
import com.codename1.ui.Label;
import com.codename1.ui.TextField;
import com.codename1.ui.events.ActionEvent;
import com.codename1.ui.events.ActionListener;

public class Game extends Form{
	private GameWorld gw; 
	
	public Game() {
		gw = new GameWorld(); 
		gw.initLayout();
		play(); 
	}
	
	private void play()
	{
		Label myLabel=new Label("Enter a Command:");
		this.add(myLabel);
		final TextField myTextField=new TextField();
		this.add(myTextField);
		this.show();
		myTextField.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt) {
				String sCommand=myTextField.getText().toString();
				myTextField.clear();
				switch (sCommand.charAt(0)) {
				case 'e':
					gw.expand();
					break;
					//add code to handle rest of the commands
				} //switch
			} //actionPerformed
		} //new ActionListener()
		); //addActionListener
	} //play
}
