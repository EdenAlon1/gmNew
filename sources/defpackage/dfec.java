package defpackage;

import android.content.Context;
import android.util.Log;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfec extends lov {
    private final Semaphore j;
    private final Set k;

    public dfec(Context context, Set set) {
        super(context);
        this.j = new Semaphore(0);
        this.k = set;
    }

    @Override // defpackage.lov
    public final /* bridge */ /* synthetic */ Object a() {
        Iterator it = this.k.iterator();
        if (it.hasNext()) {
            throw new UnsupportedOperationException();
        }
        try {
            this.j.tryAcquire(0, 5L, TimeUnit.SECONDS);
            return null;
        } catch (InterruptedException e) {
            Log.i("GACSignInLoader", "Unexpected InterruptedException", e);
            Thread.currentThread().interrupt();
            return null;
        }
    }

    @Override // defpackage.lox
    protected final void m() {
        this.j.drainPermits();
        f();
    }
}
