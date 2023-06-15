package com.chillplays.usermetadata.Controller;

import com.chillplays.usermetadata.Entity.UserMetaData;
import com.chillplays.usermetadata.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/chillplays/users/")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("saveUserDetails")
    public UserMetaData saveUserDetails(@RequestBody UserMetaData userMetaData){
        UserMetaData user = userService.saveUserMetaData(userMetaData);
        return user;
    }

    @GetMapping("getUserDetails/{userId}")
    public UserMetaData GetUser(@PathVariable Long userId){
        UserMetaData user = userService.getUserMetaDataWithUserId(userId);
        return user;
    }
}
