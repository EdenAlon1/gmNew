package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eamf {
    public final eamd a;
    private final ffsk b;

    public eamf(eamd eamdVar, ffsk ffskVar) {
        eamdVar.getClass();
        ffskVar.getClass();
        this.a = eamdVar;
        this.b = ffskVar;
    }

    public final ListenableFuture a(exyd exydVar, eagp eagpVar) {
        ListenableFuture b;
        exydVar.getClass();
        eagpVar.getClass();
        b = fgfz.b(this.b, ffhe.a, ffsm.a, new eame(this, exydVar, eagpVar, null));
        return b;
    }
}
