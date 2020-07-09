package com.codedifferently.stayready.lab04;


public class Shapes {

    public String triangle(int n ) {
        String triangle = "triangle()\n*** Output ***\n";

        String star = "*";
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j <= i; j++) {
                triangle += star;
            }
            if (i < n) {
                triangle += "\n";
            }
            if (i == n) {
                triangle += "";
            }

        }
        return triangle;
    }

    public String tableSquare(int n){
        String table="squares()\n*** Output ***\n";
        int product=0;
        for (int i =1;i<n+1;i++){
            for (int j=1;j<n+1;j++){
                product=i*j;
                table+="| "+product+" ";

            }
            //if()
            table+="|"+"\n";
        }



        return table;
    }

    public String tableSquares(int n){
        String table="squares()\n*** Output ***\n";
        int product=0;
        for (int i =1;i<n+1;i++){
            for (int j=1;j<n+1;j++){
                product=i*j;
                table+="| "+product+" ";

            }
            //if()
            table+="|"+"\n";
        }



        return table;
    }
}
