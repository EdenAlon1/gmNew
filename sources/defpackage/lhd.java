package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.MetricAffectingSpan;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lhd extends lgt {
    private TextPaint c;

    public lhd(lhc lhcVar) {
        super(lhcVar);
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        TextPaint textPaint = null;
        if (charSequence instanceof Spanned) {
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i, i2, CharacterStyle.class);
            int length = characterStyleArr.length;
            if (length != 0) {
                if (length != 1 || characterStyleArr[0] != this) {
                    TextPaint textPaint2 = this.c;
                    if (textPaint2 == null) {
                        textPaint2 = new TextPaint();
                        this.c = textPaint2;
                    }
                    textPaint = textPaint2;
                    textPaint.set(paint);
                    for (CharacterStyle characterStyle : characterStyleArr) {
                        if (!(characterStyle instanceof MetricAffectingSpan)) {
                            characterStyle.updateDrawState(textPaint);
                        }
                    }
                }
            }
            if (paint instanceof TextPaint) {
                textPaint = (TextPaint) paint;
            }
        } else if (paint instanceof TextPaint) {
            textPaint = (TextPaint) paint;
        }
        TextPaint textPaint3 = textPaint;
        if (textPaint3 != null && textPaint3.bgColor != 0) {
            int color = textPaint3.getColor();
            Paint.Style style = textPaint3.getStyle();
            textPaint3.setColor(textPaint3.bgColor);
            textPaint3.setStyle(Paint.Style.FILL);
            canvas.drawRect(f, i3, f + this.b, i5, textPaint3);
            textPaint3.setStyle(style);
            textPaint3.setColor(color);
        }
        lgl.c();
        lhc lhcVar = this.a;
        float f2 = i4;
        Paint paint2 = textPaint3;
        if (textPaint3 == null) {
            paint2 = paint;
        }
        Typeface typeface = lhcVar.b.d;
        Typeface typeface2 = paint2.getTypeface();
        paint2.setTypeface(typeface);
        int i6 = lhcVar.a;
        canvas.drawText(lhcVar.b.b, i6 + i6, 2, f, f2, paint2);
        paint2.setTypeface(typeface2);
    }
}
