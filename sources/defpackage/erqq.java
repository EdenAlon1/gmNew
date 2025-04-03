package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erqq extends ernr {
    private erqr a;

    public erqq(erqr erqrVar) {
        this.a = erqrVar;
    }

    @Override // defpackage.ernr, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        erqr erqrVar = this.a;
        if (!super.cancel(z)) {
            return false;
        }
        erqrVar.getClass();
        erqrVar.a = true;
        if (!z) {
            erqrVar.b = false;
        }
        erqrVar.a();
        return true;
    }

    @Override // defpackage.ernr
    protected final String gP() {
        erqr erqrVar = this.a;
        if (erqrVar == null) {
            return null;
        }
        ListenableFuture[] listenableFutureArr = erqrVar.d;
        AtomicInteger atomicInteger = erqrVar.c;
        return "inputCount=[" + listenableFutureArr.length + "], remaining=[" + atomicInteger.get() + "]";
    }

    @Override // defpackage.ernr
    protected final void gQ() {
        this.a = null;
    }
}
