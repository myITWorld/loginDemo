
package com.zoomkey.web.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.DynaActionForm;
import org.apache.struts.actions.DispatchAction;

import com.zoomkey.biz.UserBiz;
import com.zoomkey.entity.User;

/***************************
工程名称：loginDemo
作	    者：杨依逵
日          期：2013-4-11
时          间：上午07:33:42
***************************/
public class UserAction extends DispatchAction {

	UserBiz	userBiz;

	public UserBiz getUserBiz() {
		return this.userBiz;
	}

	public void setUserBiz(UserBiz userBiz) {
		this.userBiz = userBiz;
	}

	public ActionForward Login(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
				throws Exception {
		// TODO Auto-generated method stub
		// UserBiz userBiz = new UserBizImp();
		// UserForm userForm = (UserForm) form;
		// 动态的actionForm
		DynaActionForm dyForm = (DynaActionForm) form;
		User user = new User(dyForm.getString("name"), dyForm.getString("pwd"));
		boolean res = this.userBiz.login(user);
		if (res) {
			return mapping.findForward("success");
		} else {
			return mapping.findForward("error");
		}
	}
}
