package com.cheboss.spring.repository;

import com.cheboss.spring.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * The interface User repository.
 *
 * @author cheboss
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {}
