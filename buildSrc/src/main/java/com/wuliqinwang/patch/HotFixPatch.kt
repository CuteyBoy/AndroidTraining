package com.wuliqinwang.patch

open class HotFixPatch {
    companion object {
        // DES: 用于在app的build.gradle进行配置的名字
        const val HOT_FIX_PATCH = "hotFixPatch"
    }

    // DES: 是否是debug开关
    var isDebugOn = false
    // DES: 用于排除的应用名
    var applicationName: String = ""
    // DES: 分包输出目录
    var patchOutputDir = ""
}