package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ersl extends erqb implements RunnableFuture {
    private volatile errh a;

    public ersl(erog erogVar) {
        this.a = new ersj(this, erogVar);
    }

    static ersl d(Runnable runnable, Object obj) {
        return new ersl(Executors.callable(runnable, obj));
    }

    @Override // defpackage.ernr
    protected final String gP() {
        errh errhVar = this.a;
        return errhVar != null ? a.b(errhVar, "task=[", "]") : super.gP();
    }

    @Override // defpackage.ernr
    protected final void gQ() {
        errh errhVar;
        if (n() && (errhVar = this.a) != null) {
            errhVar.h();
        }
        this.a = null;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        errh errhVar = this.a;
        if (errhVar != null) {
            errhVar.run();
        }
        this.a = null;
    }

    public ersl(Callable callable) {
        this.a = new ersk(this, callable);
    }
}
