package com.learnit1;

public class Zoo {
    public void feedAnimals(Animal[] animals)
    {
        for (Animal animal:animals)
        {
            animal.eat();
            animal.age();
        }
    }
}
