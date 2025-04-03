package defpackage;

import java.util.concurrent.locks.LockSupport;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ffqw extends ffqq {
    public final ffti b;
    private final Thread e;

    public ffqw(ffhd ffhdVar, Thread thread, ffti fftiVar) {
        super(ffhdVar, true);
        this.e = thread;
        this.b = fftiVar;
    }

    @Override // defpackage.ffuq
    protected final void hR(Object obj) {
        if (ffkj.e(Thread.currentThread(), this.e)) {
            return;
        }
        LockSupport.unpark(this.e);
    }

    @Override // defpackage.ffuq
    protected final boolean hS() {
        return true;
    }
}
