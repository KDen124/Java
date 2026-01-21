class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){System.out.println(o);}
  void printt(Object o){System.out.print(o);}

  void init(){

    CartItem c1 = new CartItem("Apple", 0.99, 3);
    CartItem c2 = new CartItem("Banana", 0.59, 5);
    CartItem c3 = new CartItem("Orange", 0.79, 2);

    if (c1.onSale == true){
      print(c1.itemName + " is on sale! Price: " + c1.getItemPrice());
    }
    if (c2.onSale == true){
      print(c2.itemName + " is on sale! Price: " + c2.getItemPrice());
    }
    if (c3.onSale == true){
      print(c3.itemName + " is on sale! Price: " + c3.getItemPrice());
    }

    print("Total price: " + (c1.getItemPrice()*c1.quantity + c2.getItemPrice()*c2.quantity + c3.getItemPrice()*c3.quantity));
  

  }

  
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }


}