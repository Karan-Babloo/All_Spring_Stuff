/**
 * PersonServiceImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.karan.jaxws.service;

public interface PersonServiceImpl extends java.rmi.Remote {
    public boolean addPerson(com.karan.jaxws.beans.Person p) throws java.rmi.RemoteException;
    public com.karan.jaxws.beans.Person[] getAllPersons() throws java.rmi.RemoteException;
    public com.karan.jaxws.beans.Person getPerson(int id) throws java.rmi.RemoteException;
    public boolean deletePerson(int id) throws java.rmi.RemoteException;
}
