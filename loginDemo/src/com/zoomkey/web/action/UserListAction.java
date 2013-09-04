package com.zoomkey.web.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.zoomkey.biz.UserBiz;
import com.zoomkey.biz.bizimp.UserBizImp;


/***************************
工程名称：loginDemo
作	    者：杨依逵
日          期：2013-4-11
时          间：下午01:07:31
***************************/
public class UserListAction extends Action {
	UserBiz userBiz = new UserBizImp();
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
				throws Exception {
		 List list = userBiz.getUsers();
		 request.setAttribute("list", list);
		 
		return mapping.findForward("xianshi");
	}
	
}
