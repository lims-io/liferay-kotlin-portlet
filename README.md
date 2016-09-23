# Sample Liferay portlet written in Kotlin

## What is Kotlin
[Kotlin](http://kotlinlang.org/) is a new programming language from JetBrains. It's a great language with tons of features that make the programming way easier:

* ***null safety*** - lets the compiler systematically flag potential null pointer dereferences (no more NullPointerExceptions)
* ***functional programming support*** - with zero-overhead lambdas and ability to do mapping, folding over standard Java collections
* ***extension functions*** - let you add methods to classes without modifying their source code. It's a great way how to avoid FooUtils classes.
* ***lean syntax*** - type inference works everywhere, one liner functions take one line, simple structs/JavaBeans can also be declared in one line
* ***real properties*** - generate getFoo/setFoo methods behind the scenes for Java interop
* and many others like ***lambdas***, ***data classes***, ***better generics***, ***delegation***...

When building portlets for Liferay 6.x you usually have to choose Java 6 or 7. Having all the Kotlin's killer features above would be great right? Actually, it's possible and quite easy because Kotlin targets Java 6, so you can use it even if your deployment makes upgrading to a newer JVM difficult!

## How To Add Kotlin to Liferay SDK

Download the latest version of kotlin library:
https://github.com/JetBrains/kotlin/releases

Unzip and copy the whole content of lib folder into the Liferay SDK lib folder. So at the end you should have something like /path-to-liferay-sdk/lib/kotlin-*.jar 

Open build-comon.xml file in Liferay SDK directory and search for ***javac*** tag (it's around line 900). 

Add the following line before the javac tag:

```<typedef resource="org/jetbrains/kotlin/ant/antlib.xml" classpath="${sdk.dir}/lib/kotlin-ant.jar"/>```

and also insert ```<withKotlin/>``` inside the javac tag:

```
<typedef resource="org/jetbrains/kotlin/ant/antlib.xml" classpath="${sdk.dir}/lib/kotlin-ant.jar"/>
<javac
  classpathref="@{javac.classpathref}"
  compiler="${javac.compiler}"
  debug="${javac.debug}"
  deprecation="${javac.deprecation}"
  destdir="@{javac.destdir}"
  encoding="${javac.encoding}"
  includeAntRuntime="false"
  nowarn="${javac.nowarn}"
  source="${javac.source}"
  srcdir="@{javac.srcdir}"
  target="${javac.target}">
 <withKotlin/>
</javac>
```

That's it. If you run ```ant deploy``` ant will compile *.kt files together with *.java for you. 
Now, if you are using Intellij IDEA you can add a Kotlin file into your project. 
The IDE will configure the project for you. It will also add 3 files
(kotlin-reflect.jar, kotlin-runtime.jar, kotlin-runtime-sources.jar) into the newly created lib folder. 
However, you need to copy these files into the docroot/WEB-INF/lib folder to make it available.

## How To Build
First, you need to add Kotlin to your Liferay SDK as described in the chapter above. 
Once you're done, clone the project into the ***/path-to-liferay-sdk/portlets/*** folder and run ```ant deploy```.

## Known Issues
### Build Service Fails
If you run ```ant build-service``` the task fails on:

```
Exception in thread "main" java.lang.NoSuchMethodError: org.apache.log4j.Level.toLevel
```
The only solution is to comment the ```<withKotlin/>``` tag out and remove all the kotlin-*.jar files from the lib folder. 
If you find a better solution please let me know (marcel@lims.io).

### Build Fails On OutOfMemoryError
Sometimes if you run ```ant deploy``` it fails with:

```
java.lang.OutOfMemoryError: PermGen space
```

To fix this simply increase the memory by:

```
export ANT_OPTS="-Xmx2g -XX:MaxPermSize=1024m"
```
