class Main {

	public static void main(String[] args) {
    	(new Main()).init();
	}

  void init(){
  	void print (String msg);
		System.out.println(msg);
  	}
  	double FtoC(double f){
		double c = (f - 32) * 9 / 5.0;
		return c;
  	}
  	double sphereVolume(double sr){
		double volume = (4.0/3.0) * Math.PI * Math.pow	(sr/3);
		System.out.println("Your volume is: " + sr);
		return volume;
  	}
  
  double coneVolume(double r, double h){
	double cone = Math.Pi * Math.pow(r, 2) * (h / 3);
	System.out.println("Your volume is: " + cone);
	return cone;
  }

  double distance(double x1, double y1, double x2, double y2){
	double dist = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
	System.out.println("Your distance is: " + dist);
	return dist;
}

 
}