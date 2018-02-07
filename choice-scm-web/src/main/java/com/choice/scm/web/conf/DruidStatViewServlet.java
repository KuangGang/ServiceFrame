package com.choice.scm.web.conf;

import com.alibaba.druid.support.http.StatViewServlet;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

/**
 * @author linwbai
 * @version $Id: DruidStatViewServlet.java, v 0.1 2018-01-16 下午2:36 linwbai Exp $$
 */
@WebServlet(urlPatterns = "/druid/*",
        initParams = {
                @WebInitParam(name="allow",value = ""),//白名单
                @WebInitParam(name="deny",value = ""),//黑名单
                @WebInitParam(name="loginUsername",value = "admin"),//登录用户名
                @WebInitParam(name="loginPassword",value = "admin"),//登录密码
                @WebInitParam(name="resetEnable",value = "false")//禁用HTML页面上的“Reset All”功能
        })
public class DruidStatViewServlet extends StatViewServlet {
    private static final long serialVersionUID = 854849449638925243L;
}
