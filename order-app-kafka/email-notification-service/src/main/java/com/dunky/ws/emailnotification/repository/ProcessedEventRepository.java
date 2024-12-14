package com.dunky.ws.emailnotification.repository;

import com.dunky.ws.emailnotification.io.ProcessedEventEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProcessedEventRepository extends JpaRepository<ProcessedEventEntity, Long>{
}
