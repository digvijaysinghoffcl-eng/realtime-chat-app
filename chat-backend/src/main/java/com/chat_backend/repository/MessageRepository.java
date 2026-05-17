package com.chat_backend.repository;

import com.chat_backend.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MessageRepository extends JpaRepository<Message, Long> {

    List<Message> findByChatRoomIdOrderByTimestampAsc(Long chatRoomId);
    
    List<Message> findByChatRoomIdAndTimestampAfterOrderByTimestampAsc(
            Long chatRoomId, java.time.LocalDateTime timestamp);
}