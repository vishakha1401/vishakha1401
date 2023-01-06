import javax.swing.JOptionPane;

public class UnitConverter {

	public static void main(String[] args) {
		
		String userInput = JOptionPane.showInputDialog("Enter a number, a space, and a unit: cm, in, yd, m, oz, g, lb, or kg");
		int spacePos = userInput.indexOf(" ");
		double number = Double.parseDouble(userInput.substring(0, userInput.indexOf(" ")));
		String unit = userInput.substring(spacePos+1,userInput.length()).trim();
		
		//For efficiency, the conversion factors are made as constants.
		final double CENTIMETERS = 2.54;
		final double INCHES = .3937;
		final double YARDS = 1.094;
		final double METERS = .9144;
		final double OUNCES = .0352;
		final double GRAMS = 28.34;
		final double POUNDS = 2.2;
		final double KILOGRAMS = .4535;
		
		//Defining and initializing the new converted number and unit for the output.
		double num = 0;
		String u = null;
		
		//The if statements that convert the input into the proper conversions.
		if (unit.equalsIgnoreCase("cm")){
			num = number/CENTIMETERS;
			u = "inches";
		}else if (unit.equalsIgnoreCase("in")){
			num = number/INCHES;
			u = "cm";
		}else if (unit.equalsIgnoreCase("yd")){
			num = number/YARDS;
			u = "m";
		}else if (unit.equalsIgnoreCase("m")){
			num = number/METERS;
			u = "yd";
		}else if (unit.equalsIgnoreCase("oz")){
			num = number/OUNCES;
			u = "g";
		}else if (unit.equalsIgnoreCase("g")){
			num = number/GRAMS;
			u = "oz";
		}else if (unit.equalsIgnoreCase("lb")){
			num = number/POUNDS;
			u = "kg";
		}else if (unit.equalsIgnoreCase("kg")){
			num = number/KILOGRAMS;
			u = "lb";
		}
		
		//Printing the input number/unit and the converted number/unit.
			System.out.println(number+ " " +unit+ " = " +num+ " " +u );
		}
		
	}