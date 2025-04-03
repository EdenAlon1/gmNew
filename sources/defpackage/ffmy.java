package defpackage;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffmy implements ffnl {
    private final AtomicReference a;

    public ffmy(ffnl ffnlVar) {
        this.a = new AtomicReference(ffnlVar);
    }

    @Override // defpackage.ffnl
    public final Iterator a() {
        ffnl ffnlVar = (ffnl) this.a.getAndSet(null);
        if (ffnlVar != null) {
            return ffnlVar.a();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
