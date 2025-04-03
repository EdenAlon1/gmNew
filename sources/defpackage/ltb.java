package defpackage;

import android.os.Bundle;
import android.text.Spanned;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ltb {
    public static final String a = lvf.N(0);
    public static final String b = lvf.N(1);
    public static final String c = lvf.N(2);
    public static final String d = lvf.N(3);
    public static final String e = lvf.N(4);

    public static Bundle a(Spanned spanned, Object obj, int i, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(a, spanned.getSpanStart(obj));
        bundle2.putInt(b, spanned.getSpanEnd(obj));
        bundle2.putInt(c, spanned.getSpanFlags(obj));
        bundle2.putInt(d, i);
        if (bundle != null) {
            bundle2.putBundle(e, bundle);
        }
        return bundle2;
    }
}
