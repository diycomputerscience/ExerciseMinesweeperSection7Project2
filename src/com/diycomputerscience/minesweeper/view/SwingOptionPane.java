package com.diycomputerscience.minesweeper.view;

import java.awt.Component;

import javax.swing.JOptionPane;

public class SwingOptionPane implements OptionPane {

	@Override
	public int userConfirmation(Component component, 
								Object message,
								String title, 
								int optionType) {
		return JOptionPane.showConfirmDialog(component, message, title, optionType);
	}

}
