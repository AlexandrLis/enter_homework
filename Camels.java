public class Camels extends Pack_animal{
    
    public Camels(String name, String type, String BirthDay, String typeName){
        super(name, type, BirthDay, typeName);
    }

    public String come_on(){
        return "Go out";
    }

    public String stop(){
        return "Stay here";
    }

    public String ShowCommands(){
        return "come_on, stop";
    }


    @Override
    public String toString(){
        return super.toString();
    }
}
