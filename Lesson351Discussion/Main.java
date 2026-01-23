class Main {
  public static void main(String[] args)throws Exception {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init()throws Exception{

    CreateList list=new CreateList("CR101.csv");
    Student[] students = list.getStudentArray();
    
    
    
    
    
  }


  double sum = 0;
  for(int x=0; x<students.length; x++){
    Student student = students[x];
    sum += Student.gpa;
  }
  print ("School Avg:" + sum/students.length);


  int count = 0;
  for(int x=0; x<students.length; x++){
    Student student = students[x];
    if(student.findTeacher == ("Castro R")){
      count++;
    }
  }
  print("Number of students with Castro R as teacher: " + count);


  int stud = 0;
  for (int x=0; x<students.length; x++){
    Student student = students[x];
    if(student.findCourse("SHF21U2C")){
      stud++;
    }
    

  }
  print("Number of students in SHF21U2C: " + stud);

  for (int x=0; x<students.length; x++){
    Student student = students[x];
    if(student.findTeacher("Porchetta")&& student.findCourseStartingWith("MK")){
      print(student.id);
    }
  }



  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }

}