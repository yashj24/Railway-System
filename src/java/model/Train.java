
package model;



import java.sql.Date;
import java.sql.Time;

/**
 *
 * @author HP
 */
public class Train {
    
    int train_no;
    String trainName;    
    String deptStat;
    String arrStat;
    int seatsAvail;
    Date doj;
    Time dept;
    Time arrival;
    int fare;
    int totalSeats;

    public Time getDept() {
        return dept;
    }

    public void setDept(Time dept) {
        this.dept = dept;
    }

    public Time getArrival() {
        return arrival;
    }

    public void setArrival(Time arrival) {
        this.arrival = arrival;
    }
 

    public int getTrain_no() {
        return train_no;
    }

    public void setTrain_no(int train_no) {
        this.train_no = train_no;
    }

    public String getTrainName() {
        return trainName;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public String getDeptStat() {
        return deptStat;
    }

    public void setDeptStat(String deptStat) {
        this.deptStat = deptStat;
    }

    public String getArrStat() {
        return arrStat;
    }

    public void setArrStat(String arrStat) {
        this.arrStat = arrStat;
    }

    public int getSeatsAvail() {
        return seatsAvail;
    }

    public void setSeatsAvail(int seatsAvail) {
        this.seatsAvail = seatsAvail;
    }

    public Date getDoj() {
        return doj;
    }

    public int getFare() {
        return fare;
    }

    public void setFare(int fare) {
        this.fare = fare;
    }
    
    

    public void setDoj(Date doj) {
        this.doj = doj;
    }
    public int getTotalSeats() {
        return totalSeats;
    }

    public void setTotalSeats(int totalSeats) {
        this.totalSeats = totalSeats;
    }

    @Override
    public String toString() {
        return "Train{" + "train_no=" + train_no + ", trainName=" + trainName + ", deptStat=" + deptStat + ", arrStat=" + arrStat + ", seatsAvail=" + seatsAvail + ", doj=" + doj + ", dept=" + dept + ", arrival=" + arrival + ", fare=" + fare + ", totalSeats=" + totalSeats + '}';
    }
    
    
    
    
    

    
    
    
    
    
    
}
