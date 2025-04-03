package defpackage;

import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class lfb extends ReplacementSpan {
    public final lex a;
    private final Paint.FontMetricsInt b = new Paint.FontMetricsInt();
    private short c = -1;
    private float d = 1.0f;

    public lfb(lex lexVar) {
        ksw.i(lexVar, "metadata cannot be null");
        this.a = lexVar;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        paint.getFontMetricsInt(this.b);
        Paint.FontMetricsInt fontMetricsInt2 = this.b;
        this.d = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) / this.a.e();
        this.a.e();
        this.c = (short) ((this.a.d().b(12) != 0 ? r1.b.getShort(r2 + r1.a) : (short) 0) * this.d);
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = this.b.ascent;
            fontMetricsInt.descent = this.b.descent;
            fontMetricsInt.top = this.b.top;
            fontMetricsInt.bottom = this.b.bottom;
        }
        return this.c;
    }
}
