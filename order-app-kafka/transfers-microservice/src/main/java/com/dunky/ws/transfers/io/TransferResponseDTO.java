package com.dunky.ws.transfers.io;

public class TransferResponseDTO {
    private String status;
    private String message;

    public TransferResponseDTO(String status, String message) {
        this.status = status;
        this.message = message;
    }

    // Required getters and setters
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
