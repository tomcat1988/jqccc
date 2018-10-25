package com.frd.model;
import java.io.Serializable;
import java.util.Date;
/**
 * 
 * @author tomcat
 * 2018-10-25
 */
public class ProjContract implements Serializable
{
   

	//自增主键
    public Integer rowid ;

	//合同编号
    public String contractcode ;

	//合同名称
    public String contractname ;

	//合同类型
    public String contracttype ;

	//合同状态
    public String status ;

	//合同客户
    public String customer ;

	//开始时间
    public Date startdt ;

	//结束时间
    public Date enddt ;

	//合同附件
    public String url ;

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
 
    public String getContractcode(){
        return contractcode ;
    }
    
    public void setContractcode(String contractcode){
        this.contractcode=contractcode ;
    }
 
    public String getContractname(){
        return contractname ;
    }
    
    public void setContractname(String contractname){
        this.contractname=contractname ;
    }
 
    public String getContracttype(){
        return contracttype ;
    }
    
    public void setContracttype(String contracttype){
        this.contracttype=contracttype ;
    }
 
    public String getStatus(){
        return status ;
    }
    
    public void setStatus(String status){
        this.status=status ;
    }
 
    public String getCustomer(){
        return customer ;
    }
    
    public void setCustomer(String customer){
        this.customer=customer ;
    }
 
    public Date getStartdt(){
        return startdt ;
    }
    
    public void setStartdt(Date startdt){
        this.startdt=startdt ;
    }
 
    public Date getEnddt(){
        return enddt ;
    }
    
    public void setEnddt(Date enddt){
        this.enddt=enddt ;
    }
 
    public String getUrl(){
        return url ;
    }
    
    public void setUrl(String url){
        this.url=url ;
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