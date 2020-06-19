package com.example.first2d;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import android.view.View;


public class MyView extends View {
    private final LinearGradient linearGradient;
    private Paint redPaint;


    public MyView(Context context) {
        super(context, null);
        //Add your initialisation code here
        redPaint=new Paint(Paint.ANTI_ALIAS_FLAG);
        redPaint.setStyle(Paint.Style.STROKE);//stroke only no fill
        redPaint.setColor(0xffff0000);//color red
        redPaint.setStrokeWidth(10);//set the line stroke width to 5

        linearGradient =new LinearGradient(105,290,280,450, Color.BLUE,Color.RED, Shader.TileMode.MIRROR);
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Path myLines = new Path();
        myLines.moveTo(50,300);

        myLines.lineTo(50,300);
        myLines.lineTo(160,280);
        myLines.lineTo(300,380);
        myLines.lineTo(380,370);
        myLines.lineTo(280,450);
        myLines.lineTo(100,390);
        myLines.lineTo(160,380);
        myLines.lineTo(50,300);

//        int x,y;
//        x=(50+160+300+380+280+100+160+50)/8;
//        y=(300+280+380+370+450+390+380+300)/8;

//        Paint greenPaint = new Paint();
//        greenPaint.setARGB(255,0,255,0);
//        greenPaint.setStyle(Paint.Style.FILL);
////        canvas.drawCircle(x,y,250,greenPaint);
//        canvas.drawPath(myLines,redPaint);
//        canvas.drawPath(myLines,greenPaint);


        Paint gradientPaint = new Paint();
        gradientPaint.setStyle(Paint.Style.FILL);
        gradientPaint.setShader(linearGradient);

        canvas.drawPath(myLines,gradientPaint);

    }
}
