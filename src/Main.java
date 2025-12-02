//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //variables
    List<String> myNames = new ArrayList<>();
    myNames.add("John");
    myNames.add("Shannon");

    //control section
    for (String name : myNames)
    {
        var greeting = new HelloWorld(name);
        System.out.println(greeting);
    }
}
