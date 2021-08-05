package com.oracle.code.build;

import java.util.Map;

/****
 * @Description:Feign构建
 *****/
public class FeignBuilder {


    /***
     * 构建Feign
     * @param modelMap
     */
    public static void builder(Map<String, Object> modelMap){
        // 生成Dao层文件
        BuilderFactory.builder(modelMap,
                "/template/feign",
                "Feign.java",
                TemplateBuilder.PACKAGE_FEIGN,
                "Feign.java");
    }

}
