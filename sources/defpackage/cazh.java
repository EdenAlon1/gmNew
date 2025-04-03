package defpackage;

import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cazh implements Closeable {
    final /* synthetic */ cazi a;
    private final dtwd b;
    private final long c;

    public cazh(cazi caziVar, dtwd dtwdVar) {
        this.a = caziVar;
        this.b = dtwdVar;
        this.c = caziVar.b.a();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long a = this.a.b.a() - this.c;
        if (((dtrg) this.b).b.equals(dtxc.BEGIN_TRANSACTION)) {
            this.a.c.g("Bugle.Datamodel.DatabaseTransactionStartLatency.Duration", a);
        }
    }
}
