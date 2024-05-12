package com.dao;

import com.entity.JiancezhandianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiancezhandianVO;
import com.entity.view.JiancezhandianView;


/**
 * 检测站点
 * 
 * @author 
 * @email 
 * @date 2022-03-04 19:59:21
 */
public interface JiancezhandianDao extends BaseMapper<JiancezhandianEntity> {
	
	List<JiancezhandianVO> selectListVO(@Param("ew") Wrapper<JiancezhandianEntity> wrapper);
	
	JiancezhandianVO selectVO(@Param("ew") Wrapper<JiancezhandianEntity> wrapper);
	
	List<JiancezhandianView> selectListView(@Param("ew") Wrapper<JiancezhandianEntity> wrapper);

	List<JiancezhandianView> selectListView(Pagination page,@Param("ew") Wrapper<JiancezhandianEntity> wrapper);
	
	JiancezhandianView selectView(@Param("ew") Wrapper<JiancezhandianEntity> wrapper);
	

}
