package com.example.interview.exception;

import java.time.Instant;

public class ErrorHandling {
    private int status;
    private String error;
    private Instant modifyTime=Instant.now();


    public ErrorHandling(int status, String error, Instant modifyTime) {
        this.status = status;
        this.error = error;
        this.modifyTime = modifyTime;
    }

    public ErrorHandling() {
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public Instant getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Instant modifyTime) {
        this.modifyTime = modifyTime;
    }
}

