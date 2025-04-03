package defpackage;

import j$.util.Map;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cotc implements cort {
    private final Map a = new LinkedHashMap();
    private final Map b = new LinkedHashMap();
    private final Map c = new LinkedHashMap();
    private final Map d = new LinkedHashMap();

    public cotc() {
        fgdm.a(cota.a((cosy) cosz.a.createBuilder()).a());
    }

    private final djrm z(cors corsVar) {
        return (djrm) Map.EL.getOrDefault(this.b, corsVar, new djro(""));
    }

    @Override // defpackage.cort
    public final cost a() {
        coss cossVar = (coss) cost.a.createBuilder();
        cossVar.getClass();
        cosu.b(djrn.a(z(cors.a)).a, cossVar);
        cosu.e(djrn.a(z(cors.b)).a, cossVar);
        cosu.c(djrn.a(z(cors.c)).a, cossVar);
        return cosu.a(cossVar);
    }

    @Override // defpackage.cort
    public final elfl b() {
        elfl e = elfo.e(n());
        e.getClass();
        return e;
    }

    @Override // defpackage.cort
    public final elfl c() {
        elfl e = elfo.e(o());
        e.getClass();
        return e;
    }

    @Override // defpackage.cort
    public final elfl d() {
        elfl e = elfo.e(p());
        e.getClass();
        return e;
    }

    @Override // defpackage.cort
    public final elfl e(cors corsVar) {
        corsVar.getClass();
        elfl e = elfo.e(h(corsVar));
        e.getClass();
        return e;
    }

    @Override // defpackage.cort
    public final Optional f() {
        return h(cors.a);
    }

    @Override // defpackage.cort
    public final /* bridge */ /* synthetic */ Optional g(int i, boolean z) {
        djrm djrmVar = (djrm) this.d.get(new djrq(i));
        if (djrmVar != null) {
            return Optional.of(djrmVar);
        }
        Optional i2 = i(i);
        if (i2.isEmpty()) {
            return Optional.empty();
        }
        String str = ((cosz) i2.get()).c;
        str.getClass();
        return Optional.of(new djro(str));
    }

    @Override // defpackage.cort
    public final Optional h(cors corsVar) {
        corsVar.getClass();
        djrm djrmVar = (djrm) this.b.get(corsVar);
        return Optional.ofNullable(djrmVar != null ? (cosz) this.a.get(djrmVar) : null);
    }

    @Override // defpackage.cort
    public final Optional j(djrm djrmVar) {
        djrmVar.getClass();
        return Optional.ofNullable(this.a.get(djrmVar));
    }

    @Override // defpackage.cort
    public final Object k(ffgu ffguVar) {
        return ffdx.ar(this.a.values());
    }

    @Override // defpackage.cort
    public final Object l(cors corsVar, ffgu ffguVar) {
        return h(corsVar).orElse(null);
    }

    @Override // defpackage.cort
    public final Object m(int i, ffgu ffguVar) {
        return i(i).orElse(null);
    }

    @Override // defpackage.cort
    public final Set n() {
        return ffdx.ar(this.a.keySet());
    }

    @Override // defpackage.cort
    public final Set o() {
        return ffdx.ar(this.a.keySet());
    }

    @Override // defpackage.cort
    public final Set p() {
        return ffdx.ar(this.a.values());
    }

    @Override // defpackage.cort
    public final Set q() {
        return ffdx.ar(this.a.values());
    }

    @Override // defpackage.cort
    public final Set r(djrm djrmVar) {
        djrmVar.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : this.d.entrySet()) {
            if (ffkj.e((djrm) entry.getValue(), djrmVar)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Set keySet = linkedHashMap.keySet();
        if (!keySet.isEmpty()) {
            return keySet;
        }
        Optional j = j(djrmVar);
        return j.isEmpty() ? ffen.a : fffi.b(new djrq(((cosz) j.get()).d));
    }

    @Override // defpackage.cort
    public final /* bridge */ /* synthetic */ boolean s(int i, int i2) {
        Integer num = (Integer) this.c.get(Integer.valueOf(i));
        if (num != null && num.intValue() == i2) {
            return true;
        }
        Integer num2 = (Integer) this.c.get(Integer.valueOf(i2));
        return num2 != null && num2.intValue() == i;
    }

    @Override // defpackage.cort
    public final /* bridge */ /* synthetic */ boolean t(int i) {
        Set ar = ffdx.ar(this.a.values());
        ArrayList arrayList = new ArrayList(ffdx.n(ar, 10));
        Iterator it = ar.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((cosz) it.next()).d));
        }
        return arrayList.contains(Integer.valueOf(i));
    }

    @Override // defpackage.cort
    public final Object u() {
        return o();
    }

    @Override // defpackage.cort
    public final Object v() {
        return ffdx.ar(this.a.values());
    }

    @Override // defpackage.cort
    public final Object w(djrm djrmVar) {
        djrmVar.getClass();
        cosz coszVar = (cosz) this.a.get(djrmVar);
        return Optional.ofNullable(coszVar != null ? coszVar.p : null).orElse(null);
    }

    @Override // defpackage.cort
    public final Object x(djrm djrmVar) {
        return this.a.get(djrmVar);
    }

    @Override // defpackage.cort
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public final Optional i(int i) {
        Object obj;
        Iterator it = ffdx.ar(this.a.values()).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((cosz) obj).d == i) {
                break;
            }
        }
        return Optional.ofNullable(obj);
    }
}
