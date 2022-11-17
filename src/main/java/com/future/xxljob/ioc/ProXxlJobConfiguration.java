package com.future.xxljob.ioc;

import com.future.xxljob.api.conf.XxlJobConf;
import com.xxl.job.core.executor.impl.XxlJobSpringExecutor;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;

import static com.future.xxljob.api.generator.XxlJobExecutorGenerator.generateXxlJobSpringExecutor;

/**
 * storage configuration
 *
 * @author liuyunfei
 */
@SuppressWarnings({"AlibabaRemoveCommentedCode"})
@ConditionalOnBean(value = {XxlJobConf.class})
@AutoConfiguration
public class ProXxlJobConfiguration {

    @Bean
    XxlJobSpringExecutor xxlJobExecutor(XxlJobConf xxlJobConf) {
        return generateXxlJobSpringExecutor(xxlJobConf);
    }

}
