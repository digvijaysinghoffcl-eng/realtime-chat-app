package com.chat_backend.repository;

import com.chat_backend.entity.ChatRoom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ChatRoomRepository extends JpaRepository<ChatRoom, Long> {

    List<ChatRoom> findByParticipantsId(Long userId);
    
    Optional<ChatRoom> findByIdAndParticipantsId(Long roomId, Long userId);
}