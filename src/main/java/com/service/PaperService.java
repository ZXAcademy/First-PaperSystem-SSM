package com.service;

import com.pojo.Paper;

import java.util.List;

/**
 * Created by GYF-PC on 2019/4/25 22:41
 */

public interface  PaperService {

    int addPaper(Paper paper);

    int deletePaperById(long id);

    int updatePaper(Paper paper);

    Paper queryById(long id);

    List<Paper> queryAllPaper();

}
