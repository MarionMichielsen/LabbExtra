package se.marion;
import java.util.*;

public class Life {
   int antalGrannar = 0;

    int[][] world = new int[140][140];
    int[][] newWorld = new int [140][140];
    Random rand = new Random();
    
public void createLife(){
    for(int i = 0 ; i < 140 ; i++){
        for(int j = 0 ; j < 140; j++){
            world[i][j] = rand.nextInt(2);
        }
     }
}

public void liveOrDie(){
    for(int i = 0 ; i <140 ; i++){
        for(int j = 0 ; j < 140; j++){
            antalGrannar = checkGranne(i,j);
  if (antalGrannar < 2)
      newWorld[i][j]= 0;
  else if (antalGrannar > 3)
    newWorld[i][j]=0;
  else if (antalGrannar == 3)
      newWorld[i][j]=1;
  else if (world[i][j]== 1 && antalGrannar ==2)
    newWorld[i][j]=1;
    }
        }
        newWorld= world;
    }

    public int checkGranne(int i, int j){
        antalGrannar = 0;
     try {
        if (world[i+1][j] == 1) 
            antalGrannar++;
        if (world[i-1][j] == 1) 
            antalGrannar++;
        if (world[i][j-1] == 1) 
            antalGrannar++;
        if (world[i-1][j-1] == 1) 
            antalGrannar++;
        if (world[i+1][j-1] == 1) 
            antalGrannar++;
        if (world[i][j+1] == 1) 
            antalGrannar++;
        if (world[i-1][j+1] == 1) 
            antalGrannar++;
        if (world[i+2][j+1] == 1) 
            antalGrannar++;
    } 
    catch (Exception e){ 
    }
    return antalGrannar;
    }   

public void printWorld(){
    for(int i = 0 ; i < 140 ; i++){
        for(int j = 0 ; j < 140; j++){
            if ((world[i][j])== 1)
            System.out.print("*");
            else System.out.print(" ");
        }
        System.out.println();
    }
    System.out.print("________________________________________________________________________________________________________________________________");
    }
   
}