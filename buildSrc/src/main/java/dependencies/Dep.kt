package dependencies

object Dep {
    object GradlePlugin {
        val android = "com.android.tools.build:gradle:3.5.3"
        val kotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Kotlin.version}"
        val playServices = "com.google.gms:google-services:4.2.0"
        val safeArgs =
            "android.arch.navigation:navigation-safe-args-gradle-plugin:${AndroidX.Navigation.version}"
        val licensesPlugin = "com.google.android.gms:oss-licenses-plugin:0.9.4"
        val crashlytics = "io.fabric.tools:gradle:1.26.1"
        val testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    object Plugin {
        val android = "com.android.application"
        val kotlin = "kotlin-android"
        val kotlinExtensions = "kotlin-android-extensions"
        val kotlinKapt = "kotlin-kapt"
        val navigation = "androidx.navigation.safeargs.kotlin"
    }

    object Test {
        val junit = "junit:junit:4.12"
        val testRunner = "androidx.test:runner:1.1.0"
        val androidJunit4 = "androidx.test.ext.junit:1.1.0"
        val archCore = "androidx.arch.core:core-testing:2.0.0"
        val espressoCore = "androidx.test.espresso:espresso-core:3.2.0"
        val kotlinTestAssertions = "io.kotlintest:kotlintest-assertions:3.1.10"
        val testingKtx =
            "android.arch.navigation:navigation-testing-ktx:${AndroidX.Navigation.version}"

        object KotlinMultiPlatform {
            val jvmModuleTest = "org.jetbrains.kotlin:kotlin-test"
            val jvmModuleTestJunit = "org.jetbrains.kotlin:kotlin-test-junit"
            val commonModuleTest = "org.jetbrains.kotlin:kotlin-test-common"
            val commonModuleTestAnnotations = "org.jetbrains.kotlin:kotlin-test-annotations-common"
        }

        val slf4j = "org.slf4j:slf4j-simple:1.7.25"
    }

    object AndroidX {
        val jetifier = "com.android.tools.build.jetifier:jetifier-core:1.0.0-beta02"
        val core = "androidx.core:core-ktx:1.1.0"
        val appCompat = "androidx.appcompat:appcompat:1.0.0"
        val recyclerView = "androidx.recyclerview:recyclerview:1.0.0"
        val constraint = "androidx.constraintlayout:constraintlayout:1.1.3"
        val emoji = "androidx.emoji:emoji-appcompat:1.0.0"
        val design = "com.google.android.material:material:1.1.0-alpha02"
        val coreKtx = "androidx.core:core-ktx:1.0.0-alpha1"
        val preference = "androidx.preference:preference:1.0.0"
        val browser = "androidx.browser:browser:1.0.0"
        val fragment = "androidx.fragment:fragment:1.1.0-alpha03"

        val lifecycleExtensions = "androidx.lifecycle:lifecycle-extensions:2.0.0"
        val lifecycleLiveData = "androidx.lifecycle:lifecycle-livedata:2.0.0"

        object Room {
            val version = "2.1.0-alpha03"
            val compiler = "androidx.room:room-compiler:$version"
            val runtime = "androidx.room:room-runtime:$version"
            val coroutine = "androidx.room:room-coroutines:$version"
        }

        object Navigation {
            val version = "1.0.0"
            val fragmentKtx = "android.arch.navigation:navigation-fragment-ktx:$version"
            val uiKtx = "android.arch.navigation:navigation-ui-ktx:$version"
        }

        object Work {
            val version = "1.0.0-alpha12"
            val runtime = "android.arch.work:work-runtime:$version"
            val runtimeKtx = "android.arch.work:work-runtime-ktx:$version"
        }
    }

    object Kotlin {
        val version = "1.3.61"
        val stdlibCommon = "org.jetbrains.kotlin:kotlin-stdlib-common:$version"
        val stdlibJvm = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:$version"
        val coroutinesVersion = "1.2.0"
        val coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$coroutinesVersion"
        val androidCoroutinesDispatcher =
            "org.jetbrains.kotlinx:kotlinx-coroutines-android:$coroutinesVersion"
        val coroutinesReactive =
            "org.jetbrains.kotlinx:kotlinx-coroutines-reactive:$coroutinesVersion"
        val coroutinesPlayServices =
            "org.jetbrains.kotlinx:kotlinx-coroutines-play-services:$coroutinesVersion"
        val serializationCommon = "org.jetbrains.kotlinx:kotlinx-serialization-runtime:0.10.0"
        val serializationIos = "org.jetbrains.kotlinx:kotlinx-serialization-runtime-native:0.10.0"
    }

    object Firebase {
        val core = "com.google.firebase:firebase-core:16.0.4"
        val fireStore = "com.google.firebase:firebase-firestore:17.1.3"
        val auth = "com.google.firebase:firebase-auth:16.0.5"
        val crashlytics = "com.crashlytics.sdk.android:crashlytics:2.9.8"
        val messaging = "com.google.firebase:firebase-messaging:17.3.3"
    }

