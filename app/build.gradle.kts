plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
    id("dagger.hilt.android.plugin")
}

android {
    namespace = "com.yapp.bol.app"
    compileSdk = 32

    defaultConfig {
        applicationId = "com.yapp.bol.app"
        minSdk = 21
        targetSdk = 32
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro",

            )
        }
        debug {
            isMinifyEnabled = false
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation(com.yapp.bol.KTX.CORE)
    implementation(com.yapp.bol.AndroidX.APP_COMPAT)
    implementation(com.yapp.bol.AndroidX.MATERIAL)
    implementation(com.yapp.bol.AndroidX.CONSTRAINT_LAYOUT)
    implementation(com.yapp.bol.Test.JUNIT)
    implementation(com.yapp.bol.Test.TEST_RUNNER)
    implementation(com.yapp.bol.Test.ESPRESSO_CORE)

    implementation(project(mapOf("path" to ":data")))
    implementation(project(mapOf("path" to ":domain")))
    implementation(project(mapOf("path" to ":presentation")))

    // Hilt
    implementation(com.yapp.bol.DaggerHilt.DAGGER_HILT)
    kapt(com.yapp.bol.DaggerHilt.DAGGER_HILT_COMPILER)
    // implementation(com.yapp.bol.DaggerHilt.DAGGER_HILT_VIEW_MODEL)
    kapt(com.yapp.bol.DaggerHilt.DAGGER_HILT_ANDROIDX_COMPILER)

    // retrofit
    implementation(com.yapp.bol.Retrofit.RETROFIT)
    implementation(com.yapp.bol.Retrofit.CONVERTER_GSON)
    implementation(com.yapp.bol.Retrofit.CONVERTER_JAXB)

    // AndroidX
    implementation(com.yapp.bol.AndroidX.LIFECYCLE_VIEW_MODEL)
    implementation(com.yapp.bol.AndroidX.LIFECYCLE_LIVEDATA)
    implementation(com.yapp.bol.AndroidX.ACTIVITY)
    implementation(com.yapp.bol.AndroidX.FRAGMENT)
    implementation(com.yapp.bol.AndroidX.COMPOSE)

    // Coroutines
    implementation(com.yapp.bol.Coroutines.COROUTINES)
}