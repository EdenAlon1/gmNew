package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public class nyj {
    private final List A;
    private final ffbz B;
    private final fgcl C;
    public final Context a;
    public nzl b;
    public Bundle c;
    public Parcelable[] d;
    public boolean e;
    public final ffdn f;
    public final fgcm g;
    public final fgcm h;
    public final Map i;
    public final Map j;
    public lkr k;
    public nyk l;
    public final CopyOnWriteArrayList m;
    public lkj n;
    public final lkq o;
    public oal p;
    public final Map q;
    public ffji r;
    public ffji s;
    public final Map t;
    private Activity u;
    private final Map v;
    private final Map w;
    private final abo x;
    private boolean y;
    private int z;

    public nyj(Context context) {
        Object obj;
        this.a = context;
        Iterator a = ffno.e(context, nxt.a).a();
        while (true) {
            if (!a.hasNext()) {
                obj = null;
                break;
            } else {
                obj = a.next();
                if (((Context) obj) instanceof Activity) {
                    break;
                }
            }
        }
        this.u = (Activity) obj;
        this.f = new ffdn();
        this.g = fgdm.a(ffel.a);
        this.h = fgdm.a(ffel.a);
        this.v = new LinkedHashMap();
        this.w = new LinkedHashMap();
        this.i = new LinkedHashMap();
        this.j = new LinkedHashMap();
        this.m = new CopyOnWriteArrayList();
        this.n = lkj.INITIALIZED;
        this.o = new lkp() { // from class: nxp
            @Override // defpackage.lkp
            public final void hg(lkr lkrVar, lki lkiVar) {
                nyj nyjVar = nyj.this;
                nyjVar.n = lkiVar.a();
                if (nyjVar.b != null) {
                    for (nxm nxmVar : ffdx.am(nyjVar.f)) {
                        nxmVar.c = lkiVar.a();
                        nxmVar.c();
                    }
                }
            }
        };
        this.x = new nyh(this);
        this.y = true;
        this.p = new oal();
        this.q = new LinkedHashMap();
        this.t = new LinkedHashMap();
        oal oalVar = this.p;
        oalVar.c(new nzm(oalVar));
        this.p.c(new nwo(this.a));
        this.A = new ArrayList();
        this.B = ffca.a(new nyf(this));
        this.C = fgcu.e(1, 0, 2, 2);
    }

    private final boolean A(int i, Bundle bundle, nzr nzrVar) {
        nzh f;
        nxm nxmVar;
        nzh nzhVar;
        Map map = this.i;
        Integer valueOf = Integer.valueOf(i);
        if (!map.containsKey(valueOf)) {
            return false;
        }
        String str = (String) this.i.get(valueOf);
        ffdx.y(this.i.values(), new nyi(str));
        Map map2 = this.j;
        fflf.g(map2);
        ffdn<nxo> ffdnVar = (ffdn) map2.remove(str);
        ArrayList arrayList = new ArrayList();
        nxm nxmVar2 = (nxm) this.f.f();
        if (nxmVar2 == null || (f = nxmVar2.b) == null) {
            f = f();
        }
        if (ffdnVar != null) {
            for (nxo nxoVar : ffdnVar) {
                nzh r = r(f, nxoVar.b, true, null);
                if (r == null) {
                    int i2 = nzh.l;
                    throw new IllegalStateException("Restore State failed: destination " + nzb.a(this.a, nxoVar.b) + " cannot be found from the current destination " + f);
                }
                arrayList.add(nxoVar.a(this.a, r, a(), this.l));
                f = r;
            }
        }
        ArrayList<List> arrayList2 = new ArrayList();
        ArrayList<nxm> arrayList3 = new ArrayList();
        for (Object obj : arrayList) {
            if (!(((nxm) obj).b instanceof nzl)) {
                arrayList3.add(obj);
            }
        }
        for (nxm nxmVar3 : arrayList3) {
            List list = (List) ffdx.Q(arrayList2);
            if (ffkj.e((list == null || (nxmVar = (nxm) ffdx.P(list)) == null || (nzhVar = nxmVar.b) == null) ? null : nzhVar.c, nxmVar3.b.c)) {
                list.add(nxmVar3);
            } else {
                arrayList2.add(ffdx.i(nxmVar3));
            }
        }
        ffkx ffkxVar = new ffkx();
        for (List list2 : arrayList2) {
            z(this.p.a(((nxm) ffdx.K(list2)).b.c), list2, nzrVar, new nya(ffkxVar, arrayList, new ffkz(), this, bundle));
        }
        return ffkxVar.a;
    }

    public static /* synthetic */ nzh q(nyj nyjVar, int i) {
        return nyjVar.d(i, null);
    }

    public static final nzh r(nzh nzhVar, int i, boolean z, nzh nzhVar2) {
        nzl nzlVar;
        nzhVar.getClass();
        if (nzhVar.j == i && (nzhVar2 == null || (ffkj.e(nzhVar, nzhVar2) && ffkj.e(nzhVar.d, nzhVar2.d)))) {
            return nzhVar;
        }
        if (nzhVar instanceof nzl) {
            nzlVar = (nzl) nzhVar;
        } else {
            nzl nzlVar2 = nzhVar.d;
            nzlVar2.getClass();
            nzlVar = nzlVar2;
        }
        return nzlVar.h(i, nzlVar, z, nzhVar2);
    }

    static /* synthetic */ boolean u(nyj nyjVar, int i) {
        return nyjVar.p(i, true, false);
    }

    static /* synthetic */ void v(nyj nyjVar, nxm nxmVar) {
        nyjVar.k(nxmVar, false, new ffdn());
    }

    private final void y(nxm nxmVar, nxm nxmVar2) {
        this.v.put(nxmVar, nxmVar2);
        if (this.w.get(nxmVar2) == null) {
            this.w.put(nxmVar2, new AtomicInteger(0));
        }
        Object obj = this.w.get(nxmVar2);
        obj.getClass();
        ((AtomicInteger) obj).incrementAndGet();
    }

    private final void z(oaj oajVar, List list, nzr nzrVar, ffji ffjiVar) {
        this.r = ffjiVar;
        oajVar.d(list, nzrVar);
        this.r = null;
    }

    public final lkj a() {
        return this.k == null ? lkj.CREATED : this.n;
    }

    public final nxm b(int i) {
        Object obj;
        ffdn ffdnVar = this.f;
        ListIterator<E> listIterator = ffdnVar.listIterator(ffdnVar.a);
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            if (((nxm) obj).b.j == i) {
                break;
            }
        }
        nxm nxmVar = (nxm) obj;
        if (nxmVar != null) {
            return nxmVar;
        }
        throw new IllegalArgumentException("No destination with ID " + i + " is on the NavController's back stack. The current destination is " + e());
    }

    public final nxm c() {
        return (nxm) this.f.f();
    }

    public final nzh d(int i, nzh nzhVar) {
        nzh nzhVar2;
        nzl nzlVar = this.b;
        if (nzlVar == null) {
            return null;
        }
        if (nzlVar.j == i) {
            if (nzhVar == null) {
                return nzlVar;
            }
            if (ffkj.e(nzlVar, nzhVar) && nzhVar.d == null) {
                return this.b;
            }
        }
        nxm nxmVar = (nxm) this.f.f();
        if (nxmVar == null || (nzhVar2 = nxmVar.b) == null) {
            nzhVar2 = this.b;
            nzhVar2.getClass();
        }
        return r(nzhVar2, i, false, nzhVar);
    }

    public final nzh e() {
        nxm c = c();
        if (c != null) {
            return c.b;
        }
        return null;
    }

    public final nzl f() {
        nzl nzlVar = this.b;
        if (nzlVar != null) {
            return nzlVar;
        }
        throw new IllegalStateException("You must call setGraph() before calling getGraph()");
    }

    public final nzp g() {
        return (nzp) this.B.a();
    }

    public final List h() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.q.values().iterator();
        while (it.hasNext()) {
            Iterable iterable = (Iterable) ((nxr) it.next()).g.c();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : iterable) {
                nxm nxmVar = (nxm) obj;
                if (!arrayList.contains(nxmVar) && !nxmVar.h.a(lkj.STARTED)) {
                    arrayList2.add(obj);
                }
            }
            ffdx.w(arrayList, arrayList2);
        }
        ffdn ffdnVar = this.f;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : ffdnVar) {
            nxm nxmVar2 = (nxm) obj2;
            if (!arrayList.contains(nxmVar2) && nxmVar2.h.a(lkj.STARTED)) {
                arrayList3.add(obj2);
            }
        }
        ffdx.w(arrayList, arrayList3);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj3 : arrayList) {
            if (!(((nxm) obj3).b instanceof nzl)) {
                arrayList4.add(obj3);
            }
        }
        return arrayList4;
    }

    public final void i(nzh nzhVar, Bundle bundle, nxm nxmVar, List list) {
        Object obj;
        Object obj2;
        nzh nzhVar2 = nxmVar.b;
        if (!(nzhVar2 instanceof oav)) {
            do {
                ffdn ffdnVar = this.f;
                if (ffdnVar.isEmpty() || !(((nxm) ffdnVar.e()).b instanceof oav)) {
                    break;
                }
            } while (u(this, ((nxm) this.f.e()).b.j));
        }
        ffdn<nxm> ffdnVar2 = new ffdn();
        Object obj3 = null;
        if (nzhVar instanceof nzl) {
            nzh nzhVar3 = nzhVar2;
            do {
                nzhVar3.getClass();
                nzhVar3 = nzhVar3.d;
                if (nzhVar3 != null) {
                    ListIterator listIterator = list.listIterator(list.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            obj2 = listIterator.previous();
                            if (ffkj.e(((nxm) obj2).b, nzhVar3)) {
                                break;
                            }
                        } else {
                            obj2 = null;
                            break;
                        }
                    }
                    nxm nxmVar2 = (nxm) obj2;
                    if (nxmVar2 == null) {
                        nxmVar2 = nxg.b(this.a, nzhVar3, bundle, a(), this.l);
                    }
                    ffdnVar2.addFirst(nxmVar2);
                    ffdn ffdnVar3 = this.f;
                    if (!ffdnVar3.isEmpty() && ((nxm) ffdnVar3.e()).b == nzhVar3) {
                        v(this, (nxm) this.f.e());
                    }
                }
                if (nzhVar3 == null) {
                    break;
                }
            } while (nzhVar3 != nzhVar);
        }
        nzh nzhVar4 = ffdnVar2.isEmpty() ? nzhVar2 : ((nxm) ffdnVar2.a()).b;
        while (nzhVar4 != null && d(nzhVar4.j, nzhVar4) != nzhVar4) {
            nzhVar4 = nzhVar4.d;
            if (nzhVar4 != null) {
                Bundle bundle2 = (bundle == null || !bundle.isEmpty()) ? bundle : null;
                ListIterator listIterator2 = list.listIterator(list.size());
                while (true) {
                    if (listIterator2.hasPrevious()) {
                        obj = listIterator2.previous();
                        if (ffkj.e(((nxm) obj).b, nzhVar4)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                nxm nxmVar3 = (nxm) obj;
                if (nxmVar3 == null) {
                    nxmVar3 = nxg.b(this.a, nzhVar4, nzhVar4.c(bundle2), a(), this.l);
                }
                ffdnVar2.addFirst(nxmVar3);
            }
        }
        if (!ffdnVar2.isEmpty()) {
            nzhVar2 = ((nxm) ffdnVar2.a()).b;
        }
        while (true) {
            ffdn ffdnVar4 = this.f;
            if (ffdnVar4.isEmpty() || !(((nxm) ffdnVar4.e()).b instanceof nzl)) {
                break;
            }
            nzh nzhVar5 = ((nxm) this.f.e()).b;
            nzhVar5.getClass();
            if (cpp.a(((nzl) nzhVar5).a, nzhVar2.j) != null) {
                break;
            } else {
                v(this, (nxm) this.f.e());
            }
        }
        nxm nxmVar4 = (nxm) this.f.b();
        if (nxmVar4 == null) {
            nxmVar4 = (nxm) ffdnVar2.b();
        }
        if (!ffkj.e(nxmVar4 != null ? nxmVar4.b : null, this.b)) {
            ListIterator listIterator3 = list.listIterator(list.size());
            while (true) {
                if (!listIterator3.hasPrevious()) {
                    break;
                }
                Object previous = listIterator3.previous();
                nzh nzhVar6 = ((nxm) previous).b;
                nzl nzlVar = this.b;
                nzlVar.getClass();
                if (ffkj.e(nzhVar6, nzlVar)) {
                    obj3 = previous;
                    break;
                }
            }
            nxm nxmVar5 = (nxm) obj3;
            if (nxmVar5 == null) {
                Context context = this.a;
                nzl nzlVar2 = this.b;
                nzlVar2.getClass();
                nzlVar2.getClass();
                nxmVar5 = nxg.b(context, nzlVar2, nzlVar2.c(bundle), a(), this.l);
            }
            ffdnVar2.addFirst(nxmVar5);
        }
        for (nxm nxmVar6 : ffdnVar2) {
            Object obj4 = this.q.get(this.p.a(nxmVar6.b.c));
            if (obj4 == null) {
                throw new IllegalStateException("NavigatorBackStack for " + nzhVar.c + " should already be created");
            }
            ((nxr) obj4).c(nxmVar6);
        }
        this.f.addAll(ffdnVar2);
        this.f.add(nxmVar);
        for (nxm nxmVar7 : ffdx.ae(ffdnVar2, nxmVar)) {
            nzl nzlVar3 = nxmVar7.b.d;
            if (nzlVar3 != null) {
                y(nxmVar7, b(nzlVar3.j));
            }
        }
    }

    public final void j(nxs nxsVar) {
        this.m.add(nxsVar);
        ffdn ffdnVar = this.f;
        if (ffdnVar.isEmpty()) {
            return;
        }
        nxm nxmVar = (nxm) ffdnVar.e();
        nxsVar.a(nxmVar.b, nxmVar.a());
    }

    public final void k(nxm nxmVar, boolean z, ffdn ffdnVar) {
        nyk nykVar;
        Set set;
        nxm nxmVar2 = (nxm) this.f.e();
        if (!ffkj.e(nxmVar2, nxmVar)) {
            throw new IllegalStateException("Attempted to pop " + nxmVar.b + ", which is not the top of the back stack (" + nxmVar2.b + ')');
        }
        ffdx.s(this.f);
        nxr nxrVar = (nxr) this.q.get(this.p.a(nxmVar2.b.c));
        boolean z2 = true;
        if ((nxrVar == null || (set = (Set) nxrVar.g.c()) == null || !set.contains(nxmVar2)) && !this.w.containsKey(nxmVar2)) {
            z2 = false;
        }
        if (nxmVar2.e.c.a(lkj.CREATED)) {
            if (z) {
                nxmVar2.b(lkj.CREATED);
                ffdnVar.addFirst(new nxo(nxmVar2));
            }
            if (z2) {
                nxmVar2.b(lkj.CREATED);
            } else {
                nxmVar2.b(lkj.DESTROYED);
                w(nxmVar2);
            }
        }
        if (z || z2 || (nykVar = this.l) == null) {
            return;
        }
        nykVar.a(nxmVar2.d);
    }

    public final void l(int i) {
        m(g().a(i), null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0315 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x021f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(defpackage.nzl r17, android.os.Bundle r18) {
        /*
            Method dump skipped, instructions count: 1259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nyj.m(nzl, android.os.Bundle):void");
    }

    public final void n() {
        AtomicInteger atomicInteger;
        Set set;
        List<nxm> am = ffdx.am(this.f);
        if (am.isEmpty()) {
            return;
        }
        nzh nzhVar = ((nxm) ffdx.P(am)).b;
        List i = ffdx.i(nzhVar);
        if (nzhVar instanceof oas) {
            boolean z = nzhVar instanceof oav;
            Iterator it = ffdx.Y(ffdx.af(am), 1).iterator();
            while (it.hasNext()) {
                nzh nzhVar2 = ((nxm) it.next()).b;
                if (z && !(nzhVar2 instanceof oav) && !(nzhVar2 instanceof nzl)) {
                    break;
                }
                i.add(nzhVar2);
                if (!(nzhVar2 instanceof oas) && !(nzhVar2 instanceof nzl)) {
                    break;
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        if (ffdx.P(i) instanceof oav) {
            Iterator it2 = ffdx.af(am).iterator();
            while (it2.hasNext()) {
                nzh nzhVar3 = ((nxm) it2.next()).b;
                arrayList.add(nzhVar3);
                if (!(nzhVar3 instanceof oav) && !(nzhVar3 instanceof oas) && !(nzhVar3 instanceof nzl)) {
                    break;
                }
            }
        }
        HashMap hashMap = new HashMap();
        for (nxm nxmVar : ffdx.af(am)) {
            lkj lkjVar = nxmVar.h;
            nzh nzhVar4 = nxmVar.b;
            nzh nzhVar5 = (nzh) ffdx.M(i);
            if (nzhVar5 != null && nzhVar5.j == nzhVar4.j) {
                if (lkjVar != lkj.RESUMED) {
                    nxr nxrVar = (nxr) this.q.get(this.p.a(nxmVar.b.c));
                    Boolean bool = null;
                    if (nxrVar != null && (set = (Set) nxrVar.g.c()) != null) {
                        bool = Boolean.valueOf(set.contains(nxmVar));
                    }
                    if (ffkj.e(bool, true) || ((atomicInteger = (AtomicInteger) this.w.get(nxmVar)) != null && atomicInteger.get() == 0)) {
                        hashMap.put(nxmVar, lkj.STARTED);
                    } else {
                        hashMap.put(nxmVar, lkj.RESUMED);
                    }
                }
                nzh nzhVar6 = (nzh) ffdx.M(arrayList);
                if (nzhVar6 != null && nzhVar6.j == nzhVar4.j) {
                    ffdx.r(arrayList);
                }
                ffdx.r(i);
                nzl nzlVar = nzhVar4.d;
                if (nzlVar != null) {
                    i.add(nzlVar);
                }
            } else if (arrayList.isEmpty() || nzhVar4.j != ((nzh) ffdx.K(arrayList)).j) {
                nxmVar.b(lkj.CREATED);
            } else {
                nzh nzhVar7 = (nzh) ffdx.r(arrayList);
                if (lkjVar == lkj.RESUMED) {
                    nxmVar.b(lkj.STARTED);
                } else {
                    lkj lkjVar2 = lkj.STARTED;
                    if (lkjVar != lkjVar2) {
                        hashMap.put(nxmVar, lkjVar2);
                    }
                }
                nzl nzlVar2 = nzhVar7.d;
                if (nzlVar2 != null && !arrayList.contains(nzlVar2)) {
                    arrayList.add(nzlVar2);
                }
            }
        }
        for (nxm nxmVar2 : am) {
            lkj lkjVar3 = (lkj) hashMap.get(nxmVar2);
            if (lkjVar3 != null) {
                nxmVar2.b(lkjVar3);
            } else {
                nxmVar2.c();
            }
        }
    }

    public final void o() {
        boolean z = false;
        if (this.y) {
            ffdn ffdnVar = this.f;
            if (!ffdnVar.isEmpty()) {
                Iterator<E> it = ffdnVar.iterator();
                int i = 0;
                while (it.hasNext()) {
                    if (!(((nxm) it.next()).b instanceof nzl) && (i = i + 1) < 0) {
                        ffdx.k();
                    }
                }
                if (i > 1) {
                    z = true;
                }
            }
        }
        this.x.h(z);
    }

    public final boolean p(int i, boolean z, boolean z2) {
        nzh nzhVar;
        nyj nyjVar;
        boolean z3;
        if (this.f.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ffdx.af(this.f).iterator();
        while (true) {
            if (!it.hasNext()) {
                nzhVar = null;
                break;
            }
            nzhVar = ((nxm) it.next()).b;
            oaj a = this.p.a(nzhVar.c);
            if (z || nzhVar.j != i) {
                arrayList.add(a);
            }
            if (nzhVar.j == i) {
                break;
            }
        }
        if (nzhVar == null) {
            int i2 = nzh.l;
            Log.i("NavController", "Ignoring popBackStack to destination " + nzb.a(this.a, i) + " as it was not found on the current back stack");
            return false;
        }
        ffkx ffkxVar = new ffkx();
        ffdn ffdnVar = new ffdn();
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                nyjVar = this;
                z3 = z2;
                break;
            }
            oaj oajVar = (oaj) it2.next();
            ffkx ffkxVar2 = new ffkx();
            nxm nxmVar = (nxm) this.f.e();
            nyjVar = this;
            z3 = z2;
            nyjVar.s = new nxv(ffkxVar2, ffkxVar, nyjVar, z3, ffdnVar);
            oajVar.j(nxmVar, z3);
            nyjVar.s = null;
            if (!ffkxVar2.a) {
                break;
            }
            z2 = z3;
        }
        if (z3) {
            if (!z) {
                ffoh ffohVar = new ffoh(new ffoi(ffno.e(nzhVar, nxw.a), new nxx(this)));
                while (ffohVar.hasNext()) {
                    nzh nzhVar2 = (nzh) ffohVar.next();
                    Map map = nyjVar.i;
                    Integer valueOf = Integer.valueOf(nzhVar2.j);
                    nxo nxoVar = (nxo) ffdnVar.b();
                    map.put(valueOf, nxoVar != null ? nxoVar.a : null);
                }
            }
            if (!ffdnVar.isEmpty()) {
                nxo nxoVar2 = (nxo) ffdnVar.a();
                ffoh ffohVar2 = new ffoh(new ffoi(ffno.e(q(this, nxoVar2.b), nxy.a), new nxz(this)));
                while (ffohVar2.hasNext()) {
                    nyjVar.i.put(Integer.valueOf(((nzh) ffohVar2.next()).j), nxoVar2.a);
                }
                if (nyjVar.i.values().contains(nxoVar2.a)) {
                    nyjVar.j.put(nxoVar2.a, ffdnVar);
                }
            }
        }
        o();
        return ffkxVar.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d7, code lost:
    
        if (defpackage.ffkj.e(r8, r1) == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e8, code lost:
    
        r1 = new defpackage.ffdn();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00f3, code lost:
    
        if (defpackage.ffdx.e(r10.f) < r7) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00f5, code lost:
    
        r6 = (defpackage.nxm) defpackage.ffdx.s(r10.f);
        w(r6);
        r1.addFirst(new defpackage.nxm(r6, r6.b.c(r12)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x010f, code lost:
    
        r12 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0117, code lost:
    
        if (r12.hasNext() == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0119, code lost:
    
        r6 = (defpackage.nxm) r12.next();
        r7 = r6.b.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0123, code lost:
    
        if (r7 == null) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0125, code lost:
    
        y(r6, b(r7.j));
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x012e, code lost:
    
        r10.f.add(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0134, code lost:
    
        r12 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x013c, code lost:
    
        if (r12.hasNext() == false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x013e, code lost:
    
        r1 = (defpackage.nxm) r12.next();
        r10.p.a(r1.b.c).h(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00e5, code lost:
    
        if (r11.j == r1.j) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0155  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s(defpackage.nzh r11, android.os.Bundle r12, defpackage.nzr r13) {
        /*
            Method dump skipped, instructions count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nyj.s(nzh, android.os.Bundle, nzr):void");
    }

    public final void t(int i, boolean z) {
        if (p(i, z, false)) {
            x();
        }
    }

    public final void w(nxm nxmVar) {
        nxmVar.getClass();
        nxm nxmVar2 = (nxm) this.v.remove(nxmVar);
        if (nxmVar2 == null) {
            return;
        }
        AtomicInteger atomicInteger = (AtomicInteger) this.w.get(nxmVar2);
        Integer valueOf = atomicInteger != null ? Integer.valueOf(atomicInteger.decrementAndGet()) : null;
        if (valueOf == null || valueOf.intValue() != 0) {
            return;
        }
        nxr nxrVar = (nxr) this.q.get(this.p.a(nxmVar2.b.c));
        if (nxrVar != null) {
            nxrVar.d(nxmVar2);
        }
        this.w.remove(nxmVar2);
    }

    public final void x() {
        while (true) {
            ffdn ffdnVar = this.f;
            if (ffdnVar.isEmpty() || !(((nxm) ffdnVar.e()).b instanceof nzl)) {
                break;
            } else {
                v(this, (nxm) this.f.e());
            }
        }
        nxm nxmVar = (nxm) this.f.f();
        if (nxmVar != null) {
            this.A.add(nxmVar);
        }
        this.z++;
        n();
        int i = this.z - 1;
        this.z = i;
        if (i == 0) {
            List list = this.A;
            List<nxm> am = ffdx.am(list);
            list.clear();
            for (nxm nxmVar2 : am) {
                Iterator it = this.m.iterator();
                while (it.hasNext()) {
                    ((nxs) it.next()).a(nxmVar2.b, nxmVar2.a());
                }
                this.C.h(nxmVar2);
            }
            this.g.h(ffdx.am(this.f));
            this.h.h(h());
        }
    }
}
