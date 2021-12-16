package se.marion;

public class GissaTal {

    public void slumpTal(){
        int slumptal = (int)(100*Math.random())+1; //slumpar fram ett tal mellan 1 och 100
        String guess;
        boolean playAgain = true;
        boolean JEllerN = true;
        int numberOfGuesses = 0;
        String answer;
        int intGuess;
        System.out.println("Gissa ett tal mellan 1 och 100."); //ber användaren att mata in ett tal

        while (playAgain && JEllerN){
            guess = System.console().readLine(); // tar emot input 
            try { intGuess = Integer.parseInt(guess); // kollar om det är en int som har matats in
            }
            catch (Exception e){
                System.out.println("Please enter numbers only."); //om det inte är en int, be avändaren att mata in ett tal
                continue;
            }

           if (intGuess < slumptal){ //om man har matat in ett för litet tal
                numberOfGuesses++;
                System.out.println("Talet är större.");
            }
            else if (intGuess > slumptal){ //om man har matat in ett för stort tal
                numberOfGuesses++;
                System.out.println("Talet är mindre");
            }

            else if (intGuess == slumptal){ //om man har gissat rätt händer det:
                numberOfGuesses++;
                System.out.println("Rätt! Du gissade rätt på "+numberOfGuesses+ " försök.");
                System.out.println("Vill du spela igen? J/N");
                answer = System.console().readLine(); //tar emot svar om man vill spela igen
                if (JEllerN){
                    if (answer.equalsIgnoreCase("J")){ //om han vill spela igen:
                        slumptal = (int)(100*Math.random())+1; //slumpa fram ett nytt tal
                        numberOfGuesses = 0; //sätter antal gissningar på 0
                        System.out.println("Gissa ett tal mellan 1 och 100."); //och ber användaren att mata in ett tal
                    }
                    else if (answer.equalsIgnoreCase("N")) { // om han inte vill spela igen: exit
                        System.exit(0);
                    }
                    else {
                        JEllerN = false; // användaren har svarat nåt annat än J eller N
                        while (JEllerN == false){ //ska köra den här koden tills man får svar J eller N
                            System.out.println("Ogiltigt svar. Vill du spela igen? Svar J eller N.");
                            answer = System.console().readLine(); //nytt svar på J/N frågan
                            if (answer.equalsIgnoreCase("J") || answer.equalsIgnoreCase("N")){ //om man nu har matat in J eller N händer det:
                                JEllerN = true; 
                                if (answer.equalsIgnoreCase("J")){ //om ja, nytt slumptal, antal gissningar på 0 och begär nytt tal från användaren och börja om från början
                                    slumptal = (int)(100*Math.random())+1;
                                    numberOfGuesses = 0;
                                    System.out.println("Gissa ett tal mellan 1 och 100.");
                                    continue;
                                }
                                else  {
                                    System.exit(0); //om nej, exit.
                                }
                            }
                        }
                    }
                }
            }

        }
    }
    
    
}