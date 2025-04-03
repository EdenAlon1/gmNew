package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjrp implements eiyb {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/profile/cleanup/ProfilesAccountCleanupInterceptor");
    public final ffbr b;
    public final ffbr c;
    private final ffsk d;

    public cjrp(ffsk ffskVar, ffsk ffskVar2, ffbr ffbrVar, ffbr ffbrVar2) {
        ffskVar.getClass();
        ffskVar2.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        this.d = ffskVar2;
        this.b = ffbrVar;
        this.c = ffbrVar2;
    }

    @Override // defpackage.eiyb
    public final ListenableFuture b(eiyc eiycVar) {
        elfl c;
        c = axol.c(this.d, ffhe.a, ffsm.a, new cjro(eiycVar, this, null));
        return c;
    }
}
