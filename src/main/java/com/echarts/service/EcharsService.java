package com.echarts.service;

import com.echarts.Repository.EcharsRepository;
import com.echarts.entity.Echars;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Date 2019/11/13 14:43
 */
@Service
public class EcharsService {
    @Resource
    private EcharsRepository echarsRepository;
    public List<Echars> getAll(){
        return echarsRepository.findAll();
    }
}
