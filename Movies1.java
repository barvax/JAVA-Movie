package com.company;

import java.util.Arrays;

public class Movies1 {
   int rows = 5;
   int seatsInArow = 20;

    String[][] text = new String[rows][seatsInArow];

    int myRow;
    int inRow ;

public int _inRow(){
    if((seatsInArow&2)==0){
       return inRow = seatsInArow/2;
    }
       inRow = (int)(Math.ceil(seatsInArow/2));
    return inRow;
}
public int _myRow(){
    if(rows/2%2==0){
        myRow = rows/2;
        return myRow;
    }
        myRow = (int)(Math.ceil(rows/2));
        return myRow;
    }


    ////בונה את האולם בהתחלה////
public void initMovieSeats(){
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < seatsInArow; j++) {
          text[i][j]="o";
        }
    }
    }


///רק במקרה שהשורה פנויה לגמרי זה מחזיר את כמות הכסאות פחות האמצע
public int Tickets(int tickets){
    if(tickets==1){
        return 0;
    }else if(tickets%2==0){
        return tickets/2;
    }
    return (tickets-1)/2;
}



    /////מחזיר את הכיסא הראשון שניתן להושיב בו
public int Test(int tickets , int row) {
    int numOfSeat = 0;

    if (text[row][_inRow()] != "o") {
        for (int i = _inRow(); i < seatsInArow; i++) {
            if (text[row][i] == "o") {
                numOfSeat++;

                if (numOfSeat == tickets) {

                    return ((i+1)-tickets );
                }
            } else {
                numOfSeat = 0;
            }

        } for (int j = _inRow(); j >= 0; j--) {
            if (text[row][j] == "o") {
                numOfSeat++;

                if (numOfSeat == tickets) {
                    return (j );
                }
            } else {
                numOfSeat = 0;

            }
        }

    }

    return _inRow()-Tickets(tickets);
}


///מושיב את הצופים
    public void SetInRowSeats(int tickets){

    if (tickets<=seatsInArow ){
        int  currentRow = checkIfRowIsAVl(tickets);
        int currentSeat = Test(tickets,currentRow);

        for (int i = 0; i < tickets; i++) {
            text[currentRow][currentSeat+i]="S";
        }
        if(currentSeat-1>=0){
            text[currentRow][currentSeat-1]="x";
        }
        if(currentSeat+tickets<seatsInArow){
            text[currentRow][currentSeat+tickets]="x";
        }

    }else{
        System.out.println("you can't buy "+tickets+" tickets,the max tickets is:  " + seatsInArow);
    }


    }

    public void getSeats( int tickets){
        SetInRowSeats(tickets);
    }



    /////זה צריך להחזיר לי מספר שורה שאפשר להושיב בה
    public int checkIfRowIsAVl(int tickets ){
int ron = 0;
    if (tickets<=seatsInArow){
            int counter = 0;
            for (int i = 0; i < _myRow()+1; i++) {
                for (int j = 0; j < seatsInArow; j++) {

                    if(text[_myRow()-i][j]=="o"){
                        counter++;
                        if(counter==tickets){

                            return (_myRow()-i);
                        }
                    }else{
                        counter=0;
                    }
                }


            }
            if(rows%2==0){
            ron = _myRow();
            }else{
                ron = (_myRow()+1);
            }
            for (int i = 0; i < (ron); i++) {
                for (int j = 0; j < seatsInArow; j++) {

                    if(text[_myRow()+i][j]=="o"){
                        counter++;
                        if(counter==tickets){

                            return (_myRow()+i);
                        }
                    }else{
                        counter=0;
                    }
                }


            }
        System.out.println("the Movie is full, you can't buy "+tickets+" tickets. try to buy less tickets or see you next time... " );
            return _myRow();
        }
      //
        return _myRow();


    }





}
