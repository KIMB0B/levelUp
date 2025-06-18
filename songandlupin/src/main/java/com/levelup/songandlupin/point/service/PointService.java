package com.levelup.songandlupin.point.service;

import com.levelup.songandlupin.user.entity.UserEntity;
import com.levelup.songandlupin.user.repository.UserRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PointService {

    private final UserRepository userRepository;

    @Transactional
    public int increase(Long userId, int point) {
        UserEntity userEntity = userRepository.findById(userId).orElseThrow(
                () -> new IllegalArgumentException("사용자 조회 실패 with id: " + userId)
        );

        userEntity.setPoint(userEntity.getPoint() + point);

        return userEntity.getPoint();
    }

    public int fetchPoint(Long userId) {
        UserEntity userEntity = userRepository.findById(userId).orElseThrow(
                () -> new IllegalArgumentException("사용자 조회 실패 with id: " + userId)
        );

        return userEntity.getPoint();
    }
}
