package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejkr implements erog {
    final /* synthetic */ erog a;
    final /* synthetic */ ListenableFuture b;

    public ejkr(erog erogVar, ListenableFuture listenableFuture) {
        this.a = erogVar;
        this.b = listenableFuture;
    }

    @Override // defpackage.erog
    public final ListenableFuture a() {
        return this.a.a();
    }

    public final String toString() {
        ListenableFuture listenableFuture = this.b;
        return this.a.toString() + ", input=[" + String.valueOf(listenableFuture) + "]";
    }
}
