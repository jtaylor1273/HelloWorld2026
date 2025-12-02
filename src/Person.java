import java.util.Calendar;
import java.util.Date;

public class Person {
    //variables

    protected String firstName;
    protected String lastName;
    protected Integer age;
    protected Date dateOfBirth;


    //constructors
    public Person(String firstNameIn, String lastNameIn, Date dateOfBirthIn ){
        this.firstName = firstNameIn;
        this.lastName = lastNameIn;
        this.age = calculateAge(dateOfBirthIn);
    }

    //methods
    public String toString(){
        String retVal = "Hello " + this.firstName + " " + this.lastName+ ".  You are " + this.age + " years old.";
        return retVal;
    }

    private Integer calculateAge(Date dobIn){
        Date now = new Date();
        Date dob = new Date(1972, Calendar.DECEMBER, 21);
        this.age = dob.compareTo(now);


        //how to I subtract date 1 from date 2......

        return this.age;
    }


}
