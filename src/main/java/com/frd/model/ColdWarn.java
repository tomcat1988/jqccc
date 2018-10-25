package com.frd.model;
import java.io.Serializable;
import java.util.Date;
/**
 * 
 * @author tomcat
 * 2018-10-25
 */
public class ColdWarn implements Serializable
{
   

	//自增主键
    public Integer rowid ;

	//警报编号
    public String warncode ;

	//警报名称
    public String warnname ;

	//警报类型
    public String warntype ;

	//警报阀值
    public String threshold ;

	//通知方式
    public String notifytype ;

	//通知频率
    public String notifyinterval ;

	//通知地址
    public String notifyaddr ;

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
 
    public String getWarncode(){
        return warncode ;
    }
    
    public void setWarncode(String warncode){
        this.warncode=warncode ;
    }
 
    public String getWarnname(){
        return warnname ;
    }
    
    public void setWarnname(String warnname){
        this.warnname=warnname ;
    }
 
    public String getWarntype(){
        return warntype ;
    }
    
    public void setWarntype(String warntype){
        this.warntype=warntype ;
    }
 
    public String getThreshold(){
        return threshold ;
    }
    
    public void setThreshold(String threshold){
        this.threshold=threshold ;
    }
 
    public String getNotifytype(){
        return notifytype ;
    }
    
    public void setNotifytype(String notifytype){
        this.notifytype=notifytype ;
    }
 
    public String getNotifyinterval(){
        return notifyinterval ;
    }
    
    public void setNotifyinterval(String notifyinterval){
        this.notifyinterval=notifyinterval ;
    }
 
    public String getNotifyaddr(){
        return notifyaddr ;
    }
    
    public void setNotifyaddr(String notifyaddr){
        this.notifyaddr=notifyaddr ;
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