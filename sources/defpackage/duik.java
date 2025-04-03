package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class duik {
    public static dhre a(ListenableFuture listenableFuture) {
        dhqg dhqgVar = new dhqg();
        dhri dhriVar = new dhri(dhqgVar.a);
        erqt.r(listenableFuture, new duij(dhriVar, listenableFuture, dhqgVar), erpp.a);
        return dhriVar.a;
    }
}
