/*
 * Copyright 2020 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.android.material.composethemeadapter

object Versions {
    const val ktlint = "0.37.2"
}

object Libs {
    const val androidGradlePlugin = "com.android.tools.build:gradle:4.2.0-alpha04"

    const val mdc = "com.google.android.material:material:1.1.0"

    object Kotlin {
        private const val version = "1.3.72"
        const val stdlib = "org.jetbrains.kotlin:kotlin-stdlib:$version"
        const val gradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$version"
    }

    object AndroidX {
        object Compose {
            const val snapshot = ""
            const val version = "0.1.0-dev14"
            const val kotlinCompilerVersion = "1.3.70-dev-withExperimentalGoogleExtensions-20200424"

            const val runtime = "androidx.compose:compose-runtime:$version"

            const val layout = "androidx.ui:ui-layout:$version"
            const val material = "androidx.ui:ui-material:$version"

            const val test = "androidx.ui:ui-test:$version"
        }

        const val coreKtx = "androidx.core:core-ktx:1.2.0"

        object Test {
            private const val version = "1.2.0"
            const val runner = "androidx.test:runner:$version"
            const val rules = "androidx.test:rules:$version"

            const val ext = "androidx.test.ext:junit:1.1.1"

            const val espressoCore = "androidx.test.espresso:espresso-core:3.2.0"
        }
    }

    const val junit = "junit:junit:4.13"

    const val truth = "com.google.truth:truth:1.0.1"
}