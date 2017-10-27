package com.pretty.ssm.front;

import com.pretty.ssm.common.JsonUtil;
import com.pretty.ssm.common.web.CRUDWeb;
import com.pretty.ssm.entity.User;
import com.pretty.ssm.sys.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/***
 * 用户信息以json数据格式返回前台,开放接口，可以做到前后台分离
 *
 */
@Controller
@RequestMapping("/userManage")
public class UserFront extends CRUDWeb {
	
	@Autowired
	private UserService userService;

    @ResponseBody
    @RequestMapping(value="/list",method=RequestMethod.GET)
    public String list(Model model){
        List<User> list = userService.findUsersByParams(null);
        return JsonUtil.toJsonArray(list);
    }

}
