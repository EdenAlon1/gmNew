package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgim {
    public final ffql c;
    public final ffql d;
    private final AtomicReferenceArray e = new AtomicReferenceArray(128);
    public final ffqn a = new ffqn(null, ffqo.a);
    public final ffql b = new ffql(0, ffqo.a);

    public fgim() {
        ffqo ffqoVar = ffqo.a;
        this.c = new ffql(0, ffqoVar);
        this.d = new ffql(0, ffqoVar);
    }

    public final int a() {
        return this.b.c - this.c.c;
    }

    public final fgii b(fgii fgiiVar) {
        if (a() == 127) {
            return fgiiVar;
        }
        if (fgiiVar.h) {
            this.d.b();
        }
        int i = this.b.c & 127;
        while (this.e.get(i) != null) {
            Thread.yield();
        }
        this.e.lazySet(i, fgiiVar);
        this.b.b();
        return null;
    }

    public final fgii c() {
        fgii fgiiVar;
        while (true) {
            ffql ffqlVar = this.c;
            ffql ffqlVar2 = this.b;
            int i = ffqlVar.c;
            if (i - ffqlVar2.c == 0) {
                return null;
            }
            int i2 = i & 127;
            if (this.c.c(i, i + 1) && (fgiiVar = (fgii) this.e.getAndSet(i2, null)) != null) {
                if (fgiiVar.h) {
                    this.d.a();
                    boolean z = ffso.a;
                }
                return fgiiVar;
            }
        }
    }

    public final fgii d(int i, boolean z) {
        int i2 = i & 127;
        fgii fgiiVar = (fgii) this.e.get(i2);
        if (fgiiVar != null && fgiiVar.h == z) {
            AtomicReferenceArray atomicReferenceArray = this.e;
            while (!atomicReferenceArray.compareAndSet(i2, fgiiVar, null)) {
                if (atomicReferenceArray.get(i2) != fgiiVar) {
                }
            }
            if (z) {
                this.d.a();
            }
            return fgiiVar;
        }
        return null;
    }
}
