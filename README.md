

<div align="center">

# 📱 User Directory App
### Modern Android Sample Project | پروژه نمونه اندروید مدرن

[![Kotlin](https://img.shields.io/badge/Kotlin-1.9.0-7F52FF?style=for-the-badge&logo=kotlin&logoColor=white)](https://kotlinlang.org/)
[![Jetpack Compose](https://img.shields.io/badge/Jetpack%20Compose-Material3-4285F4?style=for-the-badge&logo=android&logoColor=white)](https://developer.android.com/jetpack/compose)
[![Architecture](https://img.shields.io/badge/Architecture-MVVM-green?style=for-the-badge)](https://developer.android.com/topic/architecture)
[![License](https://img.shields.io/badge/License-MIT-blue?style=for-the-badge)](LICENSE)

---

</div>

| 🇬🇧 English | 🇮🇷 فارسی |
| :--- | :--- |
| **Overview** | **درباره پروژه** |
| A lightweight, modern Android application showcasing REST API consumption using **Kotlin**, **Jetpack Compose**, and the **MVVM** pattern. It fetches a user list and cleanly handles UI states and network resilience. | یک اپلیکیشن مدرن و سبک اندروید برای نمایش چگونگی دریافت و پردازش داده‌ها از REST API با **کاتلین**، **جت‌پک کامپوز** و **معماری MVVM** به همراه مدیریت وضعیت‌های UI و اینترنت. |
| **Key Features** | **ویژگی‌های کلیدی** |
| ⚡ **Declarative UI:** 100% Jetpack Compose with Material 3. | ⚡ **رابط کاربری مدرن:** طراحی ۱۰۰٪ با Jetpack Compose و متریال ۳. |
| 🏗️ **MVVM Architecture:** Clean separation of concerns. | 🏗️ **معماری MVVM:** جداسازی کامل و تمیز لایه‌های برنامه. |
| 🌐 **Smart Network Check:** Splash Screen internet detection with retry. | 🌐 **بررسی هوشمند شبکه:** چک کردن اینترنت در اسپلش با قابلیت تلاش مجدد. |
| 🔄 **Async Networking:** Retrofit + Coroutines + StateFlow. | 🔄 **ارتباط غیرهمزمان:** استفاده از Retrofit، Coroutines و StateFlow. |
| 🛡️ **UI State Handling:** Managed `Loading`, `Success`, and `Error` states. | 🛡️ **مدیریت وضعیت:** هندل کردن تمیز حالت‌های Loading، Success و Error. |

---

### 🛠️ Tech Stack & Dependencies | تکنولوژی‌ها و کتابخانه‌ها

```kotlin
// UI & Navigation
implementation("androidx.compose.ui:ui")
implementation("androidx.compose.material3:material3")
implementation("androidx.navigation:navigation-compose")

// Architecture & Lifecycle
implementation("androidx.lifecycle:lifecycle-viewmodel-compose")

// Networking & Async
implementation("com.squareup.retrofit2:retrofit")
implementation("com.squareup.retrofit2:converter-gson")
implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android")

// Core Utils
implementation("androidx.core:core-splashscreen")

```

---

### 🌐 API Specification | مشخصات API

This project consumes the **JSONPlaceholder** REST endpoint (`/users`) to fetch basic profile fields:

| Field | Type | Description / توضیحات |
| --- | --- | --- |
| `name` | String | Full Name / نام و نام خانوادگی |
| `username` | String | Unique Identifier / نام کاربری |
| `email` | String | Email Address / آدرس ایمیل |

---

### 🚀 Quick Start | راه اندازی سریع

```bash
# 1. Clone the repository / کلون کردن ریپازیتوری
git clone [https://github.com/stevenfaster-oss/User-Manager.git]

# 2. Open in Android Studio (Flamingo+) & Sync Gradle
# 3. Build & Run on Emulator or Device (API 24+)

```

---

Developed with ❤️ by **[stevenfaster-oss](https://www.google.com/search?q=https://github.com/stevenfaster-oss)**
Buy Coffee For Me? [☕](https://daramet.com/stevenfaster_oss)
