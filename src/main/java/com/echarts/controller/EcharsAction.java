package com.echarts.controller;

import java.util.ArrayList;
import java.util.List;

import com.echarts.entity.Echar;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class EcharsAction {

    @RequestMapping(value = "/EcharsShow")
    @ResponseBody
    public List<Echar> findById(Model model) {
        List<Echar> list = new ArrayList<Echar>();
        list.add(new Echar("帽子",50));
        list.add(new Echar("鞋子",126));
        list.add(new Echar("毛衣",75));
        list.add(new Echar("羽绒服",201));
        list.add(new Echar("羊毛衫",172));
        System.err.println(list.toString());

        return list;
    }

}