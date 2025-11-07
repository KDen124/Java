class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){System.out.println(o);}
  void printt(Object o){System.out.print(o);}

  void init(){
    System.out.println(rollDice(6));

    
  }


  String rollDice(int x){
    int num1 = (int)(Math.random()*x)+1;
    int num2 = (int)(Math.random()*x)+1;
    return num1 + " " + num2;

  }

  String lotto(){
    int num1 = (int)(Math.random()*48)+1;
    int num2 = (int)(Math.random()*48)+1;
    int num3 = (int)(Math.random()*48)+1;
    int num4 = (int)(Math.random()*48)+1;
    int num5 = (int)(Math.random()*48)+1;
    return num1 + " " + num2 + " " + num3 + " " + num4 + " " + num5 ;
  }

  int diceDistribution(int n){
    for (int n=1; n<=1000; n++){
      int die = (int)(Math.random()*6)+1;
    }
    return n + "is the amount of times the die was rolled." + die;
  }

  boolean additionTutor(int ans){
    int num1 = (int)(Math.random()*100)+1;
    int num2 = (int)(Math.random()*100)+1;
    int correctAns = num1 + num2;
    if (ans == correctAns){
      return true;
    } else {
      return false;
  }
  }

}