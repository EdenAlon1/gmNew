package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Instant;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejvb {
    public final ejvr a;
    public final dlpw b;

    public ejvb(ejvr ejvrVar, dlpw dlpwVar) {
        this.a = ejvrVar;
        this.b = dlpwVar;
    }

    public static ejuh a(ejuh ejuhVar, ejuh ejuhVar2, ejke ejkeVar, Executor executor) {
        return new ejus(ejuhVar, ejuhVar2, new ejuo(ejkeVar), executor);
    }

    public static boolean c(ejug ejugVar, ejwa ejwaVar, Instant instant) {
        return ejugVar.f() && ejugVar.g() && ejugVar.d().isAfter(instant.minus(ejwaVar.k));
    }

    public static final erph d(ejuh ejuhVar, String str) {
        ekzz f = eleg.f(str);
        try {
            erph a = ejuhVar.a();
            f.a(a);
            f.close();
            return a;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final ListenableFuture b(final ejuh ejuhVar, final ejwa ejwaVar) {
        ekzz f = eleg.f("getDataAsFuture");
        try {
            final Instant f2 = this.b.f();
            erph f3 = d(ejuhVar, "First load").f(eldl.e(new erot() { // from class: ejup
                @Override // defpackage.erot
                public final erph a(erpc erpcVar, Object obj) {
                    ejug ejugVar = (ejug) obj;
                    final ejwa ejwaVar2 = ejwaVar;
                    final Instant instant = f2;
                    boolean c = ejvb.c(ejugVar, ejwaVar2, instant);
                    final ejuh ejuhVar2 = ejuhVar;
                    if (c) {
                        return new erph(erqt.i(ejugVar.e()));
                    }
                    ekzz f4 = eleg.f("getDataAsFuture fetch");
                    try {
                        ListenableFuture b = ejuhVar2.b();
                        f4.b(b);
                        ejvb ejvbVar = ejvb.this;
                        f4.close();
                        ejvbVar.a.a(b, ejuhVar2.c());
                        return new erph(b).f(eldl.e(new erot() { // from class: ejum
                            @Override // defpackage.erot
                            public final erph a(erpc erpcVar2, Object obj2) {
                                return ejvb.d(ejuh.this, "Second load");
                            }
                        }), erpp.a).e(eldl.g(new erow() { // from class: ejun
                            @Override // defpackage.erow
                            public final Object a(erpc erpcVar2, Object obj2) {
                                ejug ejugVar2 = (ejug) obj2;
                                if (ejvb.c(ejugVar2, ejwa.this, instant)) {
                                    return ejugVar2.e();
                                }
                                throw new IllegalStateException("fetchAndStore() did not produce a cache hit");
                            }
                        }), erpp.a);
                    } catch (Throwable th) {
                        try {
                            f4.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
            }), erpp.a);
            f.a(f3);
            erqc g = f3.e(new erow() { // from class: ejuq
                @Override // defpackage.erow
                public final Object a(erpc erpcVar, Object obj) {
                    return eldl.a(emwo.a).apply(obj);
                }
            }, erpp.a).g();
            f.close();
            return g;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
