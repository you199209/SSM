package com.pretty.ssm.common.web;

import org.springframework.stereotype.Component;

/**
 * 控制器返回值统一规定
 *
 */
@Component(value = "crudAction")
public class CRUDWeb {

	/**
	 * 列表页面
	 */
	public static final String LIST = "LIST";

	/**
	 * 查看详细页
	 */
	public static final String VIEW = "VIEW";

	/**
	 * 编辑页面
	 */
	public static final String EDIT = "EDIT";

	/**
	 * 操作成功
	 */
	public static final String SUCCESS = "SUCCESS";

	/**
	 * 操作失败
	 */
	public static final String FAIL = "FAIL";

}
