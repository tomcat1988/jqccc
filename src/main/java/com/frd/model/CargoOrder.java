package com.frd.model;
import java.io.Serializable;
import java.util.Date;
/**
 * 
 * @author tomcat
 * 2018-10-25
 */
public class CargoOrder implements Serializable
{
   

	//自增主键
    public Integer rowid ;

	//订单
    public String orderno ;

	//起运地
    public String origin ;

	//目的地
    public String destination ;

	//客户/货主
    public String customer ;

	//联系电话
    public String tel ;

	//要求发货时间
    public Date startdt ;

	//要求到货时间
    public Date enddt ;

	//重量
    public double gw ;

	//体积
    public double cbm ;

	//货物类型
    public String cargotype ;

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
 
    public String getOrderno(){
        return orderno ;
    }
    
    public void setOrderno(String orderno){
        this.orderno=orderno ;
    }
 
    public String getOrigin(){
        return origin ;
    }
    
    public void setOrigin(String origin){
        this.origin=origin ;
    }
 
    public String getDestination(){
        return destination ;
    }
    
    public void setDestination(String destination){
        this.destination=destination ;
    }
 
    public String getCustomer(){
        return customer ;
    }
    
    public void setCustomer(String customer){
        this.customer=customer ;
    }
 
    public String getTel(){
        return tel ;
    }
    
    public void setTel(String tel){
        this.tel=tel ;
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
 
    public double getGw(){
        return gw ;
    }
    
    public void setGw(double gw){
        this.gw=gw ;
    }
 
    public double getCbm(){
        return cbm ;
    }
    
    public void setCbm(double cbm){
        this.cbm=cbm ;
    }
 
    public String getCargotype(){
        return cargotype ;
    }
    
    public void setCargotype(String cargotype){
        this.cargotype=cargotype ;
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