package com.atguigu.service;

import com.atguigu.common.BaseService;
import com.atguigu.entity.Community;

import java.util.List;

/**
 * 项目:shf-parent
 * 包:com.atguigu.service
 * 作者:Connor
 * 日期:2022/6/15
 */
public interface CommunityService extends BaseService<Community> {

    List<Community> findAll();
}
