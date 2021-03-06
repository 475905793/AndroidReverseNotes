package com.tencent.p177mm.boot.svg.p708a.p709a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.google.android.gms.common.util.CrashUtils.ErrorDialogData;
import com.tencent.p177mm.svg.C5163c;
import com.tencent.p177mm.svg.WeChatSVGRenderC2Java;
import com.tencent.smtt.sdk.WebView;

/* renamed from: com.tencent.mm.boot.svg.a.a.aeh */
public final class aeh extends C5163c {
    private final int height = 96;
    private final int width = 96;

    /* renamed from: a */
    public final int mo10620a(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 96;
            case 1:
                return 96;
            case 2:
                Canvas canvas = (Canvas) objArr[0];
                Looper looper = (Looper) objArr[1];
                Matrix h = C5163c.m7881h(looper);
                float[] g = C5163c.m7880g(looper);
                Paint k = C5163c.m7883k(looper);
                k.setFlags(385);
                k.setStyle(Style.FILL);
                Paint k2 = C5163c.m7883k(looper);
                k2.setFlags(385);
                k2.setStyle(Style.STROKE);
                k.setColor(WebView.NIGHT_MODE_COLOR);
                k2.setStrokeWidth(1.0f);
                k2.setStrokeCap(Cap.BUTT);
                k2.setStrokeJoin(Join.MITER);
                k2.setStrokeMiter(4.0f);
                k2.setPathEffect(null);
                C5163c.m7876a(k2, looper).setStrokeWidth(1.0f);
                canvas.save();
                Paint a = C5163c.m7876a(k, looper);
                a.setColor(ErrorDialogData.SUPPRESSED);
                g = C5163c.m7878a(g, 1.0f, 0.0f, 8.0f, 0.0f, 1.0f, 8.0f);
                h.reset();
                h.setValues(g);
                canvas.concat(h);
                canvas.save();
                a = C5163c.m7876a(a, looper);
                g = C5163c.m7878a(g, 0.70710677f, 0.70710677f, -16.568542f, -0.70710677f, 0.70710677f, 40.0f);
                h.reset();
                h.setValues(g);
                canvas.concat(h);
                Path l = C5163c.m7884l(looper);
                l.moveTo(37.0f, 37.0f);
                l.lineTo(37.0f, 12.995752f);
                l.cubicTo(37.0f, 12.450768f, 37.44359f, 12.0f, 37.99078f, 12.0f);
                l.lineTo(42.00922f, 12.0f);
                l.cubicTo(42.549026f, 12.0f, 43.0f, 12.445813f, 43.0f, 12.995752f);
                l.lineTo(43.0f, 37.0f);
                l.lineTo(67.00425f, 37.0f);
                l.cubicTo(67.54923f, 37.0f, 68.0f, 37.44359f, 68.0f, 37.99078f);
                l.lineTo(68.0f, 42.00922f);
                l.cubicTo(68.0f, 42.549026f, 67.554184f, 43.0f, 67.00425f, 43.0f);
                l.lineTo(43.0f, 43.0f);
                l.lineTo(43.0f, 67.00425f);
                l.cubicTo(43.0f, 67.54923f, 42.55641f, 68.0f, 42.00922f, 68.0f);
                l.lineTo(37.99078f, 68.0f);
                l.cubicTo(37.450974f, 68.0f, 37.0f, 67.554184f, 37.0f, 67.00425f);
                l.lineTo(37.0f, 43.0f);
                l.lineTo(12.995752f, 43.0f);
                l.cubicTo(12.450768f, 43.0f, 12.0f, 42.55641f, 12.0f, 42.00922f);
                l.lineTo(12.0f, 37.99078f);
                l.cubicTo(12.0f, 37.450974f, 12.445813f, 37.0f, 12.995752f, 37.0f);
                l.lineTo(37.0f, 37.0f);
                l.lineTo(37.0f, 37.0f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a);
                canvas.restore();
                canvas.restore();
                C5163c.m7882j(looper);
                break;
        }
        return 0;
    }
}
