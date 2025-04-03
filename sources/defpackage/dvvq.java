package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvvq implements ekhx {
    private final dvva a;

    public dvvq(dvva dvvaVar) {
        this.a = dvvaVar;
    }

    @Override // defpackage.ekhx
    public final ListenableFuture a() {
        ListenableFuture a = this.a.a();
        ejjz.c(a, "Failed to start GrowthKit after package replaced", new Object[0]);
        return a;
    }
}
