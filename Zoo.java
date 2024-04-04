import java.util.ArrayList;
import java.util.List;

public class Zoo {
    
    private List<Animal> zoopark = new ArrayList<>();

    public Zoo addAnimal(Animal animal){
        zoopark.add(animal);
        return this;
    }

    public List<Animal> getAnimal(){
        return zoopark;
    }

    public void findAnimalBirthDay(String BirthDay){
        int count = 0;
        for (Animal animal : zoopark) {
            if (BirthDay.equals(animal.getBirthDay())) {
                System.out.println(animal);
                count++;
            } 
        }
        if(count == 0){
            System.out.println("Животного с такой датой рождения нет");
        }
    }
}
