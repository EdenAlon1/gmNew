package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdtx implements fdtv {
    public static final edax a;

    static {
        enpd enpdVar = enpd.a;
        a = edbk.g("9", new edbj() { // from class: fdtw
            @Override // defpackage.edbj
            public final Object a(Object obj) {
                return (fgpf) eyfy.parseFrom(fgpf.a, (byte[]) obj);
            }
        }, "EOgHGAQ", "com.google.android.libraries.performance.primes", new enpx("CLIENT_LOGGING_PROD"), true, true, false);
    }

    @Override // defpackage.fdtv
    public final fgpf a(Context context) {
        return (fgpf) a.a(context);
    }
}
