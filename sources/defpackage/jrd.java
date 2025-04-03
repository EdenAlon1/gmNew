package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jrd extends ReplacementSpan {
    public final int a;
    private final float b;
    private final int c;
    private final float d;
    private final int e;
    private final float f;
    private Paint.FontMetricsInt g;
    private int h;
    private int i;
    private boolean j;

    public jrd(float f, int i, float f2, int i2, float f3, int i3) {
        this.b = f;
        this.c = i;
        this.d = f2;
        this.e = i2;
        this.f = f3;
        this.a = i3;
    }

    public final int a() {
        if (!this.j) {
            jwo.c("PlaceholderSpan is not laid out yet.");
        }
        return this.i;
    }

    public final int b() {
        if (!this.j) {
            jwo.c("PlaceholderSpan is not laid out yet.");
        }
        return this.h;
    }

    public final Paint.FontMetricsInt c() {
        Paint.FontMetricsInt fontMetricsInt = this.g;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        ffkj.c("fontMetrics");
        return null;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        float f;
        int a;
        this.j = true;
        float textSize = paint.getTextSize();
        this.g = paint.getFontMetricsInt();
        if (c().descent <= c().ascent) {
            jwo.b("Invalid fontMetrics: line height can not be negative.");
        }
        int i3 = this.c;
        if (i3 == 0) {
            f = this.b * this.f;
        } else {
            if (i3 != 1) {
                jwo.a("Unsupported unit.");
                throw new ffbx();
            }
            f = this.b * textSize;
        }
        this.h = jre.a(f);
        int i4 = this.e;
        if (i4 == 0) {
            a = jre.a(this.d * this.f);
        } else {
            if (i4 != 1) {
                jwo.a("Unsupported unit.");
                throw new ffbx();
            }
            a = jre.a(this.d * textSize);
        }
        this.i = a;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = c().ascent;
            fontMetricsInt.descent = c().descent;
            fontMetricsInt.leading = c().leading;
            int i5 = this.a;
            if (i5 != 0) {
                if (i5 != 1) {
                    if (i5 != 2) {
                        if (i5 != 4) {
                            if (i5 != 5) {
                                if (fontMetricsInt.descent - fontMetricsInt.ascent < a()) {
                                    fontMetricsInt.ascent -= (a() - (fontMetricsInt.descent - fontMetricsInt.ascent)) / 2;
                                    fontMetricsInt.descent = fontMetricsInt.ascent + a();
                                }
                            }
                        }
                    }
                    if (fontMetricsInt.ascent > fontMetricsInt.descent - a()) {
                        fontMetricsInt.ascent = fontMetricsInt.descent - a();
                    }
                }
                if (fontMetricsInt.ascent + a() > fontMetricsInt.descent) {
                    fontMetricsInt.descent = fontMetricsInt.ascent + a();
                }
            } else if (fontMetricsInt.ascent > (-a())) {
                fontMetricsInt.ascent = -a();
            }
            fontMetricsInt.top = Math.min(c().top, fontMetricsInt.ascent);
            fontMetricsInt.bottom = Math.max(c().bottom, fontMetricsInt.descent);
        }
        return b();
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
    }
}
