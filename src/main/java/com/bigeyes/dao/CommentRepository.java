package com.bigeyes.dao;

import com.bigeyes.po.Comment;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author ych
 * @date 20/4/2020 6:54 PM
 */
public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByBlogId(Long blogId, Sort sort);

    List<Comment> findByBlogIdAndParentCommentNull(Long blogId, Sort sort);
}
