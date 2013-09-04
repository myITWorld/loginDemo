
package com.zoomkey.biz;

import java.util.List;

import com.zoomkey.entity.User;

/***************************
工程名称：loginDemo
作	    者：杨依逵
日          期：2013-4-11
时          间：上午07:42:44
***************************/
public interface UserBiz {

	public boolean login(User user);

	public List getUsers();
}
