#module_common组件
###功能描述
- 定义全局Application
- 定义全局基类
- 定义全局工具类
- 管理全局依赖库
- 权限管理(这是因为当我们处于组件开发模式下时，不需要所有组件都去添加一遍权限)
- 公共控件以及公共数据存储
- 组件的资源文件中需要放置项目公用的 Drawable、layout、sting、dimen、color和style 等等，另外项目中的 Activity 主题必须定义在 Common中，方便和 BaseActivity 配合保持整个Android应用的界面风格统一。


###注意问题
- 引入依赖使需要使用api关键字，否则其它组件即使是依赖了module_common组件也使服务使用该组件引入的第三方库
- module_common功能组件的 AndroidManifest.xml 是一张空表，这张表中只有功能组件的包名；
- 功能组件不管是在集成开发模式下还是组件开发模式下属性始终是： com.android.library，所以功能组件是不需要读取 gradle.properties 中的 isModule 值的；另外功能组件的 build.gradle 也无需设置 buildTypes ，只需要 dependencies 这个功能组件需要的jar包和开源库。