package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdsx implements fdsv {
    public static final edax a;
    public static final edax b;
    public static final edax c;
    public static final edax d;

    static {
        enpd enpdVar = enpd.a;
        enpx enpxVar = new enpx("CLIENT_LOGGING_PROD");
        a = edbk.f("45415027", true, "com.google.android.libraries.performance.primes", enpxVar, true, true, false);
        b = edbk.g("8", new edbj() { // from class: fdsw
            @Override // defpackage.edbj
            public final Object a(Object obj) {
                return (fgpf) eyfy.parseFrom(fgpf.a, (byte[]) obj);
            }
        }, "EOgHGAQ", "com.google.android.libraries.performance.primes", enpxVar, true, true, false);
        c = edbk.d("45401381", 3600000L, "com.google.android.libraries.performance.primes", enpxVar, true, true, false);
        d = edbk.f("45420903", false, "com.google.android.libraries.performance.primes", enpxVar, true, true, false);
    }

    @Override // defpackage.fdsv
    public final long a(Context context) {
        return ((Long) c.a(context)).longValue();
    }

    @Override // defpackage.fdsv
    public final fgpf b(Context context) {
        return (fgpf) b.a(context);
    }

    @Override // defpackage.fdsv
    public final boolean c(Context context) {
        return ((Boolean) a.a(context)).booleanValue();
    }

    @Override // defpackage.fdsv
    public final boolean d(Context context) {
        return ((Boolean) d.a(context)).booleanValue();
    }
}
