package com.pretty.ssm.sys.web;

import com.pretty.ssm.common.page.Page;
import com.pretty.ssm.common.web.CRUDWeb;
import com.pretty.ssm.entity.User;
import com.pretty.ssm.sys.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/user")
public class UserController extends CRUDWeb {
	
	@Autowired
	private UserService userService;

	@RequestMapping(value="/list",method=RequestMethod.GET)
	public String list(Model model, Integer pageNo, Integer pageSize){
        pageNo = pageNo == null ? 1 : pageNo;
        pageSize = pageSize == null ? 10 : pageSize;
        Page<User> userPage = new Page<User>(pageNo,pageSize);
        Page<User> pageInfo = userService.findUsersByPage(userPage);
		model.addAttribute("userlist", pageInfo.getResults());
		return "user/list";
	}

}
