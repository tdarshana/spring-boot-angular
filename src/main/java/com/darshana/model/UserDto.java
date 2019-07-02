package com.darshana.model;

import com.darshana.Entity.User;

public class UserDto {
    private long id;
    private String name;
    private String email;

    public UserDto(){}

    public UserDto(long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static UserDto valueOf(User user){
        return new UserDto(user.getId(), user.getName(), user.getEmail());
    }

    public static User valueOf(UserDto userDto){
        return new User(userDto.getName(), userDto.getEmail());
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UserDto{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
