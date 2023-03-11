# 火狐截图

#### 介绍

火狐截图仓库

```text
截图测试方法:
1.通过python文件的python命令进行处理
2.通过maven集成的依赖进行处理,通过api进行调用
```

关于@Async异步注解的使用:(异步注解注意点)
```text
1.需要添加@EnableAsync启动注解
2.@Async不能在同一个类中
3.@Async所在类需要@Service或者@Component注入
4.调用异步方法类中，使用@Autowired装配
```





