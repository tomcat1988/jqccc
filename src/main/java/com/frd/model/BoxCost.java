package com.frd.model;
import java.io.Serializable;
import java.util.Date;
/**
 * 
 * @author tomcat
 * 2018-10-25
 */
public class BoxCost implements Serializable
{
   

	//自增主键
    public Integer rowid ;

	//岗亭编号
    public String boxcode ;

	//岗亭名称
    public String boxname ;

	//收费时间
    public Date costtime ;

	//收费费用
    public double cost ;

	//车牌号码
    public String truckno ;

	//备注说明
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
 
    public String getBoxcode(){
        return boxcode ;
    }
    
    public void setBoxcode(String boxcode){
        this.boxcode=boxcode ;
    }
 
    public String getBoxname(){
        return boxname ;
    }
    
    public void setBoxname(String boxname){
        this.boxname=boxname ;
    }
 
    public Date getCosttime(){
        return costtime ;
    }
    
    public void setCosttime(Date costtime){
        this.costtime=costtime ;
    }
 
    public double getCost(){
        return cost ;
    }
    
    public void setCost(double cost){
        this.cost=cost ;
    }
 
    public String getTruckno(){
        return truckno ;
    }
    
    public void setTruckno(String truckno){
        this.truckno=truckno ;
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