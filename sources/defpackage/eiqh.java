package defpackage;

import android.text.Spannable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eiqh {
    public static void a(Spannable spannable, Object obj, Object... objArr) {
        int spanStart = spannable.getSpanStart(obj);
        int spanEnd = spannable.getSpanEnd(obj);
        spannable.removeSpan(obj);
        for (Object obj2 : objArr) {
            spannable.setSpan(obj2, spanStart, spanEnd, 0);
        }
    }
}
