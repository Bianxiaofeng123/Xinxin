package com.xinxin.evryday;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class class20170823 {
	public static void main(String[] args) {
//		 class20170823 class20170823=new class20170823();
		// class20170823.name();
		// int i=5000/300;
		// System.out.println(i);
		// Map<String, Object> OrderMap=new HashMap<>();
		// OrderMap.put("status1", "2");
		// if (!("3".equals(OrderMap.get("status1").toString()) ||
		// "2".equals(OrderMap.get("status1").toString()))) {
		// throw new IllegalAccessError("订单支付超时，请重新下单");
		// }
		// System.out.println("ok");
//		 String params="app=de246cb4-3ce8-4a25-9c5d-68ddfd675dbf&page=cc36700d-af90-4328-bf52-39c41b68c085&cmp=49c4d439-5ece-478c-ad4f-ef05c4190da4&isAjax=true";
//		 class20170823.sendPost(params);
//		 for (int i = 0; i <648; i++) {
//			 HashMap<String, Object> psramsMap=new HashMap<String, Object>();
//			 psramsMap.put("app", "de246cb4-3ce8-4a25-9c5d-68ddfd675dbf");
//			 psramsMap.put("page", "cc36700d-af90-4328-bf52-39c41b68c085");
//			 psramsMap.put("cmp", "49c4d439-5ece-478c-ad4f-ef05c4190da4");
//			 psramsMap.put("isAjax", "true");
//			 RestTemplate template = new RestTemplate();
//			 String message = template.postForObject("http://a3.rabbitpre.com/cmp/count",psramsMap, String.class);
//			 System.out.println("message:"+message);
//		}
		try {
			Random rand = new Random();
			rand.nextInt(10);
			for (int i = 0; i < 100; i++) {
				System.out.println("137"+rand.nextInt(10)+rand.nextInt(10)+rand.nextInt(10)+rand.nextInt(10)+rand.nextInt(10)+rand.nextInt(10)+rand.nextInt(10)+rand.nextInt(10));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		 
	}

	private static char[] nextInt(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @作用 使用urlconnection
	 * @param url
	 * @param Params
	 * @return
	 * @throws IOException
	 */
	public String sendPost( String Params) throws IOException {
		OutputStreamWriter out = null;
		BufferedReader reader = null;
		String response = "";
		try {
			URL httpUrl = null; // HTTP URL类 用这个类来创建连接
			// 创建URL
			httpUrl = new URL("http://a3.rabbitpre.com/cmp/count");
			// 建立连接
			HttpURLConnection conn = (HttpURLConnection) httpUrl.openConnection();
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Content-Type", "application/json");
			conn.setRequestProperty("connection", "keep-alive");
			conn.setUseCaches(false);// 设置不要缓存
			conn.setInstanceFollowRedirects(true);
			conn.setDoOutput(true);
			conn.setDoInput(true);
			conn.connect();
			// POST请求
			out = new OutputStreamWriter(conn.getOutputStream());
			out.write(Params);
			out.flush();
			// 读取响应
			reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			System.out.println("reader:"+reader);
			String lines;
			while ((lines = reader.readLine()) != null) {
				lines = new String(lines.getBytes(), "utf-8");
				response += lines;
			}
			reader.close();
			// 断开连接
			conn.disconnect();

		} catch (Exception e) {
			System.out.println("发送 POST 请求出现异常！" + e);
			e.printStackTrace();
		}
		// 使用finally块来关闭输出流、输入流
		finally {
			try {
				if (out != null) {
					out.close();
				}
				if (reader != null) {
					reader.close();
				}
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}

		return response;
	}

	public void name() {
		// Map<String, Object> params=new HashMap<String, Object>();
		// System.out.println(this.getClass().getSimpleName());
		// params.put("insfnc",
		// this.getClass().getName()+"."+Thread.currentThread().getStackTrace()[1].getMethodName());
		// System.out.println(params);
		// if (params.get("insfnc")!=null) {
		// String insfncstr=params.get("insfnc").toString();
		// System.out.println(insfncstr);
		// String [] fnclist=insfncstr.split("\\.");
		// System.out.println("---->>>>insfnc:"+fnclist);
		// if (fnclist.length>2) {
		// params.put("insfnc",
		// fnclist[fnclist.length-2]+"."+fnclist[fnclist.length-1]);
		// }else {
		// params.put("insfnc", fnclist[0]+"."+fnclist[1]);
		// }
		// }
		// UUID xuruid = UUID.randomUUID();
		// String string=xuruid.toString().replaceAll("-", "");
		// System.out.println("params:"+string);
		// String string2="2";
		// if (string2.indexOf("加")==-1) {
		// System.out.println("不包含");
		// }
		Map<String, Object> map = new HashMap<String, Object>() {
			{
				put("tpoint", 0);
				put("tlevel", 0);
			}
		};
		System.out.println(map);
	}
}
