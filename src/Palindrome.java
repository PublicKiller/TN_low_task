public class Palindrome {
    String str;

    public Palindrome(String input) {
        this.str = input;
    }

    public boolean check() {
        StringBuilder reverse = new StringBuilder();
        for (int i = this.str.length() - 1; i >= 0; i--) {
            reverse.append(this.str.charAt(i));
        }
        return this.str.contentEquals(reverse);
    }
}
