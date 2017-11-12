package com.bigniu.main;

import java.util.HashMap;
import java.util.Map;

import com.bigniu.bean.ResultData;
import com.bigniu.util.HttpConnection;
import com.google.gson.Gson;

public class GetPkey {
	public String cookie;
	public static String getPkey(){
		String url = "http://lol.magnet.zhangyoubao.com/server/rest?api=search.user&game=lol&userId=31336768&platformVersion=501140";
		Map<String,String> params = new HashMap();
		params.put("deviceId", "cgz+flSZ1mAe5HCIrkpVbZ44XIxNM9u2BlRhlAdsdQD8jmOoi9VDs2PtRSPiEPI2sRlKUHz0TCSZS4RPnizPPA==");
		params.put("sign", "");
		params.put("time", "1505199812");
		params.put("userId", "31336768");
		params.put("api", "search.user");
		params.put("secretId", "AKIDz8krbsJ5yKBZQpn74WFkmLPx3gnPhESA");
		params.put("apiVersion", "v1");
		params.put("userToken", "893c13041f218b628ab8057c16c12578ba3");
		params.put("game", "lol");
		params.put("os", "android");
		params.put("platformVersion", "501140");
		params.put("platform", "android");
		params.put("params[ver]", "44");
		params.put("secretSignature", "DhMrQieUFdjjgWFufeuQFRR20VI=");
		params.put("params[request]", "{\"area\":5,\"name\":\"Æð·çÁËØ¼\"}");
		params.put("osVersion", "22");
		params.put("secretVersion", "v1.0");
		params.put("nonce", "81727");
		params.put("time", "cgz");
		Map<String,String> cookies = new HashMap();
		String str = HttpConnection.getJson(url, params, cookies, "post");
		return getCookies(str);
	}
	public static String getCookies(String str){
		System.out.println("str:"+str);
		Gson gson = new Gson();
		ResultData resultData = gson.fromJson(str, ResultData.class);
		System.out.println("resultData:"+resultData);
		String cookies=resultData.getServer_params().getCookie();
		System.out.println("cookies:"+cookies);
		return cookies;
	}
}
