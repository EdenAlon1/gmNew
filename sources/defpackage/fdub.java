package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdub implements fdtz {
    public static final edax a;
    public static final edax b;
    public static final edax c;

    static {
        enpd enpdVar = enpd.a;
        enpx enpxVar = new enpx("CLIENT_LOGGING_PROD");
        a = edbk.g("10", new edbj() { // from class: fdua
            @Override // defpackage.edbj
            public final Object a(Object obj) {
                return (fgpf) eyfy.parseFrom(fgpf.a, (byte[]) obj);
            }
        }, "EOgHGAQ", "com.google.android.libraries.performance.primes", enpxVar, true, true, false);
        b = edbk.f("45673425", false, "com.google.android.libraries.performance.primes", enpxVar, true, true, false);
        c = edbk.f("45673426", true, "com.google.android.libraries.performance.primes", enpxVar, true, true, false);
    }

    @Override // defpackage.fdtz
    public final fgpf a(Context context) {
        return (fgpf) a.a(context);
    }

    @Override // defpackage.fdtz
    public final boolean b(Context context) {
        return ((Boolean) b.a(context)).booleanValue();
    }

    @Override // defpackage.fdtz
    public final boolean c(Context context) {
        return ((Boolean) c.a(context)).booleanValue();
    }
}
