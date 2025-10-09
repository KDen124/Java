
class Main {

	public static void main(String[] args) {
    	(new Main()).init();
	}


   	void init(){
		if (isGraduating(12,44))
	  		System.out.println("Student Is Graduating");
		else
			System.out.println("Student Is NOT Graduating");
	}

    double gpa(int gpa){
    	if(gpa>=90)
      		return gpa*1.1;
   		else 
      		return gpa;
   }
    boolean isGraduating(int gradeLvl, int credits){
    	if(gradeLvl==12 && credits>=44)
      		return true;
   		 else
      		return false;
   }


    String BMI(int weight, int height){
		double bmi=0;
		bmi = (weight/height)*703;
    	if(bmi<=18.4)
      		return "Underweight";
    	else if (bmi>=18.5 && bmi<=24.9)
      		return "Normal";
		else if (bmi>=25.0 && bmi<=39.9)
      		return "Overweight";
		else
      		return "Obese";
   }

	String shippingCost(int pounds){
		if (pounds<=10)
			return "0.00";
		else if (pounds>10 && pounds<=15)
			return "5.00";
		else if (pounds>15 && pounds<=25)
			return "10.00";
		else 
			return "10.00 + (.02*pounds)";
	}
	boolean blueOrViolet(int lf){
    	if((lf >=600 && lf<=670) || (lf >=700 && lf<=750))
      		return true;
   		 else
      		return false;
   }
}