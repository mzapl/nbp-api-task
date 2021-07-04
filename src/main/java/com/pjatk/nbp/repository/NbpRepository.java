package com.pjatk.nbp.repository;

import com.pjatk.nbp.model.Query;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NbpRepository extends JpaRepository<Query, Long> {
}
