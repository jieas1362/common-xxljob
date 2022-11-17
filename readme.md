# springboot xxl-job


### application.yml  
```
xxljob:
  adminAddresses: ***
  accessToken:
  executor:
    appName: ***
    address:
    ip:
    port:
    logPath: ***
    logRetentionDays: ***
```




### project
#### config class
```
@Component
@ConfigurationProperties(prefix = "xxljob")
public class ProXxlJobConfig extends XxlJobConfParams {
}
```

#### use
```
@Component
public class XTask {
    
    @XxlJob("xTask")
    public ReturnT<String> withdrawTransferTask(String param) {
        ......
        return ReturnT.SUCCESS;
    }
}

```