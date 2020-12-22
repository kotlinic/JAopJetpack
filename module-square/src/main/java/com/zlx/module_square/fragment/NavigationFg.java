package com.zlx.module_square.fragment;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.zlx.module_base.base_api.res_data.TreeListRes;
import com.zlx.module_base.base_api.util.ApiUtil;
import com.zlx.module_base.constant.RouterFragmentPath;
import com.zlx.module_network.api1.livedata.BaseObserver;
import com.zlx.module_network.api1.livedata.BaseObserverCallBack;
import com.zlx.module_network.bean.ApiResponse;
import com.zlx.module_square.base.BaseSquareFg;

import java.util.List;

/**
 * FileName: NavigationFg
 * Created by andy on 2020/9/18 10:16
 * 
 * Description: 导航
 */
@Route(path = RouterFragmentPath.Square.PAGER_NAVIGATION)
public class NavigationFg extends BaseSquareFg {

    @Override
    protected void initViews() {
        super.initViews();
        showLoading(indicatorScrollView);
        listSystem();
    }

    private void listSystem() {
        ApiUtil.getTreeApi().listNavis().observe(this,
                new BaseObserver<>(new BaseObserverCallBack<ApiResponse<List<TreeListRes>>>() {
                    @Override
                    public void onSuccess(ApiResponse<List<TreeListRes>> data) {
                        setData(data.getData(),false);
                    }

                    @Override
                    public void onFinish() {
                        super.onFinish();
                        showSuccess();
                    }
                }));
    }
}
