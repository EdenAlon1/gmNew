package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekvr implements ekvm {
    final /* synthetic */ eroh a;
    final /* synthetic */ ekvv b;

    public ekvr(eroh erohVar, ekvv ekvvVar) {
        this.a = erohVar;
        this.b = ekvvVar;
    }

    @Override // defpackage.ekvm
    public final ListenableFuture a(ListenableFuture listenableFuture, long j) {
        return erre.a;
    }

    @Override // defpackage.ekvm
    public final ListenableFuture b() {
        return this.a.a(this.b);
    }
}
