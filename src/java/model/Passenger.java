/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author HP
 */
public class Passenger {

    String firstName;
    String lastName;
    int age;
    double mobile;
    String email;
    String address;
    String city;
    String state;
    String gender;
    int trainNo;
    int bookingID;
    String seatNo;
    String status;
    int Sno;

    public int getSno() {
        return Sno;
    }

    public void setSno(int Sno) {
        this.Sno = Sno;
    }
   

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getTrainNo() {
        return trainNo;
    }

    public void setTrainNo(int trainNo) {
        this.trainNo = trainNo;
    }

    public String getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(String seatNo) {
        this.seatNo = seatNo;
    }

    public int getBookingID() {
        return bookingID;
    }

    public void setBookingID(int bookingID) {
        this.bookingID = bookingID;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMobile() {
        return mobile;
    }

    public void setMobile(double mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Passenger{" + "firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", mobile=" + mobile + ", email=" + email + ", address=" + address + ", city=" + city + ", state=" + state + ", gender=" + gender + ", trainNo=" + trainNo + ", bookingID=" + bookingID + ", seatNo=" + seatNo + '}';
    }

}
