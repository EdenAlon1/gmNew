package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class fbbp implements fbbm {
    public final ListenableFuture a;
    final /* synthetic */ fbbr b;

    public fbbp(fbbr fbbrVar) {
        this.b = fbbrVar;
        fbbq fbbqVar = fbbrVar.a;
        if (!fbbqVar.isDone()) {
            Runnable fbbnVar = new fbbn(fbbqVar);
            fbbqVar.b(fbbnVar, erpp.a);
            fbbqVar = fbbnVar;
        }
        this.a = fbbqVar;
    }

    @Override // defpackage.fbbm
    public final ListenableFuture d() {
        this.b.d();
        return this.a;
    }
}
