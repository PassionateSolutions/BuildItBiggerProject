package com.example.android.javalib;

import java.util.List;
import java.util.Random;

import static java.util.Arrays.asList;

public class JavaJokeLib {

    // Zombie Joke List

    List<String> zombieJokeList = asList (

        "(1)Why are zombies so successful? \n They are so dedicated!",
            "(2)Why couldn't the Zombie find a Valentine's Day date? \n Hey kept getting told he was a dead beat.",
            "(3)What do you call a zombie that comes back to life? \n Return of the Living Dead",
            "(4)A zombie walks into an empty bar and says 'This place is dead.'",
            "(5)Brains! - A Zombie 2019",
            "(6)What does a vegetarian zombie eat? \n Graaaainnnnssssss!!!!",
            "(7)What is a zombie's favorite shampoo? \n Head and Shoulders!",
            "(8)How did Frosty The Snowman turn into a zombie? \n Frost Bite",
            "(9)What kind of makeup do Zombies wear? \n Mas-scare-yah",
            "(10)How does 007 introduce himself when he is a zombie? \n Dead, Brain Dead"
    );

    public String pullJokeFromZombieJokeList(){

        // Creates Random variable to generate a random joke from the @zombieJokeList
        Random randomZombieJoke = new Random();

        // Pulls a Joke at random from the @zombieJokeList
        String pullRandomZombieJoke = zombieJokeList.get(randomZombieJoke.nextInt(zombieJokeList.size()));

        return pullRandomZombieJoke;

    }

}
