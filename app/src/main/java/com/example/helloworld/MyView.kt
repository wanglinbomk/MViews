package com.example.helloworld

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.RectF
import android.util.AttributeSet
import android.util.Log
import android.view.MotionEvent
import android.view.View

class MyView : View {

    private lateinit var rectF: RectF

    private var paint: Paint = Paint().also {
        it.color = Color.RED
        it.style = Paint.Style.STROKE
        it.strokeWidth =4f
        it.strokeCap = Paint.Cap.SQUARE
    }

    constructor(context: Context?) : super(context){
        rectF = RectF(0f,0f,300f,300f)
    }
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs) {
        rectF = RectF(0f,0f,400f,200f)
    }
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    ) {
    }

    constructor(
        context: Context?,
        attrs: AttributeSet?,
        defStyleAttr: Int,
        defStyleRes: Int
    ) : super(context, attrs, defStyleAttr, defStyleRes) {
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        var temp = canvas?.save();
        canvas?.translate(100f,100f)
        canvas?.drawPoint(200f,200f,paint)
        temp?.let { canvas?.restoreToCount(it) }
        canvas?.translate(300f,300f)
        canvas?.drawOval(rectF,paint)
        canvas?.translate(200f,200f)
        canvas?.drawRoundRect(rectF,20f,20f,paint)
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        Log.i("xyz","${event?.x}")
        Log.i("xyz","${event?.rawX}")
        Log.i("xyz","${event?.y}")
        Log.i("xyz","${event?.rawY}")
        return super.onTouchEvent(event)
    }
}