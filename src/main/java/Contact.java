public class Contact extends ContactRepositoryImpl{
    private int id;
    private String first_name;
    private String last_name;
    private String phone;

    public Contact(){

    }

    public Contact(int id,String first_name,String last_name,String phone){
        this.id=id;
        this.first_name=first_name;
        this.last_name=last_name;
        this.phone=phone;
    }

    public Contact(String first_name,String last_name,String phone){
        this.first_name=first_name;
        this.last_name=last_name;
        this.phone=phone;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
