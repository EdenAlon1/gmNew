package defpackage;

import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
/* loaded from: classes6.dex */
class alae implements akzw {
    private final String a;
    protected final String b;
    final /* synthetic */ alaf c;
    private final long d;
    private long e = -1;

    public alae(alaf alafVar, String str, String str2, long j) {
        this.c = alafVar;
        this.b = str;
        this.a = str2;
        this.d = j;
    }

    @Override // defpackage.akzw
    public final long a() {
        return this.d;
    }

    @Override // defpackage.akzw
    public final String b() {
        return this.a;
    }

    @Override // defpackage.akzw
    public final boolean c() {
        alaf alafVar = this.c;
        ConcurrentHashMap concurrentHashMap = alafVar.c;
        long a = alafVar.e.a();
        if (!concurrentHashMap.remove(this.a, this)) {
            csjb d = alaf.a.d();
            d.I("already reported timer");
            d.A("histogramName", this.b);
            d.M("lookupKey", this.a);
            d.r();
            return false;
        }
        long j = a - this.d;
        e(j);
        long j2 = this.e;
        csjb d2 = (j2 == -1 || j < j2) ? alaf.a.d() : alaf.a.e();
        d2.M("key", this.a);
        d2.z("timer took", j);
        d2.r();
        return true;
    }

    @Override // defpackage.akzw
    public final /* synthetic */ void d(long j) {
        this.e = j;
    }

    protected void e(long j) {
        ((akzt) this.c.d.b()).g(this.b, j);
    }
}
