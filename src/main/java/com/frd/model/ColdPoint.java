package com.frd.model;
import java.io.Serializable;
import java.util.Date;
/**
 * 
 * @author tomcat
 * 2018-10-25
 */
public class ColdPoint implements Serializable
{
   

	//自增主键
    public Integer rowid ;

	//点位编号
    public String pointcode ;

	//点位名称
    public String pointname ;

	//点位类型
    public String pointtype ;

	//点位状态
    public String status ;

	//安装仓库
    public String hubcode ;

	//备注
    public String remark ;

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
 
    public String getPointcode(){
        return pointcode ;
    }
    
    public void setPointcode(String pointcode){
        this.pointcode=pointcode ;
    }
 
    public String getPointname(){
        return pointname ;
    }
    
    public void setPointname(String pointname){
        this.pointname=pointname ;
    }
 
    public String getPointtype(){
        return pointtype ;
    }
    
    public void setPointtype(String pointtype){
        this.pointtype=pointtype ;
    }
 
    public String getStatus(){
        return status ;
    }
    
    public void setStatus(String status){
        this.status=status ;
    }
 
    public String getHubcode(){
        return hubcode ;
    }
    
    public void setHubcode(String hubcode){
        this.hubcode=hubcode ;
    }
 
    public String getRemark(){
        return remark ;
    }
    
    public void setRemark(String remark){
        this.remark=remark ;
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