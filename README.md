用于练习和测试Android一些有意思的功能,方便后面查看和管理,不至于到处寻找

1. 项目中有一个注解库,用于方便新的功能界面直接注册到我的主界面入口, 不需要手动添加,如果你想把你的写的界面添加到主界面,只需要在你的新Activity上面使用注解@ActRegister(name="在主界面入口显示的名字", position=0) 就可以了. 如果想要改变显示的位置靠前, 可以将position写小一点就可以了.

2. 目前完成了一个高版本的Activity插件化测试代码,低版本目前还没有兼容,需要Android 6.0以上.
