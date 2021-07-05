# 插件式的扩展框架
## 一. 业务场景
1. 动态安全规则：
```text
安全应用中，应用规则可以在运行时动态添加，不用修改原有运行主流程和框架。
应用规则无法提前抽象。
```

2. 动态数据过滤
```text
假设数据ETL处理中，数据的过滤和抽取规则随时可能新增、修改、减少，并且，
规则需要编写代码才能实现，即规则无法提前抽象。
```

3. 插件式能力组合
```text
假设应用主要流程由A组团队开发，其中涉及某个或多个规则必须由B组团队在应用落地时根据业务需求不断调整。
并且，这些规则之间无法进行高度抽象，也无法将规则录入数据库字典中。
要求A和B两个团队高度解耦，即A，B团队可能都不是一个公司的团队。
```