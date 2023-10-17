package ru.mirea.uibo02.trukhachev;

import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        List<Pet> pets = new ArrayList<>();

        pets.add(new Dog("Buddy", 3));
        pets.add(new Dog("Max", 5));
        pets.add(new Dog("Charlie", 2));

        pets.add(new Cat("Whiskers", 4));
        pets.add(new Cat("Smokey", 2));
        pets.add(new Cat("Luna", 1));

        int desiredAge = 2;
        List<Cat> catsByAge = new ArrayList<>();
        for (Pet pet : pets)
        {
            if (pet.isCat() && ((Cat) pet).isAge(desiredAge))
            {
                catsByAge.add((Cat) pet);
            }
        }

        System.out.println("Cats with age " + desiredAge + ":");
        for (Cat cat : catsByAge)
        {
            System.out.println("Name: " + cat.getName() + ", Type: " + cat.getType());
        }
    }
}