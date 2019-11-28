package com.angcyo.button

import android.content.Context
import android.content.res.ColorStateList
import android.content.res.TypedArray
import android.graphics.Color
import android.graphics.drawable.Drawable
import android.graphics.drawable.GradientDrawable
import android.graphics.drawable.RippleDrawable
import android.graphics.drawable.StateListDrawable
import android.os.Build
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatTextView
import androidx.core.graphics.toColorInt
import androidx.core.view.ViewCompat
import java.util.*

/**
 * 支持配置 普通状态 按压状态 选择状态 Check状态 焦点状态 禁止状态
 * [android.R.attr.state_pressed]
 * [android.R.attr.state_selected]
 * [android.R.attr.state_checked]
 * [android.R.attr.state_enabled]
 * [android.R.attr.state_focused]
 * Email:angcyo@126.com
 * @author angcyo
 * @date 2019/11/28
 * Copyright (c) 2019 ShenZhen O&M Cloud Co., Ltd. All rights reserved.
 */

open class DslButton : AppCompatTextView {

    companion object {
        val ATTR_NORMAL = intArrayOf()
        val ATTR_PRESSED = intArrayOf(android.R.attr.state_pressed)
        val ATTR_SELECTED = intArrayOf(android.R.attr.state_selected)
        val ATTR_CHECKED = intArrayOf(android.R.attr.state_checked)
        val ATTR_FOCUSED = intArrayOf(android.R.attr.state_focused)
        val ATTR_DISABLE = intArrayOf(-android.R.attr.state_enabled)
    }

    /**正常状态*/
    var normalDrawable: Drawable? = null
    var normalTextColor: Int = Color.WHITE
    var normalShape = GradientDrawable.RECTANGLE
    var normalSolidColor = Color.TRANSPARENT
    var normalStrokeColor = Color.TRANSPARENT
    var normalStrokeWidth = 0
    var normalDashWidth = 0f
    var normalDashGap = 0f
    var normalRadii = floatArrayOf(0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f)
    var normalGradientColors: IntArray? = null
    var normalGradientColorsOffsets: FloatArray? = null
    var normalGradientCenterX = 0.5f
    var normalGradientCenterY = 0.5f
    var normalGradientRadius = 0.5f
    var normalGradientOrientation = GradientDrawable.Orientation.LEFT_RIGHT
    var normalGradientType = GradientDrawable.LINEAR_GRADIENT

    /**按下状态*/
    var pressDrawable: Drawable? = null
    var pressTextColor: Int = Color.WHITE
    var pressShape = GradientDrawable.RECTANGLE
    var pressSolidColor = Color.TRANSPARENT
    var pressStrokeColor = Color.TRANSPARENT
    var pressStrokeWidth = 0
    var pressDashWidth = 0f
    var pressDashGap = 0f
    var pressRadii = floatArrayOf(0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f)
    var pressGradientColors: IntArray? = null
    var pressGradientColorsOffsets: FloatArray? = null
    var pressGradientCenterX = 0.5f
    var pressGradientCenterY = 0.5f
    var pressGradientRadius = 0.5f
    var pressGradientOrientation = GradientDrawable.Orientation.LEFT_RIGHT
    var pressGradientType = GradientDrawable.LINEAR_GRADIENT

    /**选中状态*/
    var selectDrawable: Drawable? = null
    var selectTextColor: Int = Color.WHITE
    var selectShape = GradientDrawable.RECTANGLE
    var selectSolidColor = Color.TRANSPARENT
    var selectStrokeColor = Color.TRANSPARENT
    var selectStrokeWidth = 0
    var selectDashWidth = 0f
    var selectDashGap = 0f
    var selectRadii = floatArrayOf(0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f)
    var selectGradientColors: IntArray? = null
    var selectGradientColorsOffsets: FloatArray? = null
    var selectGradientCenterX = 0.5f
    var selectGradientCenterY = 0.5f
    var selectGradientRadius = 0.5f
    var selectGradientOrientation = GradientDrawable.Orientation.LEFT_RIGHT
    var selectGradientType = GradientDrawable.LINEAR_GRADIENT

    /**check状态*/
    var checkDrawable: Drawable? = null
    var checkTextColor: Int = Color.WHITE
    var checkShape = GradientDrawable.RECTANGLE
    var checkSolidColor = Color.TRANSPARENT
    var checkStrokeColor = Color.TRANSPARENT
    var checkStrokeWidth = 0
    var checkDashWidth = 0f
    var checkDashGap = 0f
    var checkRadii = floatArrayOf(0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f)
    var checkGradientColors: IntArray? = null
    var checkGradientColorsOffsets: FloatArray? = null
    var checkGradientCenterX = 0.5f
    var checkGradientCenterY = 0.5f
    var checkGradientRadius = 0.5f
    var checkGradientOrientation = GradientDrawable.Orientation.LEFT_RIGHT
    var checkGradientType = GradientDrawable.LINEAR_GRADIENT

