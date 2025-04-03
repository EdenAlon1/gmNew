package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekgz implements erog {
    final /* synthetic */ ffji a;
    final /* synthetic */ ekgy b;

    public ekgz(ffji ffjiVar, ekgy ekgyVar) {
        this.a = ffjiVar;
        this.b = ekgyVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    @Override // defpackage.erog
    public final ListenableFuture a() {
        return this.a.invoke(this.b.e);
    }
}
