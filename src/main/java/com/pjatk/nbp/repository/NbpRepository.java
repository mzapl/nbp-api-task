package com.pjatk.nbp.repository;

import com.pjatk.nbp.model.Gold;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NbpRepository extends JpaRepository<Gold, Long> {
}
