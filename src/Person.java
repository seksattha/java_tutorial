public class Person {
    private String firstName, lastName, nickname, gender;

    public Person(String firstName, String lastName, String nickname, String gender) {
        this.firstName = firstName.trim().substring(0,1).toUpperCase() +
                firstName.trim().substring(1).toLowerCase();
        this.lastName = lastName;
        this.nickname = nickname;
        this.gender = gender;
    }

    //    chain consturctor #1 (เอาเฉพาะ ชื่อจริงกับ นามกสุลมาสร้าง instance)
    public Person(String firstName, String lastName) {
        this(firstName, lastName, "", "");
       /* this.firstName = firstName;
        this.lastName = lastName;*/
    }
//    default constructor (parameter less constructor)


    public Person() {
        System.out.println("Person constructor was called");
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getNickname() {
        return nickname;
    }

    public String getGender() {
        return gender;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
