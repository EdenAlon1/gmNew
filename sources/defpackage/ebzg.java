package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ebzg {
    public final ebwq a;
    public final ebun b;
    public final String c;
    public final int d;

    public ebzg(ebwq ebwqVar, int i, ebun ebunVar, String str) {
        this.a = ebwqVar;
        this.b = ebunVar;
        this.d = i;
        this.c = str;
    }

    public final ListenableFuture a(boolean z) {
        long epochMilli = Instant.now().toEpochMilli();
        ListenableFuture a = z ? this.a.a() : this.a.c();
        elfr.l(a, new ebze(this, z, epochMilli), erpp.a);
        return a;
    }
}
