# DslButton
`DslButton`继承自`AppCompatTextView`, 通过`xml`属性配置生成对应`状态`的`Drawable`设置给背景`setBackground`, 死磕`属性`. 有些属性需要高版本的`api`才有效果.

为了减少代码冗余, 目前只提供一下几种`状态`:

- 正常状态, xml属性前缀`normal`
- 按下状态`android.R.attr.state_pressed`, xml属性前缀`press`
- 选中状态`android.R.attr.state_selected`, xml属性前缀`select`
- 焦点状态`android.R.attr.state_focused`, xml属性前缀`focus`
- 禁用状态`-android.R.attr.state_enabled`, xml属性前缀`disable`


![](https://img.shields.io/badge/License-MIT-EA66AC) ![](https://img.shields.io/badge/Api-11+-FA773C) ![](https://img.shields.io/badge/AndroidX-yes-DA883C)
![](https://img.shields.io/badge/Kotlin-yes-B0C909)


![](https://raw.githubusercontent.com/angcyo/DslButton/master/png/button.png)

# 属性大全

```xml
<declare-styleable name="DslButton">

    <attr name="button_enable_ripple" format="boolean" />
    <attr name="button_enable_text_style" format="boolean" />
    <attr name="button_enable_background_style" format="boolean" />
    <attr name="button_ripple_color" format="color" />
    <attr name="button_is_selected" format="boolean" />

    <!--向下覆盖所有值-->
    <attr name="button_shape" format="enum">
        <enum name="RECTANGLE" value="0" />
        <enum name="OVAL" value="1" />
        <enum name="LINE" value="2" />
        <enum name="RING" value="3" />
    </attr>
    <attr name="button_text_color" format="color" />
    <attr name="button_solid_color" format="color" />
    <attr name="button_stroke_color" format="color" />
    <attr name="button_stroke_width" format="dimension" />
    <attr name="button_dash_width" format="dimension" />
    <attr name="button_dash_gap" format="dimension" />
    <attr name="button_radius" format="dimension" />
    <attr name="button_radii" format="string" />
    <attr name="button_gradient_colors" format="string" />
    <attr name="button_gradient_start_color" format="color" />
    <attr name="button_gradient_end_color" format="color" />
    <attr name="button_gradient_type" format="enum">
        <enum name="LINEAR_GRADIENT" value="0" />
        <enum name="RADIAL_GRADIENT" value="1" />
        <enum name="SWEEP_GRADIENT" value="2" />
    </attr>
    <attr name="button_gradient_orientation" format="enum">
        <enum name="TOP_BOTTOM" value="0" />
        <enum name="TR_BL" value="1" />
        <enum name="RIGHT_LEFT" value="2" />
        <enum name="BR_TL" value="3" />
        <enum name="BOTTOM_TOP" value="4" />
        <enum name="BL_TR" value="5" />
        <enum name="LEFT_RIGHT" value="6" />
        <enum name="TL_BR" value="7" />
    </attr>

    <!--正常状态-->
    <attr name="button_normal_drawable" format="reference" />
    <attr name="button_normal_shape" format="enum">
        <enum name="RECTANGLE" value="0" />
        <enum name="OVAL" value="1" />
        <enum name="LINE" value="2" />
        <enum name="RING" value="3" />
    </attr>
    <attr name="button_normal_text_color" format="color" />
    <attr name="button_normal_solid_color" format="color" />
    <attr name="button_normal_stroke_color" format="color" />
    <attr name="button_normal_stroke_width" format="dimension" />
    <attr name="button_normal_dash_width" format="dimension" />
    <attr name="button_normal_dash_gap" format="dimension" />
    <attr name="button_normal_radius" format="dimension" />
    <attr name="button_normal_radii" format="string" />
    <attr name="button_normal_gradient_colors" format="string" />
    <attr name="button_normal_gradient_start_color" format="color" />
    <attr name="button_normal_gradient_end_color" format="color" />

    <!--按下状态-->
    <attr name="button_press_drawable" format="reference" />
    <attr name="button_press_shape" format="enum">
        <enum name="RECTANGLE" value="0" />
        <enum name="OVAL" value="1" />
        <enum name="LINE" value="2" />
        <enum name="RING" value="3" />
    </attr>
    <attr name="button_press_text_color" format="color" />
    <attr name="button_press_solid_color" format="color" />
    <attr name="button_press_stroke_color" format="color" />
    <attr name="button_press_stroke_width" format="dimension" />
    <attr name="button_press_dash_width" format="dimension" />
    <attr name="button_press_dash_gap" format="dimension" />
    <attr name="button_press_radius" format="dimension" />
    <attr name="button_press_radii" format="string" />
    <attr name="button_press_gradient_colors" format="string" />
    <attr name="button_press_gradient_start_color" format="color" />
    <attr name="button_press_gradient_end_color" format="color" />

    <!--选中状态-->
    <attr name="button_select_drawable" format="reference" />
    <attr name="button_select_shape" format="enum">
        <enum name="RECTANGLE" value="0" />
        <enum name="OVAL" value="1" />
        <enum name="LINE" value="2" />
        <enum name="RING" value="3" />
    </attr>
    <attr name="button_select_text_color" format="color" />
    <attr name="button_select_solid_color" format="color" />
    <attr name="button_select_stroke_color" format="color" />
    <attr name="button_select_stroke_width" format="dimension" />
    <attr name="button_select_dash_width" format="dimension" />
    <attr name="button_select_dash_gap" format="dimension" />
    <attr name="button_select_radius" format="dimension" />
    <attr name="button_select_radii" format="string" />
    <attr name="button_select_gradient_colors" format="string" />
    <attr name="button_select_gradient_start_color" format="color" />
    <attr name="button_select_gradient_end_color" format="color" />

    <!--焦点状态-->
    <attr name="button_focus_drawable" format="reference" />
    <attr name="button_focus_shape" format="enum">
        <enum name="RECTANGLE" value="0" />
        <enum name="OVAL" value="1" />
        <enum name="LINE" value="2" />
        <enum name="RING" value="3" />
    </attr>
    <attr name="button_focus_text_color" format="color" />
    <attr name="button_focus_solid_color" format="color" />
    <attr name="button_focus_stroke_color" format="color" />
    <attr name="button_focus_stroke_width" format="dimension" />
    <attr name="button_focus_dash_width" format="dimension" />
    <attr name="button_focus_dash_gap" format="dimension" />
    <attr name="button_focus_radius" format="dimension" />
    <attr name="button_focus_radii" format="string" />
    <attr name="button_focus_gradient_colors" format="string" />
    <attr name="button_focus_gradient_start_color" format="color" />
    <attr name="button_focus_gradient_end_color" format="color" />

    <!--禁用状态-->
    <attr name="button_disable_drawable" format="reference" />
    <attr name="button_disable_shape" format="enum">
        <enum name="RECTANGLE" value="0" />
        <enum name="OVAL" value="1" />
        <enum name="LINE" value="2" />
        <enum name="RING" value="3" />
    </attr>
    <attr name="button_disable_text_color" format="color" />
    <attr name="button_disable_solid_color" format="color" />
    <attr name="button_disable_stroke_color" format="color" />
    <attr name="button_disable_stroke_width" format="dimension" />
    <attr name="button_disable_dash_width" format="dimension" />
    <attr name="button_disable_dash_gap" format="dimension" />
    <attr name="button_disable_radius" format="dimension" />
    <attr name="button_disable_radii" format="string" />
    <attr name="button_disable_gradient_colors" format="string" />
    <attr name="button_disable_gradient_start_color" format="color" />
    <attr name="button_disable_gradient_end_color" format="color" />

</declare-styleable>
```

# 使用`JitPack`的方式, 引入库.

## 根目录中的 `build.gradle`

```kotlin
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```

## APP目录中的 `build.gradle`

```kotlin
dependencies {
    implementation 'com.github.angcyo:DslButton:1.1.0'
}
```

---
**群内有`各(pian)种(ni)各(jin)样(qun)`的大佬,等你来撩.**

# 联系作者

[点此QQ对话](http://wpa.qq.com/msgrd?v=3&uin=664738095&site=qq&menu=yes)  `该死的空格`    [点此快速加群](https://shang.qq.com/wpa/qunwpa?idkey=cbcf9a42faf2fe730b51004d33ac70863617e6999fce7daf43231f3cf2997460)

[开源地址](https://github.com/angcyo/DslAdapter)

![](https://gitee.com/angcyo/res/raw/master/code/all_in1.jpg)

![](https://gitee.com/angcyo/res/raw/master/code/all_in2.jpg)
