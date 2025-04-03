package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Instant;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ejus implements ejuh {
    final /* synthetic */ ejuh a;
    final /* synthetic */ ejuh b;
    final /* synthetic */ ejkd c;
    final /* synthetic */ Executor d;
    private final Object e;

    public ejus(ejuh ejuhVar, ejuh ejuhVar2, ejkd ejkdVar, Executor executor) {
        this.a = ejuhVar;
        this.b = ejuhVar2;
        this.c = ejkdVar;
        this.d = executor;
        Object obj = ((ejuy) ejuhVar).b;
        obj.getClass();
        Object obj2 = ((ejuy) ejuhVar2).b;
        obj2.getClass();
        emxf.b(true, "Cannot create a parent key without child keys");
        this.e = new ejtu(enip.p(new Object[]{obj, obj2}));
    }

    @Override // defpackage.ejuh
    public final erph a() {
        final erph a = this.a.a();
        final erph a2 = this.b.a();
        erpa erpaVar = new erpa(a, a2);
        final ejkd ejkdVar = this.c;
        return erpaVar.a(eldl.h(new eroz() { // from class: ejur
            @Override // defpackage.eroz
            public final erph a(erpc erpcVar, erpd erpdVar) {
                ejva ejvaVar = new ejva(ejkd.this);
                final ejug ejugVar = (ejug) erpdVar.a(a);
                final ejug ejugVar2 = (ejug) erpdVar.a(a2);
                if (!ejugVar.f() || !ejugVar2.f()) {
                    return new erph(erqt.i(ejug.a));
                }
                ejkd ejkdVar2 = ejvaVar.a;
                erph erphVar = new erph(erqt.i(((ejuo) ejkdVar2).a.a(ejugVar.e(), ejugVar2.e())));
                final boolean z = false;
                if (ejugVar.g() && ejugVar2.g()) {
                    z = true;
                }
                return erphVar.e(eldl.g(new erow() { // from class: ejuz
                    @Override // defpackage.erow
                    public final Object a(erpc erpcVar2, Object obj) {
                        if (!z) {
                            return ejug.b(obj);
                        }
                        return ejug.a(obj, (Instant) enej.a(ejugVar.d(), ejugVar2.d()));
                    }
                }), erpp.a);
            }
        }), this.d);
    }

    @Override // defpackage.ejuh
    public final ListenableFuture b() {
        ListenableFuture listenableFuture = erre.a;
        return erqt.f(listenableFuture, listenableFuture);
    }

    @Override // defpackage.ejuh
    public final Object c() {
        return this.e;
    }

    public final String toString() {
        ejuh ejuhVar = this.b;
        return "DataSources.combine(" + this.a.toString() + ", " + ejuhVar.toString() + ")";
    }
}
