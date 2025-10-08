class Main {

	public static void main(String[] args) {
    	(new Main()).init();
	}

  void init(){
  	System.out.println("Hello World");
  }
  double FtoC(double f){
		double c = (f - 32) * 9 / 5.0;
		return c;
  }
  double sphereVolume(double sr){
		double v = (4.0/3.0) * Math.PI * Math.pow(sr,3);
		return v;
  }
  
  double coneVolume(double r, double h){
	double cone = (1.0/3.0) * Math.PI* Math.pow(r,2) * h ;
	return cone;
  }

  double distance(double x1, double y1, double x2, double y2){
	double dist = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1), 2));
	return dist;
}

 
}