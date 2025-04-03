package defpackage;

import android.database.sqlite.SQLiteDatabase;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efjh {
    public final SQLiteDatabase a;
    public volatile boolean b = false;
    public final efjq c;
    private final Executor d;
    private final Executor e;

    public efjh(SQLiteDatabase sQLiteDatabase, Executor executor, Executor executor2, efjq efjqVar) {
        this.a = sQLiteDatabase;
        this.d = executor;
        this.e = executor2;
        this.c = efjqVar;
    }

    private final void d() {
        if (this.b) {
            throw new IllegalStateException("Already closed");
        }
    }

    public final erph a(String str, Object[] objArr) {
        d();
        efjd efjdVar = new efjd(this, objArr, str);
        int i = efkb.a;
        efjz efjzVar = new efjz(efjdVar);
        efjzVar.e(this.d);
        return erph.b(efjzVar, erpp.a);
    }

    public final ListenableFuture b(final Callable callable) {
        d();
        errj errjVar = new errj(eldl.m(new Callable() { // from class: efja
            @Override // java.util.concurrent.Callable
            public final Object call() {
                efjh efjhVar = efjh.this;
                efjhVar.c.b();
                try {
                    return callable.call();
                } finally {
                    efjhVar.c.a();
                }
            }
        }));
        this.d.execute(errjVar);
        return errjVar;
    }

    public final ListenableFuture c(efkq efkqVar) {
        d();
        elae elaeVar = elad.a;
        final efks efksVar = new efks(this.a);
        ekzz g = eleg.g("Transaction", elaeVar);
        try {
            final errj errjVar = new errj(eldl.m(new efjf(this, efkqVar, efksVar)));
            this.e.execute(errjVar);
            errjVar.b(new Runnable() { // from class: efjc
                @Override // java.lang.Runnable
                public final void run() {
                    if (errj.this.isCancelled()) {
                        efksVar.a.cancel();
                    }
                }
            }, erpp.a);
            g.b(errjVar);
            g.close();
            return errjVar;
        } catch (Throwable th) {
            try {
                g.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
