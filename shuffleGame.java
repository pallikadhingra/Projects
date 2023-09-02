import java.util.Scanner;
class Game{
    int arr[] = new int[5];
    int n = arr.length;

    Game(){
        
    System.out.println(" --  --  --  --  --  ");
    System.out.print("| ");
        
    for(int i = 0; i<n; i++){
        System.out.print(arr[i] + " | ");
    }
    System.out.println();

    System.out.println(" --  --  --  --  --  ");

    System.out.println("You currently have 7 chances");
    }   
}

class Chances extends Game{
    int arr[] = new int[5];
    int n = arr.length;
    int points = 0;

    public void CleanArray(){
        for(int i = 0; i<n; i++){
            arr[i] = 0;
        }
    }

    public void printResult(){
        for(int i = 0; i<n; i++){
            if(arr[i]!=0){
                System.out.println("Failed!");
                break;
            }
        }

    }

    public void input(){
        System.out.println("enter number: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        if(x<1 || x>n){
            System.out.println("invalid number! please try again");
        }

        if(arr[x-1]==1){
            arr[x-1] = 0;
            points = points + 10;
        }

        else{
            points = points - 2;
        }

        System.out.println("current points: " + points);

        sc.close();
    }

}

class Chance1 extends Chances{
    
    Chance1(){
        arr[0] = 1;
        arr[1] = 1;
        arr[4] = 1;

        super.input();
    }

}

class Chance2  extends Chances{
    int count = 0;

    Chance2(){

        for(int i =0; i<n; i++){
            if(arr[i]!=0){
                count = count + 1;
            }
        }

        super.CleanArray();

        if(count==2){
            arr[2] = 1;
            arr[4] = 1;

            super.input();
        }

        else{
            arr[0] = 1;
            arr[2] = 1;
            arr[4] = 1;

            super.input();
        }

    }


}

class Chance3 extends Chances{
    int count = 0;

    Chance3(){
        for(int i = 0; i<n; i++){
            if(arr[i]!=0){
                count = count + 1;
            }
        }

        super.CleanArray();

        if(count==1){
            arr[3] = 1;

            super.input();
        }

        else if(count==2){
            arr[0] = 1;
            arr[2] = 1;

            super.input();
        }

        else{
            arr[1] = 1;
            arr[2] = 1;
            arr[4] = 1;

            super.input();
        }
    }

}
class Chance4 extends Chances{
    int count = 0;

    Chance4(){

        for(int i = 0; i<n; i++){
            if(arr[i]!=0){
                count = count + 1;
            }
        }

        super.CleanArray();

        if(count==0){
            System.out.println("You won");
            return;
        }

        else if(count==1){
            arr[1] = 1;

            super.input();
        }

        else if(count==2){
            arr[1] = 1;
            arr[3] = 1;

            super.input();
        }

        else{
            arr[0] = 1;
            arr[3] = 1;
            arr[4] = 1;

            super.input();
        }
    }

}

class Chance5 extends Chances{
    int count = 0;

    Chance5(){
        for(int i = 0; i<n; i++){
            if(arr[i]!=0){
                count = count + 1;
            }
        }

        super.CleanArray();

        if(count==0){
            System.out.println("You won");
        }

        else if(count==1){
            arr[4] = 1;
        }
        
        else if(count==2){
            arr[3] = 1;
            arr[0] = 1;
        }

        else{
            arr[0] = 1;
            arr[2] = 1;
            arr[3] = 1;
        }

        super.printResult();
    }
}

public class shuffleGame{
    public static void main(String[] args) {
        
        Game g1 = new Game();
        //Chances chance = new Chances();
        Chance1 c1 = new Chance1();
        Chance2 c2 = new Chance2();
        Chance3 c3 = new Chance3();
        Chance4 c4 = new Chance4();
        Chance5 c5 = new Chance5();

        System.out.println(g1);
        //System.out.println(chance);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);


    }
}











