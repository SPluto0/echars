package com.echarts.Repository;

import com.echarts.entity.Echars;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EcharsRepository extends JpaRepository<Echars,Integer> {
}
