package com.example.demo;  
  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.web.bind.annotation.*;  

import java.util.HashMap;
import java.util.List;  
import java.util.Map;
@RestController  
public class GirlController {  
    @Autowired  
    private GirlRepository girlRepository;  
  
//    /**查询所有女生列表*/  
//    @RequestMapping(value = "/girls/{id}")  
//    public List<Emp> girl(@PathVariable("id") Integer id){  
////    	List<Emp> emplist = girlRepository.findOne(id);  
////    	Map<Integer,Integer> map=new HashMap<>();
//        return girlRepository.findOne(id);  
//    }  
    /**查询所有女生列表*/  
    @RequestMapping(value = "/girls/{id}")  
    public Map<Integer,Integer> girl(@PathVariable("id") Integer id){  
    	List<Emp> emplist = girlRepository.findOne(id);  
    	Map<Integer,Integer> map=new HashMap<>();
//    	return  girlRepository.findOne(id);
    	for (Emp emp:emplist){
    		map.put(emp.getRownum(),emp.getSal());
    	}
    	return map;
    }   
//    /**添加一个女生*/  
//    @PostMapping(value="/girls")  
//    public Girl girlAdd(@RequestParam("cupSize") String cupSize,  
//                          @RequestParam("age") Integer age){  
//        Girl girl=new Girl();  
//        girl.setCupSize(cupSize);  
//        girl.setAge(age);  
//        return girlRepository.save(girl);  
//    }  
//    //查询一个女生  
//    @GetMapping(value = "/girls/{id}")  
//    public Girl girlFindOne(@PathVariable("id") Integer id){  
//        return girlRepository.findOne(id);  
//    }  
//    //更新  
//    @PutMapping(value = "/girls/{id}")  
//    public Girl girlUpdate(@PathVariable("id") Integer id,  
//                           @RequestParam("cupSize") String cupSize,  
//                           @RequestParam("age") Integer age){  
//        Girl girl=new Girl();  
//        girl.setId(id);  
//        girl.setCupSize(cupSize);  
//        girl.setAge(age);  
//        return girlRepository.save(girl);  
//    }  
//    //删除  
//    @DeleteMapping(value="/girls/{id}")  
//    public void girlDelete(@PathVariable("id") Integer id){  
//        girlRepository.delete(id);  
//    }  
//  
    //通过年龄查询女生列表  
//    @GetMapping(value = "/girls/{age}")  
//    public  List<Girl> girlListByAge(@PathVariable("age")Integer age){  
//        return girlRepository.findByAge(age);  
//    }  
}  