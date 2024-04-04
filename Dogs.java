public class Dogs extends Pets{
    
    public Dogs(String name, String type, String BirthDay, String typeName){
        super(name, type, BirthDay, typeName);
    }

    public String speak(){
        return "Gav... gav";
    }

    public String ShowCommands(){
        return "speak";
    }

    @Override
    public String toString(){
        return super.toString();
    }
}
