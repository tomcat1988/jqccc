package com.frd.model;
import java.io.Serializable;
import java.util.Date;
/**
 * 
 * @author tomcat
 * 2018-10-25
 */
public class ColdHub implements Serializable
{
   

	//自增主键
    public Integer rowid ;

	//仓库代码
    public String hubcode ;

	//仓库名称
    public String hubname ;

	//仓库状态
    public String status ;

	//最低温度
    public double mintemp ;

	//最高温度
    public double maxtemp ;

	//最低湿度
    public double minhum ;

	//最高湿度
    public double maxhum ;

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
 
    public String getHubcode(){
        return hubcode ;
    }
    
    public void setHubcode(String hubcode){
        this.hubcode=hubcode ;
    }
 
    public String getHubname(){
        return hubname ;
    }
    
    public void setHubname(String hubname){
        this.hubname=hubname ;
    }
 
    public String getStatus(){
        return status ;
    }
    
    public void setStatus(String status){
        this.status=status ;
    }
 
    public double getMintemp(){
        return mintemp ;
    }
    
    public void setMintemp(double mintemp){
        this.mintemp=mintemp ;
    }
 
    public double getMaxtemp(){
        return maxtemp ;
    }
    
    public void setMaxtemp(double maxtemp){
        this.maxtemp=maxtemp ;
    }
 
    public double getMinhum(){
        return minhum ;
    }
    
    public void setMinhum(double minhum){
        this.minhum=minhum ;
    }
 
    public double getMaxhum(){
        return maxhum ;
    }
    
    public void setMaxhum(double maxhum){
        this.maxhum=maxhum ;
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