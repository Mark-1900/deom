package com.turingcourt.controller;

import com.turingcourt.config.json.JsonResult;
import com.turingcourt.vo.CommentVO;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

/**
 * Comment控制层
 *
 * @author Cyanogen
 * @since 2022-03-07 19:30:53
 */
@CrossOrigin
@RestController
@ApiOperation("评论操作")
@RequestMapping("/comment")
public class CommentController {

    /**
     * 查询某博客的所有评论
     *
     * @param blogId 博客id
     * @return 所有评论
     */
    @GetMapping("/get/{blogId}")
    @ApiOperation("查询某博客的所有评论")
    public JsonResult getAllComment(@PathVariable Long blogId) {
        return null;
    }

    /**
     * 发布评论
     * 评论完要重新把该博客的所有评论查一遍
     *
     * @param commentVO 评论内容
     * @return 评论是否发布成功
     */
    @PostMapping("/insert")
    @ApiOperation("发布评论")
    public JsonResult insertComment(CommentVO commentVO) {
        return null;
    }

    /**
     * 回复评论
     *
     * @param commentVO 回复内容
     * @param pid       评论的id
     * @return 回复是否成功
     */
    @PostMapping("/reply")
    @ApiOperation("回复评论")
    public JsonResult replyComment(CommentVO commentVO, Long pid) {
        return null;
    }
}
