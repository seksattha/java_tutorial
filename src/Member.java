public class Member {
    private String firstName, lastName;

    public Member(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return String.format("First name = %s, Last Name = %s", firstName, lastName);
//        return super.toString();
    }

    public Member() {
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

    public float discount(float amount) {
        if (amount > 1000) {
            return amount * .2f;
        } else {
            return 0f;
        }
    }
}
