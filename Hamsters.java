public class Hamsters extends Pets{
    
    public Hamsters(String name, String type, String BirthDay, String typeName){
        super(name, type, BirthDay, typeName);
    }

    public String play(){
        return "I running in a wheel";
    }

    public String ShowCommands(){
        return "play";
    }

    @Override
    public String toString(){
        return super.toString();
    }
}
