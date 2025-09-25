
class Main {
	public static void main(String[] args) {
    	(new Main()).init();
	}

  void init(){
/*  
    Challenge 1:
    1) Create the variables, ask the user for the variable values, write the equation in file EQ1-act6 and display the equation value.
*/
    System.out.println("Enter X");
    double X = Input.readDouble();
    double y = 0;
    double y = Math.pow(X,7);
    System.out.println(y);


  

/*  
    Challenge 2:
    1) Create the variables, ask the user for the variable values, write the equation in fileEQ1.1-act6 and display the equation value.
*/
    System.out.println("enter Z");
    double Z = Input.readDouble();
    double z = 0;
    double q = Math.pow(z,3) + 5;
    System.out.println(q);


/*  
    Challenge 3:
    Create the variables, ask the user for the variable values, write the equation in file EQ2-act6 and display the equation value..
    
*/
    System.out.println("enter r");
    System.out.println("enter t");
    double r = Input.readDouble();
    double t = Input.readDouble();
    double s = 0;
    double s = Math.pow(t,5) * Math.pow((r + 2),4);
    System.out.println(s);

 

/*  
    Challenge 4:
    Create the variables, ask the user for the variable values, write the equation in file EQ3-act6 and display the equation value..
    
*/

    System.out.println("Enter A");
    System.out.println("Enter B");
    double A = Input.readDouble();
    double B = Input.readDouble();
    double C = 0;
    double C = Math.sqrt(A+B);
    System.out.println(d);


/*  
    Challenge 5:
    Create the variables, ask the user for the variable values, write the equation in file EQ4-act6 and display the equation value..
    
*/
    System.out.println("Enter X1");
    System.out.println("Enter X2");
    double X1 = Input.readDouble();
    double X2 = Input.readDouble();
    double d = 0;
    double d = Math.sqrt(Math.pow(X1,2) + Math.pow(X2,2));
    System.out.println(d);




/*  
    Challenge 6:
    Create the variables, ask the user for the variable values, write the equation g=sin(deg) and display the equation value..
    
*/
    System.out.println("Enter sin");
    System.out.println("Enter deg");
    double sin = Input.readDouble();
    double deg = Input.readDouble();
    double g = 0;
    double g = sin * deg;
    System.out.println(g);




/*  
    Challenge 7:
    Create the variables, ask the user for the variable values, write the equation in file EQ5-act6 and display the equation value.
    
*/

    System.out.println("Enter m");
    System.out.println("Enter n");
    double m = Input.readDouble();
    double n = Input.readDouble();
    double k = 0;
    double k = Math.pow(m,5) / Math.sqrt(n+1);
    System.out.println(k);


/*  
    *** Bonus Challenge ***:
    Create the variables, ask the user for the variable values, write the equation in file Ch-act6 and display the equation value.

    HINT: What does the "plus minus: after "-b" mean.
*/





    // **************************************************
    // **** Don't write any code below here.  ***********
    // **************************************************
  }
}