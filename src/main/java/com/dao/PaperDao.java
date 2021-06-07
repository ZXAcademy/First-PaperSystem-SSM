package com.dao;

import com.pojo.Paper;

import java.util.List;

/**
 * Created by GYF-PC on 2019/4/25 22:44
 */
public interface PaperDao {

    int addPaper(Paper paper);

    int deletePaperById(long id);

    int updatePaper(Paper paper);

    Paper queryById(long id);

    List<Paper> queryAllPaper();
}
