package defpackage;

import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkgw {
    public static final /* synthetic */ int b = 0;
    private static final dktn c = new dktn("ImsServiceManager");
    private static final diyy d = dizd.a(177222621);
    public final List a;
    private volatile boolean e;
    private final dktn f;

    public dkgw() {
        this.a = ((Boolean) d.a()).booleanValue() ? new CopyOnWriteArrayList() : new ArrayList(12);
        this.e = false;
        this.f = c;
    }

    public final dkgm a(Class cls) {
        for (dkgm dkgmVar : this.a) {
            if (cls.isInstance(dkgmVar)) {
                return (dkgm) cls.cast(dkgmVar);
            }
        }
        return null;
    }

    public final dkgm b(Class cls) {
        dkgm a = a(cls);
        if (a != null) {
            return a;
        }
        throw new dkqr(1, "Service not available: ".concat(String.valueOf(cls.getName())));
    }

    public final Optional c(final String str) {
        if (str == null) {
            dkty.k("No session can be found for null callId", new Object[0]);
            return Optional.empty();
        }
        Optional findAny = Collection.EL.stream(this.a).flatMap(new Function() { // from class: dkgs
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                dkgm dkgmVar = (dkgm) obj;
                dkhc dkhcVar = dkgmVar.c;
                int i = dkgw.b;
                return Collection.EL.stream(dkhcVar.b(dkgmVar));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).filter(new Predicate() { // from class: dkgt
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
                int i = dkgw.b;
                return str.equals(((dkha) obj).l.a);
            }
        }).findAny();
        if (findAny.isEmpty()) {
            dkty.k("No session can be found for callId: %s", str);
        }
        return findAny;
    }

    public final Optional d(final String str) {
        return str == null ? Optional.empty() : Collection.EL.stream(this.a).flatMap(new Function() { // from class: dkgq
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                int i = dkgw.b;
                return Collection.EL.stream(((dkgm) obj).d.a);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).filter(new Predicate() { // from class: dkgr
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
                int i = dkgw.b;
                return str.equals(((dkhi) obj).e.a);
            }
        }).findAny();
    }

    public final void e(dkgm dkgmVar) {
        this.a.add(dkgmVar);
    }

    public final synchronized void f() {
        if (this.e) {
            dkty.r(this.f, "Services already started", new Object[0]);
            return;
        }
        this.e = true;
        for (dkgm dkgmVar : this.a) {
            String name = dkgmVar.getClass().getName();
            dkty.d(this.f, "Start IMS service: %s", name);
            try {
                dkgmVar.j();
            } catch (Exception e) {
                dkty.j(e, this.f, "Error while starting service: %s", name);
            }
        }
    }

    public final synchronized void g(dilc dilcVar) {
        if (!this.e) {
            dkty.d(this.f, "Not stopping, services already stopped", new Object[0]);
            return;
        }
        dkty.d(this.f, "Stopping all IMS services due to %s", dilcVar);
        try {
            for (dkgm dkgmVar : enkr.f(this.a)) {
                String name = dkgmVar.getClass().getName();
                if (dilcVar == dilc.NETWORK_CHANGE || dilcVar == dilc.VPN_SETUP || dilcVar == dilc.VPN_TEARDOWN || dilcVar == dilc.ACTIVE_MEDIA_NETWORK_INTERFACE_CHANGE || dilcVar == dilc.CONNECTIVITY_CHANGE) {
                    dkgmVar.n();
                }
                if (dilcVar == dilc.NETWORK_ERROR) {
                    dkgmVar.o();
                }
                dkty.d(this.f, "Stopping IMS service: %s", name);
                try {
                    dkgmVar.k(dilcVar);
                } catch (Exception e) {
                    dkty.j(e, this.f, "Error while stopping service: %s", name);
                }
            }
        } finally {
            this.e = false;
        }
    }
}
