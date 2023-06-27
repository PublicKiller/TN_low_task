public class StringUtil {
    StringBuilder string;

    public StringUtil(StringBuilder inputString) {
        this.string = inputString;
    }

    public StringBuilder reverse() {
        StringBuilder reverse = new StringBuilder();
        for (int i = this.string.length() - 1; i >= 0; i--) {
            reverse.append(this.string.charAt(i));
        }
        return reverse;
    }
}
