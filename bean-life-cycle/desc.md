### Bean 的生命周期

> Spring Bean 从创建 → 初始化完毕 → 销毁的整个过程；

- 调用类的构造方法创建目标对象；
- 调用 `BeanPostProcessor` 实现类中的 `postProcessBeforeInitialization` 方法，完成通用初始化工作，此方法调用时，类还没有开始初始化工作；
- 调用 `@PostConstruct` 标记的初始化方法；
- 调用 `afterPropertiesSet` 方法，该方法实现于 `InitializingBean` 接口；
- 调用 `init_method` 方法，该方法可以在配置 Bean 时指定；
- 完成属性初始化；
- 执行 `@PreDestroy` 标记的预销毁方法；
- 调用 `destroy` 方法，该方法实现于 `DisposableBean` 接口；
- 调用 `destroy_method` 方法，该方法可以在配置 Bean 时指定；

**TIPS：**

如果 `Bean` 的 `Scope` 非单例，那么在上下文关闭时，不会执行销毁处理逻辑；