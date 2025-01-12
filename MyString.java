public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true

        System.out.println("for me:");
        System.out.println(contains("Effective presentations must be clear, concise, and humble", "leverage")); 


    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        String newStr = "";
        for (int i=0; i<str.length(); i++) {
            if (str.charAt(i)>='A' && str.charAt(i)<='Z') {
                newStr= newStr+ (char)(str.charAt(i)+32);
            }
            else newStr=newStr+str.charAt(i);
        }

        return newStr;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        if (str2=="") {
            return true;
        }
        if (str1=="") {
            return false;
        }
        for (int i=0; i<str1.length(); i++) {
            if (str1.charAt(i)==str2.charAt(0)) {
                boolean end = false;
                for (int j=0; j<str2.length() && (i+j)<str1.length(); j++) {
                    if (str1.charAt(i+j)==str2.charAt(j)) {
                        end = true;
                    }
                    else {
                        end = false;
                        break;
                    }
                    if ((i+j+1)>=str1.length()) {
                        end = false;
                    }
                }
                if (end==true) return true;
            }
        }
        return false;
    }
}
