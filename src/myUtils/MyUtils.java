package myUtils;

import java.awt.Component;
import java.util.Scanner;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class MyUtils {
	private static Scanner sc;

	public static boolean getDate(String date) {
		boolean cont = true;

		try {
			String patten = "^\\d{1,2}[-|/]\\d{1,2}[-|/]\\d{4}$";
			if (date.matches(patten) == true) {
				cont = false;
			} else
				throw new Exception();
		} catch (Exception e) {
		}
		return cont;
	}

	public static String getDateDialog(Component o, String msg, String result) {
		sc = new Scanner(System.in);
		try {
			String pattern = "^\\d{1,2}[-|/]\\d{1,2}[-|/]\\d{4}$";
			if (!result.matches(pattern))
				throw new Exception();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(o, msg, "Error", JOptionPane.ERROR_MESSAGE);
		}
		return result;
	}

	public static double getDouble(String welcome, double min) {
		boolean cont = true;
		System.out.print(welcome);
		double result = 0;
		do {
			try {
				result = Double.parseDouble(sc.nextLine());
				if (result < min) {
					System.out.print("Input must be large than or equal " + min + "\nInput again: ");
				} else {
					cont = false;
				}
			} catch (Exception e) {
				System.out.print("PLease input number: ");
			}
		} while (cont == true);
		return result;
	}

	public static float getFloatJtext(Component o, String msg, JTextField jText) {
		Float result = new Float(0);
		try {
			result = Float.valueOf(jText.getText());
			if(result.toString() == null) throw new Exception();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(o, msg);
		}
		return result;
	}
	
	public static Integer getIntegerJtext(Component o, String msg, JTextField jText) {
		Integer result = new Integer(0);
		try {
			result = Integer.valueOf(jText.getText());
			if(result.toString() == null) throw new Exception();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(o, msg);
		}
		return result;
	}
}
