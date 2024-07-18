public class Contact {
    private String fname, lname;
    private String phoneNumber;

    public Contact(String fname, String lname, String phoneNumber) {
        setFname(fname);
        setLname(lname);
        setPhoneNumber(phoneNumber);
    }

    //setter
    public void setFname(String fname) {
        this.fname = fname.substring(0,1).toUpperCase() + fname.substring(1).toLowerCase();
    }
    public void setLname(String lname) {
        this.lname = lname.substring(0,1).toUpperCase() + lname.substring(1).toLowerCase();
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber.replaceAll("\\D","");
    }

    //getter
    public String getFname() {
        return fname;
    }

    @Override
    public String toString() {
        return "ชื่อจริง: " + fname + '\'' +
                "นามสกุล: " + lname + '\'' +
                "เบอร์มือถือ" + phoneNumber;
    }

}
