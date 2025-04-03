package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctbl {
    public final ctbj a;
    public final Object b = new Object();
    public final IdentityHashMap c = new IdentityHashMap();
    private final errl d;

    public ctbl(errl errlVar, ctbj ctbjVar) {
        this.d = errlVar;
        this.a = ctbjVar;
    }

    public final ctbx a(final ctbf ctbfVar, String str, String str2, final String str3) {
        ekzz f = eleg.f(str);
        try {
            ctbfVar.getClass();
            cqoq cqoqVar = new cqoq(str2);
            synchronized (this.b) {
                if (this.c.isEmpty()) {
                    this.a.fN();
                }
                emxf.m(this.c.put(ctbfVar, cqoqVar) == null, "Callback was double-registered");
            }
            ctbx ctbxVar = new ctbx() { // from class: ctbg
                @Override // defpackage.ctbx
                public final void a() {
                    ekzz f2 = eleg.f(str3);
                    ctbf ctbfVar2 = ctbfVar;
                    ctbl ctblVar = ctbl.this;
                    try {
                        eleg.d();
                        synchronized (ctblVar.b) {
                            emxf.m(ctblVar.c.remove(ctbfVar2) != null, "Callback was double-unregistered");
                            if (ctblVar.c.isEmpty()) {
                                ctblVar.a.fO();
                            }
                        }
                        f2.close();
                    } catch (Throwable th) {
                        try {
                            f2.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }

                @Override // defpackage.ctbx, java.io.Closeable, java.lang.AutoCloseable
                public final /* synthetic */ void close() {
                    ctbw.a(this);
                }
            };
            f.close();
            return ctbxVar;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void b(final Object obj, ekzz ekzzVar) {
        final engw engwVar;
        eleg.d();
        synchronized (this.b) {
            if (this.c.isEmpty()) {
                int i = engw.d;
                engwVar = enou.a;
            } else {
                Stream map = Collection.EL.stream(enhk.j(this.c).entrySet()).map(new Function() { // from class: ctbi
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        Map.Entry entry = (Map.Entry) obj2;
                        ekzz a = ((cqor) entry.getValue()).a();
                        try {
                            elfl a2 = ((ctbf) entry.getKey()).a(obj);
                            a.b(a2);
                            a.close();
                            return a2;
                        } catch (Throwable th) {
                            try {
                                a.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                int i2 = engw.d;
                engwVar = (engw) map.collect(endq.a);
            }
        }
        if (engwVar.isEmpty()) {
            return;
        }
        elfl h = elfo.h(new erog() { // from class: ctbh
            @Override // defpackage.erog
            public final ListenableFuture a() {
                return elfo.a(engw.this);
            }
        }, this.d);
        ekzzVar.b(h);
        axnw.h(h);
    }

    public final void c(Supplier supplier, String str) {
        Object obj;
        ekzz f = eleg.f(str);
        try {
            obj = supplier.get();
            b(obj, f);
            f.close();
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
