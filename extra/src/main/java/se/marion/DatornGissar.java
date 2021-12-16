package se.marion;

public class DatornGissar {
    public void GissaTal(){
        int slumptal = (int)(100*Math.random())+1; //slumpar fram ett tal mellan 1 och 100
        int max = 100;
        int min = 1;
        int guess = 0;
        int antalGuesses = 0;

        while (guess != slumptal){
        guess = (min+max)/2; //datorn gissar på det talet som ligger precis i mellan max och min
        System.out.println(guess);
        if (guess< slumptal){
            min = guess; // om talet var för litet, anpassar min gränsen till gissningen
            System.out.println("För litet tal.");
            antalGuesses++;
        }
        else if (guess> slumptal){
            max = guess; // om talet var för stort, anpassar max gränsen till gissningen
            System.out.println("För stort tal.");
            antalGuesses++;
        }
        else{
            antalGuesses++;
            System.out.println("Grattis! Du gissade rätt i: "+antalGuesses+ " gånger.");
        }
    }
}
}
