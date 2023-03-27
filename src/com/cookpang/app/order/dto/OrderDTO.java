package com.cookpang.app.order.dto;

import java.time.LocalDateTime;

public class OrderDTO {
    private int orderNumber;
    private int userNumber;
    private LocalDateTime orderDate;
    private int orderZipCode;
    private String orderAddress;
    private String orderMessage;
    private int totalCost;
    private String orderStatus;

    public OrderDTO() {}


    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public int getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(int userNumber) {
        this.userNumber = userNumber;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }

    public int getOrderZipCode() {
        return orderZipCode;
    }

    public void setOrderZipCode(int orderZipCode) {
        this.orderZipCode = orderZipCode;
    }

    public String getOrderAddress() {
        return orderAddress;
    }

    public void setOrderAddress(String orderAddress) {
        this.orderAddress = orderAddress;
    }

    public String getOrderMessage() {
        return orderMessage;
    }

    public void setOrderMessage(String orderMessage) {
        this.orderMessage = orderMessage;
    }

    public int getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(int totalCost) {
        this.totalCost = totalCost;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

	@Override
	public String toString() {
		return "OrderDTO [orderNumber=" + orderNumber + ", userNumber=" + userNumber + ", orderZipCode=" + orderZipCode
				+ ", orderAddress=" + orderAddress + ", orderMessage=" + orderMessage + ", totalCost=" + totalCost
				+ ", orderStatus=" + orderStatus + "]";
	}

  
}
