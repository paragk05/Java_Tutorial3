package com.learnit1;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ZooTest
{

    @Test
    public void shouldAnswerWithTrue()
    {
       Zoo zoo= new Zoo();
       Animal[] animals={new Dog(),new Gorila(),new Lion(),new Tiger()};
       zoo.feedAnimals(animals);
    }
}
