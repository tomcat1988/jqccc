package com.frd.model;
import java.io.Serializable;
import java.util.Date;
/**
 * 
 * @author tomcat
 * 2018-10-25
 */
public class ColdInterface implements Serializable
{
   

	//自增主键
    public Integer rowid ;

	//接口编号
    public String infcode ;

	//接口名称
    public String infname ;

	//接口类型
    public String inftype ;

	//接口状态
    public String status ;

	//接口参数
    public String param ;

	//接口url
    public String url ;

	//接口调用方式
    public String infmethod ;

	//接口调用频率
    public double infinterval ;

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
 
    public String getInfcode(){
        return infcode ;
    }
    
    public void setInfcode(String infcode){
        this.infcode=infcode ;
    }
 
    public String getInfname(){
        return infname ;
    }
    
    public void setInfname(String infname){
        this.infname=infname ;
    }
 
    public String getInftype(){
        return inftype ;
    }
    
    public void setInftype(String inftype){
        this.inftype=inftype ;
    }
 
    public String getStatus(){
        return status ;
    }
    
    public void setStatus(String status){
        this.status=status ;
    }
 
    public String getParam(){
        return param ;
    }
    
    public void setParam(String param){
        this.param=param ;
    }
 
    public String getUrl(){
        return url ;
    }
    
    public void setUrl(String url){
        this.url=url ;
    }
 
    public String getInfmethod(){
        return infmethod ;
    }
    
    public void setInfmethod(String infmethod){
        this.infmethod=infmethod ;
    }
 
    public double getInfinterval(){
        return infinterval ;
    }
    
    public void setInfinterval(double infinterval){
        this.infinterval=infinterval ;
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