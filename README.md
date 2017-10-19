# Firebase

In this project I'll explain you how to create an Firebase project and how to write to the db.

First you have to edit build.gradle(Project) file.
In the dependencies areas, paste this code

    dependencies {

        classpath 'com.android.tools.build:gradle:2.3.3'
        classpath 'com.google.gms:google-services:3.1.0'
     
    }
and then under jcenter(), paste this code

    maven()
                {
                    url 'https://maven.google.com'
                }

Then in build.gradle(Module:app) file, paste this code at the bottom of the last code block 

    apply plugin: 'com.google.gms.google-services'

Now it depends on your project what kind of project you want to work on. Because at firebase you have several [libraries](https://firebase.google.com/docs/android/setup).
If you want to work with database and with authentication then you have to paste these libraries reference in build.gradle(Module:app) file under the last block of dependencies.

    compile 'com.google.firebase:firebase-database:11.4.2'
    compile 'com.google.firebase:firebase-auth:11.4.2'

