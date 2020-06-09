

## 基础环境配置
### java
#### 安装
傻瓜安装包，一路next即可（不建议装C盘）
#### 配置环境变量
安装好后，安装目录应该会出现以下几个目录：
```
bin
db
jre
lib
include
```
![](https://www.showdoc.cc/server/api/common/visitfile/sign/e1c0f6e4d312bf3a34ec276554a0cb14?showdoc=.jpg)
![](https://www.showdoc.cc/server/api/common/visitfile/sign/61c0d3f674c3ae57489019e659157cfd?showdoc=.jpg)
![](https://www.showdoc.cc/server/api/common/visitfile/sign/9aad100d8324af12c17141e0c66c6aab?showdoc=.jpg)
![](https://www.showdoc.cc/server/api/common/visitfile/sign/5dd5f956a87cb49c42e85ce4c5bfcc8f?showdoc=.jpg)
添加 `%JAVA_HOME%\jre\bin` `%JAVA_HOME%\bin`
`Note: %JAVA_HOME% 是指java安装路径`
#### 测试
```
$ java -version
java version "1.8.0_111"
Java(TM) SE Runtime Environment (build 1.8.0_111-b14)
Java HotSpot(TM) 64-Bit Server VM (build 25.111-b14, mixed mode)
```
```
$ javac -version
javac 1.8.0_111
```

### ndk
#### 安装
解压安装包即可
#### 配置环境变量
...
添加 `%NDK_HOME%\android-ndk-r10e`
`Note: %NDK_HOME% 是指ndk安装路径`
#### 测试
```
$ ndk-build
Android NDK: Could not find application project directory !
Android NDK: Please define the NDK_PROJECT_PATH variable to point to it.
E:\Java\android-ndk-r10e\build/core/build-local.mk:143: *** Android NDK: Aborting    .  Stop.
```
### sdk
#### 安装
解压安装包即可
#### 配置环境变量
...
添加 `%SDK_HOME%\tools` `SDK_HOME%\platform-tools`
`Note: %SDK_HOME% 是指sdk安装路径`
#### 测试
```
$ ddms
The standalone version of DDMS is deprecated.
Please use Android Device Monitor (monitor.bat) instead.
```

```
$ adb version
Android Debug Bridge version 1.0.40
Version 4797878
Installed as E:\Java\sdk\platform-tools\adb.exe
```

## apk的组成

## apk打包流程

## apk安装流程
