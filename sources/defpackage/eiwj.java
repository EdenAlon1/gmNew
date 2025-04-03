package defpackage;

import android.content.Intent;
import android.util.Pair;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eiwj {
    public final eiyk a;
    public final Set b;
    private final Map c;
    private final Map d;
    private final Map e;
    private final eivc f;

    public eiwj(eiyk eiykVar, Map map, Map map2, Map map3, Set set, eivc eivcVar) {
        this.a = eiykVar;
        this.c = map;
        this.d = map2;
        this.e = map3;
        this.b = set;
        this.f = eivcVar;
        Boolean bool = false;
        bool.getClass();
    }

    final engw a(List list) {
        if (list == null) {
            return this.f.e();
        }
        if (list.isEmpty()) {
            return enou.a;
        }
        engr d = engw.d(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ffbr ffbrVar = (ffbr) this.e.get((Class) it.next());
            ffbrVar.getClass();
            d.h((eiuz) ffbrVar.b());
        }
        return d.g();
    }

    final ListenableFuture b(final eisx eisxVar, final List list, final Intent intent, final eitk eitkVar) {
        return erny.g(this.a.a(eisxVar), eldl.d(new eroh() { // from class: eivz
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return eiwj.this.e(eisxVar, list, intent, eitkVar);
            }
        }), erpp.a);
    }

    final ListenableFuture c(final ListenableFuture listenableFuture, final List list, final Intent intent) {
        return erny.g(listenableFuture, eldl.d(new eroh() { // from class: eiwc
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                eisx eisxVar;
                eitn eitnVar = (eitn) obj;
                if (eitnVar.c != null || (eisxVar = eitnVar.a) == null) {
                    return listenableFuture;
                }
                return eiwj.this.e(eisxVar, list, intent, eitnVar.e);
            }
        }), erpp.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    final ListenableFuture d(final eivr eivrVar, List list, final eitk eitkVar) {
        Object obj;
        ArrayList arrayList = new ArrayList(((enou) list).c);
        enqv it = ((engw) list).iterator();
        while (it.hasNext()) {
            Class cls = (Class) it.next();
            if (eivo.class.isAssignableFrom(cls)) {
                emxf.p(!eivq.class.isAssignableFrom(cls), "An account selector should only implement either AutoSelectorKey or InteractiveSelectorKey, but not both. Found %s that implements both keys", cls);
                emxf.p(this.c.containsKey(cls), "Selector with key: [%s] not found, did you forget to include the module providing the selector for this key?", cls);
                obj = this.c.get(cls);
            } else {
                if (!eivq.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("No selector registered for key: ".concat(String.valueOf(String.valueOf(cls))));
                }
                emxf.p(!eivo.class.isAssignableFrom(cls), "An account selector should only implement either AutoSelectorKey or InteractiveSelectorKey, but not both. Found %s that implements both keys", cls);
                emxf.p(this.d.containsKey(cls), "Selector with key: [%s] not found, did you forget to include the module providing the selector for this key?", cls);
                obj = this.d.get(cls);
            }
            final ffbr ffbrVar = (ffbr) obj;
            arrayList.add(new erog() { // from class: eiwb
                @Override // defpackage.erog
                public final ListenableFuture a() {
                    final eivl eivlVar = (eivl) ffbr.this.b();
                    return erny.f(eivlVar.a(eivrVar), new emwl() { // from class: eiwa
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            return Pair.create(eivl.this, obj2);
                        }
                    }, erpp.a);
                }
            });
        }
        return erny.g(eixg.a(arrayList, new emxg() { // from class: eiwd
            @Override // defpackage.emxg
            public final boolean a(Object obj2) {
                return ((Pair) obj2).second != null;
            }
        }, erpp.a), eldl.d(new eroh() { // from class: eiwe
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj2) {
                ListenableFuture g;
                Pair pair = (Pair) obj2;
                ekzz f = eleg.f("AccountUiService handle selection result");
                final eiwj eiwjVar = eiwj.this;
                final eitk eitkVar2 = eitkVar;
                if (pair != null) {
                    try {
                        if (pair.first instanceof eivp) {
                            g = erny.f(((eivp) pair.first).b((Intent) pair.second), eldl.a(new emwl() { // from class: eiwf
                                @Override // defpackage.emwl
                                public final Object apply(Object obj3) {
                                    Intent intent = (Intent) obj3;
                                    ekzz f2 = eleg.f("AccountUiService useIntent");
                                    try {
                                        eitn eitnVar = new eitn(null, eixz.a, null, intent, eitk.this);
                                        f2.close();
                                        return eitnVar;
                                    } finally {
                                    }
                                }
                            }), erpp.a);
                            f.b(g);
                        } else if (pair.first instanceof eivn) {
                            final eisx eisxVar = (eisx) pair.second;
                            final eivn eivnVar = (eivn) pair.first;
                            g = erny.g(eiwjVar.a.c(eisxVar), eldl.d(new eroh() { // from class: eivy
                                @Override // defpackage.eroh
                                public final ListenableFuture a(Object obj3) {
                                    eixn eixnVar = (eixn) obj3;
                                    boolean contains = eiwj.this.b.contains(eixnVar.b().k);
                                    eivn eivnVar2 = eivnVar;
                                    final eisx eisxVar2 = eisxVar;
                                    if (!contains) {
                                        emxf.m(eixnVar.c() != 3, "Can't auto-select disabled accounts.");
                                    }
                                    final eitk eitkVar3 = eitkVar2;
                                    emxf.m(eitkVar3.a.compareAndSet(false, true), "AccountOperationContext is already in the mutable state. This may be caused by concurrent access to the object, which is forbidden.");
                                    eitj eitjVar = new eitj(eitkVar3);
                                    try {
                                        ListenableFuture c = eivnVar2.c(eisxVar2);
                                        eitjVar.close();
                                        return erny.f(c, eldl.a(new emwl() { // from class: eiwi
                                            @Override // defpackage.emwl
                                            public final Object apply(Object obj4) {
                                                ekzz f2 = eleg.f("AccountUiService useAccount");
                                                eitk eitkVar4 = eitkVar3;
                                                try {
                                                    eitn eitnVar = new eitn(eisx.this, eixz.a, null, null, eitkVar4);
                                                    f2.close();
                                                    return eitnVar;
                                                } finally {
                                                }
                                            }
                                        }), erpp.a);
                                    } catch (Throwable th) {
                                        try {
                                            eitjVar.close();
                                        } catch (Throwable th2) {
                                            th.addSuppressed(th2);
                                        }
                                        throw th;
                                    }
                                }
                            }), erpp.a);
                            f.b(g);
                        }
                        f.close();
                        return g;
                    } finally {
                    }
                }
                g = erqt.i(new eitn(null, eixz.a, null, null, eitkVar2));
                f.b(g);
                f.close();
                return g;
            }
        }), erpp.a);
    }

    final ListenableFuture e(final eisx eisxVar, List list, Intent intent, final eitk eitkVar) {
        return erny.g(this.f.g(eisxVar, a(list), intent), eldl.d(new eroh() { // from class: eiwg
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final eixm eixmVar = (eixm) obj;
                boolean c = eixmVar.c();
                eisx eisxVar2 = eisxVar;
                final eitk eitkVar2 = eitkVar;
                if (c) {
                    return erny.f(eiwj.this.a.c(eisxVar2), eldl.a(new emwl() { // from class: eiwh
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            eixn eixnVar = (eixn) obj2;
                            eisx a = eixnVar.a();
                            eixz b = eixnVar.b();
                            eixm eixmVar2 = eixm.this;
                            emxf.m(eixmVar2.c(), "Trying to propagate AccountInfo for invalid account.");
                            return new eitn(a, b, eixmVar2, null, eitkVar2);
                        }
                    }), erpp.a);
                }
                emxf.l(!eixmVar.c());
                return erqt.i(new eitn(eisxVar2, eixz.a, eixmVar, null, eitkVar2));
            }
        }), erpp.a);
    }
}
