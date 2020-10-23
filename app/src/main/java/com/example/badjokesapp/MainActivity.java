package com.example.badjokesapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.os.ConfigurationCompat;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import org.w3c.dom.Text;

import java.util.*;
import java.lang.*;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void jokeGenerator(View view) {

        Locale curr = ConfigurationCompat.getLocales(getResources().getConfiguration()).get(0);
        String current_Locale = String.valueOf(curr);

        Random rand = new Random();
        int rand_joke = rand.nextInt(5);

        ArrayList<String> badjokes = new ArrayList<String>();

        badjokes.add("-Knock, knock.\n" +
                "-Who’s there?\n" +
                "--very long pause --\n" +
                "-Java.");
        badjokes.add("There are three kinds of lies: Lies, damned lies, and benchmarks.");
        badjokes.add("The generation of random numbers is too important to be left to chance.");
        badjokes.add("Debugging: Removing the needles from the haystack.");
        badjokes.add("How many programmers does it take to change a light bulb?\n" +
                "None – It’s a hardware problem");

        ArrayList<String> suchary = new ArrayList<String>();
        suchary.add("Z programowaniem jak z budową katedry, budujesz,budujesz a potem się modlisz (żeby wszystko działało)");
        suchary.add("Żona do programisty: idź do sklepu kup 5 bułek, a jak będą jajka kup 10.\n" +
                    "Programista będąc w sklepie: – Są jajka?\n" +
                    "Sprzedawczyni: – Tak, są.\n" +
                    "Programista: To poproszę 10 bułek.");
        suchary.add("Najkrótszy żart na świecie?\n" +
                "– programista HTML");
        suchary.add("Rozmawia dwóch adminów:\n" +
                "Pierwszy: pożycz mi 500 zł\n" +
                "Drugi: masz 512 do równego");
        suchary.add("Wysprzątane mieszkanie to znak, że komputer jest zepsuty.");

        TextView tv = findViewById(R.id.jokeArea);
        if (current_Locale.startsWith("pl")) {
            tv.setText(suchary.get(rand_joke));
        }else{
            tv.setText(badjokes.get(rand_joke));
        }


    }
}