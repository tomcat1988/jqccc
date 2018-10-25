package com.frd.model;
import java.io.Serializable;
import java.util.Date;
/**
 *
 * @author tomcat
 * 2018-10-25
 */
public class BaseBox implements Serializable
{


    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//自增主键
    public Integer rowid ;

    //岗亭编号
    public String boxcode ;

    //岗亭名称
    public String boxname ;

    //岗亭类型
    public String boxtype ;

    //岗亭状态
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

    public String getBoxtype(){
        return boxtype ;
    }

    public void setBoxtype(String boxtype){
        this.boxtype=boxtype ;
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