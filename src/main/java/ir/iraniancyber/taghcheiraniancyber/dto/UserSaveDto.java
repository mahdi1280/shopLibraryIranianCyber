package ir.iraniancyber.taghcheiraniancyber.dto;

import ir.iraniancyber.taghcheiraniancyber.model.Role;
import ir.iraniancyber.taghcheiraniancyber.model.User;

import java.io.Serializable;

public class UserSaveDto implements Serializable {

    private String username;
    private String name;
    private String password;
    private String address;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static User convertUserDtoToUser(UserSaveDto userSaveDto) {
        User user = new User();
        user.setName(userSaveDto.getName());
        user.setPassword(userSaveDto.getPassword());
        user.setAddress(userSaveDto.getAddress());
        user.setUsername(userSaveDto.getUsername());
        user.setRole(Role.USER);
        return user;
    }


    public static UserSaveDto convertUserDtoToUser(User user) {
        UserSaveDto userSaveDto = new UserSaveDto();
        userSaveDto.setAddress(user.getAddress());
        userSaveDto.setUsername(user.getUsername());
        userSaveDto.setPassword(user.getPassword());
        userSaveDto.setName(user.getName());
        return userSaveDto;
    }

    public User convertUserDtoToUser() {
        User user = new User();
        user.setName(this.getName());
        user.setPassword(this.getPassword());
        user.setAddress(this.getAddress());
        user.setUsername(this.getUsername());
        user.setRole(Role.USER);
        return user;
    }
}
