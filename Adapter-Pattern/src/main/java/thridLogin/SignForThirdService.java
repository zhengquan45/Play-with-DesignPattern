package thridLogin;

public class SignForThirdService extends SignService {

    public ResultMsg loginForQQ(String openId){
        //1 openId全局唯一 我们可以把它当作一个用户名(加长)
        //2 密码默认为QQ_EMPTY
        //3 注册(在原有系统里面创建一个用户)
        //4 调用原来的登录方法
        return loginForRegist(openId,null);
    }

    public ResultMsg loginForWechat(String openId){
        return null;
    }

    public ResultMsg loginForToken(String token){
        return null;
    }

    public ResultMsg loginForTelphone(String telphone,String code){
        return null;
    }

    private ResultMsg loginForRegist(String username, String password) {
        super.regist(username,password);
        return super.login(username, password);
    }
}
