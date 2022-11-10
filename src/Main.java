import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random r =new Random();
        Scanner input = new Scanner(System.in);
        String t;
        Integer randomNumber,randomNumber2;
        ArrayList<String> teams = new ArrayList<>();
        ArrayList<String> reverseList=new ArrayList<>();
        ArrayList<String> temporaryList=new ArrayList<>();
        System.out.println("Fikstür oluşturucuya hoşgeldiniz!");
        System.out.print("Kaç adet takım gireceksiniz : ");
        int teamCount = input.nextInt();
        System.out.println("-Takımları giriniz-");
        for (int i = 1; i <= teamCount;i++) {
            System.out.println(i + ".Takım : ");
            t = input.next();
            teams.add(t);
        }
        if (teamCount % 2 == 1) {
            teams.add("bay");
        }
        System.out.println("-TAKIMLAR-");
        for (String i:teams) {
            if (!i.equals("bay")){
            System.out.println("- "+i);
            }
        }
        temporaryList.addAll(teams);
        for (int i=1;i<=(teams.size()-1);i++){
            System.out.println("Round "+i);
            for (int j=0;j<teams.size()/2;j++){
            randomNumber=(r.nextInt(temporaryList.size()));
            System.out.print(temporaryList.get(randomNumber)+" vs ");
            String temporary;
            temporary=temporaryList.get(randomNumber);
            //reverseList.add(temporaryList.get(randomNumber));
            temporaryList.remove(temporaryList.get(randomNumber));
            randomNumber2=(r.nextInt(temporaryList.size()));
            System.out.println(temporaryList.get(randomNumber2));
            reverseList.add(temporaryList.get(randomNumber2));
            reverseList.add(temporary);
            temporaryList.remove(temporaryList.get(randomNumber2));
            }
                System.out.println();
            temporaryList.addAll(teams);

        }
         int a =0;
        for (int i=teams.size();i<teams.size()*2-1;i++){
            System.out.println("Round "+i);
            for (int j =0;j<teams.size()/2;j++){
                System.out.print(reverseList.get(0)+" vs ");
                reverseList.remove(0);
                System.out.println(reverseList.get(0));
                reverseList.remove(0);
            }

        }
    }
}
