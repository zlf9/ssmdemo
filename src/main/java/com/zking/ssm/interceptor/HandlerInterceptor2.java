package com.zking.ssm.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HandlerInterceptor2 implements HandlerInterceptor {

    //在Handler方法之前执行
    //用于身份认证、身份授权
    //比如身份认证，如果认证不通过表示当前用户没有登录，需要此方法拦截不再向下执行
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //return false 表示拦截，不向下执行
        //return true 表示向下执行
        return true;
    }

    //进入Handler方法之后，返回ModelAndView之前执行
    //应用场景从ModelAndView出法：将公用的模型数据(比如菜单导航)在这里传到视图，也可以在这里统一指定视图
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    //在Handler方法执行完成之后执行
    //应用场景：统一异常处理、统一日志处理
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
