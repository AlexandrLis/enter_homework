import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Camels camels = new Camels("", "", "", "");
        Cats cats = new Cats("", "", "", "");
        Dogs dogs = new Dogs("", "", "", "");
        Donkeys donkeys = new Donkeys("", "", "", "");
        Hamsters hamsters = new Hamsters("", "", "", "");
        Horses horses = new Horses("", "", "", "");
        int[] arrayPets = {0};
        int[] arrayPack_animal = {0};
        
        Zoo zoo = new Zoo();
        choise(zoo, camels, cats, dogs, donkeys, hamsters, horses, arrayPets, arrayPack_animal);
        


    }
    public static void choise(Zoo zoo, Camels camels, Cats cats, Dogs dogs, Donkeys donkeys, Hamsters hamsters, Horses horses, int[] arrayPets, int[] arrayPack_animal){
        System.out.println("Выберете действие: ");
        System.out.println("1 - добавить животное");
        System.out.println("2 - вывести список животных");
        System.out.println("3 - найти животное по дате рождения");
        System.out.println("4 - вывести список команд животного");
        System.out.println("5 - вывести количество домашних животных и количество вьючных животных");
        System.out.println("6 - выход");

        Scanner scan = new Scanner(System.in);
        int answer = scan.nextInt();

        switch (answer) {
            case 1:
                funcAdd(zoo, arrayPets, arrayPack_animal);
                choise(zoo, camels, cats, dogs, donkeys, hamsters, horses, arrayPets, arrayPack_animal);
            break;
            case 2:
                funcShowZoo(zoo);
                choise(zoo, camels, cats, dogs, donkeys, hamsters, horses, arrayPets, arrayPack_animal);
            break;
            case 3:
                funcFindAnimal(zoo);
                choise(zoo, camels, cats, dogs, donkeys, hamsters, horses, arrayPets, arrayPack_animal);
            break;
            case 4:
                funcCommands(zoo, camels, cats, dogs, donkeys, hamsters, horses, arrayPets, arrayPack_animal);
                choise(zoo, camels, cats, dogs, donkeys, hamsters, horses, arrayPets, arrayPack_animal);
            break;
            case 5:
                System.out.println("Домашних животных: " + arrayPets[0]);
                System.out.println("Вьючных животных: " + arrayPack_animal[0]);
                choise(zoo, camels, cats, dogs, donkeys, hamsters, horses, arrayPets, arrayPack_animal);
            break;
            case 6:
                System.out.println("До свидания!");
            break;
            default:
                System.out.println("Действия с таким номером не существует");
                choise(zoo, camels, cats, dogs, donkeys, hamsters, horses, arrayPets, arrayPack_animal);
            break;
        }
    }
    public static void funcAdd(Zoo zoo, int[] arrayPets, int[] arrayPack_animal){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите имя животного:");
        String nameAnimal = scan.nextLine();
        System.out.println("Введите тип животного:");
        String typeAnimal = scan.nextLine();
        System.out.println("Введите дату рождения животного в формате гг-мм-дд:");
        String BirthDayAnimal = scan.nextLine();
        System.out.println("Ваше животное относится к группе pets или к группе pack animal:");
        String typeName = scan.nextLine();
        if((typeName.toLowerCase()).equals("pets")){
            arrayPets[0]++;
        }
        else if((typeName.toLowerCase()).equals("pack animal")){
            arrayPack_animal[0]++;
        }
        else{
            System.out.println("Вы указали неверную группу животного");
        }
        zoo.addAnimal(new Animal(nameAnimal, typeAnimal, BirthDayAnimal, typeName));
    }

    public static void funcShowZoo(Zoo zoo){
        if((zoo.getAnimal()).size() == 0){
            System.out.println("Список животных пуст");
        }
        for (Animal animal : zoo.getAnimal()) {
            System.out.println(animal);
        }
    }

    public static void funcFindAnimal(Zoo zoo){
        System.out.println("Введите дату рождения искомых животных в формате гг-мм-дд:");
        Scanner scanner = new Scanner(System.in);
        String date = scanner.nextLine();
        zoo.findAnimalBirthDay(date);
    }

    public static void funcCommands(Zoo zoo, Camels camels, Cats cats, Dogs dogs, Donkeys donkeys, Hamsters hamsters, Horses horses, int[] arrayPets, int[] arrayPack_animal){
        Scanner scan = new Scanner(System.in);
        System.out.println("Список команд какого животного вы хотите увидеть?");
        System.out.println("1 - верблюд");
        System.out.println("2 - кот");
        System.out.println("3 - собака");
        System.out.println("4 - осёл");
        System.out.println("5 - хомяк");
        System.out.println("6 - лошадь");
        int result = scan.nextInt();
        switch (result) {
            case 1:
                System.out.println(camels.ShowCommands());
            break;
            case 2:
                System.out.println(cats.ShowCommands());
            break;
            case 3:
                System.out.println(dogs.ShowCommands());
            break;
            case 4:
                System.out.println(donkeys.ShowCommands());
            break;
            case 5:
                System.out.println(hamsters.ShowCommands());
            break;
            case 6:
                System.out.println(horses.ShowCommands());
            break;
            default:
                System.out.println("Типа животного с таким номером не существует");
                choise(zoo, camels, cats, dogs, donkeys, hamsters, horses, arrayPets, arrayPack_animal);
            break;
        }
    }
}
