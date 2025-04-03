package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdtl implements fdtj {
    public static final edax a;
    public static final edax b;

    static {
        enpd enpdVar = enpd.a;
        enpx enpxVar = new enpx("CLIENT_LOGGING_PROD");
        a = edbk.f("45663934", false, "com.google.android.libraries.performance.primes", enpxVar, true, true, false);
        b = edbk.g("45352226", new edbj() { // from class: fdtk
            @Override // defpackage.edbj
            public final Object a(Object obj) {
                return (fgpf) eyfy.parseFrom(fgpf.a, (byte[]) obj);
            }
        }, "EAAYAw", "com.google.android.libraries.performance.primes", enpxVar, true, true, false);
    }

    @Override // defpackage.fdtj
    public final fgpf a(Context context) {
        return (fgpf) b.a(context);
    }

    @Override // defpackage.fdtj
    public final boolean b(Context context) {
        return ((Boolean) a.a(context)).booleanValue();
    }
}
