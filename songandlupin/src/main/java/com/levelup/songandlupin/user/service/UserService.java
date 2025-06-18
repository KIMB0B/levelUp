package com.levelup.songandlupin.user.service;

import com.levelup.songandlupin.user.dto.UserInputDto;
import com.levelup.songandlupin.user.entity.UserEntity;
import com.levelup.songandlupin.user.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public UserEntity save(UserInputDto userInputDto) {
        String username = userInputDto.getUsername();

        UserEntity userEntity = new UserEntity();
        userEntity.setUsername(username);
        userEntity.setPoint(0);
        return userRepository.save(userEntity);
    }
}
