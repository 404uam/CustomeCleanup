package src;

public class Person {

    String name,
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
    type = "";
    public Person(String[] person) {

        switch (person.length)
        {
            case 16: //No Email
                break;
            case 21: //Has Email
                break;
            case 25: //Has a note
                break;
            case 26: //has a customer type
                break;
            default:
                System.out.println("Unexpected person length found in file");
                break;
        }

    }
}
