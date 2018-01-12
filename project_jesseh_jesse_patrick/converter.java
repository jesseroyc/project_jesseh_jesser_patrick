public class Converter {
//Your names go here:
/*
* @Author: Name of the first student
* Jesse Roy-Cote
* Patrick Matchett
*
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
    double F = celsiusToFahrenheit(180);
    System.out.println("180 C is \f F", F);
    
    double C = fahrenheitToCelsius(250);
    System.out.println("250 F is \f C", C);
// Call FahrenheitToCelsius to convert 250 Fahrenheit to Celsius value.
}
}
