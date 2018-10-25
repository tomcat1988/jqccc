package com.frd.model;
import java.io.Serializable;
import java.util.Date;
/**
 * 
 * @author tomcat
 * 2018-10-25
 */
public class PltLease implements Serializable
{
   

	//自增主键
    public Integer rowid ;

	//栈板名称
    public String pltname ;

	//栈板类型
    public String plttype ;

	//租赁数量
    public Integer qty ;

	//租赁人
    public String customer ;

	//租赁时间
    public Date leasedt ;

	//预计归还时间
    public Date edt ;

	//实际归还时间
    public Date adt ;

	//实际归还数量
    public Integer backqty ;

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
 
    public String getPltname(){
        return pltname ;
    }
    
    public void setPltname(String pltname){
        this.pltname=pltname ;
    }
 
    public String getPlttype(){
        return plttype ;
    }
    
    public void setPlttype(String plttype){
        this.plttype=plttype ;
    }
 
    public Integer getQty(){
        return qty ;
    }
    
    public void setQty(Integer qty){
        this.qty=qty ;
    }
 
    public String getCustomer(){
        return customer ;
    }
    
    public void setCustomer(String customer){
        this.customer=customer ;
    }
 
    public Date getLeasedt(){
        return leasedt ;
    }
    
    public void setLeasedt(Date leasedt){
        this.leasedt=leasedt ;
    }
 
    public Date getEdt(){
        return edt ;
    }
    
    public void setEdt(Date edt){
        this.edt=edt ;
    }
 
    public Date getAdt(){
        return adt ;
    }
    
    public void setAdt(Date adt){
        this.adt=adt ;
    }
 
    public Integer getBackqty(){
        return backqty ;
    }
    
    public void setBackqty(Integer backqty){
        this.backqty=backqty ;
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