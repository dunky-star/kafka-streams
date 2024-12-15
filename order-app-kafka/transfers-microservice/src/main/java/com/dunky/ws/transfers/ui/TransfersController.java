package com.dunky.ws.transfers.ui;

import com.dunky.ws.transfers.io.TransferResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.dunky.ws.transfers.model.TransferRestModel;
import com.dunky.ws.transfers.service.TransferService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api/v1/transfers")
public class TransfersController {
    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());
    private final TransferService transferService;

    public TransfersController(TransferService transferService) {
        this.transferService = transferService;
    }


    @PostMapping()
    public ResponseEntity<TransferResponseDTO> transfer(@RequestBody TransferRestModel transferRestModel) {
        boolean isTransferred = transferService.transfer(transferRestModel);

        TransferResponseDTO responseDTO;

        if (isTransferred) {
            responseDTO = new TransferResponseDTO("SUCCESS", "Transfer completed successfully.");
            return ResponseEntity.ok(responseDTO); // HTTP 200 OK
        } else {
            responseDTO = new TransferResponseDTO("FAILURE", "Transfer failed due to an error.");
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(responseDTO); // HTTP 500
        }
    }

}
