package com.xinxin.mybatis.utils;

import java.util.Map;

public class Generalmethod {
	public static Map<String, Object> insertParams(Map<String, Object> params) {
		if (params!=null && params.get("USER_ID")!=null) {
			params.put("SYSINS_USER_ID", params.get("USER_ID"));
		}else if (params!=null && params.get("TOK_ID")!=null) {
			params.put("SYSINS_TOK_ID", params.get("TOK_ID"));
		}else if (params!=null && params.get("SIIRE_ID")!=null) {
			params.put("SYSINS_SIIRE_ID", params.get("SIIRE_ID"));
		}else if (params!=null && params.get("UNTSH_ID")!=null) {
			params.put("SYSINS_UNTSH_ID", params.get("UNTSH_ID"));
		}else {
			params.put("SYSINS_USER_ID", "aoto");
			params.put("SYSINS_TOK_ID", "aoto");
			params.put("SYSINS_SIIRE_ID", "aoto");
			params.put("SYSINS_UNTSH_ID", "aoto");
		}
		if (params!=null && params.get("USER_ID")!=null) {
			params.put("SYSUPD_USER_ID", params.get("USER_ID"));
		}else if (params!=null && params.get("TOK_ID")!=null) {
			params.put("SYSUPD_TOK_ID", params.get("TOK_ID"));
		}else if (params!=null && params.get("SIIRE_ID")!=null) {
			params.put("SYSUPD_SIIRE_ID", params.get("SIIRE_ID"));
		}else if (params!=null && params.get("UNTSH_ID")!=null) {
			params.put("SYSUPD_UNTSH_ID", params.get("UNTSH_ID"));
		}else {
			params.put("SYSUPD_USER_ID", "aoto");
			params.put("SYSUPD_TOK_ID", "aoto");
			params.put("SYSUPD_SIIRE_ID", "aoto");
			params.put("SYSUPD_UNTSH_ID", "aoto");
		}
		params.put("SYSINS_TERM_ID", "001");
		params.put("SYSINS_GMN_ID", "001");
		params.put("SYSINS_YMD", ConvertDateTime.getCurrentTimeForyyyyMMdd());
		params.put("SYSINS_HMS", ConvertDateTime.getCurrentTimeForHHmmss());
		params.put("UPD_KBN", "1");
		params.put("SYSUPD_TERM_ID", "001");
		params.put("SYSUPD_GMN_ID", "001");
		params.put("SYSUPD_YMD", ConvertDateTime.getCurrentTimeForyyyyMMdd());
		params.put("SYSUPD_HMS", ConvertDateTime.getCurrentTimeForHHmmss());
		return params;
	}

	public static Map<String, Object> updateParams(Map<String, Object> params) {
		if (params!=null && params.get("USER_ID")!=null) {
			params.put("SYSUPD_USER_ID", params.get("USER_ID"));
		}else if (params!=null && params.get("TOK_ID")!=null) {
			params.put("SYSUPD_TOK_ID", params.get("TOK_ID"));
		}else if (params!=null && params.get("SIIRE_ID")!=null) {
			params.put("SYSUPD_SIIRE_ID", params.get("SIIRE_ID"));
		}else if (params!=null && params.get("UNTSH_ID")!=null) {
			params.put("SYSUPD_UNTSH_ID", params.get("UNTSH_ID"));
		}else {
			params.put("SYSUPD_USER_ID", "aoto");
			params.put("SYSUPD_TOK_ID", "aoto");
			params.put("SYSUPD_SIIRE_ID", "aoto");
			params.put("SYSUPD_UNTSH_ID", "aoto");
		}
		params.put("SYSUPD_TERM_ID", "001");
		params.put("SYSUPD_GMN_ID", "001");
		params.put("SYSUPD_YMD", ConvertDateTime.getCurrentTimeForyyyyMMdd());
		params.put("SYSUPD_HMS", ConvertDateTime.getCurrentTimeForHHmmss());
		params.put("UPD_KBN", "2");
		return params;
	}
	public static Map<String, Object> deleteParams(Map<String, Object> params) {
		params.put("UPD_KBN", "3");
		params.put("DEL_YMD", ConvertDateTime.getCurrentTimeForyyyyMMdd());
		return params;
	}
}
