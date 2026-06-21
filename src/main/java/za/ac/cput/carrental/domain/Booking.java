/*Booking domain entity
        Author: Tanatswa Mabhodha
        Student No:220637482
        Date: 21 June 2026
*/

package za.ac.cput.carrental.domain;

import java.time.LocalDate;

public class Booking {
    private String bookingId;
    private String memberId;
    private String carId;
    private String startDate;
    private String  endDate;
    private double totalCost;

    protected Booking(){}

    private Booking(Builder builder){
        this.bookingId = builder.bookingId;
        this.memberId = builder.memberId;
        this.carId = builder.carId;
        this.startDate = builder.startDate;
        this.endDate = builder.endDate;
        this.totalCost = builder.totalCost;
    }

    public String getBookingId(){return bookingId;}
    public String getMemberId(){return memberId;}
    public String getCarId(){return carId;}
    public String getStartDate(){return startDate;}
    public String getEndDate(){return endDate;}
    public double getTotalCost(){return totalCost;}

    public int calculateRentalDuration(){
        LocalDate start = LocalDate.parse(startDate);
        LocalDate end = LocalDate.parse(endDate);
        int days = end.getDayOfYear() - start.getDayOfYear();
        return days/365;
    }

    public void extendRental(String newEndDate){
        this.endDate = newEndDate;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingId='" + bookingId + '\'' +
                ", memberId='" + memberId + '\'' +
                ", carId='" + carId + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", totalCost=" + totalCost +
                '}';
    }

    public static class Builder{
        private String bookingId;
        private String memberId;
        private String carId;
        private String startDate;
        private String endDate;
        private double totalCost;

public Builder BookingId(String bookingId){
    this.bookingId = bookingId;
    return this;
}
public Builder MemberId(String memberId){
    this.memberId = memberId;
    return this;
}
public Builder CarId(String carId){
    this.carId = carId;
    return this;
}
public Builder StartDate(String startDate){
    this.startDate = startDate;
    return this;
}
public Builder EndDate(String endDate){
    this.endDate = endDate;
    return this;
}
public Builder setTotalCost(double totalCost){
    this.totalCost = totalCost;
    return this;
}
public Builder copy(Booking book){
    this.bookingId = book.bookingId;
    this.memberId = book.memberId;
    this.carId = book.carId;
    this.startDate = book.startDate;
    this.endDate = book.endDate;
    this.totalCost = book.totalCost;
    return this;

}

public Booking build(){
    return new Booking(this);
}
    }
}


