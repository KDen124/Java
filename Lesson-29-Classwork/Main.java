class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    	dog dog1 = new dog();
	    dog1.name = "Toto";
	    dog1.age = 3;
	    dog1.breed = "Terrier";
	    dog1.bark();

    	dog dog2 = new dog();
	    dog2.name = "Snoopy";
	    dog2.age = 5;
	    dog2.breed = "Dashshund";
	    dog2.bark();

      dog dog3 = new dog();
	    dog3.name = "Poophy";
	    dog3.age = 7;
	    dog3.breed = "Corgi";
	    dog3.bark();
    

}

    
  class dog{
    String name;
    int age;
    String breed;

    void bark(){
      System.out.println("Woof! Woof!");
    }

	}






  
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }

}