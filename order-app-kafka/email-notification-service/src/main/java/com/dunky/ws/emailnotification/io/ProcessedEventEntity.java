package com.dunky.ws.emailnotification.io;

import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;

@Entity
@Table(name = "processed-events")
public class ProcessedEventEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = 3687553269742697084L;

    @Id
    @GeneratedValue
    private Long id;

    @Column(unique = true, nullable = false)
    private String messageId;

    @Column(nullable = false)
    private String productId;

    public ProcessedEventEntity() {
    }

    public ProcessedEventEntity(long id, String messageId, String productId) {
        this.id = id;
        this.messageId = messageId;
        this.productId = productId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }
}
