package ru.kata.spring.boot_security.demo.services;

import org.springframework.stereotype.Component;
import ru.kata.spring.boot_security.demo.dto.UserDto;
import ru.kata.spring.boot_security.demo.models.Role;
import ru.kata.spring.boot_security.demo.models.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Component
public class UserConverter {

    public static UserDto toUserDto(User user) {
        UserDto userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setUsername(user.getUsername());
        userDto.setEmail(user.getEmail());
        userDto.setFirstname(user.getFirstname());
        userDto.setLastname(user.getLastname());
        userDto.setAge(user.getAge());
        userDto.setRoles(user.getRoles().stream()
                .map(Role::getId)
                .collect(Collectors.toSet()));
        return userDto;
    }

    public static User toUser(UserDto userDto, RoleService roleService) {
        User user = new User();
        user.setId(userDto.getId());
        user.setUsername(userDto.getUsername());
        user.setEmail(userDto.getEmail());
        user.setFirstname(userDto.getFirstname());
        user.setLastname(userDto.getLastname());
        user.setAge(userDto.getAge());
        user.setPassword(userDto.getPassword());
        List<Long> roleIds = new ArrayList<>(userDto.getRoles());

        Set<Role> roles = roleService.findByIds(roleIds);
        user.setRoles(roles);

        return user;
    }
}

