package com.codedifferently.stayready.lab04;


public class Numbers {

    public String oneToTen(){
    	String output ="oneToTen()\n"
    				   +"*** Output ***";
    	for(int x=1; x<=10; x++){
    		output += "\n"+x;
    	}
        return output;
    }

    public String oddNumbers(){
    	String output = "oddNumbers()\n"
    					+"*** Output ***";
    	for(int x =1; x < 20 ; x+=2){
    		output += "\n"+x;
    	}
    		
        return output;
    }

    public String squares(){  

    String output = "squares()\n"+"*** Output ***";//output statement 
    int amountOfSquares=10; //number of iterations 
    int square=0; //product of i squared in each iteration 
    String listOfSquares=""; //string of squares 
    for (int i=1;i<=amountOfSquares;i++){
        square=i*i; //1st iter=1*1,5th iter=5*5
        if(i!=1&&i<amountOfSquares+1){
            listOfSquares=listOfSquares+"\n"; //so that it doesn't add an extra line to the first or last row
        }
        listOfSquares=listOfSquares+square; //add square to list of squares

        }
    output=output+"\n"+listOfSquares;//add output statement and new line
        return output;
    }

    public String even(int n){
        String output = "even()\n"+"*** Output ***";//output statement

        for (int i=1;i<n;i++){ //count from 1-n
            if(i%2==0){ //take out evens only
                output+="\n"+i;//and add them to the output string
            }else{
                //do nothing
            }
        }
        return output;
    }
    public String powers(int n){
        String pows="";
        for (int i=1; i<=n;i++){
            i= (int) Math.pow(1, n);
            pows = pows+i;
        }
        return pows;}

        /*1:
        random4()
2: *** Output ***
3: 3
4: 5
5: 2
6: 8

*/
    //change to a bool, returns true if contains correct stuff
    public boolean random4(){
        int numRands=4; //number of random numbers to output 
        String listRands="1: random4()\n" +"2: *** Output ***\n";//list of random numbers
        int randomNum=0;//random number variable
        for (int i=0;i<numRands;i++){
            randomNum = (int)(Math.random() * 10 + 1);//random number generator
            listRands=listRands+(i+3)+": "+randomNum+"\n";//adds number label and random number to string of random numbers
        }
        boolean c=false; //to see if string contains correct output or not
        for(String split:listRands.split("\n")){//splits and makes new string arrays separated by \n
            //now test each string array with .contains each number label
            if(split.contains("3: ")){
                c=true;}
            if(split.contains("4: ")){
                c=true; }
            if(split.contains("5: ")){
                c=true; }
            if(split.contains("6: ")){
                c=true; }
            if(split.contains("randy ")){ //to test that bool is working properly
                System.out.print("ZZZZ"); //bc this is NOT contained in the string
                c=false; }

        } //if all true means random generator is working
        System.out.print(listRands);
        return c;
    }

}
