package Selenium;

public class Selenium1Proxy implements Selenium.Selenium1 {
  private String _endpoint = null;
  private Selenium.Selenium1 selenium1 = null;
  
  public Selenium1Proxy() {
    _initSelenium1Proxy();
  }
  
  public Selenium1Proxy(String endpoint) {
    _endpoint = endpoint;
    _initSelenium1Proxy();
  }
  
  private void _initSelenium1Proxy() {
    try {
      selenium1 = (new Selenium.Selenium1ServiceLocator()).getSelenium1();
      if (selenium1 != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)selenium1)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)selenium1)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (selenium1 != null)
      ((javax.xml.rpc.Stub)selenium1)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public Selenium.Selenium1 getSelenium1() {
    if (selenium1 == null)
      _initSelenium1Proxy();
    return selenium1;
  }
  
  public java.lang.Object findElementById(java.lang.String elementId) throws java.rmi.RemoteException{
    if (selenium1 == null)
      _initSelenium1Proxy();
    return selenium1.findElementById(elementId);
  }
  
  public void setSearchValue(java.lang.String searchValue) throws java.rmi.RemoteException{
    if (selenium1 == null)
      _initSelenium1Proxy();
    selenium1.setSearchValue(searchValue);
  }
  
  public java.lang.String getPageTittle() throws java.rmi.RemoteException{
    if (selenium1 == null)
      _initSelenium1Proxy();
    return selenium1.getPageTittle();
  }
  
  public void submitSearchForm() throws java.rmi.RemoteException{
    if (selenium1 == null)
      _initSelenium1Proxy();
    selenium1.submitSearchForm();
  }
  
  public void navigateToPuPage() throws java.rmi.RemoteException{
    if (selenium1 == null)
      _initSelenium1Proxy();
    selenium1.navigateToPuPage();
  }
  
  
}