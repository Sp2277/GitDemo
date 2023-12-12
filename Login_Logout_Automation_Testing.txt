cd..
cd..
D:

set projectpath=D:\MyInsider Automation Testing\Login_Logout_Automation
cd %projectpath%
set classpath=%projectpath%\bin;%projectpath%\lib\*
java  org.testng.TestNG TestNG.xml
pause