/**
  * Copyright 2017 bejson.com 
  */
package com.bigniu.bean;

/**
 * Auto-generated: 2017-09-12 15:20:42
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class ResultData {

    private int code;
    private int show;
    private String api;
    private String html;
    private int order;
    private int cachetime;
    private String game;
    private ServerParams server_params;
    private String message;
    private Data data;
    private String method;
    public void setCode(int code) {
         this.code = code;
     }
     public int getCode() {
         return code;
     }

    public void setShow(int show) {
         this.show = show;
     }
     public int getShow() {
         return show;
     }

    public void setApi(String api) {
         this.api = api;
     }
     public String getApi() {
         return api;
     }

    public void setHtml(String html) {
         this.html = html;
     }
     public String getHtml() {
         return html;
     }

    public void setOrder(int order) {
         this.order = order;
     }
     public int getOrder() {
         return order;
     }

    public void setCachetime(int cachetime) {
         this.cachetime = cachetime;
     }
     public int getCachetime() {
         return cachetime;
     }

    public void setGame(String game) {
         this.game = game;
     }
     public String getGame() {
         return game;
     }

    public void setServer_params(ServerParams server_params) {
         this.server_params = server_params;
     }
     public ServerParams getServer_params() {
         return server_params;
     }

    public void setMessage(String message) {
         this.message = message;
     }
     public String getMessage() {
         return message;
     }

    public void setData(Data data) {
         this.data = data;
     }
     public Data getData() {
         return data;
     }

    public void setMethod(String method) {
         this.method = method;
     }
     public String getMethod() {
         return method;
     }
	@Override
	public String toString() {
		return "ResultData [code=" + code + ", show=" + show + ", api=" + api + ", html=" + html + ", order=" + order
				+ ", cachetime=" + cachetime + ", game=" + game + ", server_params=" + server_params + ", message="
				+ message + ", data=" + data + ", method=" + method + "]";
	}
}