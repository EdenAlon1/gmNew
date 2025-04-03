package defpackage;

import java.util.concurrent.CompletableFuture;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fjbn implements fjbm {
    private final CompletableFuture a;

    public fjbn(CompletableFuture completableFuture) {
        this.a = completableFuture;
    }

    @Override // defpackage.fjbm
    public final void onFailure(fjbj fjbjVar, Throwable th) {
        this.a.completeExceptionally(th);
    }

    @Override // defpackage.fjbm
    public final void onResponse(fjbj fjbjVar, fjdu fjduVar) {
        if (fjduVar.c()) {
            this.a.complete(fjduVar.b);
        } else {
            this.a.completeExceptionally(new fjcb(fjduVar));
        }
    }
}
