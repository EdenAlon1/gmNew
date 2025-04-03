package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cjwt {
    public static final boolean a(bseh bsehVar) {
        bsehVar.getClass();
        String s = crjm.s(Uri.parse(String.valueOf(bsehVar.W())));
        return ffkj.e(s, "r") || ffkj.e(s, "h");
    }

    public static final int b(boolean z) {
        return z ? 1 : 0;
    }
}
