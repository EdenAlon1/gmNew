package defpackage;

import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class lgt extends ReplacementSpan {
    public final lhc a;
    private final Paint.FontMetricsInt c = new Paint.FontMetricsInt();
    public short b = -1;
    private float d = 1.0f;

    public lgt(lhc lhcVar) {
        ksw.i(lhcVar, "rasterizer cannot be null");
        this.a = lhcVar;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        paint.getFontMetricsInt(this.c);
        Paint.FontMetricsInt fontMetricsInt2 = this.c;
        this.d = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) / this.a.d();
        this.a.d();
        this.b = (short) ((this.a.f().b(12) != 0 ? r1.b.getShort(r2 + r1.a) : (short) 0) * this.d);
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = this.c.ascent;
            fontMetricsInt.descent = this.c.descent;
            fontMetricsInt.top = this.c.top;
            fontMetricsInt.bottom = this.c.bottom;
        }
        return this.b;
    }
}
