package com.example.demo.controllerweb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.DaoDb;
import com.example.demo.modelpojo.Model;

@Controller
public class Controllerindex {
    
    @Autowired
    DaoDb userdao;  
    
    @RequestMapping("/name")
    public String id() {
        return "webapp";
    }
    
    @RequestMapping("/index")
    public String name(Model model) {
        userdao.save(model); 
        return "webapp";
    }
    
    
    @RequestMapping("/getuser")
    public ModelAndView getuser(@RequestParam int id) {
    	ModelAndView mv = new ModelAndView("showuser");
   	Model model=userdao.findById(id).orElse(new Model());
    	mv.addObject(model);
		return mv;        
    }
    
    @RequestMapping("/delete")
    public ModelAndView delete(@RequestParam int id) {
    	ModelAndView mv = new ModelAndView("deleteuser");
   	Model model=userdao.findById(id).orElse(new Model());
   	userdao.deleteById(id);
    	mv.addObject(model);
		return mv;        
    }
}








	


