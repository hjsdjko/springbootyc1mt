package com.dao;

import com.entity.JiancexinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiancexinxiVO;
import com.entity.view.JiancexinxiView;


/**
 * 检测信息
 * 
 * @author 
 * @email 
 * @date 2022-03-04 19:59:21
 */
public interface JiancexinxiDao extends BaseMapper<JiancexinxiEntity> {
	
	List<JiancexinxiVO> selectListVO(@Param("ew") Wrapper<JiancexinxiEntity> wrapper);
	
	JiancexinxiVO selectVO(@Param("ew") Wrapper<JiancexinxiEntity> wrapper);
	
	List<JiancexinxiView> selectListView(@Param("ew") Wrapper<JiancexinxiEntity> wrapper);

	List<JiancexinxiView> selectListView(Pagination page,@Param("ew") Wrapper<JiancexinxiEntity> wrapper);
	
	JiancexinxiView selectView(@Param("ew") Wrapper<JiancexinxiEntity> wrapper);
	

}
