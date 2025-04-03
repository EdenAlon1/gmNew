package defpackage;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jxs extends CharacterStyle implements UpdateAppearance {
    private final ifs a;

    public jxs(ifs ifsVar) {
        this.a = ifsVar;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        if (textPaint != null) {
            ifs ifsVar = this.a;
            if (ffkj.e(ifsVar, ifu.a)) {
                textPaint.setStyle(Paint.Style.FILL);
                return;
            }
            if (ifsVar instanceof ifv) {
                textPaint.setStyle(Paint.Style.STROKE);
                textPaint.setStrokeWidth(((ifv) this.a).a);
                textPaint.setStrokeMiter(((ifv) this.a).b);
                int i = ((ifv) this.a).d;
                textPaint.setStrokeJoin(idn.a(i, 0) ? Paint.Join.MITER : idn.a(i, 1) ? Paint.Join.ROUND : idn.a(i, 2) ? Paint.Join.BEVEL : Paint.Join.MITER);
                int i2 = ((ifv) this.a).c;
                textPaint.setStrokeCap(idm.a(i2, 0) ? Paint.Cap.BUTT : idm.a(i2, 1) ? Paint.Cap.ROUND : idm.a(i2, 2) ? Paint.Cap.SQUARE : Paint.Cap.BUTT);
                textPaint.setPathEffect(null);
            }
        }
    }
}
