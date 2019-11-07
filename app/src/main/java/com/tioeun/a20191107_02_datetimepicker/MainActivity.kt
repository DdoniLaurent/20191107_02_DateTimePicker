package com.tioeun.a20191107_02_datetimepicker

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupEvents()
        setValues()
    }

    override fun setupEvents() {
        selectDateBtn.setOnClickListener {
            var datePickerDialog = DatePickerDialog(this, DatePickerDialog.OnDateSetListener { view, year, month, dayOfMonth ->
                dateTxt.text = "${year}년 ${month+1}월 ${dayOfMonth}일"
            }, 2019,Calendar.NOVEMBER,9)
            datePickerDialog.show()
        }
    }

    override fun setValues() {

    }


}
