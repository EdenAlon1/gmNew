package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddya extends we {
    private final ffbr d;
    private ksv e;
    private int h;
    private final AtomicInteger f = new AtomicInteger();
    private final AtomicInteger g = new AtomicInteger();
    private boolean i = true;

    public ddya(ffbr ffbrVar) {
        this.d = ffbrVar;
    }

    @Override // defpackage.we
    public final wr b(int i) {
        this.e.getClass();
        if (this.i) {
            ((aemg) this.d.b()).a(aemg.c);
            this.i = false;
        }
        if (this.h == i) {
            wr wrVar = (wr) this.e.a();
            if (wrVar != null) {
                this.f.incrementAndGet();
                return wrVar;
            }
            this.g.incrementAndGet();
        }
        return super.b(i);
    }

    @Override // defpackage.we
    public final void e(wr wrVar) {
        ksv ksvVar = this.e;
        ksvVar.getClass();
        if (this.h == wrVar.f && ksvVar.b(wrVar)) {
            return;
        }
        super.e(wrVar);
    }

    public final void h(int i, int i2) {
        this.e = new ksv(i);
        this.h = i2;
    }
}
