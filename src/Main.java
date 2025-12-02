import java.util.Date;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //variables
    List<Person> myPeople = new ArrayList<Person>();
    myPeople.add(new Person("John","Taylor", new Date(1973, Calendar.DECEMBER, 21)));
    //myPeople.add(new Person("Shannon","Taylor", 49));
    //myPeople.add(new Person("Isabel","Taylor", 19));
    //myPeople.add(new Person("Emily","Taylor", 17));

    //control section
    for (Person p : myPeople)
    {
        System.out.println(p);
    }


}
