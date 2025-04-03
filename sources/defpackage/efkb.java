package defpackage;

import android.os.CancellationSignal;
import android.util.Log;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class efkb extends ernr implements Runnable {
    public static final /* synthetic */ int a = 0;
    private final efka b;

    public efkb(efka efkaVar) {
        this.b = efkaVar;
    }

    protected abstract void d(efka efkaVar);

    public final void e(Executor executor) {
        executor.execute(eldl.l(this));
    }

    @Override // defpackage.ernr
    public final String gP() {
        return "query=[" + this.b.b() + "]";
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (isCancelled()) {
            return;
        }
        try {
            if (Log.isLoggable("ASQLDB", 2)) {
                this.b.c();
                Log.v("ASQLDB", "The query's result is currently:");
                Log.v("ASQLDB", efks.e(this.b.a(new CancellationSignal())));
                Log.v("ASQLDB", "NOTE(b/171271240): If another thread commits in parallel with this query, the printed debug result above might be from an earlier snapshot than this query's Future<Cursor> iterates.");
            }
            ekzz f = eleg.f("Query: " + this.b.b());
            try {
                d(this.b);
                f.close();
            } finally {
            }
        } catch (Throwable th) {
            setException(th);
        }
    }
}
