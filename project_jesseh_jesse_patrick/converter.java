public class converter {
//Your names go here:
/*
* @Author: Name of the first student
* Jesse Roy-Cote
* Patrick Matchett
* Jesse Hooper
*/
private double celsiusToFahrenheit(double C){
	return C*(9/5)+32;
}
private double fahrenheitToCelsius(double F){
return (F - 32) / 1.8;
}
public static void main(String[] args) {
//TODO: The first student will implement this method.
// Call CelsiusToFahrenheit to convert 180 Celsius to Fahrenheit value.
	converter OBJ= new converter();

    double F= OBJ.celsiusToFahrenheit(180);
    System.out.printf("180 Celsius is %f Fahrenheit\n", F);
    
    double C = OBJ.fahrenheitToCelsius(250);
    System.out.printf("250 Fahrenheit is %f Celsius\n", C);
// Call FahrenheitToCelsius to convert 250 Fahrenheit to Celsius value.
}
}
