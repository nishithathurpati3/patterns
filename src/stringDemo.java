import java.util.Scanner;
public class stringDemo {
    public static void main(String[] args) {
//        String fname="Chunky";
//        System.out.println(fname);
//        String lname="Thurpati";
//        System.out.println(lname);
//        String fullName= fname +" "+lname;
//        System.out.println(fullName);
//        String fullName1= fname.concat(" "). concat(lname);
//        System.out.println(fullName1);
//        String course= "Java";
//        System.out.println(course);
//        int length= course.length();
//        System.out.println(length);
//        char letter=course.charAt(0);
//        System.out.println(letter);
        Scanner sc= new Scanner(System.in);
//        String word1=sc.next();
//        for(int i=0;i<word1.length();i++){
//            System.out.println(word1.charAt(i));
//        }
//       char letter1=word1.charAt(0);
//       System.out.println(letter1);

        String statement="I Like Java";
//         String word2=statement.substring(7);
//         System.out.println(word2);
//         String word3=statement.substring(2,6);
//         System.out.println(word3);
//         String word4=sc.next();
//   //      System.out.println(word4);
//         System.out.println(word2+ " "+word3+ " "+word4);


//        String word5="HAYAN";
//        System.out.println(word5.toLowerCase());
//        System.out.println(statement.toUpperCase());
//        char letter2=word5.charAt(2);
//        System.out.println(Character.toLowerCase(letter2));
//        String word6= "I Like Java";
//        System.out.println(statement.equalsIgnoreCase(word6));
//        System.out.println(statement.equals(word6));
//        System.out.println(statement==word6);
//        int num1=10;
//        int num2=10;
//        System.out.println(num1==num2);


//        String s1=new String("Java");
//        String s2=new String("Java");
//        System.out.println(s1==s2);
//        System.out.println(s1.equals(s2));
//        System.out.println(s1.hashCode());
//        System.out.println(s2.hashCode());

        //Reverse String
        String word7= "JUNIOR";
//        StringBuilder word8=new StringBuilder("SENIOR");
//        System.out.println(word8.reverse());

//        for(int i=word7.length()-1;i>=0;i--){
//            System.out.print(word7.charAt(i));
//        }

        String reverseWord= "";
        for(int i=word7.length()-1;i>=0;i--){
            reverseWord= reverseWord+word7.charAt(i);
            System.out.println("Reversed word is ::" +reverseWord);
        }
       System.out.println(reverseWord);



    }
}
