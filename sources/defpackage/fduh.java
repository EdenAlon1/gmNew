package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fduh implements fdug {
    public static final edax a;
    public static final edax b;

    static {
        enpd enpdVar = enpd.a;
        enip r = enip.r("PROFILE_PRIMITIVES", "GMM_PRIMES");
        a = edbk.d("45430882", 20000L, "profile_primitives_android", r, true, false, false);
        b = edbk.e("45422346", "", "profile_primitives_android", r, true, false, false);
    }

    @Override // defpackage.fdug
    public final long a(Context context) {
        return ((Long) a.a(context)).longValue();
    }

    @Override // defpackage.fdug
    public final String b(Context context) {
        return (String) b.a(context);
    }
}
