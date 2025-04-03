package defpackage;

import java.util.concurrent.CompletableFuture;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fjbq implements fjbm {
    private final CompletableFuture a;

    public fjbq(CompletableFuture completableFuture) {
        this.a = completableFuture;
    }

    @Override // defpackage.fjbm
    public final void onFailure(fjbj fjbjVar, Throwable th) {
        this.a.completeExceptionally(th);
    }

    @Override // defpackage.fjbm
    public final void onResponse(fjbj fjbjVar, fjdu fjduVar) {
        this.a.complete(fjduVar);
    }
}
