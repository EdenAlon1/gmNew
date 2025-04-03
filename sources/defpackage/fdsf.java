package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdsf implements fdsc {
    public static final edax a;
    public static final edax b;
    public static final edax c;

    static {
        enpd enpdVar = enpd.a;
        enpx enpxVar = new enpx("CLIENT_LOGGING_PROD");
        a = edbk.g("15", new edbj() { // from class: fdsd
            @Override // defpackage.edbj
            public final Object a(Object obj) {
                return (fgpf) eyfy.parseFrom(fgpf.a, (byte[]) obj);
            }
        }, "EAAYAg", "com.google.android.libraries.performance.primes", enpxVar, true, true, false);
        b = edbk.g("45357002", new edbj() { // from class: fdse
            @Override // defpackage.edbj
            public final Object a(Object obj) {
                return (ecke) eyfy.parseFrom(ecke.a, (byte[]) obj);
            }
        }, "CAASABgAIAAoADAAOABAAA", "com.google.android.libraries.performance.primes", enpxVar, true, true, false);
        c = edbk.g("45355611", new edbj() { // from class: fdse
            @Override // defpackage.edbj
            public final Object a(Object obj) {
                return (ecke) eyfy.parseFrom(ecke.a, (byte[]) obj);
            }
        }, "CAASABgAIAAoADAAOABAAA", "com.google.android.libraries.performance.primes", enpxVar, true, true, false);
    }

    @Override // defpackage.fdsc
    public final ecke a(Context context) {
        return (ecke) b.a(context);
    }

    @Override // defpackage.fdsc
    public final ecke b(Context context) {
        return (ecke) c.a(context);
    }

    @Override // defpackage.fdsc
    public final fgpf c(Context context) {
        return (fgpf) a.a(context);
    }
}
