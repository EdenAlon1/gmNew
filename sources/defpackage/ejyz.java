package defpackage;

import java.io.Closeable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ejyz implements Closeable, ejvv {
    public final ejuj a;
    final /* synthetic */ ejza b;
    private final Executor c;
    private final ejxi d;
    private final AtomicBoolean e = new AtomicBoolean(false);
    private boolean f = false;

    public ejyz(ejza ejzaVar, ejxi ejxiVar, Executor executor) {
        this.b = ejzaVar;
        this.d = ejxiVar;
        this.c = executor;
        this.a = ejxiVar.a();
    }

    @Override // defpackage.ejvv
    public final void a(ejvu ejvuVar) {
        if (ejvuVar.c.ordinal() != 0) {
            return;
        }
        boolean andSet = this.e.getAndSet(true);
        if (efbd.g()) {
            b();
        } else {
            if (andSet) {
                return;
            }
            this.c.execute(eldl.l(new Runnable() { // from class: ejyy
                @Override // java.lang.Runnable
                public final void run() {
                    ejyz.this.b();
                }
            }));
        }
    }

    public final void b() {
        efbd.c();
        if (this.f || !this.e.get()) {
            return;
        }
        ejza ejzaVar = this.b;
        if (ejzaVar.c == null || !ejzaVar.d) {
            return;
        }
        this.e.set(false);
        ejza ejzaVar2 = this.b;
        ejzaVar2.c.a(this.d);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        efbd.c();
        this.f = true;
    }
}
