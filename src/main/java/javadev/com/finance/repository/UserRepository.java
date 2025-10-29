package javadev.com.finance.repository;

import javadev.com.finance.model.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity,Long> {
    Optional<UserEntity> findByIdentificationNumber(String identificationNumber);
}
