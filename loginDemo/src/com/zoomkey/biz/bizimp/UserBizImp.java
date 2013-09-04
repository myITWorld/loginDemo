
package com.zoomkey.biz.bizimp;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.zoomkey.biz.UserBiz;
import com.zoomkey.dao.UserDao;
import com.zoomkey.entity.User;

/***************************
工程名称：loginDemo
作	    者：杨依逵
日          期：2013-4-11
时          间：上午07:43:31
***************************/
public class UserBizImp implements UserBiz {

	UserDao	userDao;

	public UserDao getUserDao() {
		return this.userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public boolean login(User user) {
		// TODO Auto-generated method stub
		ResultSet rs = this.userDao.findUserbyInfo(user);
		try {
			if (rs != null && rs.next()) {
				int n = rs.getInt(1);
				if (n > 0) {
					return true;
				} else {
					return false;
				}
			}
			return false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public List getUsers() {
		// TODO Auto-generated method stub
		return this.userDao.getUsers();
	}
}
