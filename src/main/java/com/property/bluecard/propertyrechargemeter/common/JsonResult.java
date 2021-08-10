package com.property.bluecard.propertyrechargemeter.common;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import java.util.ArrayList;

public class JsonResult<T> implements Serializable {
    private static final long serialVersionUID = -1L;
    public static final String OK = "ok";
    private String status;
    private String msg;
    private long pages;
    private T data;

    public static <T> JsonResult<T> ok(T data) {
        JsonResult<T> result = new JsonResult();
        result.setStatus("ok");
        result.setMsg("ok");
        result.setData(null == data ? (T) new ArrayList() : data);
        return result;
    }

    public static <T> JsonResult<T> ok(T data, long pages) {
        JsonResult<T> result = new JsonResult();
        result.setStatus("ok");
        result.setMsg("ok");
        result.setPages(pages);
        result.setData(null == data ? (T) new ArrayList() : data);
        return result;
    }

    public static <T> JsonResult<T> ok() {
        return (JsonResult<T>) ok((Object)null);
    }

    public static JsonResult fail(String status, String msg) {
        status = status == null ? "fail" : status;
        if ("ok".equals(status)) {
            throw new RuntimeException("ok is not fail");
        } else {
            JsonResult result = new JsonResult();
            result.setStatus(status);
            result.setMsg(msg);
            return result;
        }
    }

    public static JsonResult fail(ExceptionCode serviceStatusEnum) {
        JsonResult result = new JsonResult();
        result.setStatus(serviceStatusEnum.getCode());
        result.setMsg(serviceStatusEnum.getMessage());
        return result;
    }

    public static JsonResult badRequest(String msg) {
        return fail("bad_request", msg);
    }

    @JsonIgnore
    public boolean isOk() {
        return "ok".equals(this.status);
    }

    @JsonGetter
    public long getTimestamp() {
        return System.currentTimeMillis();
    }

    public JsonResult() {
    }

    public String getStatus() {
        return this.status;
    }

    public String getMsg() {
        return this.msg;
    }

    public T getData() {
        return this.data;
    }

    public void setStatus(final String status) {
        this.status = status;
    }

    public void setMsg(final String msg) {
        this.msg = msg;
    }

    public void setData(final T data) {
        this.data = data;
    }

    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof JsonResult)) {
            return false;
        } else {
            JsonResult<?> other = (JsonResult)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                label47: {
                    Object this$status = this.getStatus();
                    Object other$status = other.getStatus();
                    if (this$status == null) {
                        if (other$status == null) {
                            break label47;
                        }
                    } else if (this$status.equals(other$status)) {
                        break label47;
                    }

                    return false;
                }

                Object this$msg = this.getMsg();
                Object other$msg = other.getMsg();
                if (this$msg == null) {
                    if (other$msg != null) {
                        return false;
                    }
                } else if (!this$msg.equals(other$msg)) {
                    return false;
                }

                Object this$data = this.getData();
                Object other$data = other.getData();
                if (this$data == null) {
                    if (other$data != null) {
                        return false;
                    }
                } else if (!this$data.equals(other$data)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(final Object other) {
        return other instanceof JsonResult;
    }

    public int hashCode() {
        boolean PRIME = true;
        int result = 1;
        Object $status = this.getStatus();
        result = result * 59 + ($status == null ? 43 : $status.hashCode());
        Object $msg = this.getMsg();
        result = result * 59 + ($msg == null ? 43 : $msg.hashCode());
        Object $data = this.getData();
        result = result * 59 + ($data == null ? 43 : $data.hashCode());
        return result;
    }

    public String toString() {
        return "JsonResult(status=" + this.getStatus() + ", msg=" + this.getMsg() + ", data=" + this.getData() + ")";
    }

    public long getPages() {
        return pages;
    }

    public void setPages(long pages) {
        this.pages = pages;
    }
}

