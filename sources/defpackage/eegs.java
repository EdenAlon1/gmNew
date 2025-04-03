package defpackage;

import android.util.Pair;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eegs extends eehc {
    public eegs(String str, int i) {
        super(str, Integer.toString(i));
    }

    public static eegs a(String str) {
        Pair e = e(eehd.c(str, "b="));
        return new eegs((String) e.first, eehd.a((String) e.second));
    }

    @Override // defpackage.eeha
    public final void b(StringBuilder sb) {
        sb.append("b=");
        g(sb);
    }
}
