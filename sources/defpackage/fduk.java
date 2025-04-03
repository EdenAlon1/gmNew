package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fduk implements fduj {
    public static final edax a;
    public static final edax b;
    public static final edax c;
    public static final edax d;

    static {
        enpd enpdVar = enpd.a;
        enip r = enip.r("PROFILE_PRIMITIVES", "GMM_PRIMES");
        a = edbk.f("45662278", true, "profile_primitives_android", r, true, false, false);
        b = edbk.a("45667762", false, "profile_primitives_android", r, true, false, false);
        c = edbk.f("45679787", true, "profile_primitives_android", r, true, false, false);
        d = edbk.e("45645886", "https://www.googleapis.com/auth/photos.firstparty.readwrite", "profile_primitives_android", r, true, false, false);
    }

    @Override // defpackage.fduj
    public final String a(Context context) {
        return (String) d.a(context);
    }

    @Override // defpackage.fduj
    public final boolean b(Context context) {
        return ((Boolean) a.a(context)).booleanValue();
    }

    @Override // defpackage.fduj
    public final boolean c(Context context) {
        return ((Boolean) b.a(context)).booleanValue();
    }

    @Override // defpackage.fduj
    public final boolean d(Context context) {
        return ((Boolean) c.a(context)).booleanValue();
    }
}
