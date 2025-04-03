package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jtk {
    public static final Typeface a(Typeface typeface, jsw jswVar, Context context) {
        ThreadLocal threadLocal = jto.a;
        if (typeface == null) {
            return null;
        }
        if (jswVar.a.isEmpty()) {
            return typeface;
        }
        Paint paint = (Paint) jto.a.get();
        if (paint == null) {
            paint = new Paint();
            jto.a.set(paint);
        }
        paint.setFontVariationSettings(null);
        paint.setTypeface(typeface);
        jzh.a(context);
        paint.setFontVariationSettings(kau.d(jswVar.a, null, new jtn(), 31));
        return paint.getTypeface();
    }
}
