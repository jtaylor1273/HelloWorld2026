import javax.swing.text.html.HTMLDocument;

public class HelloWorld {
    private String name = "";

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
        StringBuilder retVal = new StringBuilder();
        retVal.append("Hello ");
        retVal.append(this.name);
        return retVal.toString();
    }

}
