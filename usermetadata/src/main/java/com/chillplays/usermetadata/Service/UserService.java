package com.chillplays.usermetadata.Service;

import com.chillplays.usermetadata.Entity.UserMetaData;
import com.chillplays.usermetadata.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public UserMetaData saveUserMetaData(UserMetaData userMetaData){
        return userRepository.save(userMetaData);
    }
    public UserMetaData getUserMetaDataWithUserId(Long userId){
        return userRepository.findById(userId)
                .orElseThrow(() -> new IllegalArgumentException("Cannot find user with userId " + userId));

    }
}
