package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdtt implements fdtr {
    public static final edax a;

    static {
        enpd enpdVar = enpd.a;
        a = edbk.g("17", new edbj() { // from class: fdts
            @Override // defpackage.edbj
            public final Object a(Object obj) {
                return (fgpf) eyfy.parseFrom(fgpf.a, (byte[]) obj);
            }
        }, "EOgHGAM", "com.google.android.libraries.performance.primes", new enpx("CLIENT_LOGGING_PROD"), true, true, false);
    }

    @Override // defpackage.fdtr
    public final fgpf a(Context context) {
        return (fgpf) a.a(context);
    }
}
