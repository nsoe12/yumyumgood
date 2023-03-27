package com.cookpang.app.payment.dto;

import java.time.LocalDateTime;

public class PaymentDTO {
    private int paymentNumber;
    private int orderNumber;
    private int paymentAmount;
    private LocalDateTime paymentDate;
    private String paymentMethod;

    public PaymentDTO() {
    }

    public int getPaymentNumber() {
        return paymentNumber;
    }

    public void setPaymentNumber(int paymentNumber) {
        this.paymentNumber = paymentNumber;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public int getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(int paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public LocalDateTime getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(LocalDateTime paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

	@Override
	public String toString() {
		return "PaymentDTO [paymentNumber=" + paymentNumber + ", orderNumber=" + orderNumber + ", paymentAmount="
				+ paymentAmount + ", paymentMethod=" + paymentMethod + "]";
	}

   
}
