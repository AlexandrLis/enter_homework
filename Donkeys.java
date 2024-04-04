public class Donkeys extends Pack_animal{
    
    public Donkeys(String name, String type, String BirthDay, String typeName){
        super(name, type, BirthDay, typeName);
    }

    public String ShowCommands(){
        return "Нет выполняемых команд";
    }

    @Override
    public String toString(){
        return super.toString();
    }
}
