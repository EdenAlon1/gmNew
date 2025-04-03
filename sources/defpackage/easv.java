package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class easv implements easu {
    private static final entd a = entd.c("GnpSdk");

    @Override // defpackage.easu
    public final void a(Context context) {
        try {
            ecvo.f(context);
        } catch (IllegalStateException e) {
            ((ensz) ((ensz) a.o().g(e)).h("com/google/android/libraries/notifications/platform/phenotype/impl/GnpPhenotypeContextInitImpl", "initPhenotypeContext", 23, "GnpPhenotypeContextInitImpl.java")).q("PhenotypeContext.setContext was called more than once");
        }
    }
}
