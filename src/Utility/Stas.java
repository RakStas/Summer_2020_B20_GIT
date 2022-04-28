package Utility;

public class Stas {
    public static void main(String[] args) {
        String str = "Alina";
        String reerse = "";
        for (int i=str.length()-1; i>=0; i--){
            char ch =str.charAt(i);
            reerse+=ch;
        }
        System.out.println(reerse);



    }
}
