/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

/**
 *
 * @author RAFAEL
 */
public interface OnlinePaymentService {

    double paymentFee(double amount);

    double interest(double amount, int months);

}
