/* 
NAMA  : ARINI JELITA REZEKI SITANGGANG
NIM   : 41425006
PRODI : TEKNOLOGI REKAYASA PERANGKAT LUNAK
*/

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.del.rental;

/**
 *
 * @author Arini
 */

public class VehicleRental {
    public String plateNumber;
    public double rentalRatePerDay;
    private int rentalDays;
    double discountRate;

    public VehicleRental(String plateNumber, double rate) {
        this.plateNumber = plateNumber;
        this.rentalRatePerDay = rate;
    }

    public void setRentalDays(int days) {
        this.rentalDays = days;
    }

    public double getTotalCost() {
        return (rentalRatePerDay * rentalDays) -
               (rentalRatePerDay * rentalDays * discountRate);
    }
}
