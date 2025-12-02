
public class HelloWorld {
    private String name;

    public HelloWorld(String nameIn){
        this.name = nameIn;
    }

    public void SetName(String nameIn){
        this.name = nameIn;
    }
    public String GetName(){
        return this.name;
    }

    public String toString(){
        String retVal = "Hello " +
                this.name;
        return retVal;
    }

}
