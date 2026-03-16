
import java.io.IOException;
import java.sql.*;
//For compiling on the shell on repl: Same on mac
//javac -cp sqlite-jdbc-3.23.1.jar: Main.java

//Use for windows
//javac -cp sqlite-jdbc-3.23.1.jar; ServerExample.java
class Main {

 public static void main(String[] args)throws IOException{
    (new Main()).init();
  }

  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init() {
   

    String queryResult="";
    String sql ="";

		Database db = new Database("jdbc:sqlite:students.db" );	
    
   
     
      }    
  sql = "UPDATE cr101 SET ROOM = '122' WHERE StudentID = STUDENT1001 AND PERIOD = 3";
  queryResult = db.runSQL(sql,"table-auto");
  print(queryResult);

  sql = "UPDATE cr101 DELETE FROM Course WHERE StudentID = STUDENT1200";
  queryResult = db.runSQL(sql,"table-auto");
  print(queryResult);
 
  sql = "UPDATE cr101 SET ROOM = 213 WHERE TEACHER1 = 'DOYLE' and PERIOD = (4,5)";
  queryResult = db.runSQL(sql,"table-auto");
  print(queryResult);

  sql = "UPDATE cr101 SET TEACHER1 = 'MR ARCHETTI' WHERE TEACHER1 = 'MR ROFFLER' AND COURSE = 'MQF44QGF' AND SECTION = 1";
  queryResult = db.runSQL(sql,"table-auto");
  print(queryResult);

  sql = "UPDATE cr101 SET GRADE = 11 AND OffClass = 'Junior' WHERE StudentID = STUDENT999";
  queryResult = db.runSQL(sql,"table-auto");
  print(queryResult);
  sql = "UPDATE cr101 DELETE FROM Course WHERE StudentID = STUDENT1200";
  queryResult = db.runSQL(sql,"table-auto");
  print(queryResult);
}

