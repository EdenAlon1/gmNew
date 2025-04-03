package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efiv {
    public final efjy a;

    public efiv(efjy efjyVar) {
        this.a = efjyVar;
    }

    public final erph a(final efkn efknVar) {
        return this.a.c().f(eldl.e(new erot() { // from class: efip
            @Override // defpackage.erot
            public final erph a(erpc erpcVar, Object obj) {
                efkn efknVar2 = efkn.this;
                return ((efjh) obj).a(efknVar2.a, efknVar2.b);
            }
        }), erpp.a);
    }

    public final erph b(final String str, final String[] strArr) {
        return this.a.c().f(eldl.e(new erot() { // from class: efiu
            @Override // defpackage.erot
            public final erph a(erpc erpcVar, Object obj) {
                return ((efjh) obj).a(str, strArr);
            }
        }), erpp.a);
    }

    public final ListenableFuture c(final efkn efknVar) {
        return this.a.c().f(eldl.e(new erot() { // from class: efiq
            @Override // defpackage.erot
            public final erph a(erpc erpcVar, Object obj) {
                final efjh efjhVar = (efjh) obj;
                efkn efknVar2 = efkn.this;
                final String str = efknVar2.a;
                ekzz f = eleg.f("ExecSQL: ".concat(str));
                final Object[] objArr = efknVar2.b;
                try {
                    ListenableFuture b = efjhVar.b(new Callable() { // from class: efiz
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            efjh.this.a.execSQL(str, objArr);
                            return null;
                        }
                    });
                    f.b(b);
                    f.close();
                    return new erph(b);
                } catch (Throwable th) {
                    try {
                        f.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        }), erpp.a).g();
    }

    public final ListenableFuture d(final efkq efkqVar) {
        return this.a.c().f(eldl.e(new erot() { // from class: efir
            @Override // defpackage.erot
            public final erph a(erpc erpcVar, Object obj) {
                return new erph(((efjh) obj).c(efkq.this));
            }
        }), erpp.a).g();
    }

    public final ListenableFuture e(final efkr efkrVar) {
        return this.a.c().f(eldl.e(new erot() { // from class: efit
            @Override // defpackage.erot
            public final erph a(erpc erpcVar, Object obj) {
                final efkr efkrVar2 = efkr.this;
                return new erph(((efjh) obj).c(new efkq() { // from class: efjb
                    @Override // defpackage.efkq
                    public final Object a(efks efksVar) {
                        efkr.this.a(efksVar);
                        return null;
                    }
                }));
            }
        }), erpp.a).g();
    }
}
