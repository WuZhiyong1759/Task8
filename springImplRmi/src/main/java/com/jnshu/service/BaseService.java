package com.jnshu.service;

import com.jnshu.model.User;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by Tom on 2017/5/19.
 */
public interface BaseService extends Remote {
    /**
     *Title:getHelloword
     *Description:
     * @param name
     * @return
     */
    public String getHelloword(String name) throws RemoteException;
    /**
     *Title:getUser
     *Description:
     * @param user
     * @return
     * @throws RemoteException
     */
    public String getUser(User user) throws RemoteException;

}
