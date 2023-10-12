package com.example.uppop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.uppop.model.Activity;

@Repository
public interface ActivityRepository extends JpaRepository<Activity, Long> {
    // คุณสามารถเพิ่มเมธอดเพิ่มเติมตามต้องการ
}
