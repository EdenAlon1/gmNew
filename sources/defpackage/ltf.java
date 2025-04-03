package defpackage;

import android.text.Spannable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ltf {
    public static void a(Spannable spannable, Object obj, int i, int i2) {
        for (Object obj2 : spannable.getSpans(i, i2, obj.getClass())) {
            b(spannable, obj2, i, i2);
        }
        spannable.setSpan(obj, i, i2, 33);
    }

    public static void b(Spannable spannable, Object obj, int i, int i2) {
        if (spannable.getSpanStart(obj) == i && spannable.getSpanEnd(obj) == i2 && spannable.getSpanFlags(obj) == 33) {
            spannable.removeSpan(obj);
        }
    }
}
