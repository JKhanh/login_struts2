package com.struts.action;

import com.opensymphony.xwork2.ActionSupport;
import com.struts.common.Constant;
import com.struts.common.UserDAO;

public class LoginAction extends ActionSupport {
    private UserDAO userDAO;
    private String userName;
    private String password;

    /**
     * login method
     * 
     * @return success or error
     */
    public String login() {
        userDAO = new UserDAO();
        if (!(userDAO.searchUser(userName, password))) {
            addActionError(Constant.INVALID_ACCOUNT_MSG);
            return ERROR;
        }
        return SUCCESS;
    }

    // define setter & setter
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
