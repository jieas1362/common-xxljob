package com.future.xxljob.api.generator;

import com.future.base.util.base.ProChecker;
import com.future.xxljob.api.conf.XxlJobConf;
import com.xxl.job.core.executor.impl.XxlJobSpringExecutor;

/**
 * XxlJob components generator
 *
 * @author zhaojj
 */
@SuppressWarnings({"JavaDoc", "unused"})
public final class XxlJobExecutorGenerator {

    /**
     * generate XxlJobSpringExecutor
     *
     * @param xxlJobConf
     * @return
     */
    public static XxlJobSpringExecutor generateXxlJobSpringExecutor(XxlJobConf xxlJobConf) {
        XxlJobSpringExecutor xxlJobSpringExecutor = new XxlJobSpringExecutor();
        xxlJobSpringExecutor.setAdminAddresses(xxlJobConf.getAdminAddresses());
        xxlJobSpringExecutor.setAppname(xxlJobConf.getExecutor().getAppName());
        if (ProChecker.isNotBlank(xxlJobConf.getExecutor().getAddress())) {
            xxlJobSpringExecutor.setAddress(xxlJobConf.getExecutor().getAddress());
        }
        if (ProChecker.isNotBlank(xxlJobConf.getExecutor().getIp())) {
            xxlJobSpringExecutor.setIp(xxlJobConf.getExecutor().getIp());
        }
        if (ProChecker.isValidIdentity(xxlJobConf.getExecutor().getPort())) {
            xxlJobSpringExecutor.setPort(xxlJobConf.getExecutor().getPort());
        }
        if (ProChecker.isNotBlank(xxlJobConf.getAccessToken())) {
            xxlJobSpringExecutor.setAccessToken(xxlJobConf.getAccessToken());
        }
        xxlJobSpringExecutor.setLogPath(xxlJobConf.getExecutor().getLogPath());
        xxlJobSpringExecutor.setLogRetentionDays(xxlJobConf.getExecutor().getLogRetentionDays());
        return xxlJobSpringExecutor;
    }

}
