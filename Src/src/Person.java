package src;

public class Person {

    private String name,number,
    discount,
    tax,
    firstName, lastName, title,
    company,
    dob,
    addr1, addr2, city, province, postal, country,
    home;
    private String work = "";
    private String fax = "";
    private String pager = "";
    private String mobile = "";
    private String email = "";
    private String email2 = "";
    private String website = "";
    private String custom = "";
    private String note = "";
    private String type = "";
    private String created = "";
    public Person(String[] person) {
        name = person[0];
        number = person[1];
        discount = person[2];
        tax = person[3];
        firstName = person[4];
        lastName = person[5];
        title = person[6];
        company = person[7];
        dob = person[8];
        addr1 = person[9];
        addr2 = person[10];
        city = person[11];
        province = person[12];
        postal = person[13];
        country = person[14];
        home = person[15];
        work = person[16];
        fax = person[17];
        pager = person[18];
        mobile = person[19];
        email = person[20];
        email2 = person[21];
        website = person[22];
        custom = person[23];
        note = person[24];
        type = person[25];
        created = person[26];
    }

    /**
     *
     * @return Returns a CSV for the upload format.
     */
    public String toString(){
        return name +","+ number +","+ discount +","+ tax +","+ firstName +","+ lastName +","+ title +","+
                company +","+ dob +","+ addr1 +","+ addr2 +","+ city +","+ province +","+ postal +","+
                country +","+ home +","+ work +","+ fax +","+ pager +","+ mobile +","+ email +","+
                email2 +","+ website +","+ custom +","+ note +","+ type;
    }
    public String toString(String type){
            return firstName +","+ lastName +","+ title +","+
                    company +","+ dob +","+ addr1 +","+ addr2 +","+ city +","+ province +","+ postal +","+
                    country +",,,,,,"+ email +","+
                    email2 +","+ website +","+ custom +","+ note +",,,"+ type +",,,";
    }

    public String getLastName() {
        return lastName;
    }

    public String getCreated() {
        return created;
    }

    public String getEmail() {
        return email;
    }
}
