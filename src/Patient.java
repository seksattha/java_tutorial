public class Patient extends Person {
    private float height, weight;

    public Patient() {
        System.out.println("patient constructor was called.");
    }

    public Patient(String firstName, String lastName,
                   String nickname, String gender,
                   float height, float weight) {
        super(firstName, lastName, nickname, gender);
        this.height = height;
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
}