    object Arch {
        val version = "1.1.1"
        val core = "android.arch.lifecycle:runtime:$version"
        val extensions = "android.arch.lifecycle:extensions:$version"
        val compiler = "android.arch.lifecycle:compiler:$version"
    }

    object RxAndroid {
        val rxjava = "io.reactivex.rxjava2:rxjava:2.1.0"
        val rxandroid = "io.reactivex.rxjava2:rxandroid:2.0.1"
    }

    object Retrofit2 {
        val retrofit = "com.squareup.retrofit2:retrofit:2.3.0"
        val gson = "com.squareup.retrofit2:converter-gson:2.3.0"
        val adapter = "com.squareup.retrofit2:adapter-rxjava2:2.3.0"
    }

    object PlayServices {
        val auth = "com.google.android.gms:play-services-auth:16.0.1"
        val licensesPlugin = "com.google.android.gms:play-services-oss-licenses:16.0.1"
    }

    object Dagger {
        val version = "2.20"
        val core = "com.google.dagger:dagger:$version"
        val compiler = "com.google.dagger:dagger-compiler:$version"
        val androidSupport = "com.google.dagger:dagger-android-support:$version"
        val android = "com.google.dagger:dagger-android:$version"
        val androidProcessor = "com.google.dagger:dagger-android-processor:$version"
        val assistedInjectAnnotations =
            "com.squareup.inject:assisted-inject-annotations-dagger2:0.3.0"
        val assistedInjectProcessor = "com.squareup.inject:assisted-inject-processor-dagger2:0.3.0"
    }

    object Ktor {
        val version = "1.1.2"
        val clientCommon = "io.ktor:ktor-client-core:$version"
        val clientAndroid = "io.ktor:ktor-client-okhttp:$version"
        val clientIos = "io.ktor:ktor-client-ios:$version"
        val jsonCommon = "io.ktor:ktor-client-json:$version"
        val jsonJvm = "io.ktor:ktor-client-json-jvm:$version"
        val jsonNative = "io.ktor:ktor-client-json-native:$version"
    }

    object OkHttp {
        val version = "3.11.0"
        val client = "com.squareup.okhttp3:okhttp:$version"
        val loggingInterceptor = "com.squareup.okhttp3:logging-interceptor:$version"
        val okio = "com.squareup.okio:okio:1.14.0"
    }

    val liveDataKtx = "com.shopify:livedata-ktx:2.0.1"

    val ktlint = "com.github.shyiko:ktlint:0.29.0"

    object LeakCanary {
        val version = "1.6.3"
        val leakCanary = "com.squareup.leakcanary:leakcanary-android:$version"
        val leakCanaryNoOp = "com.squareup.leakcanary:leakcanary-android-no-op:$version"
        val leakCanaryFragment = "com.squareup.leakcanary:leakcanary-support-fragment:$version"
    }

    object Stetho {
        val stetho = "com.facebook.stetho:stetho:1.5.0"
    }

    object Hyperion {
        val version = "0.9.25"
        val hyperionPlugins = listOf(
            "com.willowtreeapps.hyperion:hyperion-core:$version",
            "com.willowtreeapps.hyperion:hyperion-attr:$version",
            "com.willowtreeapps.hyperion:hyperion-measurement:$version",
            "com.willowtreeapps.hyperion:hyperion-disk:$version",
            "com.willowtreeapps.hyperion:hyperion-recorder:$version",
            "com.willowtreeapps.hyperion:hyperion-phoenix:$version",
            "com.willowtreeapps.hyperion:hyperion-crash:$version",
            "com.willowtreeapps.hyperion:hyperion-shared-preferences:$version",
            "com.willowtreeapps.hyperion:hyperion-geiger-counter:$version",
            "com.willowtreeapps.hyperion:hyperion-build-config:$version"
        )
    }

    object Klock {
        val version = "1.1.0-eap-100"
        val common = "com.soywiz:klock:$version"
        val jvm = "com.soywiz:klock-jvm:$version"
    }

    object MockK {
        val jvm = "io.mockk:mockk:1.9"
        val common = "io.mockk:mockk-common:1.9"
    }

    object Glide {
        val glide = "com.squareup.picasso:picasso:2.71828"
        val glideTransformation = "jp.wasabeef:picasso-transformations:2.2.1"
    }

    object Timber {
        val common = "com.jakewharton.timber:timber-common:5.0.0-SNAPSHOT"
        val jdk = "com.jakewharton.timber:timber-jdk:5.0.0-SNAPSHOT"
        val android = "com.jakewharton.timber:timber-android:5.0.0-SNAPSHOT"
    }

    object PhotoView {
        val photoview =  "com.github.chrisbanes:PhotoView:2.3.0"
    }
}
