package com.example;

import java.util.ArrayList;
import java.util.Random;

public class JokeSource {
    ArrayList<String> jokeList;
    private void getAllJokes(){
        jokeList = new ArrayList<>();
            jokeList.add("Why couldn't the bicycle stand up?"+
                    "Because it was two tired");
            jokeList.add("What do you call a cheese that isn't yours?"+
                    "Nacho Cheese!");
            jokeList.add("Before I criticize a man, I like to walk a mile in his shoes."+
                    "That way, when I do criticize him, I'm a mile away and I have his shoes.");
            jokeList.add("What do you call a fish with no eye?"+
                    "Fssshh");
            jokeList.add("Have you heard the one about the Corduroy pillow?"+
                    "It's making HEADLINES!");
            jokeList.add("What's red and bad for your teeth?"+
                    "A brick.");
            jokeList.add("Why didn't the melons get married?"+
                    "Because they cantaloupe!");
            jokeList.add("What did the cobbler say when a cat wandered into his shop?"+
                    "Shoe!");
            jokeList.add("What did the Buddhist say to the hot dog vendor?"+
                    "Make me one with everything!");
            jokeList.add("The face of a child can say it all"+
                    "especially the mouth part of the face.");
            jokeList.add("Why did the cookie go to the hospital?"+
                    "Because he felt crummy.");
            jokeList.add("I intend to live forever..."+
                    "So far, so good.");
    }
    public String getJoke(){
        getAllJokes();
        Random rand = new Random();
        int randomNum = rand.nextInt((jokeList.size()));
        return jokeList.get(randomNum);
    }
}
