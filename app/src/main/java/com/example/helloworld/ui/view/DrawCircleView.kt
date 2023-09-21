package com.example.helloworld.ui.view

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View
import androidx.compose.ui.graphics.Color

class DrawCircleView : View {
    private var mPaintFull = Paint(Paint.ANTI_ALIAS_FLAG).also {
        it.color = Color.Black.hashCode()
        it.style = Paint.Style.FILL
    }
    private var mPaintSingle = Paint(Paint.ANTI_ALIAS_FLAG).also {
        it.color = Color.Black.hashCode()
        it.style = Paint.Style.STROKE
        it.strokeWidth = 10f
    }

    constructor(context: Context?) : super(context)
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs)
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    )

    constructor(
        context: Context?,
        attrs: AttributeSet?,
        defStyleAttr: Int,
        defStyleRes: Int
    ) : super(context, attrs, defStyleAttr, defStyleRes)

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        canvas?.drawCircle(200f, 200f, 100f, mPaintFull)
        canvas?.drawCircle(500f, 200f, 100f, mPaintSingle)
        mPaintFull.color = Color.Blue.hashCode()
        canvas?.drawCircle(200f, 600f, 100f, mPaintFull)
        mPaintSingle.strokeWidth = 20f
        canvas?.drawCircle(500f,600f,100f,mPaintSingle)
    }
}