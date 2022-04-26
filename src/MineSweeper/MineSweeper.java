package MineSweeper;

import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    int row;
    int col;
    String[][] map;
    String[][] game;
    Boolean isOver;

    public MineSweeper(int row,int col){
        this.row=row;
        this.col=col;
        this.map= new String[row][col];
        this.game=new String[row][col];
        this.isOver=false;
    }

    public void construction(){
        int numberMine = (int) (this.row*this.col/4);
        for(int i=0;i<this.row;i++){
            for(int j=0;j<this.col;j++){
                this.map[i][j]="-";
            }
        }
        for(int i=0;i<this.row;i++){
            for(int j=0;j<this.col;j++){
                this.game[i][j]="-";
            }
        }
        int count=0;
        Random random = new Random();
        while (count<numberMine){
            int mineRow = random.nextInt(this.row);
            int mineCol = random.nextInt(this.col);
            this.map[mineRow][mineCol]="*";
            count++;
        }
    }
    public void printMap(){
        for(int i=0;i<this.row;i++){
            for(int j=0;j<this.col;j++){
                System.out.print(this.map[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("===============");
    }
    public void printGame(){
        for(int i=0;i<this.row;i++){
            for(int j=0;j<this.col;j++){
                System.out.print(this.game[i][j]+" ");
            }
            System.out.println();
        }
    }
    public void selecting(int row,int col){
        int counter=0;
        if(this.map[row][col].equals("*")){
            isOver=true;
        }else {
            for(int k=row-1;k<=row+1;k++){
                for (int l=col-1; l<=col+1; l++){
                    if(!(k==row && l==col)) {
                        try {
                            if(this.map[k][l].equals("*")){
                                counter++;
                            }
                        }catch(Exception ignored){

                        }
                    }


                }
            }
            this.game[row][col]=String.valueOf(counter);
        }

    }
    public boolean isFinished(){
        for(int i=0;i<this.row;i++){
            for(int j=0;j<this.col;j++){
                if((this.game[i][j].equals("-")) && (this.map[i][j].equals("-")) ){
                    return false;
                }

            }
        }
        return true;
    }
    public void run(){
        construction();
        printMap();
        Scanner inp = new Scanner(System.in);
        while (!isOver){
            printGame();
            System.out.print("Row: ");
            int inputRow=inp.nextInt();
            System.out.print("Column: ");
            int inputCol=inp.nextInt();

            if (inputRow<0 || inputRow>this.row || inputCol<0 || inputCol>this.col){
                System.out.println("Hatali giris yaptiniz!");
                continue;
            }
            selecting(inputRow,inputCol);
            if(isFinished()){
                System.out.println("Tebrikler! Kazandiniz!");
                break;
            }
            if(isOver){
                System.out.println("!!!!!Mayina bastin!!!!!");
                printMap();
            }
        }
    }
}
