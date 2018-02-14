package com.github.crab2died.myboot.mapper;

import com.github.crab2died.myboot.domain.Demo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DemoMapper {


    List<Demo> list(@Param("demo") String demo);

}
