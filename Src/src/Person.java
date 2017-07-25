package src;

public class Person {

    private String name,
    number,
    discount,
    tax,
    firstName,
    lastName,
    title,
    company,
    dob,
    addr1, addr2, city, province, postal, country,
    home,work,fax,pager,mobile,
    email,email2,
    website,
    custom,
    note,
    type = " ";
    public Person(String[] person) {
        switch (person.length)
        {
            case 17: //Has work no Email
                work = person[16];
                break;
            case 20: //Has mobile but no email
                work = person[16];
                fax = person[17];
                pager = person[18];
                mobile = person[19];
            case 21: //Has Email
                email = person[20];
                break;
            case 25: //Has a note
                email = person[20];
                email2 = person[21];
                website = person[22];
                custom = person[23];
                note = person[24];
                break;
            case 26: //has a customer type
                email = person[20];
                email2 = person[21];
                website = person[22];
                custom = person[23];
                note = person[24];
                type = person[25];
                break;
            default:
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
                break;
        };
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
}
