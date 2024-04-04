public class Cats extends Dogs{
    
    public Cats(String name, String type, String BirthDay, String typeName){
        super(name, type, BirthDay, typeName);
    }

    public String speak(){
        return "Meow";
    }

    public String ShowCommands(){
        return "speak";
    }

    @Override
    public String toString(){
        return super.toString();
    }
}
