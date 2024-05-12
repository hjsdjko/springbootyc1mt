package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiancexinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiancexinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiancexinxiView;


/**
 * 检测信息
 *
 * @author 
 * @email 
 * @date 2022-03-04 19:59:21
 */
public interface JiancexinxiService extends IService<JiancexinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiancexinxiVO> selectListVO(Wrapper<JiancexinxiEntity> wrapper);
   	
   	JiancexinxiVO selectVO(@Param("ew") Wrapper<JiancexinxiEntity> wrapper);
   	
   	List<JiancexinxiView> selectListView(Wrapper<JiancexinxiEntity> wrapper);
   	
   	JiancexinxiView selectView(@Param("ew") Wrapper<JiancexinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiancexinxiEntity> wrapper);
   	

}

