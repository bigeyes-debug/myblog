package com.bigeyes.dao;

import com.bigeyes.po.Type;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @author ych
 * @date 16/4/2020 9:06 PM
 */
public interface TypeRepository extends JpaRepository<Type, Long> {
    Type findByName(String name);

    // enquiry types by passing in number of size
    @Query("select t from Type t")
    List<Type> findTop(Pageable pageable);
}
