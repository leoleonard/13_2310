package one;

public class Scores {
    private String firstName;
    private String lastName;
    private double time;

    public Scores(String firstName, String lastName, double time) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.time = time;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Scores{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", time=" + time +
                '}' + "\n";
    }
}
