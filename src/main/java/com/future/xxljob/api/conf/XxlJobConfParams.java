package com.future.xxljob.api.conf;

/**
 * redis params
 *
 * @author liuyunfei
 */
@SuppressWarnings({"unused", "AlibabaCommentsMustBeJavadocFormat"})
public class XxlJobConfParams implements XxlJobConf {

    protected transient String adminAddresses;

    protected transient String accessToken;

    protected Executor executor;


    public static class Executor {
        protected String appName;
        protected String address;
        protected String ip;
        protected Integer port;
        protected String logPath;
        protected Integer logRetentionDays;

        public String getAppName() {
            return appName;
        }

        public void setAppName(String appName) {
            this.appName = appName;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getIp() {
            return ip;
        }

        public void setIp(String ip) {
            this.ip = ip;
        }

        public Integer getPort() {
            return port;
        }

        public void setPort(Integer port) {
            this.port = port;
        }

        public String getLogPath() {
            return logPath;
        }

        public void setLogPath(String logPath) {
            this.logPath = logPath;
        }

        public Integer getLogRetentionDays() {
            return logRetentionDays;
        }

        public void setLogRetentionDays(Integer logRetentionDays) {
            this.logRetentionDays = logRetentionDays;
        }

        @Override
        public String toString() {
            return "Executor{" +
                    "appName='" + appName + '\'' +
                    ", address='" + address + '\'' +
                    ", ip='" + ip + '\'' +
                    ", port=" + port +
                    ", logPath='" + logPath + '\'' +
                    ", logRetentionDays=" + logRetentionDays +
                    '}';
        }
    }

    @Override
    public String getAdminAddresses() {
        return adminAddresses;
    }

    public void setAdminAddresses(String adminAddresses) {
        this.adminAddresses = adminAddresses;
    }

    @Override
    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    @Override
    public Executor getExecutor() {
        return executor;
    }

    public void setExecutor(Executor executor) {
        this.executor = executor;
    }

    @Override
    public String toString() {
        return "XxlJobConfParams{" +
                "adminAddresses='" + adminAddresses + '\'' +
                ", accessToken='" + accessToken + '\'' +
                ", executor=" + executor +
                '}';
    }
}
