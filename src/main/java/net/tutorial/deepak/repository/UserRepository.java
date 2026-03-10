package net.tutorial.deepak.repository;


import net.tutorial.deepak.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // findAll() method is automatically provided
}