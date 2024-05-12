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


import com.dao.JiancexinxiDao;
import com.entity.JiancexinxiEntity;
import com.service.JiancexinxiService;
import com.entity.vo.JiancexinxiVO;
import com.entity.view.JiancexinxiView;

@Service("jiancexinxiService")
public class JiancexinxiServiceImpl extends ServiceImpl<JiancexinxiDao, JiancexinxiEntity> implements JiancexinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiancexinxiEntity> page = this.selectPage(
                new Query<JiancexinxiEntity>(params).getPage(),
                new EntityWrapper<JiancexinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiancexinxiEntity> wrapper) {
		  Page<JiancexinxiView> page =new Query<JiancexinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiancexinxiVO> selectListVO(Wrapper<JiancexinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiancexinxiVO selectVO(Wrapper<JiancexinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiancexinxiView> selectListView(Wrapper<JiancexinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiancexinxiView selectView(Wrapper<JiancexinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
