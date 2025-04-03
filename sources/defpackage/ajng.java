package defpackage;

import android.util.LruCache;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajng {
    public final LruCache a;
    public final cqoh b;
    public final cfup c;

    public ajng(LruCache lruCache, cqoh cqohVar) {
        lruCache.getClass();
        cqohVar.getClass();
        this.a = lruCache;
        this.b = cqohVar;
        this.c = cfvl.f(cfvl.b, "single_reg_cached_capability_expiration_seconds", 60L);
    }
}
