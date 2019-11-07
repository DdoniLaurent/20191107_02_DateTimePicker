package com.tioeun.a20191107_02_datetimepicker

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.text.SimpleDateFormat
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

                var selectDate = Calendar.getInstance()
//                원하는 항목별로 직접 입력
                selectDate.set(Calendar.YEAR, year)
//                년/월/일을 한번에 집어넣기
                selectDate.set(year, month, dayOfMonth)

                var sdf = SimpleDateFormat("yyyy년 MM월 dd일")
                var resultStr = sdf.format(selectDate.time)

                dateTxt.text = resultStr
            }, 2019,Calendar.NOVEMBER,9)
            datePickerDialog.show()
        }
    }

    override fun setValues() {

    }


}
