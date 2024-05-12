package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.JiancezhandianDao;
import com.entity.JiancezhandianEntity;
import com.service.JiancezhandianService;
import com.entity.vo.JiancezhandianVO;
import com.entity.view.JiancezhandianView;

@Service("jiancezhandianService")
public class JiancezhandianServiceImpl extends ServiceImpl<JiancezhandianDao, JiancezhandianEntity> implements JiancezhandianService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiancezhandianEntity> page = this.selectPage(
                new Query<JiancezhandianEntity>(params).getPage(),
                new EntityWrapper<JiancezhandianEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiancezhandianEntity> wrapper) {
		  Page<JiancezhandianView> page =new Query<JiancezhandianView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiancezhandianVO> selectListVO(Wrapper<JiancezhandianEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiancezhandianVO selectVO(Wrapper<JiancezhandianEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiancezhandianView> selectListView(Wrapper<JiancezhandianEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiancezhandianView selectView(Wrapper<JiancezhandianEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
