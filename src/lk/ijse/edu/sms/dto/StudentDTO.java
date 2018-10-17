/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.edu.sms.dto;

import java.io.Serializable;

/**
 *
 * @author Sandun_CJ
 */
public class StudentDTO implements Serializable{
    
  
    
    private int sId;
    private String sName;
    private String sAddress;
    private String sTelephone;

    public StudentDTO() {
    }

    public StudentDTO(int sId, String sName, String sAddress, String sTelephone) {
        this.sId = sId;
        this.sName = sName;
        this.sAddress = sAddress;
        this.sTelephone = sTelephone;
    }

   

    /**
     * @return the sId
     */
    public int getsId() {
        return sId;
    }

    /**
     * @param sId the sId to set
     */
    public void setsId(int sId) {
        this.sId = sId;
    }

    /**
     * @return the sName
     */
    public String getsName() {
        return sName;
    }

    /**
     * @param sName the sName to set
     */
    public void setsName(String sName) {
        this.sName = sName;
    }

    /**
     * @return the sAddress
     */
    public String getsAddress() {
        return sAddress;
    }

    /**
     * @param sAddress the sAddress to set
     */
    public void setsAddress(String sAddress) {
        this.sAddress = sAddress;
    }

    /**
     * @return the sTelephone
     */
    public String getsTelephone() {
        return sTelephone;
    }

    /**
     * @param sTelephone the sTelephone to set
     */
    public void setsTelephone(String sTelephone) {
        this.sTelephone = sTelephone;
    }

    @Override
    public String toString() {
        return "StudentDTO{" + "sId=" + sId + ", sName=" + sName + ", sAddress=" + sAddress + ", sTelephone=" + sTelephone + '}';
    }
    
    
    
}
