package com.viago.service;

import com.viago.entities.*;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Set;

public interface UserService {


    UserEntity save(UserEntity user);
    UserEntity findOne(Integer id);
    Page<UserEntity> findAll(Pageable page);
    PassengerEntity findByLogin(UserEntity user);
//    Set<MessageDTO> findMessagesOfUser(Integer id);
    Set<RoleEntity> findRolesOfUser(String username);
    MessageEntity SaveMessage(MessageEntity message);

    void blockUser(Integer id);

    void unblockUser(Integer id);

    NoteEntity saveNote(Integer id, NoteEntity note);

//    NotePageDTO findNotes(Integer id, Pageable page);

    UserEntity findByEmail(String email);
}
