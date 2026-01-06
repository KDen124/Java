class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init() {

    // READ ORIGINAL FILE
    String original = Input.readFile("Original.txt");

    // ENCRYPT
    String encrypted = encrypt(original);
    Input.writeFile("Encrypted.txt", encrypted);

    // DECRYPT
    String decrypted = decrypt(encrypted);
    Input.writeFile("Decrypted.txt", decrypted);
  }

  /* =======================
        ENCRYPTION
     ======================= */
  String encrypt(String txt) {
    txt = reverse(txt);              // 1
    txt = encode(txt);               // 2
    txt = vowelEncode(txt);          // 3
    txt = addAy(txt);                // 4
    txt = wingdingsEncode(txt);      // 5
    txt = reverse(txt);              // 6
    return txt;
  }

  /* =======================
        DECRYPTION
     ======================= */
  String decrypt(String txt) {
    txt = reverse(txt);              // undo 6
    txt = wingdingsDecode(txt);      // undo 5
    txt = removeAy(txt);             // undo 4
    txt = vowelDecode(txt);          // undo 3
    txt = decode(txt);               // undo 2
    txt = reverse(txt);              // undo 1
    return txt;
  }

  /* =======================
        LEVEL 1 – REVERSE
     ======================= */
  String reverse(String txt) {
    String bld = "";
    for (int i = txt.length() - 1; i >= 0; i--) {
      bld += txt.charAt(i);
    }
    return bld;
  }

  /* =======================
        LEVEL 2 – CAESAR (+2)
     ======================= */
  String encode(String txt) {
    String bld = "";
    for (int i = 0; i < txt.length(); i++) {
      char c = txt.charAt(i);
      if (Character.isLetter(c)) {
        char ch = txt.charAt(i);
        if (ch == 'z')
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
      } else {
        bld += c;
      }
    }
    return bld;
  }

  String decode(String txt) {
    String bld = "";
    for (int i = 0; i < txt.length(); i++) {
      char c = txt.charAt(i);
      if (Character.isLetter(c)) {
        bld += (char)(c - 2);
      } else {
        bld += c;
      }
    }
    return bld;
  }

  /* =======================
        LEVEL 3 – VOWELS
     ======================= */
  String vowelEncode(String txt) {
    return txt.replace("a", "1")
              .replace("e", "2")
              .replace("i", "3")
              .replace("o", "4")
              .replace("u", "5");
  }

  String vowelDecode(String txt) {
    return txt.replace("1", "a")
              .replace("2", "e")
              .replace("3", "i")
              .replace("4", "o")
              .replace("5", "u");
  }

  /* =======================
        LEVEL 4 – ADD AY
     ======================= */
  String addAy(String txt) {
    String[] words = txt.split(" ");
    String bld = "";
    for (String w : words) {
      bld += w + "ay ";
    }
    return bld.trim();
  }

  String removeAy(String txt) {
    String[] words = txt.split(" ");
    String bld = "";
    for (String w : words) {
      if (w.endsWith("ay"))
        bld += w.substring(0, w.length() - 2) + " ";
    }
    return bld.trim();
  }

  /* =======================
        LEVEL 5 – WINGDINGS
     ======================= */
  String wingdingsEncode(String txt) {
    String normal = "abcdefghijklmnopqrstuvwxyz";
    String wing   = "!@#$%^&*()_+-={}[]|:;<>,.?/";

    String bld = "";
    for (int i = 0; i < txt.length(); i++) {
      char c = txt.charAt(i);
      int idx = normal.indexOf(c);
      if (idx >= 0 && idx < wing.length()) {
        bld += wing.charAt(idx);
      } else {
        bld += c;
      }
    }
    return bld;
  }

  String wingdingsDecode(String txt) {
    String normal = "abcdefghijklmnopqrstuvwxyz";
    String wing   = "!@#$%^&*()_+-={}[]|:;<>,.?/";

    String bld = "";
    for (int i = 0; i < txt.length(); i++) {
      char c = txt.charAt(i);
      int idx = wing.indexOf(c);
      if (idx >= 0 && idx < normal.length()) {
        bld += normal.charAt(idx);
      } else {
        bld += c;
      }
    }
    return bld;
  }
}
