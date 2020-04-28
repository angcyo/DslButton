package com.angcyo

import android.content.res.Resources

/**
 *
 * Email:angcyo@126.com
 * @author angcyo
 * @date 2020/04/28
 * Copyright (c) 2020 ShenZhen Wayto Ltd. All rights reserved.
 */

val dp: Float get() = Resources.getSystem()?.displayMetrics?.density ?: 0f
