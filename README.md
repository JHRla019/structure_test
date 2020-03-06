# structure_test

## 형상관리 사용법
1. jdk1.8.0 설치
2. eclipst.ini 파일 수정
```
-startup
plugins/org.eclipse.equinox.launcher_1.3.0.v20130327-1440.jar
-vm
/usr/local/java/jdk1.8.0_241/bin
--launcher.library
plugins/org.eclipse.equinox.launcher.gtk.linux.x86_64_1.1.200.v20140116-2212
-product
org.eclipse.epp.package.jee.product
--launcher.defaultAction
openFile
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
