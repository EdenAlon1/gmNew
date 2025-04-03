package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzhw implements eiyb {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/datamodel/ditto/settings/GaiaAccountCleanupInterceptor");
    public final ffbr b;
    public final ffbr c;
    private final ffsk d;

    public bzhw(ffbr ffbrVar, ffbr ffbrVar2, ffsk ffskVar) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffskVar.getClass();
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.d = ffskVar;
    }

    @Override // defpackage.eiyb
    public final ListenableFuture b(eiyc eiycVar) {
        elfl c;
        c = axol.c(this.d, ffhe.a, ffsm.a, new bzhv(eiycVar, this, null));
        return c;
    }
}
