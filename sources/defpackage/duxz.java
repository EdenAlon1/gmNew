package defpackage;

import j$.util.Collection;
import j$.util.function.Predicate$CC;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class duxz extends duxy implements duyj {
    private final AtomicBoolean b;
    private final Class c;

    public duxz(Runnable runnable, Class cls) {
        super(runnable);
        this.b = new AtomicBoolean(false);
        this.c = cls;
    }

    @Override // defpackage.duxy
    public final synchronized void a(Executor executor) {
        this.b.set(false);
        duyi.a().d(this, this.c, dunl.b(executor));
    }

    @Override // defpackage.duyj
    public final void b(Class cls) {
        if (this.b.getAndSet(false)) {
            return;
        }
        duyb.b(String.valueOf(String.valueOf(cls)).concat(" component was already not ready"), false);
    }

    @Override // defpackage.duyj
    public final /* bridge */ /* synthetic */ void c(duyc duycVar) {
        duxx duxxVar = (duxx) duycVar;
        if (this.b.getAndSet(true)) {
            duyb.b(String.valueOf(String.valueOf(duxxVar.getClass())).concat(" component was already ready"), true);
        }
        d();
        this.a.run();
    }

    @Override // defpackage.duxy
    public final synchronized void d() {
        boolean z;
        final Class cls = this.c;
        duyi a = duyi.a();
        synchronized (cls) {
            WeakHashMap weakHashMap = (WeakHashMap) a.c.get(cls);
            z = false;
            if (weakHashMap != null) {
                duyk duykVar = (duyk) weakHashMap.remove(this);
                if (duykVar != null) {
                    duyp duypVar = duykVar.a;
                    synchronized (duypVar.e) {
                        if (duypVar.c) {
                            Collection.EL.removeIf(duypVar.e, new Predicate() { // from class: duym
                                public final /* synthetic */ Predicate and(Predicate predicate) {
                                    return Predicate$CC.$default$and(this, predicate);
                                }

                                @Override // java.util.function.Predicate
                                /* renamed from: negate */
                                public final /* synthetic */ Predicate mo439negate() {
                                    return Predicate$CC.$default$negate(this);
                                }

                                public final /* synthetic */ Predicate or(Predicate predicate) {
                                    return Predicate$CC.$default$or(this, predicate);
                                }

                                @Override // java.util.function.Predicate
                                public final boolean test(Object obj) {
                                    duyo duyoVar = (duyo) obj;
                                    enhk enhkVar = duyp.a;
                                    if (duyoVar.b == cls) {
                                        return duyoVar.d == this;
                                    }
                                    return false;
                                }
                            });
                        } else {
                            duypVar.e.clear();
                        }
                    }
                    z = true;
                }
                if (weakHashMap.isEmpty()) {
                    a.c.remove(cls);
                }
            }
        }
        if (z) {
            return;
        }
        ((enrr) ((enrr) duyi.a.j()).h("com/google/android/libraries/inputmethod/notificationcenter/NotificationCenter", "unregisterListener", 480, "NotificationCenter.java")).D("Listener %s was not registered for notification %s", this, cls);
    }
}
