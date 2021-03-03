/**
 * Selenium1.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package Selenium;

public interface Selenium1 extends java.rmi.Remote {
    public java.lang.Object findElementById(java.lang.String elementId) throws java.rmi.RemoteException;
    public void setSearchValue(java.lang.String searchValue) throws java.rmi.RemoteException;
    public java.lang.String getPageTittle() throws java.rmi.RemoteException;
    public void submitSearchForm() throws java.rmi.RemoteException;
    public void navigateToPuPage() throws java.rmi.RemoteException;
}
