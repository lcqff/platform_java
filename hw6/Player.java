package ed.pnu.admin;

import java.util.Objects;

public class Player {

    private String firstName;
    private String lastName;
    private int jerseyNumber;
    public Player(String firstName, String lastName, int jerseyNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.jerseyNumber = jerseyNumber;
    }

    public String toString() {
        return "[" + lastName + ", " + firstName + " " + jerseyNumber + ']';
    }

    public static String getFirstName(Player o) {
        return (String)o.firstName;
    }
    public static int getNumber(Player o) {
        return (int)o.jerseyNumber;
    }
    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, jerseyNumber);
    }
    //other methods constructor toString equals hashcode
}

