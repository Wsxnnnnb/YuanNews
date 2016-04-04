package cn.hpu.yuan.ssm.mapper.manager;


import cn.hpu.yuan.ssm.model.pojo.CommentPo;

/**
 * Created by yuan on 16-4-3.
 * 后台管理 - 评论管理 - Mapper
 */
public interface CommentManagerMapper {

    /**
     * ----------------------------------
     * 查询
     */
    //根据id 查询评论信息
    CommentPo findCommentById(Integer id);




}