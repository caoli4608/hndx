package com.hntelecom.storm.octopus.service;

import com.hntelecom.storm.octopus.dao.ConstructionMapper;
import com.hntelecom.storm.octopus.model.Construction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Lee on 2019/1/9.
 */
public class ConstructionServiceImpl implements ConstructionService {
    @Autowired
    private ConstructionMapper constructionMapper;
    @Override
    public int deleteConstructionById(Integer id) {
        return 0;
    }

    @Override
    public int insertConstruction(Construction con) {
        return 0;
    }

    @Override
    public int updateConstruction(Construction con) {
        return 0;
    }

    @Override
    public Construction getConstructionByUser(Integer userId) {
        return null;
    }

    @Override
    public List<Construction> getAllConstructions() {
        return null;
    }
}
