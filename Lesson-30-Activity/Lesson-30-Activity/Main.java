class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){System.out.println(o);}
  void printt(Object o){System.out.print(o);}

  void init(){
    Car Car1 = new Car("Toyota", "Red", "Corolla", 2020, 20000.00);

    Car1.honk();

    Car Car2 = new Car("Honda", "Blue", "Civic", 2019, 22000.00);

    Car2.honk();

  }

  class Car{
    String brand;
    String color;
    String model;
    int year;
    double value;

    Car(String brand, String color, String model, int year, double value) {
      this.brand = brand;
      this.color = color;
      this.model = model;
      this.year = year;
      this.value = value;
    }

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