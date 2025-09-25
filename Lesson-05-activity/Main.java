class Main {
	public static void main(String[] args) {
    	(new Main()).init();
	}

  void init(){
    

/*  
    Challenge 1:
    Create two integer variables and Assign values to them. 
    Calculate the sum of the two numbers and store the 
    calculated sum and then display it.
    
*/
   int x1 = 10;
   int x2 = -50;
   int xsum = x1+x2;
   System.out.println(xsum);



/*  
    Challenge 2:
    Create three variables to assign three grades and Assign values to each grade. 
    Calculate the sum of the three grades and store the 
    calculated sum and then display it.

*/

   int x1 = 30;
   int x2 = -80;
   int x3 = 20;
   int xsum = x1 + x2 + x3;
   System.out.println(xsum);
/*  
    Challenge 3:
    Calculate the average from the three grades from challenge 2,
    store the value and then display it.
    Declare and assign values to any new variables
    NOTE: Does it look correct, check with a calculator?
*/
   x1 = 20;
   x2 = -40;
   x3 = 10;
   int xavg = (x1 + x2 + x3) / 3 ;
   System.out.println(xavg);


/*  
    Challenge 4:
    Write the following equation in EQ1.PNG file in Java; store the result and the display it:
    Declare and assign values to any new variables

*/
   double x=5.0;
   double A=1.0;
   double y = (A)/(x+1);

/*  
    Challenge 5:
    Using the variables same variables from challenge4 above, write the following equation in EQ2.PNG file in Java, store the result and the display it:

    Declare and assign values to any new variables

*/
 
   double x=4.0;
   double A=2.0;
   double y2 = (2x)(x+1)(-(x/2))/(A);




/*  
    Challenge 6:
    Create the variables and write the equation in
    file  EQ3.PNG

    Declare and assign values to any new variables
*/
   double b = 6;
   double h = 3;
   double A = (b*h)/2;




/*  
    **** Bonus Challenge ****:
    Create a variable that stores the total number of eggs 
    and assign it 100. We want to fill as many baskets with 
    eggs as we can. Each basket can hold only 12 eggs.

    1) Write the java code that will calcute how many baskets
    of 12 eggs can we fill fully.

    HINT: What do we get when we divide an integer by 
    an integer in Java

    2) Write the java code that will calculate how many eggs
    are left over after we filled as many baskets of 12 eggs.
*/





    // **************************************************
    // **** Don't write any code below here.  ***********
    // **************************************************
  }
}