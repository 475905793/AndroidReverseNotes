package com.tencent.mm.boot.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.mm.svg.WeChatSVGRenderC2Java;
import com.tencent.mm.svg.c;
import com.tencent.smtt.sdk.WebView;

public final class aay extends c {
    private final int height = 72;
    private final int width = 72;

    public final int a(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 72;
            case 1:
                return 72;
            case 2:
                Canvas canvas = (Canvas) objArr[0];
                Looper looper = (Looper) objArr[1];
                c.h(looper);
                c.g(looper);
                Paint k = c.k(looper);
                k.setFlags(385);
                k.setStyle(Style.FILL);
                Paint k2 = c.k(looper);
                k2.setFlags(385);
                k2.setStyle(Style.STROKE);
                k.setColor(WebView.NIGHT_MODE_COLOR);
                k2.setStrokeWidth(1.0f);
                k2.setStrokeCap(Cap.BUTT);
                k2.setStrokeJoin(Join.MITER);
                k2.setStrokeMiter(4.0f);
                k2.setPathEffect(null);
                c.a(k2, looper).setStrokeWidth(1.0f);
                k = c.a(k, looper);
                k.setColor(WebView.NIGHT_MODE_COLOR);
                canvas.save();
                Paint a = c.a(k, looper);
                Path l = c.l(looper);
                l.moveTo(26.00236f, 54.803513f);
                l.lineTo(27.321718f, 55.185577f);
                l.cubicTo(30.085625f, 55.985954f, 33.006626f, 56.4f, 36.0f, 56.4f);
                l.cubicTo(50.69829f, 56.4f, 62.4f, 46.45355f, 62.4f, 34.5f);
                l.cubicTo(62.4f, 22.546453f, 50.69829f, 12.6f, 36.0f, 12.6f);
                l.cubicTo(21.30171f, 12.6f, 9.6f, 22.546453f, 9.6f, 34.5f);
                l.cubicTo(9.6f, 40.72777f, 12.770791f, 46.57829f, 18.301785f, 50.73409f);
                l.lineTo(19.95378f, 51.97534f);
                l.lineTo(19.24858f, 58.042023f);
                l.lineTo(26.00236f, 54.803513f);
                l.close();
                l.moveTo(36.0f, 60.0f);
                l.cubicTo(32.61305f, 60.0f, 29.357191f, 59.52292f, 26.320362f, 58.64351f);
                l.lineTo(17.371504f, 62.934578f);
                l.cubicTo(17.116058f, 63.057068f, 16.831148f, 63.104713f, 16.54975f, 63.072006f);
                l.cubicTo(15.726863f, 62.976353f, 15.137323f, 62.231728f, 15.232977f, 61.40884f);
                l.lineTo(16.139269f, 53.6122f);
                l.cubicTo(9.920994f, 48.94f, 6.0f, 42.109215f, 6.0f, 34.5f);
                l.cubicTo(6.0f, 20.416739f, 19.431458f, 9.0f, 36.0f, 9.0f);
                l.cubicTo(52.568542f, 9.0f, 66.0f, 20.416739f, 66.0f, 34.5f);
                l.cubicTo(66.0f, 48.58326f, 52.568542f, 60.0f, 36.0f, 60.0f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 1);
                canvas.drawPath(l, a);
                canvas.restore();
                c.j(looper);
                break;
        }
        return 0;
    }
}
