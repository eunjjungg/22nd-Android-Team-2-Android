plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.yapp.bgrating.data"
    compileSdk = 32

    defaultConfig {
        minSdk = 21
        targetSdk = 32

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro",
            )
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
    implementation(com.yapp.bgrating.Test.EXT_JUNIT)
    implementation(com.yapp.bgrating.Test.TEST_RUNNER)
    implementation(com.yapp.bgrating.Test.ESPRESSO_CORE)
}
