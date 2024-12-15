package com.dunky.ws.transfers.service;

import com.dunky.ws.transfers.model.TransferRestModel;

public interface TransferService {
    public boolean transfer(TransferRestModel productPaymentRestModel);
}
