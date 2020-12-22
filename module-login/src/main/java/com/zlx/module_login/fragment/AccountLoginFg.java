package com.zlx.module_login.fragment;

import android.os.Handler;
import android.text.TextUtils;
import android.widget.EditText;

import androidx.navigation.fragment.NavHostFragment;

import com.zlx.module_base.base_api.res_data.UserInfo;
import com.zlx.module_base.base_api.util.ApiUtil;
import com.zlx.module_base.base_fg.BaseFg;
import com.zlx.module_base.database.MMkvHelper;
import com.zlx.module_login.R;
import com.zlx.module_login.R2;
import com.zlx.module_network.api1.livedata.BaseObserver;
import com.zlx.module_network.api1.livedata.BaseObserverCallBack;
import com.zlx.module_network.bean.ApiResponse;
import com.zlx.module_network.widget.popwindow.PopUtil;
import com.zlx.widget.ClearEditText;
import com.zlx.widget.submit_button.SubmitButton;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * FileName: AccountLoginFg
 * Created by andy on 2020/9/21 14:54
 * 
 * Description: 账号登录
 */
public class AccountLoginFg extends BaseFg {

    @BindView(R2.id.etAccount)
    ClearEditText etAccount;
    @BindView(R2.id.etPassword)
    EditText etPassword;
    @BindView(R2.id.btnLogin)
    SubmitButton btnLogin;

    @Override
    protected int getLayoutId() {
        return R.layout.fg_account_login;
    }

    @Override
    protected void initViews() {
        super.initViews();

    }


    private void login() {
        String username = etAccount.getText().toString().trim();
        if (TextUtils.isEmpty(username)) {
            PopUtil.show("请输入账号");
            return;
        }
        String password = etPassword.getText().toString().trim();
        if (TextUtils.isEmpty(password)) {
            PopUtil.show( "请输入密码");
            return;
        }

        btnLogin.startAnim();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                ApiUtil.getLoginApi().login(username, password).observe(getViewLifecycleOwner(),
                        new BaseObserver<>(new BaseObserverCallBack<ApiResponse<UserInfo>>() {
                            @Override
                            public void onSuccess(ApiResponse<UserInfo> data) {
                                MMkvHelper.getInstance().saveUserInfo(data.getData());
                                getActivity().finish();
                            }

                            @Override
                            public boolean showErrorMsg() {
                                return true;
                            }

                            @Override
                            public void onFinish() {
                                super.onFinish();
                                btnLogin.reset();
                            }
                        }));
            }
        },2000);

    }

    @Override
    public void onStop() {
        super.onStop();
        btnLogin.reset();
    }

    @OnClick(R2.id.btnLogin)
    public void onViewClicked() {
        login();

    }
    @OnClick(R2.id.ivCha)
    public void cha(){
        getActivity().finish();
    }

    @OnClick(R2.id.tvRegister)
    public void register(){
        NavHostFragment.findNavController(this).navigate(R.id.action_fragment_register);
    }
}
