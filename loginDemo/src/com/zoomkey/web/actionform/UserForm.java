
package com.zoomkey.web.actionform;

import org.apache.struts.action.ActionForm;

import com.zoomkey.entity.User;

/***************************
工程名称：loginDemo
作	    者：杨依逵
日          期：2013-4-11
时          间：上午07:32:40
***************************/
@SuppressWarnings("serial")
public class UserForm extends ActionForm {

	private User	user	= new User();

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	private String	name;

	private String	pwd;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return this.pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
}
