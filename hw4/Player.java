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

    public boolean equals(String Name, int Num) {
        if (this.firstName == Name && this.jerseyNumber == Num) return true;
        if (Name == null) return false;
        return this.jerseyNumber == Num && Objects.equals(this.firstName, Name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, jerseyNumber);
    }
    //other methods constructor toString equals hashcode
}
