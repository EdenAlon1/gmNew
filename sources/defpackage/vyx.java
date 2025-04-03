package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vyx implements vyw {
    private static final cskc a = cskc.g("Bugle", "SelectedMessagesImpl");
    private final Map b = new cmh();
    private final List c = new ArrayList();

    private final bcse j() {
        efbd.c();
        return (bcse) b().iterator().next();
    }

    @Override // defpackage.vyw
    public final int a() {
        efbd.c();
        return ((cpn) this.b).d;
    }

    @Override // defpackage.vyw
    public final Collection b() {
        efbd.c();
        return engw.n(this.b.values());
    }

    @Override // defpackage.vyw
    public final void c(vyy vyyVar) {
        efbd.c();
        this.c.add(vyyVar);
    }

    @Override // defpackage.vyw
    public final void d() {
        efbd.c();
        Map map = this.b;
        if (map.isEmpty()) {
            return;
        }
        engw n = engw.n(map.values());
        engw n2 = engw.n(this.b.keySet());
        this.b.clear();
        csjb c = a.c();
        c.I("Deselected messages");
        c.I(n2);
        c.r();
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((vyy) it.next()).J(n);
        }
    }

    @Override // defpackage.vyw
    public final void e(vyy vyyVar) {
        efbd.c();
        this.c.remove(vyyVar);
    }

    @Override // defpackage.vyw
    public final boolean f() {
        efbd.c();
        return this.b.isEmpty();
    }

    @Override // defpackage.vyw
    public final boolean g(bcse bcseVar) {
        efbd.c();
        return this.b.containsKey(bcseVar.u());
    }

    @Override // defpackage.vyw
    public final boolean h(int i, Context context) {
        efbd.c();
        boolean z = a() == 1;
        int i2 = i - 1;
        if (i2 == 0) {
            if (z) {
                bcse j = j();
                if (!j.ao() && !j.Y().isEmpty()) {
                    return true;
                }
            }
            return false;
        }
        if (i2 == 1) {
            if (z) {
                bcse j2 = j();
                if (!j2.ao() && j2.ar()) {
                    return !j2.az() || bdjs.k(j2.f());
                }
            }
            return false;
        }
        if (i2 == 2) {
            if (z) {
                return j().ah();
            }
            return false;
        }
        if (i2 == 3) {
            return z;
        }
        if (i2 == 4) {
            if (z) {
                return j().al();
            }
            return false;
        }
        if (i2 == 5) {
            if (z) {
                return j().ai(context);
            }
            return false;
        }
        if (z) {
            bcse j3 = j();
            if (j3.ah()) {
                if (j3.ar()) {
                    if (!j3.ap()) {
                        return true;
                    }
                } else if (((enip) Collection.EL.stream(j3.Y()).filter(new Predicate() { // from class: bcrv
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
                        return ((MessagePartCoreData) obj).V() != null;
                    }
                }).map(new Function() { // from class: bcrw
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        String V = ((MessagePartCoreData) obj).V();
                        V.getClass();
                        return V;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).collect(endq.b)).size() <= 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.vyw
    public final void i(bcse bcseVar) {
        efbd.c();
        if (bcseVar.aZ()) {
            return;
        }
        if (this.b.remove(bcseVar.u()) != null) {
            csjb c = a.c();
            c.I("Deselected message");
            c.d(bcseVar.u());
            c.r();
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                ((vyy) it.next()).K(bcseVar);
            }
            return;
        }
        this.b.put(bcseVar.u(), bcseVar);
        csjb c2 = a.c();
        c2.I("Selected message");
        c2.d(bcseVar.u());
        c2.r();
        Iterator it2 = this.c.iterator();
        while (it2.hasNext()) {
            ((vyy) it2.next()).M(bcseVar);
        }
    }
}
