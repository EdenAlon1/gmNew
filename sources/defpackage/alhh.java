package defpackage;

import j$.util.function.Function$CC;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class alhh {
    private final alhi a;
    private final Executor b;
    public final ffbr f;

    protected alhh(ffbr ffbrVar, alhi alhiVar, Executor executor) {
        this.f = ffbrVar;
        this.a = alhiVar;
        this.b = executor;
    }

    public abstract BiConsumer a();

    public final elfl l(final Supplier supplier) {
        return elfo.g(new Callable() { // from class: alhg
            @Override // java.util.concurrent.Callable
            public final Object call() {
                final alhh alhhVar = alhh.this;
                alhj alhjVar = (alhj) alhhVar.f.b();
                final Supplier supplier2 = supplier;
                return Boolean.valueOf(alhjVar.a(new Supplier() { // from class: alhf
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        Object obj;
                        obj = supplier2.get();
                        return alhh.this.m((eyhs) obj);
                    }
                }));
            }
        }, this.b);
    }

    public final eolu m(eyhs eyhsVar) {
        return n(eyhsVar, Function$CC.identity());
    }

    public final eolu n(eyhs eyhsVar, Function function) {
        Object obj;
        Object apply;
        obj = this.a.c().get();
        apply = function.apply((eyhr) obj);
        eyhr eyhrVar = (eyhr) apply;
        a().accept(eyhrVar, eyhsVar);
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eolt a = this.a.a();
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eolvVar.j = a.dk;
        eolvVar.b |= 1;
        this.a.b().accept(eoluVar, eyhrVar);
        return eoluVar;
    }

    public final void o(final Supplier supplier) {
        ((alhj) this.f.b()).a(new Supplier() { // from class: alhe
            @Override // java.util.function.Supplier
            public final Object get() {
                Object obj;
                obj = supplier.get();
                return alhh.this.m((eyhs) obj);
            }
        });
    }

    protected final void p(final Supplier supplier, final Function function) {
        ((alhj) this.f.b()).a(new Supplier() { // from class: alhd
            @Override // java.util.function.Supplier
            public final Object get() {
                Object obj;
                obj = supplier.get();
                return alhh.this.n((eyhs) obj, function);
            }
        });
    }
}
