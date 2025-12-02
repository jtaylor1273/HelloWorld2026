import java.util.Date;

public class Person {
    //variables

    protected String firstName;
    protected String lastName;
    protected Integer age;
    protected Date dateOfBirth;


    //constructors
    public Person(String firstNameIn, String lastNameIn, Integer ageIn ){
        this.firstName = firstNameIn;
        this.lastName = lastNameIn;
        this.age = ageIn;
    }

    //methods
    public String toString(){
        String retVal = "Hello " + this.firstName + " " + this.lastName+ ".  You are " + this.age + " years old.";
        return retVal;
    }

    private Integer calculateAge(Date dobIn){
        return 1;
    }


}
