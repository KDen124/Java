class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
   
  }

  String creditCardType(String cardNumber){
   if (cardNumber.substring(0, 1).equals("4")) {
    return "Visa";
   } else if (cardNumber.substring(0, 2).equals("34") || cardNumber.substring(0, 2).equals("37")) {
    return "American Express";
   } else if (cardNumber.substring(0, 2).equals("36") 
    return "Diner Club";
   } else if (cardNumber.substring(0, 2).equals("51") || cardNumber.substring(0, 2).equals("55")) {
    return "MasterCard";
   } else if (cardNumber.substring(0, 4).equals("6011") || cardNumber.substring(0, 2).equals("65") ||
    return "Discovery";
   } else {
    return "Unknown Card Type";
 }

 String pigLatin(String word){
  String firstLetter = word.substring(0, 1);
  String restOfWord = word.substring(1);
  return restOfWord + firstLetter + "ay";
 }
 String nycLocate(String zip){
  if zip.substring(0,3).equals("100") || zip.substring(0,3).equals("101") || zip.substring(0,3).equals("102") {
   return "Manhattan";
  } else if zip.substring(0,3).equals("103") {
   return "Staten Island";
  } else if zip.substring(0,3).equals("104") {
   return "The Bronx";
  } else if zip.substring(0,3).equals("112") {
   return "Brooklyn";
  } else if zip.substring(0,3).equals("111") || zip.substring(0,3).equals("113") || zip.substring(0,3).equals("114") {
   return "Queens";
  } else {
   return "Unknown Borough";
  }
 }
}