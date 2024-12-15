package com.dunky.ws.transfers.error;

public class TransferServiceException extends RuntimeException {
    public TransferServiceException(Throwable cause) {
        super(cause);
    }

    public TransferServiceException(String message) {
        super(message);
    }
}
