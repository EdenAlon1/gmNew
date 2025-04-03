package defpackage;

import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eavn {
    public static void a(TextView textView) {
        kvo.p(textView, new eavm());
    }

    public static String b(Object obj, eave eaveVar) {
        boolean z = ((eavk) eavl.a(obj, eaveVar)).a;
        String b = emxe.b(eaveVar.e(obj));
        String b2 = z ? "" : emxe.b(eaveVar.c(obj));
        return (b.isEmpty() && b2.isEmpty()) ? eaveVar.b(obj) : b.isEmpty() ? b2 : (b2.isEmpty() || b.equals(b2)) ? b : a.w(b2, b, " ");
    }
}
