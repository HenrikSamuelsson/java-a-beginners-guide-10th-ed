# Java a Beginner's Guide, Tenth Edition

Collection of material related to the book *Java: A Beginner's Guide, Tenth Edition*, written by Herbert Schildt and Danny Coward.

## JDK

To build a JAVA program we need a set of tools called the Java Development Kit (JDK). There are multiple way to get an JDK. A simple way is to go with the open source [Eclipse Temurin JDK](https://adoptium.net/temurin/releases/).

## Build Commands

To build from the command invoke the command `javac` followed by the name of the `.java` file to be built and `.class` file will be created.

```txt
> ls

    Directory: C:\git_repos\java-a-beginners-guide-10th-ed\first-simple-program

Mode                 LastWriteTime         Length Name
----                 -------------         ------ ----
-a---          18/05/2024    06:43            162 HelloWorld.java
> javac .\HelloWorld.java
> ls
    Directory: C:\git_repos\java-a-beginners-guide-10th-ed\first-simple-program

Mode                 LastWriteTime         Length Name
----                 -------------         ------ ----
-a---          18/05/2024    06:58            426 HelloWorld.class
-a---          18/05/2024    06:43            162 HelloWorld.java
```
