package ru.aa.KuprianovSergeev.Tanchiki.models

import android.view.View
import ru.aa.KuprianovSergeev.Tanchiki.enums.Material

data class Element constructor(
    val viewId: Int = View.generateViewId(),
    val material: Material,
    var coordinate: Coordinate,
    val width: Int = material.width,
    val height: Int = material.height
) {

}