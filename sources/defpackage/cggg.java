package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cggg implements ekrm {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/gaia/synclet/GaiaStatusUpdaterSynclet");
    public final ffbr b;
    public final ffbr c;
    public final ffbr d;
    private final ffsk e;

    public cggg(ffsk ffskVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3) {
        ffskVar.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        this.e = ffskVar;
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.d = ffbrVar3;
    }

    @Override // defpackage.ekrm
    public final ListenableFuture a() {
        elfl c;
        c = axol.c(this.e, ffhe.a, ffsm.a, new cggf(this, null));
        return c;
    }
}
