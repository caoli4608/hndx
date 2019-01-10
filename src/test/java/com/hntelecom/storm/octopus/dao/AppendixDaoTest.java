package com.hntelecom.storm.octopus.dao;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.hntelecom.storm.octopus.model.Appendix;
import com.hntelecom.storm.octopus.model.Construction;
import com.hntelecom.storm.octopus.model.DangerousRep;
import org.json.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;


@RunWith(SpringRunner.class)
@SpringBootTest
@EnableAutoConfiguration
public class ConstructionDaoTest {
    @Resource
    private ConstructionMapper constructionMapper;
    @Test
    public void addConstructionTest() {
        Construction cr = new Construction();
        cr.setAddress("中国电信232132");
        cr.setLatitude(232.2321);
        cr.setLongtitude(31.434);
        cr.setDes("刚度搜");
        cr.setConCategory("人工开挖");
        DateFormat df = new SimpleDateFormat("YY:MM:DD");
        Date date = new Date();

        cr.setBeginDate(date);
        cr.setProCategory("城镇开发");
        cr.setUserId(1);
        List l = new ArrayList<Appendix>();
        Appendix a1 = new Appendix();
        a1.setParentId(2);
        constructionMapper.insertConstruction(cr);
        System.out.println(cr.getId());
    }

    @Test
    public void updateConstructionTest() {
        Construction cr = new Construction();
        cr.setId(2);
        cr.setAddress("中国电信");
        cr.setLatitude(232.2321);
        cr.setLongtitude(31.434);
        cr.setDes("方式");
        cr.setConCategory("机械施工");
        DateFormat df = new SimpleDateFormat("YY:MM:DD");
        Date date = new Date();

        cr.setBeginDate(date);
        cr.setProCategory("修路架桥");
        cr.setUserId(1);
        constructionMapper.updateConstruction(cr);
    }

    @Test
    public void selectConstructionByUserId() {
        List<Construction> list = constructionMapper.getConstructionByUser(1);
        Gson g = new Gson();
        String str = g.toJson(list);
        System.out.println(str);
    }

    @Test
    public void getAllConstructions() {
        List<Construction> list = constructionMapper.getAllConstructions();
        Gson g = new Gson();
        for (Construction con:list) {
            String str = g.toJson(con);
            System.out.println(str);
        }

    }

    @Test
    public void delConstructionByUserId() {
        constructionMapper.deleteConstructionById(2);
    }

}

