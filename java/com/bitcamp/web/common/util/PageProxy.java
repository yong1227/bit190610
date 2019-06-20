package com.bitcamp.web.common.util;

import java.util.Map;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.Data;

 @Component
 @Data
 @Lazy
public class PageProxy {

    private int pageNum, pageSize, blockSize, startRow, endRow, startPage, endPage, prevBlock, nextBlock, totalCount;

    private String search;

    // 페이지 화살표 보이게 하는 거
    private boolean existPrev, existNext;

    public void execute(Map<?,?> paramMap){
        String _pageNum = (String)paramMap.get("page_num");
        //다른 페이지일 때 무조건 1페이지를 보여주세요
        pageNum = (_pageNum == null) ? 1 : Integer.parseInt(_pageNum);

        // 페이지 개수 몇 개씩 볼거냐
        String _pageSize = (String)paramMap.get("page_size");
        pageSize = (_pageNum == null) ? 5 : Integer.parseInt(_pageSize);

        //blockSize 기본값 5 , 한 페이지 묶음

        // totalCount = DB에 있는 테이블에서 갯수 가져온다.
        // 나머지는 
        int nmg = totalCount % pageSize;
        int pageCount = (nmg ==0) ? totalCount / pageSize : totalCount / pageSize + 1; // 마지막에 2개 남아도 1페이지는 보여야하니까

        //startRow
        
        
        
        //endRow
        

    }

    
}