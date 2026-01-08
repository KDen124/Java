class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){System.out.println(o);}
  void printt(Object o){System.out.print(o);}

  void init(){
    Car Car1 = new Car();
    Car1.brand = "Toyota";
    Car1.color = "Red";
    Car1.model = "Corolla";
    Car1.year = 2020;
    Car1.value = 20000.00;
    Car1.honk();

    Car Car2 = new Car();
    Car2.brand = "Honda";
    Car2.color = "Blue";    
    Car2.model = "Civic";
    Car2.year = 2019;
    Car2.value = 22000.00;
    Car2.honk();

  }

  class Car{
    String brand;
    String color;
    String model;
    int year;
    double value;

    void honk(){
      System.out.println("Beep! Beep!");
      System.out.println("This car is a " + brand + " " + model + " worth $" + value);
    }
  }
  

  
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }


}