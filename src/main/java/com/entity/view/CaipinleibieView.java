package com.entity.view;

import com.entity.CaipinleibieEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 菜品类别
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-18 01:00:26
 */
@TableName("caipinleibie")
public class CaipinleibieView  extends CaipinleibieEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public CaipinleibieView(){
	}
 
 	public CaipinleibieView(CaipinleibieEntity caipinleibieEntity){
 	try {
			BeanUtils.copyProperties(this, caipinleibieEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}