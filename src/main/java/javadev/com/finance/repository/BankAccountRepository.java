package javadev.com.finance.repository;

import javadev.com.finance.model.entity.BankAccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BankAccountRepository extends JpaRepository<BankAccountEntity,Long> {
    Optional<BankAccountEntity> findByNumber(String accountNumber);
}
