package ru.learn.tusk.web.mapper;

import org.mapstruct.Mapper;
import ru.learn.tusk.domain.user.User;
import ru.learn.tusk.web.dto.task.UserDto;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDto toDto(User user);

    User toEntity(UserDto dto);

}
