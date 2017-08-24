package com.xinxin.mybatis.utils;

import java.io.Serializable;
import java.util.Map;

import lombok.Data;

@Data
public class Pager implements Serializable{
	private static final long serialVersionUID = -974129326292363254L;
	private Integer start;
	private Integer limit;
	private Integer pageno;
	private Integer pagesize;
	
	private final String namestart = "start";
	private final String namelimit = "limit";

	private final int negative = -1;
	private final Integer deflimit = 10;
	private final Integer defstart = 0;
	
	@SuppressWarnings("unchecked")
	public void setPager(@SuppressWarnings("rawtypes") Map params, Pager pager)
	{
		if(pager.start != null)
		{
			if(pager.limit == null)
				pager.limit = this.deflimit;
			this.start = pager.start;
			this.limit = pager.limit;
		}
		else if(pager.pageno != null)
		{
			if(pager.pagesize == null)
				pager.pagesize = this.deflimit;
			this.start = (pager.pageno.intValue() + negative) * pager.pagesize;
			this.limit = pager.pagesize;
		}
		params.put(namestart, this.start);
		params.put(namelimit, this.limit);
	}
	
	@SuppressWarnings("unchecked")
	public void setPagerNecessary(@SuppressWarnings("rawtypes") Map params, Pager pager)
	{
		if(pager.start != null)
		{
			if(pager.limit == null)
				pager.limit = this.deflimit;
			this.start = pager.start;
			this.limit = pager.limit;
		}
		else if(pager.pageno != null)
		{
			if(pager.pagesize == null)
				pager.pagesize = this.deflimit;
			this.start = (pager.pageno.intValue() + negative) * pager.pagesize;
			this.limit = pager.pagesize;
		}
		else
		{
			this.start = pager.defstart;
			this.limit = pager.deflimit;
		}
		params.put(namestart, this.start);
		params.put(namelimit, this.limit);
	}
	
	
}
