package com.yapp.bgrating

import com.yapp.bgrating.Versions.HILT_VERSION
import com.yapp.bgrating.Versions.KOTLIN_VERSION
import com.yapp.bgrating.Versions.KTLINT_VERSION

// ktlint-disable filename

object Versions {
    const val KOTLIN_VERSION = "1.6.10"
    const val KTLINT_VERSION = "9.1.0"
    const val HILT_VERSION = "2.44"
}

object Kotlin {
    const val SDK = "org.jetbrains.kotlin:kotlin-gradle-plugin:$KOTLIN_VERSION"
}

object KTX {
    const val CORE = "androidx.core:core-ktx:1.8.0"
}

object AndroidX {
    const val MATERIAL = "com.google.android.material:material:1.9.0"
    const val CONSTRAINT_LAYOUT = "androidx.constraintlayout:constraintlayout:2.1.4"
    const val APP_COMPAT = "androidx.appcompat:appcompat:1.5.1"
}

object DaggerHilt {
    const val DAGGER_HILT = "com.google.dagger:hilt-android:$HILT_VERSION"
    const val DAGGER_HILT_COMPILER = "com.google.dagger:hilt-android-compiler:$HILT_VERSION"
    const val DAGGER_HILT_VIEW_MODEL = "androidx.hilt:hilt-lifecycle-viewmodel:1.0.0-alpha03"
    const val DAGGER_HILT_ANDROIDX_COMPILER = "androidx.hilt:hilt-compiler:1.0.0"
}

object Retrofit {
    const val RETROFIT = "com.squareup.retrofit2:retrofit:2.9.0"
    const val CONVERTER_GSON = "com.squareup.retrofit2:converter-gson:2.9.0"
    const val CONVERTER_JAXB = "com.squareup.retrofit2:converter-jaxb:2.9.0"
}

object OkHttp {
    const val OKHTTP = "com.squareup.okhttp3:okhttp:4.9.1"
    const val LOGGING_INTERCEPTOR = "com.squareup.okhttp3:logging-interceptor:4.9.1"
}

object KtLint {
    const val KTLINT = "org.jlleitschuh.gradle:ktlint-gradle:$KTLINT_VERSION"
}

object Test {
    const val JUNIT = "junit:junit:4.13.2"
    const val TEST_RUNNER = "com.android.support.test:runner:1.0.2"
    const val ESPRESSO_CORE = "com.android.support.test.espresso:espresso-core:3.0.2"
    const val EXT_JUNIT = "androidx.test.ext:junit:1.1.5"
}
