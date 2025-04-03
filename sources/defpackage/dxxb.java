package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxxb implements efdl {
    public final dwqq a;
    public final AtomicLong b = new AtomicLong();
    final /* synthetic */ dxxc c;
    private final String d;

    public dxxb(dxxc dxxcVar, String str, dwqq dwqqVar) {
        this.c = dxxcVar;
        this.d = str;
        this.a = dwqqVar;
    }

    @Override // defpackage.efdl
    public final void a(long j) {
        this.b.getAndAdd(j);
        dxth.m("%s: Received data for groupName = %s, len = %d, Counter = %d", "DownloadProgressMonitor", this.d, Long.valueOf(j), Long.valueOf(this.b.get()));
    }

    @Override // defpackage.efdl
    public final void b() {
        synchronized (dxxc.class) {
            if (this.c.c.containsKey(this.d)) {
                this.c.a.execute(new Runnable() { // from class: dxxa
                    @Override // java.lang.Runnable
                    public final void run() {
                        dxxb dxxbVar = dxxb.this;
                        dxxbVar.a.a(dxxbVar.b.get());
                    }
                });
            }
        }
    }
}
