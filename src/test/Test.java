package test;

import javax.swing.UIManager;

import view.ManageEView;

public class Test {
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			new ManageEView();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
