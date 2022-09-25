public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        return checkLengths(this.name) && checkSpaces(this.name) && checkOneWhitespace(this.name);
    }

    private boolean checkSpaces(String name) {
        return name.trim().equals(name);
    }

    private boolean checkLengths(String name) {
        return name.length() >= 3 && name.length() <= 19;
    }

    private boolean checkOneWhitespace(String name) {
        int counter = 0;
        for (int i=0; i<name.length(); i++){
            if (Character.isWhitespace(name.charAt(i))) counter++;
        }
        return counter == 1;
    }
}
