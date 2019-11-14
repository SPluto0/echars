package com.echarts.controller;

import com.echarts.entity.Echars;
import com.echarts.service.EcharsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Date 2019/11/13 13:15
 */
@Controller
public class IndexController {
    @Autowired
    private EcharsService echarsService;
    @RequestMapping("/{page}")
    public String showPage(@PathVariable String page){
        System.out.println(page);
        return page;
    }
    @RequestMapping("/getAll")
    @ResponseBody
    public List<Echars> getSaleNum() {
        return echarsService.getAll();
    }
}
