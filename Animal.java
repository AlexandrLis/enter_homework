public class Animal {
    
    protected String name;
    protected String type;
    protected String BirthDay;
    protected String typeName;

    public Animal(String name, String type, String BirthDay, String typeName){
        this.name = name;
        this.type = type;
        this.BirthDay = BirthDay;
        this.typeName = typeName;
    }

    public String getBirthDay(){
        return BirthDay;
    }


    @Override
    public String toString(){
        return "имя: " + name + ", животное: " + type + ", дата рождения: " + BirthDay + ", тип животного: " + typeName;
    }
}
