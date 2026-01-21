class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){

    double[] g1 = {60,70,90};
    double[] g2 = {65,75,60};
    double[] g3 = {78,70,80};
    double[] g4 = {64,77,90};
    double[] g5 = {77,76,70};

    String[]  courses1  = {"EEFG7QH","FSFC3","HQFC3TH","HUF43X"};
    String[]  courses2  = {"MRF43","PGF43Q3C","SCF43QG","HUF43X"};
    String[]  courses3  = {"MRF43","PGF43Q3C","SCF43QG","HUF43X"};
    String[]  courses4  = {"MRF43","PGF43Q3C","SCF43QG","HUF43X"};
    String[]  courses5  = {"MRF43","PGF43Q3C","SCF43QG","HUF43X"};

    
    //Create an array of students 
    Student[] studentList = new Student[5];

    //we have to create a new student object and assign
    //it to each element
    
    studentList[0] = new Student("Tom",9,g1,courses1);
    studentList[1] = new Student("Jerry",11,g2,courses2);
    studentList[2] = new Student("Ren",10,g3,courses3);
    studentList[3] = new Student("Stimpy",9,g4,courses4);
    studentList[4] = new Student("Krusty",9,g5,courses5);

    // add your code here
    print ("Average grade of " + studentList[0].getFirstName() + " is " + studentList[0].calculateAvg());

    print ("Average grade of " + studentList[1].getFirstName() + " is " + studentList[1].calculateAvg());
    print ("Average grade of " + studentList[2].getFirstName() + " is " + studentList[2].calculateAvg());

    print ("Average grade of " + studentList[3].getFirstName() + " is " + studentList[3].calculateAvg());    
    
    print ("Average grade of " + studentList[4].getFirstName() + " is " + studentList[4].calculateAvg());
    
  
    if (studentList[0].calculateAvg() > 70) {
      print (studentList[0].getFirstName() + " has a passing average.");
    } 
    if (studentList[1].calculateAvg() > 70) {
      print (studentList[1].getFirstName() + " has a passing average.");
    }
    if (studentList[2].calculateAvg() > 70) {
      print (studentList[2].getFirstName() + " has a passing average.");
    }
    if (studentList[3].calculateAvg() > 70) {
      print (studentList[3].getFirstName() + " has a passing average.");
    }
    if (studentList[4].calculateAvg() > 70) {   
      print (studentList[4].getFirstName() + " has a passing average.");
    } 
}




  
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }

}