package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekrx implements eksc {
    private static final enru a = enru.c("com/google/apps/tiktok/sync/impl/NoOpSyncManager");

    @Override // defpackage.eksc
    public final ListenableFuture a() {
        ((enrr) ((enrr) a.i()).h("com/google/apps/tiktok/sync/impl/NoOpSyncManager", "poke", 18, "NoOpSyncManager.java")).q("Skipping #poke() because this is not a supported process");
        return erre.a;
    }

    @Override // defpackage.eksc
    public final ListenableFuture b() {
        ((enrr) ((enrr) a.i()).h("com/google/apps/tiktok/sync/impl/NoOpSyncManager", "sync", 24, "NoOpSyncManager.java")).q("Skipping #sync() because this is not a supported process");
        return erre.a;
    }
}
