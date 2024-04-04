public class Horses extends Pack_animal{
    
    public Horses(String name, String type, String BirthDay, String typeName){
        super(name, type, BirthDay, typeName);
    }

    public String come_on(){
        return "Go out";
    }

    public String stop(){
        return "Stay here";
    }

    public String jump(){
        return "Jumping";
    }

    public String ShowCommands(){
        return "come_on, stop, jump";
    }

    @Override
    public String toString(){
        return super.toString();
    }
}
