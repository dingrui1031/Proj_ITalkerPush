package net.dingrui.web.italker.push.bean.api.account;

import com.google.common.base.Strings;
import com.google.gson.annotations.Expose;

/**
 * @author dingrui
 */
public class RegisterModel {
    @Expose
    private String account;
    @Expose
    private String password;
    @Expose
    private String name;
    @Expose
    private String pushId;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPushId() {
        return pushId;
    }

    public void setPushId(String pushId) {
        this.pushId = pushId;
    }

    /**
     * 校验用户名密码姓名是否为空
     * @param registerModel
     * @return
     */
    public static boolean check(RegisterModel registerModel) {
        return registerModel != null
                && !Strings.isNullOrEmpty(registerModel.account)
                && !Strings.isNullOrEmpty(registerModel.password)
                && !Strings.isNullOrEmpty(registerModel.name);

    }
}
