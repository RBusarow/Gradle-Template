/*
 * Copyright (C) 2021 Rick Busarow
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

plugins {
  id("com.rickbusarow.gradle-dependency-sync") version "0.11.2"
}

dependencies {

  dependencySync("androidx.activity:activity-compose:1.3.1")
  dependencySync("androidx.activity:activity-ktx:1.3.1")
  dependencySync("androidx.activity:activity:1.3.1")
  dependencySync("androidx.annotation:annotation:1.2.0")
  dependencySync("androidx.appcompat:appcompat:1.3.1")
  dependencySync("androidx.arch.core:core-testing:2.1.0")
  dependencySync("androidx.compose.compiler:compiler:1.0.3")
  dependencySync("androidx.compose.foundation:foundation:1.0.3")
  dependencySync("androidx.compose.material:material-icons-core:1.0.3")
  dependencySync("androidx.compose.material:material-icons-extended:1.0.3")
  dependencySync("androidx.compose.material:material:1.0.3")
  dependencySync("androidx.compose.runtime:runtime:1.0.3")
  dependencySync("androidx.compose.ui:ui-test-junit4:1.0.3")
  dependencySync("androidx.compose.ui:ui-test-manifest:1.0.3")
  dependencySync("androidx.compose.ui:ui-tooling:1.0.3")
  dependencySync("androidx.compose.ui:ui:1.0.3")
  dependencySync("androidx.constraintlayout:constraintlayout:2.1.1")
  dependencySync("androidx.core:core-ktx:1.6.0")
  dependencySync("androidx.fragment:fragment-ktx:1.3.6")
  dependencySync("androidx.fragment:fragment-testing:1.3.6")
  dependencySync("androidx.fragment:fragment:1.3.6")
  dependencySync("androidx.lifecycle:lifecycle-common:2.3.1")
  dependencySync("androidx.lifecycle:lifecycle-livedata-core:2.3.1")
  dependencySync("androidx.lifecycle:lifecycle-livedata-ktx:2.3.1")
  dependencySync("androidx.lifecycle:lifecycle-runtime-ktx:2.3.1")
  dependencySync("androidx.lifecycle:lifecycle-runtime:2.3.1")
  dependencySync("androidx.lifecycle:lifecycle-viewmodel-compose:2.4.0-beta01")
  dependencySync("androidx.lifecycle:lifecycle-viewmodel-ktx:2.3.1")
  dependencySync("androidx.lifecycle:lifecycle-viewmodel-savedstate:2.3.1")
  dependencySync("androidx.lifecycle:lifecycle-viewmodel:2.3.1")
  dependencySync("androidx.navigation:navigation-common:2.4.0-alpha10")
  dependencySync("androidx.navigation:navigation-compose:2.4.0-alpha10")
  dependencySync("androidx.navigation:navigation-fragment-ktx:2.4.0-alpha10")
  dependencySync("androidx.navigation:navigation-runtime-ktx:2.4.0-alpha10")
  dependencySync("androidx.navigation:navigation-ui-ktx:2.4.0-alpha10")
  dependencySync("androidx.paging:paging-common-ktx:3.0.1")
  dependencySync("androidx.paging:paging-compose:1.0.0-alpha13")
  dependencySync("androidx.paging:paging-runtime-ktx:3.0.1")
  dependencySync("androidx.room:room-common:2.4.0-alpha05")
  dependencySync("androidx.room:room-compiler:2.4.0-alpha05")
  dependencySync("androidx.room:room-ktx:2.4.0-alpha05")
  dependencySync("androidx.room:room-paging:2.4.0-alpha05")
  dependencySync("androidx.room:room-runtime:2.4.0-alpha05")
  dependencySync("androidx.room:room-testing:2.4.0-alpha05")
  dependencySync("androidx.savedstate:savedstate:1.1.0")
  dependencySync("androidx.startup:startup-runtime:1.1.0")
  dependencySync("androidx.test.espresso:espresso-contrib:3.4.0")
  dependencySync("androidx.test.espresso:espresso-core:3.4.0")
  dependencySync("androidx.test.espresso:espresso-idling-resource:3.4.0")
  dependencySync("androidx.test.espresso:espresso-intents:3.4.0")
  dependencySync("androidx.test.espresso:espresso-web:3.4.0")
  dependencySync("androidx.test.ext:junit:1.1.3")
  dependencySync("androidx.test.ext:truth:1.4.0")
  dependencySync("androidx.test:core:1.4.0")
  dependencySync("androidx.test:orchestrator:1.4.0")
  dependencySync("androidx.test:rules:1.4.0")
  dependencySync("androidx.test:runner:1.4.0")
  dependencySync("androidx.work:work-runtime-ktx:2.6.0")
  dependencySync("androidx.work:work-runtime:2.6.0")
  dependencySync("androidx.work:work-testing:2.6.0")


























































































































  dependencySync("com.android.tools.build:gradle:7.0.2")
  dependencySync("com.github.javaparser:javaparser-symbol-solver-core:3.23.0")
  dependencySync("com.github.tschuchortdev:kotlin-compile-testing:1.4.5")
  dependencySync("com.google.accompanist:accompanist-coil:0.15.0")
  dependencySync("com.google.android.material:material:1.4.0")
  dependencySync("com.google.auto.service:auto-service-annotations:1.0")
  dependencySync("com.google.auto.service:auto-service:1.0")
  dependencySync("com.google.auto:auto-common:1.1.2")
  dependencySync("com.google.dagger:dagger-compiler:2.39")
  dependencySync("com.google.dagger:dagger:2.39")
  dependencySync("com.google.devtools.ksp:symbol-processing-gradle-plugin:1.5.31-1.0.0")
  dependencySync("com.jakewharton.timber:timber:5.0.1")
  dependencySync("com.rickbusarow.dispatch:dispatch-android-espresso:1.0.0-beta10")
  dependencySync("com.rickbusarow.dispatch:dispatch-android-lifecycle-extensions:1.0.0-beta10")
  dependencySync("com.rickbusarow.dispatch:dispatch-android-lifecycle:1.0.0-beta10")
  dependencySync("com.rickbusarow.dispatch:dispatch-android-viewmodel:1.0.0-beta10")
  dependencySync("com.rickbusarow.dispatch:dispatch-core:1.0.0-beta10")
  dependencySync("com.rickbusarow.dispatch:dispatch-detekt:1.0.0-beta10")
  dependencySync("com.rickbusarow.dispatch:dispatch-test-junit4:1.0.0-beta10")
  dependencySync("com.rickbusarow.dispatch:dispatch-test-junit5:1.0.0-beta10")
  dependencySync("com.rickbusarow.dispatch:dispatch-test:1.0.0-beta10")
  dependencySync("com.rickbusarow.hermit:hermit-core:0.9.5")
  dependencySync("com.rickbusarow.hermit:hermit-coroutines:0.9.5")
  dependencySync("com.rickbusarow.hermit:hermit-junit4:0.9.5")
  dependencySync("com.rickbusarow.hermit:hermit-junit5:0.9.5")
  dependencySync("com.rickbusarow.hermit:hermit-mockk:0.9.5")
  dependencySync("com.squareup.anvil:annotations:2.3.5")
  dependencySync("com.squareup.anvil:compiler-api:2.3.5")
  dependencySync("com.squareup.anvil:compiler-utils:2.3.5")
  dependencySync("com.squareup.anvil:compiler:2.3.5")
  dependencySync("com.squareup.anvil:gradle-plugin:2.3.5")
  dependencySync("com.squareup.moshi:moshi-adapters:1.12.0")
  dependencySync("com.squareup.moshi:moshi-kotlin-codegen:1.12.0")
  dependencySync("com.squareup.moshi:moshi-kotlin:1.12.0")
  dependencySync("com.squareup.moshi:moshi:1.12.0")
  dependencySync("com.squareup.okhttp3:logging-interceptor:4.9.2")
  dependencySync("com.squareup.okhttp3:okhttp:4.9.2")
  dependencySync("com.squareup.retrofit2:converter-moshi:2.9.0")
  dependencySync("com.squareup.retrofit2:retrofit-mock:2.9.0")
  dependencySync("com.squareup.retrofit2:retrofit:2.9.0")
  dependencySync("com.squareup:kotlinpoet:1.10.1")
  dependencySync("com.vanniktech:gradle-maven-publish-plugin:0.18.0")


























































































































  dependencySync("dev.zacsweers.autoservice:auto-service-ksp:1.0.0")
  dependencySync("dev.zacsweers.moshix:moshi-ksp:0.14.1")
  dependencySync("dev.zacsweers.moshix:moshi-sealed-codegen:0.14.1")
  dependencySync("dev.zacsweers.moshix:moshi-sealed-ksp:0.14.1")
  dependencySync("dev.zacsweers.moshix:moshi-sealed-runtime:0.14.1")


























































































































  dependencySync("gradle.plugin.dev.arunkumar:scabbard-gradle-plugin:0.5.0")


























































































































  dependencySync("io.coil-kt:coil-compose:1.4.0")
  dependencySync("io.coil-kt:coil-gif:1.4.0")
  dependencySync("io.coil-kt:coil:1.4.0")
  dependencySync("io.kotest:kotest-assertions-core-jvm:4.6.3")
  dependencySync("io.kotest:kotest-assertions-shared-jvm:4.6.3")
  dependencySync("io.kotest:kotest-common-jvm:4.6.3")
  dependencySync("io.kotest:kotest-property-jvm:4.6.3")
  dependencySync("io.kotest:kotest-runner-junit5-jvm:4.6.3")
  dependencySync("io.mockk:mockk:1.12.0")


























































































































  dependencySync("javax.annotation:jsr250-api:1.0")
  dependencySync("javax.inject:javax.inject:1")


























































































































  dependencySync("junit:junit:4.13.2")


























































































































  dependencySync("net.swiftzer.semver:semver:1.1.1")


























































































































  dependencySync("org.codehaus.groovy:groovy-xml:3.0.9")
  dependencySync("org.codehaus.groovy:groovy:3.0.9")
  dependencySync("org.jetbrains.dokka:dokka-gradle-plugin:1.5.31")
  dependencySync("org.jetbrains.kotlin:kotlin-annotation-processing-embeddable:1.5.31")
  dependencySync("org.jetbrains.kotlin:kotlin-compiler-embeddable:1.5.31")
  dependencySync("org.jetbrains.kotlin:kotlin-gradle-plugin-api:1.5.31")
  dependencySync("org.jetbrains.kotlin:kotlin-gradle-plugin:1.5.31")
  dependencySync("org.jetbrains.kotlin:kotlin-reflect:1.5.31")
  dependencySync("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.5.31")
  dependencySync("org.jetbrains.kotlinx:atomicfu-gradle-plugin:0.16.3")
  dependencySync("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.5.2")
  dependencySync("org.jetbrains.kotlinx:kotlinx-coroutines-core-jvm:1.5.2")
  dependencySync("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.5.2")
  dependencySync("org.jetbrains.kotlinx:kotlinx-coroutines-jdk8:1.5.2")
  dependencySync("org.jetbrains.kotlinx:kotlinx-coroutines-test:1.5.2")
  dependencySync("org.jetbrains.kotlinx:kotlinx-knit-test:0.3.0")
  dependencySync("org.jetbrains.kotlinx:kotlinx-knit:0.3.0")
  dependencySync("org.jlleitschuh.gradle:ktlint-gradle:10.2.0")
  dependencySync("org.jmailen.gradle:kotlinter-gradle:3.4.5")
  dependencySync("org.junit.jupiter:junit-jupiter-api:5.8.1")
  dependencySync("org.junit.jupiter:junit-jupiter-engine:5.8.1")
  dependencySync("org.junit.jupiter:junit-jupiter-params:5.8.1")
  dependencySync("org.junit.jupiter:junit-jupiter:5.8.1")
  dependencySync("org.junit.vintage:junit-vintage-engine:5.8.1")
  dependencySync("org.robolectric:robolectric:4.6.1")
}
