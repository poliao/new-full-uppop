package com.example.uppop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.uppop.model.PersonActivity;

@Repository
public interface PersonActivityRepository extends JpaRepository<PersonActivity, Long> {
    // คุณสามารถเพิ่มเมธอดเพิ่มเติมตามต้องการ
}
