package com.example.uppop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.uppop.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
    // คุณสามารถเพิ่มเมธอดเพิ่มเติมตามต้องการ
}
