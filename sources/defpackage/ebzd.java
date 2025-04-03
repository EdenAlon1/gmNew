package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ebzd {
    public final ebun a;
    public final String b;
    public final int c;
    private final ebwq d;

    public ebzd(ebwq ebwqVar, int i, ebun ebunVar, String str) {
        this.d = ebwqVar;
        this.a = ebunVar;
        this.c = i;
        this.b = str;
    }

    public final ListenableFuture a(boolean z, String str, int i) {
        long epochMilli = Instant.now().toEpochMilli();
        ListenableFuture f = z ? this.d.f(str, i) : this.d.g(str, i);
        elfr.l(f, new ebzc(this, i, z, epochMilli), erpp.a);
        return f;
    }
}
