package com.frd.model;
import java.io.Serializable;
import java.util.Date;
/**
 * 
 * @author tomcat
 * 2018-10-25
 */
public class BaseDevice implements Serializable
{
   

	//自增主键
    public Integer rowid ;

	//设备编号
    public String devicecode ;

	//设备名称
    public String devicename ;

	//设备类型
    public String devicetype ;

	//规格型号
    public String standard ;

	//设备状态
    public String status ;

	//创建人
    public String creator ;

	//创建时间
    public Date createdt ;

	//修改人
    public String modifyby ;

	//修改时间
    public Date modifydt ;
    
    /************************************/
 
    public Integer getRowid(){
        return rowid ;
    }
    
    public void setRowid(Integer rowid){
        this.rowid=rowid ;
    }
 
    public String getDevicecode(){
        return devicecode ;
    }
    
    public void setDevicecode(String devicecode){
        this.devicecode=devicecode ;
    }
 
    public String getDevicename(){
        return devicename ;
    }
    
    public void setDevicename(String devicename){
        this.devicename=devicename ;
    }
 
    public String getDevicetype(){
        return devicetype ;
    }
    
    public void setDevicetype(String devicetype){
        this.devicetype=devicetype ;
    }
 
    public String getStandard(){
        return standard ;
    }
    
    public void setStandard(String standard){
        this.standard=standard ;
    }
 
    public String getStatus(){
        return status ;
    }
    
    public void setStatus(String status){
        this.status=status ;
    }
 
    public String getCreator(){
        return creator ;
    }
    
    public void setCreator(String creator){
        this.creator=creator ;
    }
 
    public Date getCreatedt(){
        return createdt ;
    }
    
    public void setCreatedt(Date createdt){
        this.createdt=createdt ;
    }
 
    public String getModifyby(){
        return modifyby ;
    }
    
    public void setModifyby(String modifyby){
        this.modifyby=modifyby ;
    }
 
    public Date getModifydt(){
        return modifydt ;
    }
    
    public void setModifydt(Date modifydt){
        this.modifydt=modifydt ;
    }
	
}