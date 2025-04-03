package defpackage;

import java.util.concurrent.CompletableFuture;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fjbp extends CompletableFuture {
    private final fjbj a;

    public fjbp(fjbj fjbjVar) {
        this.a = fjbjVar;
    }

    @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        if (z) {
            this.a.c();
        }
        return super.cancel(z);
    }
}
