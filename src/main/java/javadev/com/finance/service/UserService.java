package javadev.com.finance.service;

import javadev.com.finance.model.dto.User;
import javadev.com.finance.model.entity.UserEntity;
import javadev.com.finance.model.mapper.UserMapper;
import javadev.com.finance.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private UserMapper userMapper = new UserMapper();

    @Autowired
    private UserRepository userRepository;

    public User readUser(String identification){
        Optional<UserEntity> userEntity = userRepository.findByIdentificationNumber(identification);//.orElseThrow(EntityNotFoundException::new);
        return userMapper.convertToDto(userEntity.orElse(null));
    }

    public List<User> readUsers(Pageable pageable) {
        return userMapper.convertToDtoList(userRepository.findAll(pageable).getContent());
    }

}
