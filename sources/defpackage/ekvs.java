package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekvs implements ekvm {
    final /* synthetic */ ekrl a;
    final /* synthetic */ ekvw b;

    public ekvs(ekvw ekvwVar, ekrl ekrlVar) {
        this.b = ekvwVar;
        this.a = ekrlVar;
    }

    @Override // defpackage.ekvm
    public final ListenableFuture a(ListenableFuture listenableFuture, long j) {
        return this.b.a(listenableFuture, this.a, j);
    }

    @Override // defpackage.ekvm
    public final ListenableFuture b() {
        ekvw ekvwVar = this.b;
        if (ekvwVar.a.booleanValue()) {
            ekvwVar.b.a(ekvwVar.c, this.a.b(), "attempt");
        }
        return erre.a;
    }
}
