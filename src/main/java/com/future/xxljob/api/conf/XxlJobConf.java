package com.future.xxljob.api.conf;

/**
 * storage conf
 *
 * @author liuyunfei
 */
@SuppressWarnings({"AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc", "AlibabaCommentsMustBeJavadocFormat"})
public interface XxlJobConf {

    String getAdminAddresses();

    String getAccessToken();

    XxlJobConfParams.Executor getExecutor();

}
