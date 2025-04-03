package defpackage;

import android.util.LruCache;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cgvp {
    private ffrp f;
    private final Object e = new Object();
    public final AtomicReference a = new AtomicReference("");
    public final AtomicLong b = new AtomicLong(-1);
    public final Object c = new Object();
    public final LruCache d = new LruCache(50);

    public final ffrp a() {
        ffrq ffrqVar;
        synchronized (this.e) {
            ffud ffudVar = this.f;
            if (ffudVar != null) {
                ((ffuq) ffudVar).S(cgvo.a);
                this.f = null;
            }
            ffrqVar = new ffrq();
            this.f = ffrqVar;
        }
        return ffrqVar;
    }

    public final void b(cgvo cgvoVar) {
        cgvoVar.getClass();
        synchronized (this.e) {
            ffud ffudVar = this.f;
            if (ffudVar != null) {
                ((ffuq) ffudVar).S(cgvoVar);
            }
            this.f = null;
        }
    }
}
