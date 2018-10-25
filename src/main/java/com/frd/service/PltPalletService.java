package com.frd.service;
import java.util.List;
import java.util.Map;

import com.frd.model.PltPallet;

public interface PltPalletService {
	/**
	 * @param pltpallet
	 * @return
	 * 添加
	 */
	public  Integer  addPltPallet(PltPallet pltpallet);
	
	
	/**
	 * @param id
	 * @return
	 * 删除
	 */
	public 	Integer  deletePltPallet(Integer id);
	
	
	/**
	 * @param map
	 * @return
	 * 查询所有的信息(带条件)
	 */
	public List<PltPallet> getAllPltPallet(Map<String,Object> map);
	
	
	
	/**
	 * @param id
	 * @return
	 * 查询一条数据
	 */
	public PltPallet getOnePltPallet(Integer id);
	
	
	/**
	 * @param pltpallet
	 * @return
	 * 修改
	 */
	public Integer updatePltPallet(PltPallet pltpallet);
	
}
