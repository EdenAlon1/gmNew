package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.style.ReplacementSpan;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbwx extends ReplacementSpan {
    public final Parcelable a;
    private final Drawable b;
    private final int c = 1;

    public dbwx(Parcelable parcelable, Drawable drawable) {
        this.a = parcelable;
        this.b = drawable;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        canvas.save();
        int i6 = i5 - this.b.getBounds().bottom;
        if (this.c == 1) {
            i6 /= 2;
        }
        canvas.translate(f, i6);
        this.b.draw(canvas);
        canvas.restore();
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Rect bounds = this.b.getBounds();
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.leading = fontMetricsInt2.leading;
        }
        return bounds.right + 12;
    }
}
