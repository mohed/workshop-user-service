// User repository interface for use with spring data

package com.extendaretail.workshoprelevate;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}