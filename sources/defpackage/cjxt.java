package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjxt implements ekrm {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/profile/synclet/ProfileRefreshSynclet");
    public final eisx b;
    public final eixo c;
    public final ffhd d;
    public final cjxi e;
    public final ffbr f;
    public final ffbr g;
    public final ffbr h;
    public final ffbr i;
    private final ffsk j;

    public cjxt(eisx eisxVar, eixo eixoVar, ffhd ffhdVar, ffsk ffskVar, cjxi cjxiVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4) {
        eisxVar.getClass();
        eixoVar.getClass();
        ffhdVar.getClass();
        ffskVar.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        this.b = eisxVar;
        this.c = eixoVar;
        this.d = ffhdVar;
        this.j = ffskVar;
        this.e = cjxiVar;
        this.f = ffbrVar;
        this.g = ffbrVar2;
        this.h = ffbrVar3;
        this.i = ffbrVar4;
    }

    @Override // defpackage.ekrm
    public final ListenableFuture a() {
        elfl c;
        c = axol.c(this.j, ffhe.a, ffsm.a, new cjxs(this, null));
        return c;
    }
}
