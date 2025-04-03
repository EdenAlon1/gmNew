package defpackage;

import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aqgb implements aqge, ctbj {
    public final Object a = new Object();
    public final AtomicReference b = new AtomicReference(Optional.empty());
    public final ctbl c;
    public final errl d;
    public final aqge e;
    private ctbx f;

    public aqgb(ctbk ctbkVar, errl errlVar, aqge aqgeVar) {
        this.c = ctbkVar.a(this);
        this.d = errlVar;
        this.e = aqgeVar;
        emxf.b(!(aqgeVar instanceof aqgb), "The underlying ObservableSupplier is already a LiveCache!");
    }

    @Override // defpackage.aqge
    public final ctbx a(final aqgd aqgdVar) {
        return this.c.a(new ctbf() { // from class: aqfy
            @Override // defpackage.ctbf
            public final elfl a(Object obj) {
                return aqgd.this.a();
            }
        }, "LiveCache::register", "LiveCache::callback", "LiveCache::unregister");
    }

    @Override // defpackage.aqge
    public final elfl b() {
        Optional map = ((Optional) this.b.get()).map(new Function() { // from class: aqfz
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return elfl.g(((ejlc) obj).c());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        final aqge aqgeVar = this.e;
        aqgeVar.getClass();
        return (elfl) map.orElseGet(new Supplier() { // from class: aqga
            @Override // java.util.function.Supplier
            public final Object get() {
                return aqge.this.b();
            }
        });
    }

    @Override // defpackage.aqge
    public final Object c() {
        Optional optional = (Optional) this.b.get();
        if (optional.isPresent() && ((ejlc) optional.get()).e()) {
            try {
                return erqt.q(((ejlc) optional.get()).c());
            } catch (ExecutionException unused) {
            }
        }
        return this.e.c();
    }

    @Override // defpackage.ctbj
    public final void fN() {
        boolean z;
        synchronized (this.a) {
            this.f = this.e.a(new aqgd() { // from class: aqfv
                @Override // defpackage.aqgd
                public final elfl a() {
                    aqgb aqgbVar = aqgb.this;
                    synchronized (aqgbVar.a) {
                        if (((Optional) aqgbVar.b.get()).isEmpty()) {
                            return elfo.e(null);
                        }
                        AtomicReference atomicReference = aqgbVar.b;
                        aqge aqgeVar = aqgbVar.e;
                        aqgeVar.getClass();
                        atomicReference.set(Optional.of(new ejlc(new aqfw(aqgeVar), aqgbVar.d)));
                        aqgbVar.c.c(new Supplier() { // from class: aqfx
                            @Override // java.util.function.Supplier
                            public final Object get() {
                                return null;
                            }
                        }, "changeValue");
                        return elfo.e(null);
                    }
                }
            });
            AtomicReference atomicReference = this.b;
            Optional empty = Optional.empty();
            aqge aqgeVar = this.e;
            aqgeVar.getClass();
            Optional of = Optional.of(new ejlc(new aqfw(aqgeVar), this.d));
            while (true) {
                if (atomicReference.compareAndSet(empty, of)) {
                    z = true;
                    break;
                } else if (atomicReference.get() != empty) {
                    z = false;
                    break;
                }
            }
            emxf.m(z, "Unexpected initializing future found!");
        }
    }

    @Override // defpackage.ctbj
    public final void fO() {
        synchronized (this.a) {
            emxf.m(((Optional) this.b.getAndSet(Optional.empty())).isPresent(), "Unexpectedly missing initializing future!");
        }
        ctbx ctbxVar = this.f;
        ctbxVar.getClass();
        ctbxVar.a();
        this.f = null;
    }
}
