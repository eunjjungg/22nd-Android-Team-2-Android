plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
    id("dagger.hilt.android.plugin")
}

android {
    namespace = "com.yapp.bgrating.app"
    compileSdk = 32

    defaultConfig {
        applicationId = "com.yapp.bgrating.app"
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
    implementation(com.yapp.bgrating.KTX.CORE)
    implementation(com.yapp.bgrating.AndroidX.APP_COMPAT)
    implementation(com.yapp.bgrating.AndroidX.MATERIAL)
    implementation(com.yapp.bgrating.AndroidX.CONSTRAINT_LAYOUT)
    implementation(com.yapp.bgrating.Test.JUNIT)
    implementation(com.yapp.bgrating.Test.TEST_RUNNER)
    implementation(com.yapp.bgrating.Test.ESPRESSO_CORE)

    implementation(project(mapOf("path" to ":data")))
    implementation(project(mapOf("path" to ":domain")))

    // Hilt
    implementation(com.yapp.bgrating.DaggerHilt.DAGGER_HILT)
    kapt(com.yapp.bgrating.DaggerHilt.DAGGER_HILT_COMPILER)
    implementation(com.yapp.bgrating.DaggerHilt.DAGGER_HILT_VIEW_MODEL)
    kapt(com.yapp.bgrating.DaggerHilt.DAGGER_HILT_ANDROIDX_COMPILER)

    // retrofit
    implementation(com.yapp.bgrating.Retrofit.RETROFIT)
    implementation(com.yapp.bgrating.Retrofit.CONVERTER_GSON)
    implementation(com.yapp.bgrating.Retrofit.CONVERTER_JAXB)
}
