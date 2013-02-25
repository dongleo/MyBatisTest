package com.snda.sysdev.mapper;

import com.snda.sysdev.bean.Parent;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author liudong.leo
 * @since 2013-02-25 14:02
 */
@Repository
@Transactional
public interface ParentMapper {
    public Parent selectParent(Integer parentId);
    public void insertParent(Parent parent);
    public void updateParent(Parent parent);
}
