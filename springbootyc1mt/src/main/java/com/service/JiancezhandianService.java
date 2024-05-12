package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiancezhandianEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiancezhandianVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiancezhandianView;


/**
 * 检测站点
 *
 * @author 
 * @email 
 * @date 2022-03-04 19:59:21
 */
public interface JiancezhandianService extends IService<JiancezhandianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiancezhandianVO> selectListVO(Wrapper<JiancezhandianEntity> wrapper);
   	
   	JiancezhandianVO selectVO(@Param("ew") Wrapper<JiancezhandianEntity> wrapper);
   	
   	List<JiancezhandianView> selectListView(Wrapper<JiancezhandianEntity> wrapper);
   	
   	JiancezhandianView selectView(@Param("ew") Wrapper<JiancezhandianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiancezhandianEntity> wrapper);
   	

}