    /**焦点状态*/
    var focusDrawable: Drawable? = null
    var focusTextColor: Int = Color.WHITE
    var focusShape = GradientDrawable.RECTANGLE
    var focusSolidColor = Color.TRANSPARENT
    var focusStrokeColor = Color.TRANSPARENT
    var focusStrokeWidth = 0
    var focusDashWidth = 0f
    var focusDashGap = 0f
    var focusRadii = floatArrayOf(0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f)
    var focusGradientColors: IntArray? = null
    var focusGradientColorsOffsets: FloatArray? = null
    var focusGradientCenterX = 0.5f
    var focusGradientCenterY = 0.5f
    var focusGradientRadius = 0.5f
    var focusGradientOrientation = GradientDrawable.Orientation.LEFT_RIGHT
    var focusGradientType = GradientDrawable.LINEAR_GRADIENT

    /**禁用状态*/
    var disableDrawable: Drawable? = null
    var disableTextColor: Int = Color.WHITE
    var disableShape = GradientDrawable.RECTANGLE
    var disableSolidColor = Color.TRANSPARENT
    var disableStrokeColor = Color.TRANSPARENT
    var disableStrokeWidth = 0
    var disableDashWidth = 0f
    var disableDashGap = 0f
    var disableRadii = floatArrayOf(0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f)
    var disableGradientColors: IntArray? = null
    var disableGradientColorsOffsets: FloatArray? = null
    var disableGradientCenterX = 0.5f
    var disableGradientCenterY = 0.5f
    var disableGradientRadius = 0.5f
    var disableGradientOrientation = GradientDrawable.Orientation.LEFT_RIGHT
    var disableGradientType = GradientDrawable.LINEAR_GRADIENT

    /**是否使用Ripple, 需要API>=21*/
    var enableRipple = false
    var rippleColor = false

