buildscript {
    repositories {
        google()
        mavenCentral()
    }

    dependencies {
        classpath("com.android.tools.build:gradle:3.4.0")
        classpath("com.chrnie.gdr:plugin")
    }
}

allprojects{
    repositories {
        google()
        mavenCentral()
    }
}