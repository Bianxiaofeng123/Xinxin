package com.alibaba.dubbo.demo;

import java.util.List;

/**
 * @author fengfeng
 */
public interface DemoService {
	List<String> getPermissions(Long id);
}
