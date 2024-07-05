package com.example.demo.dto;

import com.example.demo.entity.UserEntity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class UserDTO {
    private String id;
    private String userEmail;
    private String userPassword;
    private String userName;

    public static UserDTO toUserDTO(UserEntity userEntity){
        UserDTO userDTO = new UserDTO();
        userDTO.setId(userEntity.getId());
        userDTO.setUserEmail(userEntity.getUserEmail());
        userDTO.setUserPassword(userEntity.getUserPassword());
        userDTO.setUserName(userEntity.getUserName());
        return userDTO;
    }
}
