plugins {
    id("droidknights.android.feature")
}

android {
    namespace = "com.droidknights.app2023.feature.contributor"
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.activity.compose)
}
