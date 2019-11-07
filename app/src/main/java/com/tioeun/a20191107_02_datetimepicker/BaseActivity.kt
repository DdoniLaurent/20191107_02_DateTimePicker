package com.tioeun.a20191107_02_datetimepicker

import androidx.appcompat.app.AppCompatActivity

abstract  class BaseActivity : AppCompatActivity() {

    abstract fun setupEvents()
    abstract fun setValues()
}
