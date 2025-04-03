package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdtp implements fdtn {
    public static final edax a;
    public static final edax b;
    public static final edax c;
    public static final edax d;
    public static final edax e;

    static {
        enpd enpdVar = enpd.a;
        enpx enpxVar = new enpx("CLIENT_LOGGING_PROD");
        a = edbk.d("45641094", 2L, "com.google.android.libraries.performance.primes", enpxVar, true, true, false);
        b = edbk.f("3", false, "com.google.android.libraries.performance.primes", enpxVar, true, true, false);
        c = edbk.d("45357887", 1L, "com.google.android.libraries.performance.primes", enpxVar, true, true, false);
        d = edbk.g("19", new edbj() { // from class: fdto
            @Override // defpackage.edbj
            public final Object a(Object obj) {
                return (fgpf) eyfy.parseFrom(fgpf.a, (byte[]) obj);
            }
        }, "EAAYAg", "com.google.android.libraries.performance.primes", enpxVar, true, true, false);
        e = edbk.f("45677305", false, "com.google.android.libraries.performance.primes", enpxVar, true, true, false);
    }

    @Override // defpackage.fdtn
    public final long a(Context context) {
        return ((Long) a.a(context)).longValue();
    }

    @Override // defpackage.fdtn
    public final long b(Context context) {
        return ((Long) c.a(context)).longValue();
    }

    @Override // defpackage.fdtn
    public final fgpf c(Context context) {
        return (fgpf) d.a(context);
    }

    @Override // defpackage.fdtn
    public final boolean d(Context context) {
        return ((Boolean) b.a(context)).booleanValue();
    }

    @Override // defpackage.fdtn
    public final boolean e(Context context) {
        return ((Boolean) e.a(context)).booleanValue();
    }
}
