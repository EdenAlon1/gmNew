package defpackage;

import android.util.Pair;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eegu extends eehc {
    public eegu(String str, String str2) {
        super(str, str2);
    }

    public static eegu a(String str) {
        Pair e = e(eehd.c(str, "a="));
        return new eegu((String) e.first, (String) e.second);
    }

    @Override // defpackage.eeha
    public final void b(StringBuilder sb) {
        sb.append("a=");
        g(sb);
    }

    @Override // defpackage.eehc
    public final String c() {
        return this.a;
    }

    @Override // defpackage.eehc
    public final String d() {
        return this.b;
    }
}
