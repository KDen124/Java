class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    System.out.println(fib(6));
    System.out.println(spaces(6));
    System.out.println(harmonic(6));
    
  }

  int spaces(String N){
    int result = 1;
    for(int x=0; x<N; x++){
      result += " ";
    }
    return result;
  }

  int harmonic(int n){
    int result = 1;
    for (int x = 1; x<=n; x++){
      result += (1/x);
    }
    return result;
  }

  int fib(int n){
    int result = 0;
    for (int x = 0; x<n; x++){
      result += fib(n-1) + fib(n-2);
    }
    return result;
  }
  
  int approxSine(int n){
    int result = 0;
    for (int x = 0; x<n; x+=2){
      result -= (Math.pow(0,x)/ factorial(x));
    }
    return result;
  }
  
  
}