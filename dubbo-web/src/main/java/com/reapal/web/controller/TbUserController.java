package com.reapal.web.controller;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.reapal.user.model.TbUser;
import com.reapal.user.service.ITbUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * <p>
 * #test  前端控制器
 * </p>
 *
 * @author jackcooper
 * @since 2017-02-11
 */
@Controller
@RequestMapping
public class TbUserController {

    @Autowired
    private ITbUserService tbUserService;

    @RequestMapping("/login")
    public String login(){
        return "login";
    }
    @RequestMapping(value = "signIn",method = RequestMethod.POST)
    @ResponseBody
    public String signIn(Model model, TbUser tbUser){
        List<TbUser> tbUsers = tbUserService.selectList(new EntityWrapper<TbUser>()
                .and("name={1}", tbUser.getName())
                .and("passowrd={2}", tbUser.getPassword())
        );
        if(tbUsers.size()==1){
            return "login Succ";
        }else{
            return "login Error";
        }
    }
	
}
