package src.jetons;

import java.util.Scanner;

public class JetonRotationDeplacement {
    public void rotation(){
        boolean choixDef = false;

        while(!choixDef){
            System.out.println("numero entre 1 et 4");
            Scanner scanner  = new Scanner(System.in);
            int nombreMur = scanner.nextInt();
            TuilesQuartiers choix = choixTuile();
            choix.setMur(int nombreMur);
        }
    }

    public void deplacement(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choisi le detective à deplacer");
        int choix = scanner.nextInt();
        if(detective.getNom() == "Watson"){
            detective.setPlace(detective.getPlace()+choix);
            switch(detective.getPlace()){
                case 13:
                    detective.setPlace(1);
                    break;
                case 14:
                    detective.setPlace(2);
                    break;
            }
        }
    }
}