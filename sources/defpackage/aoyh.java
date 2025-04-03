package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aoyh implements alyn {
    public final List a = new ArrayList();
    private final aqux b;
    private final alyt c;
    private final ffbr d;
    private final AtomicReference e;

    public aoyh(aqux aquxVar, alxo alxoVar, alyt alytVar, ffbr ffbrVar) {
        this.b = aquxVar;
        this.c = alytVar;
        this.d = ffbrVar;
        this.e = new AtomicReference(alxoVar);
    }

    @Override // defpackage.alyo
    public final alxo a() {
        return (alxo) this.e.get();
    }

    @Override // defpackage.alyo
    public final alyt b() {
        return this.c;
    }

    @Override // defpackage.alyn
    public final aqux c() {
        return this.b;
    }

    @Override // defpackage.alya
    public final /* synthetic */ int d() {
        return 2;
    }

    public final void e(alxo alxoVar) {
        engw<zvl> a;
        alxo a2 = a();
        if (!a2.a(alxoVar)) {
            return;
        }
        AtomicReference atomicReference = this.e;
        while (!atomicReference.compareAndSet(a2, alxoVar)) {
            if (atomicReference.get() != a2) {
                return;
            }
        }
        synchronized (this.a) {
            a = engq.a(this.a);
        }
        for (zvl zvlVar : a) {
            zvlVar.a.b(zvlVar.b);
        }
        if (alxoVar.b()) {
            synchronized (this.a) {
                this.a.clear();
            }
        }
    }

    public final ctbx f(final zvl zvlVar) {
        if (a().b()) {
            return ctbx.d;
        }
        synchronized (this.a) {
            this.a.add(zvlVar);
        }
        return new ctbx() { // from class: aoyg
            @Override // defpackage.ctbx
            public final void a() {
                zvl zvlVar2 = zvlVar;
                aoyh aoyhVar = aoyh.this;
                synchronized (aoyhVar.a) {
                    aoyhVar.a.remove(zvlVar2);
                }
            }

            @Override // defpackage.ctbx, java.io.Closeable, java.lang.AutoCloseable
            public final /* synthetic */ void close() {
                ctbw.a(this);
            }
        };
    }
}
