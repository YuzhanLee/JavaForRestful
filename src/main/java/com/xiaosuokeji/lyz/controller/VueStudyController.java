package com.xiaosuokeji.lyz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/*
* @Controller表示这个类是一个控制器
* */
@Controller
/*
* @RequsetMapping映射访问路径
* */
@RequestMapping("/")
public class VueStudyController {

    /*
    请求路径 http://localhost:8080/vue
    @ResponseBody 把返回的对象改成json格式返回
    返回结果
    {
        "hi": "hello"
    }
    */
    @RequestMapping("/vue")
    @ResponseBody
    public Map getHello(){
        Map map = new HashMap();
        map.put("hi","hello");
        return map;
    }


    /*
    * 请求路径 http://localhost:8080/react
    * @RequestBody 请求数据为json时要加这个注解在参数前面
    * 请求参数：
    * {
    *   "C":"haha"
    * }
    * 返回结果：
    * {
    *   "C":"haha",
    *   "Lee":"xixi"
    * }
    * */
    @RequestMapping("/react")
    @ResponseBody
    public Map getHi(@RequestBody Map map){
        map.put("Lee","xixi");
        return map;
    }

}
