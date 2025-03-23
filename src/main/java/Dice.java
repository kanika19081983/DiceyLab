
public class Dice {
    //Dice dice = new Dice(2); // for craps
   //   Dice dice = new Dice(5); // for yatzee
public int  numOfDice;
public Dice (int numOfDice) {
    this.numOfDice = numOfDice;
}
public Integer diceRoll() {
    int totalSumOfDice = 0;
    for (int i = 0 ; i< numOfDice; i++) {
        totalSumOfDice += (int) Math.floor((Math.random()*6) +1 );
    }
    return totalSumOfDice;
}
public int getNumOfDice() {
    return numOfDice;
}

   
}
