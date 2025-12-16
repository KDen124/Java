class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){

    // This example we are substituting all lower case 
    // letters to another lower case letter.
    char[] sub = new char[5];
    sub[0] = 'a';
    sub[1] = 'e';
    sub[2] = 'i';
    sub[3] = 'o';
    sub[4] = 'u';


      Encoding message
    String file = Input.readFile("test.txt");

    //substituion
    String encodedMsg1 = cipher(file);
    Input.writeFile("Encode1.txt",encodedMsg1);
    print(encodedMsg1);
    /** 
    // caesar cipher
    String encodedMsg2 = encode(encodedMsg1);
    //Input.writeFile("Encode2.txt",encodedMsg2);

    // reverse
    String encodedMsg3 = reverse(encodedMsg2);
    Input.writeFile("Encode3.txt",encodedMsg3);

    
    // decoding message
    String file2 = Input.readFile("Encode1.txt");
    
    String decodedMsg1 = reverse(file2);
    //Input.writeFile("Decode1.txt", decodedMsg1);
    
    String decodedMsg2 = decode(decodedMsg1);
    //Input.writeFile("Decode2.txt", decodedMsg2);
    
     String decodedMsg3 = subEncryption(decodedMsg2, sub2, sub);
    //Input.writeFile("Decode1.txt", decodedMsg3);
    */
    
  }

String cipher(String S){
	String bld= " ";
	for (int i=0; i< S.length(); i++){
		char ch = S.charAt(i);
		if (ch == 'b' )
			bld += 'z';
		else if(ch == 'B')
			bld += 'Z';
    else if(ch == 'A')
			bld += 'y';
    else if(ch == 'A')
			bld += 'Y';
		else{
       int ascii = (int)ch;
		   ch = (char)(ascii + 2);
		   bld += ch;
		}
	}
	return bld;
}


String decipher(String S){
	String bld= " ";
	for (int i=0; i< S.length(); i++){
		char ch = S.charAt(i);
		if (ch == 'z' )
			bld += 'b';
		else if(ch == 'Z')
			bld += 'B';
    else if(ch == 'y')
			bld += 'a';
    else if(ch == 'Y')
			bld += 'A';
		else{
      int ascii = (int)ch;
		  ch = (char)(ascii - 2);
		  bld += ch ;
		}
	}
	return bld;
}




  // Level 1 reverse string
  String reverse(String txt){
    String bld ="";
    
    return bld;
  }
  
  
  //Level 2 Cipher encoding with no wrapping
  String encode(String txt){
    String bld="";
    
     
    return bld;
  }

  
  String decode(String txt){
    String bld="";
   
    return bld;
  }

  // Level 3 Substituion encoding
  String subEncryption(String s, char[] sub, char[] sub2){
    String bld="";
   
    return bld;
  }
  
  
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }

}