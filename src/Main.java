//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //variables
    List<Person> myPeople = new ArrayList<Person>();
    myPeople.add(new Person("John","Taylor", 51));
    myPeople.add(new Person("Shannon","Taylor", 49));
    myPeople.add(new Person("Isabel","Taylor", 19));
    myPeople.add(new Person("Emily","Taylor", 17));

    //control section
    for (Person p : myPeople)
    {
        System.out.println(p);
    }

    Date now = new Date();
    Date dob = new Date(1972, Calendar.DECEMBER, 21);

    System.out.println(Date.from(dob.toInstant()));
}
