package indi.huahua.action2java.controller;

import indi.huahua.action2java.domain.Index;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author :huayanjun
 * @date :2020/4/18 15:39
 */
@RestController
@RequestMapping("/home")
public class HomeController {

    @GetMapping("/hello")
    public Index hello(){
        Index index = new Index();
        index.setName("huahua");
        index.setMessage("nihao");
        return index;
    }


}
