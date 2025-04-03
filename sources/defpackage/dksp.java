package defpackage;

import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Consumer$CC;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dksp {
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    private volatile Optional b = Optional.empty();

    public static final void c(final dkso dksoVar, final Object obj) {
        Object apply;
        Function d = dksoVar.d();
        if (d != null) {
            apply = d.apply(obj);
            if (!((Boolean) apply).booleanValue()) {
                return;
            }
        }
        dksoVar.c().execute(eldl.l(new Runnable() { // from class: dksk
            @Override // java.lang.Runnable
            public final void run() {
                dkso.this.a().a(obj);
            }
        }));
    }

    private final void e(Object obj) {
        Iterator it = this.a.values().iterator();
        while (it.hasNext()) {
            c((dkso) it.next(), obj);
        }
    }

    private final synchronized void f(Object obj) {
        this.b = Optional.ofNullable(obj);
        e(obj);
    }

    public final void a(final dkso dksoVar) {
        dkse dkseVar = (dkse) dksoVar;
        if (this.a.containsKey(dkseVar.b)) {
            return;
        }
        this.a.put(dkseVar.b, dksoVar);
        if (dkseVar.a) {
            this.b.ifPresent(new Consumer() { // from class: dksl
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    dksp.c(dkso.this, obj);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
    }

    public final void b(Object obj) {
        if (ersy.a("cslib.enable_synchronized_update_value_flag", "cslib")) {
            f(obj);
        } else {
            this.b = Optional.ofNullable(obj);
            e(obj);
        }
    }

    public final void d(Object obj) {
        this.a.remove(obj);
    }
}
