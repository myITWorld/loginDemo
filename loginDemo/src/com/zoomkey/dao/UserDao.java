
package com.zoomkey.dao;

import java.sql.ResultSet;
import java.util.List;

import com.zoomkey.entity.User;

/***************************
工程名称：loginDemo
作	    者：杨依逵
日          期：2013-4-11
时          间：上午07:34:23
***************************/
public interface UserDao {

	public ResultSet findUserbyInfo(User user);

	public List getUsers();
}
