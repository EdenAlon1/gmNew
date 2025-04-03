package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lfi extends lfb {
    public lfi(lex lexVar) {
        super(lexVar);
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        lew.b();
        lex lexVar = this.a;
        Typeface typeface = lexVar.b.d;
        Typeface typeface2 = paint.getTypeface();
        paint.setTypeface(typeface);
        int i6 = lexVar.a;
        canvas.drawText(lexVar.b.b, i6 + i6, 2, f, i4, paint);
        paint.setTypeface(typeface2);
    }
}
