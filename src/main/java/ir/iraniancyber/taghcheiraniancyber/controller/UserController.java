package ir.iraniancyber.taghcheiraniancyber.controller;

import ir.iraniancyber.taghcheiraniancyber.dto.MessageDto;
import ir.iraniancyber.taghcheiraniancyber.dto.UserSaveDto;
import ir.iraniancyber.taghcheiraniancyber.model.User;
import ir.iraniancyber.taghcheiraniancyber.service.UserService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
@CrossOrigin(allowedHeaders = "*" , origins = "*")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/list")
    public List<User> list() {
        return userService.findAll();
    }

    @PostMapping("/save")
    public ResponseEntity<MessageDto> register(@RequestBody UserSaveDto userSaveDto) {
        if(userService.existsByUsername(userSaveDto.getUsername())) {
            return ResponseEntity.status(HttpStatus.CONFLICT)
                    .contentType(MediaType.APPLICATION_JSON)
                    .body(new MessageDto("Username already exists"));
        } else {
            userService.save(userSaveDto.convertUserDtoToUser());
            return ResponseEntity.status(HttpStatus.OK)
                    .contentType(MediaType.APPLICATION_JSON)
                    .body(new MessageDto("User registered successfully"));
        }
    }

    @PostMapping("/login")
    public UserSaveDto login(@RequestParam String username, @RequestParam String password) {
        User byUsernameAndPassword = userService.findByUsernameAndPassword(username, password);
        if (byUsernameAndPassword == null) {
            return null;
        }
        return UserSaveDto.convertUserDtoToUser(byUsernameAndPassword);
    }
}
