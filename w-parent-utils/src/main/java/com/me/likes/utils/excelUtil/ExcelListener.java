package com.me.likes.utils.excelUtil;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @program: b2b-cms-center->ExcelListener
 * @description:excel数据处理
 * @author: szh
 * @create: 2020-09-01 14:31
 **/
public class ExcelListener extends AnalysisEventListener {
    private static final Logger LOGGER = LoggerFactory.getLogger(ExcelListener.class);

    /**
     * 用于保存数据
     */
    private List<Object> datas = Collections.synchronizedList(new ArrayList<>());

    /**
     * 读取的每行数据  这个每一条数据解析都会来调用
     *
     * @param object
     * @param analysisContext
     */
    @Override
    public void invoke(Object object, AnalysisContext analysisContext) {
        LOGGER.info("解析到一条数据:{}", JSON.toJSONString(object));
        datas.add(object);
    }

    /**
     * 读取完之后的操作  所有数据解析完成了 都会来调用
     *
     * @param analysisContext
     */
    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {

    }

    public List<Object> getDatas() {
        return datas;
    }

    public void setDatas(List<Object> datas) {
        this.datas = datas;
    }
}