package com.hntelecom.storm.octopus.dao;

import com.hntelecom.storm.octopus.model.Construction;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface ConstructionMapper {

    int deleteConstructionById(Integer id);

    int insertConstruction(Construction con);

    int updateConstruction(Construction con);

    List<Construction> getConstructionByUser(Integer userId);

    List<Construction> getAllConstructions();
}