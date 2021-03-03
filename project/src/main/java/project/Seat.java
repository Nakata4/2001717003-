package project;

public class Seat
{
    public static void main(String[] args) {
        double RandomSeatNumber = Math.random() * 5;
        System.out.println("RandomSeatNumber = " + RandomSeatNumber);
        int randomSeat = (int)RandomSeatNumber;
        System.out.println("randomSeat = " + randomSeat);
        /**
         * this is a randomizer class 
         */
    }

    public  Seat(int number, boolean isTaken) {   
    }
    public int getNumber() {
    	return number;
    }
    public void setNumber(int number) {
    	this.number = number;
    }
    public boolean isTaken() {
    	return isTaken;
    }
    public void setTaken(boolean isTaken) {
    	this.isTaken = isTaken;
    }
    private int number;
    private boolean isTaken;
}
	