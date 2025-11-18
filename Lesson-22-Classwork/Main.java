class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
   String friends[]={"Alice","Bob","Charlie","Diana","Eve"};
    
    double[] tempc = {0.0, 20.0, 37.0, 40, 73, 100.0};

    double[] tempf = convert(tempc); 
  }

  double[] convert(double[] c){
    double[] temp = new double[c.length];
    for(int i=0;i<temp.length;i++){
      temp[i]=celsiusToFarhenheit(c[i]);
    }
    return temp;
  }

  double celsiusToFarhenheit(double c){
        return c*9/5+32;
  }
}