SET CLASSPATH=%CLASSPATH%;C:\aspectj1.1\lib\aspectjrt.jar
call C:\aspectj1.1\bin\ajc.bat  @files.lst
del *.jad
jad *.class
