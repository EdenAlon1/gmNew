package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axph {
    public final erog a;
    private final Executor d;
    private final elfk e = new elfk();
    public final AtomicLong b = new AtomicLong(Long.MIN_VALUE);
    public final AtomicLong c = new AtomicLong(Long.MIN_VALUE);

    public axph(erog erogVar, Executor executor) {
        this.a = erogVar;
        this.d = executor;
    }

    public final elfl a() {
        final long incrementAndGet = this.b.incrementAndGet();
        emxf.l(incrementAndGet != Long.MIN_VALUE);
        return elfl.g(this.e.a(new erog() { // from class: axpf
            @Override // defpackage.erog
            public final ListenableFuture a() {
                long j = incrementAndGet;
                final axph axphVar = axph.this;
                if (j <= axphVar.c.get()) {
                    return elfo.c();
                }
                AtomicLong atomicLong = axphVar.b;
                erog erogVar = axphVar.a;
                final long j2 = atomicLong.get();
                return elfl.g(erogVar.a()).h(new emwl() { // from class: axpg
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        axph.this.c.set(j2);
                        return obj;
                    }
                }, erpp.a);
            }
        }, this.d));
    }
}
