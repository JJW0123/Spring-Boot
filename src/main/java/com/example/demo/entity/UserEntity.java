package com.example.demo.entity;

import com.example.demo.dto.UserDTO;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name = "user_table")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment
    private String id;

    @Column(unique = true)
    private String userEmail;

    @Column
    private String userPassword;

    @Column
    private String userName;

    public static UserEntity toUserEntity(UserDTO userDTO){
        UserEntity userEntity = new UserEntity();
        userEntity.setId(userDTO.getId());
        userEntity.setUserEmail(userDTO.getUserEmail());
        userEntity.setUserName(userDTO.getUserName());
        userEntity.setUserPassword(userDTO.getUserPassword());
        return userEntity;
    }
}
