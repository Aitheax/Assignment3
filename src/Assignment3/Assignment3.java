package Assignment3;

import javax.swing.JOptionPane;

public class Assignment3 {

	public static void main(String[] args) {
		String[] choices = { "Admin", "Student", "Staff" };
		String input = (String) JOptionPane.showInputDialog(null,
				"Choose account type...", "Account Type",
				JOptionPane.QUESTION_MESSAGE, null, choices, choices[1]);
		System.out.println(input);
		String AdminUser = "Admin";
		String StudentUser = "Student";
		String StaffUser = "Staff";
		String StudentPass = "Stupassword";
		String AdminPass = "Adpassword";
		String StaffPass = "Stapassword";
		String entereduname;
		String enteredpass;
		int count = 0;
	
			switch (input) {

			case "Admin":
				while (count < 3) {
					count++;
					entereduname = JOptionPane
							.showInputDialog("Enter Username");
					if (!AdminUser.equals(entereduname) && count < 3) {
						JOptionPane.showMessageDialog(null,
								"Incorrect Username");
						System.out.println(count);
					} else if (count >= 3) {
						JOptionPane.showMessageDialog(null, "Contact Admin");

					} else
						JOptionPane.showMessageDialog(null, "It Works");
					while (count < 3) {
						count++;
						enteredpass = JOptionPane
								.showInputDialog("Enter Password");
						if (!AdminPass.equals(enteredpass) && count < 3) {
							JOptionPane.showMessageDialog(null,
									"Incorrect Password");
						} else if (count >= 3) {
							JOptionPane
									.showMessageDialog(null, "Contact Admin");

						} else
							JOptionPane.showMessageDialog(null, "Welcome " + entereduname);
						break;
					}
				}
			case "Student":
				while (count < 3) {
					count++;
					entereduname = JOptionPane
							.showInputDialog("Enter Username");
					if (!StudentUser.equals(entereduname) && count < 3) {
						JOptionPane.showMessageDialog(null,
								"Incorrect Username");
						System.out.println(count);
					} else if (count >= 3) {
						JOptionPane.showMessageDialog(null, "Contact Admin");

					} else
					while (count < 3) {
						count++;
						enteredpass = JOptionPane
								.showInputDialog("Enter Password");
						if (!StudentPass.equals(enteredpass) && count < 3) {
							JOptionPane.showMessageDialog(null,
									"Incorrect Password");
						} else if (count >= 3) {
							JOptionPane
									.showMessageDialog(null, "Contact Admin");

						} else
							JOptionPane.showMessageDialog(null,"Welcome " + entereduname);
						break;
					}
				}
			case "Staff":
				while (count < 3) {
					count++;
					entereduname = JOptionPane
							.showInputDialog("Enter Username");
					if (!StaffUser.equals(entereduname) && count < 3) {
						JOptionPane.showMessageDialog(null,
								"Incorrect Username");
						System.out.println(count);
					} else if (count >= 3) {
						JOptionPane.showMessageDialog(null, "Contact Admin");

					} else
					while (count < 3) {
						count++;
						enteredpass = JOptionPane
								.showInputDialog("Enter Password");
						if (!StaffPass.equals(enteredpass) && count < 3) {
							JOptionPane.showMessageDialog(null,
									"Incorrect Password");
						} else if (count >= 3) {
							JOptionPane
									.showMessageDialog(null, "Contact Admin");

						} else
							JOptionPane.showMessageDialog(null, "Welcome "+ entereduname);
						break;
					}
				}

			}

		}
	}
