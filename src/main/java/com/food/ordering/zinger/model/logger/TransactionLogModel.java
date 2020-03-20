package com.food.ordering.zinger.model.logger;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.food.ordering.zinger.enums.Priority;

import java.sql.Timestamp;

public class TransactionLogModel {
    private String transactionId;
    private Integer errorCode;
    private String mobile;
    private String message;
    private String updatedValue;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm:ss", timezone = "Asia/Kolkata")
    private Timestamp date;

    private Priority priority;

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUpdatedValue() {
        return updatedValue;
    }

    public void setUpdatedValue(String updatedValue) {
        this.updatedValue = updatedValue;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "TransactionsLogModel{" +
                "transactionId='" + transactionId + '\'' +
                ", errorCode=" + errorCode +
                ", mobile='" + mobile + '\'' +
                ", message='" + message + '\'' +
                ", updatedValue='" + updatedValue + '\'' +
                ", date=" + date +
                ", priority='" + priority + '\'' +
                '}';
    }
}
