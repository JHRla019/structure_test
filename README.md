# structure_test

<br/> 

## Git 시작

1. jdk1.8.0 설치
2. jdk1.8.0의 JVM을 실행시키기위해 eclipst.ini 파일에서 -vm 설정  
(-vmargs 이후 라인은 JVM으로 넘겨지기 때문에 -vm 라인은 -vmargs 위에서 설정해야함)
```
-startup
plugins/org.eclipse.equinox.launcher_1.3.0.v20130327-1440.jar
--launcher.library
plugins/org.eclipse.equinox.launcher.gtk.linux.x86_64_1.1.200.v20140116-2212
-product
org.eclipse.epp.package.jee.product
--launcher.defaultAction
openFile
-vm
/usr/local/java/jdk1.8.0_241/bin
-showsplash
org.eclipse.platform
--launcher.XXMaxPermSize
256m
--launcher.defaultAction
openFile
--launcher.appendVmargs
-vmargs
-Dosgi.requiredJavaVersion=1.6
-XX:MaxPermSize=256m
-Xms40m
-Xmx512m
``` 
3. eclipse 실행 후 Window > Show View > Other > Git > Git Repositories와 Git Staging 선택
4. Git Repositories 창에서 `Clone a Git repository` 클릭
5. URL `https://github.com/JHRla019/structure_test.git`와 본인 계정 정보 입력 후 `Next`, `Finish`
  
<br/>  

## 브랜치 생성 및 관리   
:point_right: https://devhj.tistory.com/10
