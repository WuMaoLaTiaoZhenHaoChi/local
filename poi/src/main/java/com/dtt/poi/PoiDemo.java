package com.dtt.poi;

import cn.afterturn.easypoi.excel.ExcelImportUtil;
import cn.afterturn.easypoi.excel.entity.ImportParams;
import org.junit.Test;

import java.io.File;
import java.util.Date;
import java.util.List;

/**
 * @Author: duant
 * @Date: 2020/3/3 17:22
 * @Description:
 */
public class PoiDemo {

    @Test
    public void test2() {
        ImportParams params = new ImportParams();
        params.setTitleRows(1);
        params.setHeadRows(1);
        long start = new Date().getTime();
        File file = new File("D:\\1.xlsx");
        List<StudentEntity> list = ExcelImportUtil.importExcel(
                file,
                StudentEntity.class, params);
        System.out.println(new Date().getTime() - start);
        System.out.println(list.size());

        list.forEach(employee -> {
            System.out.println(employee);
        });

    }

//    @Test
//    public void importExcel(MultipartFile file){
//        ImportParams importParams = new ImportParams();
//        // 因为Excel是从第3行开始才有正式数据,所以我们这里从第2行开始读取数据
//        importParams.setHeadRows(2);
//
//        // 获取模板
//        ExcelImportResult<CompanyStaffExcelDTO> data = null;
//        try {
//            data = ExcelImportUtil.importExcelMore(file.getInputStream(), CompanyStaffExcelDTO.class, importParams);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        // 获取模板数据
//        List<CompanyStaffExcelDTO> successList = data.getList();
//        int total = successList.size();
//        if (total == 0) {
//            // 如果数据量为0直接返回错误信息,不继续执行
//            System.out.println("数据为0");
//        }
//
//    }

}
