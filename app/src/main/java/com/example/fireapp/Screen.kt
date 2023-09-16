package com.example.fireapp

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Calculate
import androidx.compose.material.icons.filled.CurrencyYen
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomNavigationItem(var route: String, var icon: ImageVector, var title: String) {
    object FullFire : BottomNavigationItem("fullFire", Icons.Default.CurrencyYen, "フルFire")
    object SideFire : BottomNavigationItem("sideFire", Icons.Default.CurrencyYen, "サイドFire")
    object Simulation : BottomNavigationItem("simulation", Icons.Default.Calculate, "複利計算")
}