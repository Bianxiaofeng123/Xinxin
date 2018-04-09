package com.xinxin.controller;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.xinxin.mybatis.utils.ExcelRead;
import com.xinxin.mybatis.utils.ExcelUtil;
import com.xinxin.mybatis.utils.ExcelWriter;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SuppressWarnings("serial")
@RestController
@RequestMapping(value = "/excel") 
public class ExcelDemoController implements Serializable {

	@Autowired
	ExcelWriter excelWriter;

	/**
	 * 导出
	 */
	@SuppressWarnings("static-access")
	@RequestMapping(value = "/export", method = RequestMethod.GET)
	public void Export(HttpServletResponse response) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("name", "exclw文件名称");
		paramMap.put("titles", new ArrayList<String>());
		paramMap.put("rows", new ArrayList<List<String>>());
		String sheetName = "sheet名称";
		try {
			excelWriter.exportExcel(response, paramMap.get("name") + ".xlsx", paramMap, sheetName);
		} catch (Exception e) {
			log.info("失败");
		}
	}
	
	/**
	   * 导入
	   */
	  @RequestMapping(value = "/import", method = RequestMethod.POST)
	  public void Import(@RequestParam(value = "excelFile") MultipartFile file) throws IOException {

	    // 判断文件是否为空
	    if (file == null) {
	    	return;
	    }
	    String name = file.getOriginalFilename();
	    long size = file.getSize();
	    // 判断文件名
	    if (name == null || ExcelUtil.EMPTY.equals(name) && size == 0) {
	    	return;
	    }
	    // 读取Excel数据到List中
	    List<ArrayList<String>> list = new ExcelRead().readExcel(file);
	    // list中存的就是excel中的数据，可以根据excel中每一列的值转换成你所需要的值（从0开始），如：
	    // User user = null;
	    List<Map<String, Object>> SchedulingList = new ArrayList<Map<String, Object>>();
	    for (ArrayList<String> arr : list) {
	      if (arr == null || arr.size() < 1) {
	        continue;
	      }
	      System.out.println("-------file serverc" + arr);
	      String datestr = arr.get(5);// DOB日期
	      try {
	        System.out.println("-----日期datestr转换：" + datestr);
	        if (arr.get(6) == null || arr.get(7) == null || arr.get(8) == null || arr.get(12) == null) {
	          continue;
	        }
	        if (arr.get(7) == "" || "".equals(arr.get(7).toString())) {
	          continue;
	        }
	        SchedulingList.add(new HashMap<String, Object>() {
	          {
	            put("staffId", arr.get(0));
	            put("familyName", arr.get(1));
	            put("givenName", arr.get(2));
	            put("name", arr.get(1) + arr.get(2));
	            put("chineseFamilyName", arr.get(3));
	            put("chineseGivenName", arr.get(4));
	            put("chineseName", arr.get(3) + arr.get(4));
	            put("dob", datestr);
	            put("gender", arr.get(6));
	            put("postId", arr.get(7));
	            put("contactTel", arr.get(8));
	            put("payerId", arr.get(9));
	            put("planCode", arr.get(10));
	            put("packageCode", arr.get(11));
	            put("company", arr.get(12));
	            put("valid", 1);
	          }
	        });
	      } catch (Exception e) {
	        continue;
	      }
	    }
	    log.info("导入的数据一览："+SchedulingList);
	  }
}
