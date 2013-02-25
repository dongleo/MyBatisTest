package com.snda.sysdev.mapper;

import com.snda.sysdev.bean.Child;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author liudong.leo
 * @since 2013-02-25 14:08
 */
@Repository
@Transactional
public interface ChildMapper {
    public List<Child> selectAll();
    public Child selectChild(Integer childId);
    public List<Child> selectChildByParentId(Integer parentId);
    public void insertChild(Child child);
}
