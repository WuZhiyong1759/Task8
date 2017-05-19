package com.jnshu.service;

import com.jnshu.model.User;

/**
 * Created by Tom on 2017/5/19.
 */
public class BaseServiceImpl implements BaseService {

    /* (non-Javadoc)
     *Title:getHelloword
     *Description</p>
     *@param name
     *@return
     * @see com.boco.rmi.service.inface.BaseService#getHelloword(java.lang.String)
     */
    @Override
    public String getHelloword(String name) {
        // TODO Auto-generated method stub
        return "Welcome to boco,"+name+"!";
    }

    /* (non-Javadoc)
     *Title:getUser
     *Description</p>
     *@param user
     *@return
     * @see com.boco.rmi.service.inface.BaseService#getUser(com.boco.rmi.service.dao.User)
     */
    @Override
    public String getUser(User user) {
        // TODO Auto-generated method stub
        return "name:"+user.getName()+"-------->"+"age"+user.getAge();
    }

}
