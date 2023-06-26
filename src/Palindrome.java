public class Palindrome {
    String str;
    public Palindrome(String input){
        this.str = input;
    }
    public boolean check(){
        String reverse = "";
        for (int i = this.str.length() - 1; i >= 0; i--) {
            reverse += this.str.charAt(i);
        }
        return this.str.equals(reverse);
    }
}
