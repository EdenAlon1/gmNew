package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efdm implements efei {
    public final efdl a;
    private final efdk b;
    private final long c;
    private long d;

    public efdm(efdl efdlVar, efdk efdkVar, long j, TimeUnit timeUnit) {
        this.a = efdlVar;
        this.b = efdkVar;
        this.c = timeUnit.toMillis(j);
        this.d = efdkVar.a();
    }

    @Override // defpackage.efei
    public final void a(int i) {
        this.a.a(i);
        if (this.b.a() - this.d >= this.c) {
            this.a.b();
            this.d = this.b.a();
        }
    }

    @Override // defpackage.efei, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.b();
    }
}
