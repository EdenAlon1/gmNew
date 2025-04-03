package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejlc {
    public final ejkz a;
    public final SettableFuture d;
    public final AtomicLong b = new AtomicLong(b(Integer.MIN_VALUE, Integer.MIN_VALUE));
    public final AtomicReference c = new AtomicReference(null);
    private final AtomicReference e = new AtomicReference(null);
    private final Executor f = new ersb(erpp.a);

    public ejlc(erog erogVar, Executor executor) {
        SettableFuture create = SettableFuture.create();
        this.d = create;
        ejkz ejkzVar = new ejkz(erogVar, executor);
        this.a = ejkzVar;
        create.b(ejkzVar, erpp.a);
    }

    public static int a(long j) {
        return (int) (j >>> 32);
    }

    public static long b(int i, int i2) {
        return (i2 & 4294967295L) | (i << 32);
    }

    public final ListenableFuture c() {
        long j;
        final int a;
        if (this.d.isDone()) {
            return this.d;
        }
        do {
            j = this.b.get();
            a = a(j);
        } while (!this.b.compareAndSet(j, b(a, ((int) j) + 1)));
        AtomicReference atomicReference = this.e;
        final SettableFuture create = SettableFuture.create();
        ListenableFuture listenableFuture = (ListenableFuture) atomicReference.getAndSet(create);
        create.m(listenableFuture == null ? erqt.n(eldl.c(new erog() { // from class: ejkw
            @Override // defpackage.erog
            public final ListenableFuture a() {
                return ejlc.this.d(a);
            }
        }), erpp.a) : ernq.g(listenableFuture, Throwable.class, eldl.d(new eroh() { // from class: ejkx
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return ejlc.this.d(a);
            }
        }), this.f));
        final ejla ejlaVar = new ejla(this, a);
        create.b(new Runnable() { // from class: ejky
            @Override // java.lang.Runnable
            public final void run() {
                ejla ejlaVar2 = ejlaVar;
                SettableFuture settableFuture = create;
                try {
                    Object q = erqt.q(settableFuture);
                    ejlc ejlcVar = ejlc.this;
                    ejlcVar.d.set(q);
                    ejlaVar2.m(ejlcVar.d);
                } catch (Throwable unused) {
                    ejlaVar2.m(settableFuture);
                }
            }
        }, erpp.a);
        return ejlaVar;
    }

    public final ListenableFuture d(int i) {
        ejlb ejlbVar;
        if (a(this.b.get()) > i) {
            return erqt.g();
        }
        ejlb ejlbVar2 = new ejlb(i);
        do {
            ejlbVar = (ejlb) this.c.get();
            if (ejlbVar != null && ejlbVar.a > i) {
                return erqt.g();
            }
        } while (!ejkv.a(this.c, ejlbVar, ejlbVar2));
        if (a(this.b.get()) > i) {
            ejlbVar2.cancel(true);
            ejkv.a(this.c, ejlbVar2, null);
            return ejlbVar2;
        }
        ejkz ejkzVar = this.a;
        erog erogVar = ejkzVar.a;
        Executor executor = ejkzVar.b;
        if (erogVar == null || executor == null) {
            ejlbVar2.m(this.d);
            return ejlbVar2;
        }
        ejlbVar2.m(erqt.n(eldl.c(erogVar), executor));
        return ejlbVar2;
    }

    public final boolean e() {
        return this.d.isDone();
    }
}
