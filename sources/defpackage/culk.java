package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class culk implements ekrm {
    public static final cfva a = cfvl.e(cfvl.b, "spam_data_cleanup_interval_days", 7);
    public final ffbr b;
    public final ffbr c;
    private final ffsk d;

    public culk(ffbr ffbrVar, ffbr ffbrVar2, ffsk ffskVar) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffskVar.getClass();
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.d = ffskVar;
    }

    @Override // defpackage.ekrm
    public final ListenableFuture a() {
        elfl c;
        c = axol.c(this.d, ffhe.a, ffsm.a, new culj(this, null));
        return c;
    }
}