    constructor(context: Context) : super(context) {
        initAttribute(context, null)
    }

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {
        initAttribute(context, attrs)
    }

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    ) {
        initAttribute(context, attrs)
    }

    /**xml属性读取*/
    open fun initAttribute(context: Context, attributeSet: AttributeSet? = null) {
        val typedArray = context.obtainStyledAttributes(attributeSet, R.styleable.DslButton)

        //向下覆盖属性
        initButtonAttr(typedArray)

        //正常状态
        normalDrawable = typedArray.getDrawable(R.styleable.DslButton_button_normal_drawable)
        normalTextColor =
            typedArray.getColor(R.styleable.DslButton_button_normal_text_color, normalTextColor)
        normalShape = typedArray.getInt(R.styleable.DslButton_button_normal_shape, normalShape)
        normalSolidColor =
            typedArray.getColor(R.styleable.DslButton_button_normal_solid_color, normalSolidColor)
        normalStrokeColor =
            typedArray.getColor(R.styleable.DslButton_button_normal_stroke_color, normalStrokeColor)
        normalStrokeWidth = typedArray.getDimensionPixelOffset(
            R.styleable.DslButton_button_normal_stroke_width,
            normalStrokeWidth
        )
        normalDashWidth = typedArray.getDimensionPixelOffset(
            R.styleable.DslButton_button_normal_dash_width,
            normalDashWidth.toInt()
        ).toFloat()
        normalDashGap = typedArray.getDimensionPixelOffset(
            R.styleable.DslButton_button_normal_dash_gap,
            normalDashGap.toInt()
        ).toFloat()

        normalGradientType =
            typedArray.getInt(R.styleable.DslButton_button_normal_gradient_type, normalGradientType)

        val normalOrientation =
            typedArray.getInt(
                R.styleable.DslButton_button_normal_gradient_orientation,
                normalGradientOrientation.ordinal
            )
        normalGradientOrientation = GradientDrawable.Orientation.values()[normalOrientation]

        val normalRadius =
            typedArray.getDimensionPixelOffset(R.styleable.DslButton_button_normal_radius, 0)
        if (normalRadius > 0) {
            Arrays.fill(normalRadii, normalRadius.toFloat())
        } else {
            typedArray.getString(R.styleable.DslButton_button_normal_radii)?.let {
                _fillRadii(normalRadii, it)
            }
        }

        val normalColors =
            typedArray.getString(R.styleable.DslButton_button_normal_gradient_colors)

        normalGradientColors = if (normalColors.isNullOrEmpty()) {
            val startColor = typedArray.getColor(
                R.styleable.DslButton_button_normal_gradient_start_color,
                Color.TRANSPARENT
            )
            val endColor = typedArray.getColor(
                R.styleable.DslButton_button_normal_gradient_end_color,
                Color.TRANSPARENT
            )
            if (startColor != endColor) {
                intArrayOf(startColor, endColor)
            } else {
                null
            }
        } else {
            _fillColor(normalColors) ?: normalGradientColors
        }

        typedArray.recycle()

        if (normalDrawable == null) {
            updateNormalDrawable()
        }

        updateButton()
    }

    open fun initButtonAttr(typedArray: TypedArray) {
        if (typedArray.hasValue(R.styleable.DslButton_button_text_color)) {
            val bTextColor =
                typedArray.getColor(R.styleable.DslButton_button_text_color, normalTextColor)
            normalTextColor = bTextColor
            pressTextColor = bTextColor
            focusTextColor = bTextColor
            selectTextColor = bTextColor
            checkTextColor = bTextColor
            disableTextColor = bTextColor
        }

        if (typedArray.hasValue(R.styleable.DslButton_button_shape)) {
            val bShape = typedArray.getInt(R.styleable.DslButton_button_shape, normalShape)
            normalShape = bShape
            pressShape = bShape
            focusShape = bShape
            selectShape = bShape
            checkShape = bShape
            disableShape = bShape
        }

        if (typedArray.hasValue(R.styleable.DslButton_button_solid_color)) {
            val bSolidColor =
                typedArray.getColor(R.styleable.DslButton_button_solid_color, normalSolidColor)
            normalSolidColor = bSolidColor
            pressSolidColor = bSolidColor
            focusSolidColor = bSolidColor
            selectSolidColor = bSolidColor
            checkSolidColor = bSolidColor
            disableSolidColor = bSolidColor
        }

        if (typedArray.hasValue(R.styleable.DslButton_button_stroke_color)) {
            val bStrokeColor =
                typedArray.getColor(R.styleable.DslButton_button_stroke_color, normalStrokeColor)
            normalStrokeColor = bStrokeColor
            pressStrokeColor = bStrokeColor
            focusStrokeColor = bStrokeColor
            selectStrokeColor = bStrokeColor
            checkStrokeColor = bStrokeColor
            disableStrokeColor = bStrokeColor
        }

        if (typedArray.hasValue(R.styleable.DslButton_button_stroke_width)) {
            val bStrokeWidth = typedArray.getDimensionPixelOffset(
                R.styleable.DslButton_button_stroke_width,
                normalStrokeWidth
            )
            normalStrokeWidth = bStrokeWidth
            pressStrokeWidth = bStrokeWidth
            focusStrokeWidth = bStrokeWidth
            selectStrokeWidth = bStrokeWidth
            checkStrokeWidth = bStrokeWidth
            disableStrokeWidth = bStrokeWidth
        }

        if (typedArray.hasValue(R.styleable.DslButton_button_dash_width)) {
            val bDashWidth = typedArray.getDimensionPixelOffset(
                R.styleable.DslButton_button_dash_width,
                normalDashWidth.toInt()
            ).toFloat()
            normalDashWidth = bDashWidth
            pressDashWidth = bDashWidth
            focusDashWidth = bDashWidth
            selectDashWidth = bDashWidth
            checkDashWidth = bDashWidth
            disableDashWidth = bDashWidth
        }

        if (typedArray.hasValue(R.styleable.DslButton_button_dash_gap)) {
            val bDashGap = typedArray.getDimensionPixelOffset(
                R.styleable.DslButton_button_dash_gap,
                normalDashGap.toInt()
            ).toFloat()

            normalDashGap = bDashGap
            pressDashGap = bDashGap
            focusDashGap = bDashGap
            selectDashGap = bDashGap
            checkDashGap = bDashGap
            disableDashGap = bDashGap
        }

        if (typedArray.hasValue(R.styleable.DslButton_button_gradient_type)) {
            val bGradientType =
                typedArray.getInt(R.styleable.DslButton_button_gradient_type, normalGradientType)

            normalGradientType = bGradientType
            pressGradientType = bGradientType
            focusGradientType = bGradientType
            selectGradientType = bGradientType
            checkGradientType = bGradientType
            disableGradientType = bGradientType
        }

        if (typedArray.hasValue(R.styleable.DslButton_button_gradient_orientation)) {
            val bOrientation =
                typedArray.getInt(
                    R.styleable.DslButton_button_gradient_orientation,
                    normalGradientOrientation.ordinal
                )
            val bGradientOrientation = GradientDrawable.Orientation.values()[bOrientation]

            normalGradientOrientation = bGradientOrientation
            pressGradientOrientation = bGradientOrientation
            focusGradientOrientation = bGradientOrientation
            selectGradientOrientation = bGradientOrientation
            checkGradientOrientation = bGradientOrientation
            disableGradientOrientation = bGradientOrientation
        }

        val bRadius =
            typedArray.getDimensionPixelOffset(R.styleable.DslButton_button_radius, 0)
        if (bRadius > 0) {
            Arrays.fill(normalRadii, bRadius.toFloat())
            Arrays.fill(pressRadii, bRadius.toFloat())
            Arrays.fill(focusRadii, bRadius.toFloat())
            Arrays.fill(selectRadii, bRadius.toFloat())
            Arrays.fill(checkRadii, bRadius.toFloat())
            Arrays.fill(disableRadii, bRadius.toFloat())
        } else {
            typedArray.getString(R.styleable.DslButton_button_radii)?.let {
                _fillRadii(normalRadii, it)
                _fillRadii(pressRadii, it)
                _fillRadii(focusRadii, it)
                _fillRadii(selectRadii, it)
                _fillRadii(checkRadii, it)
                _fillRadii(disableRadii, it)
            }
        }

        val bColors =
            typedArray.getString(R.styleable.DslButton_button_gradient_colors)

        val bGradientColors = if (bColors.isNullOrEmpty()) {
            val startColor = typedArray.getColor(
                R.styleable.DslButton_button_gradient_start_color,
                Color.TRANSPARENT
            )
            val endColor = typedArray.getColor(
                R.styleable.DslButton_button_gradient_end_color,
                Color.TRANSPARENT
            )
            if (startColor != endColor) {
                intArrayOf(startColor, endColor)
            } else {
                null
            }
        } else {
            _fillColor(bColors)
        }
        normalGradientColors = bGradientColors
        pressGradientColors = bGradientColors
        focusGradientColors = bGradientColors
        selectGradientColors = bGradientColors
        checkGradientColors = bGradientColors
        disableGradientColors = bGradientColors
    }

    fun _fillRadii(array: FloatArray, radii: String?) {
        if (radii.isNullOrEmpty()) {
            return
        }
        val split = radii.split(",")
        if (split.size != 8) {
            throw IllegalArgumentException("radii 需要8个值.")
        } else {
            val dp = context.resources.displayMetrics.density
            for (i in split.indices) {
                array[i] = split[i].toFloat() * dp
            }
        }
    }

    fun _fillColor(colors: String?): IntArray? {
        if (colors.isNullOrEmpty()) {
            return null
        }
        val split = colors.split(",")

        val array = IntArray(split.size)
        for (i in split.indices) {
            array[i] = split[i].toColorInt()
        }
        return array
    }

    open fun updateNormalDrawable() {
        DslGradientDrawable().apply {
            gradientShape = normalShape
            gradientSolidColor = normalSolidColor
            gradientStrokeColor = normalStrokeColor
            gradientStrokeWidth = normalStrokeWidth
            gradientDashWidth = normalDashWidth
            gradientDashGap = normalDashGap
            gradientRadii = normalRadii
            gradientColors = normalGradientColors
            gradientColorsOffsets = normalGradientColorsOffsets
            gradientCenterX = normalGradientCenterX
            gradientCenterY = normalGradientCenterY
            gradientRadius = normalGradientRadius
            gradientOrientation = normalGradientOrientation
            gradientType = normalGradientType
            normalDrawable = generateDrawable()
        }
    }

    open fun updateDisableDrawable() {

    }

    open fun updateFocusDrawable() {

    }

    open fun updatePressDrawable() {

    }

    open fun updateSelectDrawable() {

    }

    open fun updateCheckDrawable() {

    }

    open fun updateDrawable() {
        updateNormalDrawable()
        updateDisableDrawable()
        updateFocusDrawable()
        updatePressDrawable()
        updateSelectDrawable()
        updateCheckDrawable()
        updateButton()
    }

    open fun updateButton() {
        //文本状态颜色
        val textColorList =
            ColorStateList(
                arrayOf(
                    ATTR_DISABLE,
                    ATTR_FOCUSED,
                    ATTR_PRESSED,
                    ATTR_SELECTED,
                    ATTR_CHECKED,
                    ATTR_NORMAL
                ),
                intArrayOf(
                    disableTextColor,
                    focusTextColor,
                    pressTextColor,
                    selectTextColor,
                    checkTextColor,
                    normalTextColor
                )
            )
        setTextColor(textColorList)

        //背景状态颜色
        val backgroundDrawable: Drawable
        val contentDrawable = StateListDrawable()

        contentDrawable.addState(ATTR_DISABLE, disableDrawable)
        contentDrawable.addState(ATTR_FOCUSED, focusDrawable)
        contentDrawable.addState(ATTR_PRESSED, pressDrawable)
        contentDrawable.addState(ATTR_SELECTED, selectDrawable)
        contentDrawable.addState(ATTR_CHECKED, checkDrawable)
        contentDrawable.addState(ATTR_NORMAL, normalDrawable)

        backgroundDrawable =
            if (enableRipple && Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                RippleDrawable(textColorList, contentDrawable, null)
            } else {
                contentDrawable
            }

        ViewCompat.setBackground(this, backgroundDrawable)
    }
}