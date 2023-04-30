package Replit.color;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Color color = new Color(in.nextInt(), in.nextInt(), in.nextInt());
        System.out.println(color);

    }






}

/*

### Colors can be represented in many ways, but a popular approach is using RGB(red, green, & blue) values. The number values of the three allow a color to be represented

### Finish the `Color` class based on the given comments so we can represent colors to the computer. Look for `todo comments`. A selection of common colors are already defined in the class as `final static int[]` variables.

There are number of ways to describe color to computers, smart phones, tablets, browsers etc.

Main topics: class & object, static, constructors, toString, array

What you will practice in this practice:

	- overloading constructors
	- this() keyword
	- comparing arrays
	- overriding toString method

Example:
```
Color color = new Color();
System.out.println(color.toString()); // prints "white"
```
Example:
```
Color color2 = new Color(255, 0, 0);
System.out.println(color2.toString()); // prints "red"
```
Example:
```
Color color3 = new Color(255, 44, 88);
System.out.println(color3.toString()); // prints "n/a"
```
Example:
```
Color color4 = new Color(192, 192, 192);
System.out.println(color4); // prints "light gray"
```


 */
