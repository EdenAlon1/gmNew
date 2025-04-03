package defpackage;

import android.util.Base64;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Predicate$CC;
import java.io.IOException;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acuq {
    public static final cskc a = cskc.g("Bugle", "JsBridgeManager");
    public static final Object b = new Object();
    public static final emyl c = cfvl.x(198333659, "add_root_trace_to_jsbridge_messages");
    public final ctbs d;
    public final errm e;
    public final acvp f;
    public final ffbr g;
    public final elbx h;
    public final Map i = new EnumMap(acua.class);
    public final Map j = new ConcurrentHashMap();
    public final enfz k = new enfz();

    public acuq(ctbs ctbsVar, errm errmVar, acvp acvpVar, ffbr ffbrVar, elbx elbxVar) {
        this.d = ctbsVar;
        this.e = errmVar;
        this.f = acvpVar;
        this.g = ffbrVar;
        this.h = elbxVar;
    }

    public static String a(eydl eydlVar) {
        return Base64.encodeToString(eydlVar.toByteArray(), 0);
    }

    private final void i(acua acuaVar) {
        Set D;
        synchronized (this.k) {
            D = this.k.d(acuaVar);
        }
        if (D == null) {
            return;
        }
        Iterator it = D.iterator();
        while (it.hasNext()) {
            ((kfb) it.next()).b(null);
        }
    }

    public final void b(acua acuaVar, acyu acyuVar) {
        synchronized (b) {
            acum acumVar = (acum) this.i.get(acuaVar);
            if (acumVar != null) {
                if (!acyuVar.equals(acumVar.d())) {
                    return;
                }
                try {
                    acumVar.close();
                } catch (IOException e) {
                    a.o("Failed when closing a JsBridgeChannel", e);
                }
            }
            this.i.remove(acuaVar);
        }
    }

    public final void c(acur acurVar, esnl esnlVar, acum acumVar) {
        a.s("Exception when handling JsBridge request", acurVar);
        acip acipVar = (acip) this.g.b();
        esnn esnnVar = (esnn) esnlVar.instance;
        acipVar.i(esnnVar.d, esnm.a(esnnVar.b).B, acurVar.a);
        try {
            acvo b2 = acumVar.b();
            fagh faghVar = acurVar.a;
            esnlVar.copyOnWrite();
            ((esnn) esnlVar.instance).e = faghVar.a();
            String str = (String) Optional.ofNullable(acurVar.getMessage()).orElse("Unknown Error");
            esnlVar.copyOnWrite();
            esnn esnnVar2 = (esnn) esnlVar.instance;
            str.getClass();
            esnnVar2.f = str;
            b2.a(a(esnlVar.build()));
        } catch (acvb e) {
            a.s("Could not send reply to Ditto. Channel has closed", e);
        }
    }

    public final void d(acua acuaVar) {
        synchronized (b) {
            acum acumVar = (acum) this.i.get(acuaVar);
            if (acumVar == null) {
                a.p(String.format("Cannot pause nonexistent channel %s", acuaVar.name()));
                return;
            }
            if (acumVar.g()) {
                return;
            }
            csjb c2 = a.c();
            c2.I("Pausing JsBridge channel");
            c2.A("hostType", acuaVar);
            c2.r();
            Map map = this.i;
            emyw.a(true ^ acumVar.g());
            map.put(acuaVar, new acsv(acumVar.d(), acumVar.b(), acumVar.c(), acumVar.a(), acumVar.e(), true, acumVar.f()));
        }
    }

    public final void e(acua acuaVar) {
        i(acuaVar);
        i(acua.AGNOSTIC);
    }

    public final void f(acua acuaVar) {
        synchronized (b) {
            acum acumVar = (acum) this.i.get(acuaVar);
            if (acumVar == null) {
                a.p(String.format("Cannot unpause nonexistent channel %s", acuaVar.name()));
                return;
            }
            if (acumVar.g()) {
                Map map = this.i;
                emyw.a(acumVar.g());
                map.put(acuaVar, new acsv(acumVar.d(), acumVar.b(), acumVar.c(), acumVar.a(), acumVar.e(), false, acumVar.f()));
                csjb c2 = a.c();
                c2.I("Unpausing JsBridge channel");
                c2.A("hostType", acuaVar);
                c2.r();
                e(acuaVar);
            }
        }
    }

    public final boolean g() {
        boolean anyMatch;
        synchronized (b) {
            anyMatch = Collection.EL.stream(this.i.values()).filter(new Predicate() { // from class: acty
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
                    cskc cskcVar = acuq.a;
                    return !((acum) obj).g();
                }
            }).anyMatch(new Predicate() { // from class: actm
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
                    return ((acum) obj).h();
                }
            });
        }
        return anyMatch;
    }

    public final boolean h(acua acuaVar) {
        acum acumVar;
        if (acuaVar == acua.AGNOSTIC) {
            return g();
        }
        synchronized (b) {
            acumVar = (acum) this.i.get(acuaVar);
        }
        return (acumVar == null || !acumVar.h() || acumVar.g()) ? false : true;
    }
}
