package Assignment_2;



import java.util.Random;
import java.util.Scanner;



public class Q11 {
public static void main(String [] args)
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the passenger details");
    System.out.println("Enter the train name");
    String trainName=sc.next();
    System.out.println("Enter the passenger name");
    String passengerName=sc.next();
    TrainReservation trainReservation=new TrainReservation(trainName,passengerName);
    TrainReservation [] arr=new TrainReservation[10];
    for(int i=0;i<arr.length;i++)
    {
        //TrainReservation trainReservation=new TrainReservation(trainName,passengerName);
        arr[i]=trainReservation;
    }
    int  Id=trainReservation.trainId;
    System.out.println(check(Id));
    



}
private static String check(int trainId)
{
    System.out.println("please enter your train id");
    Scanner s=new Scanner(System.in);
    int x=s.nextInt();
    if(x==trainId)
    {
        return "seat is reserved";
    }
    else
    {
        return "unserved";
    }
}
}
class TrainReservation{
    Random random =new Random();
    int trainId=random.nextInt();
    String trainName;
    String passengerName;
    public TrainReservation(String trainName, String passengerName) {
        super();
        System.out.println("your train Id number after booking is " +trainId);
        this.trainName = trainName;
        this.passengerName = passengerName;
    }
    public int getTrainId() {
        return trainId;
    }
    public void setTrainId(int trainId) {
        this.trainId = trainId;
    }
    public String getTrainName() {
        return trainName;
    }
    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }
    public String getPassengerName() {
        return passengerName;
    }
    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }
    public String toString() {
        return "TrainReservation [trainId=" + trainId + ", trainName="
                + trainName + ", passengerName=" + passengerName + "]";
    }
}