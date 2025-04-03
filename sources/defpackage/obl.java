package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.Set;

/* compiled from: PG */
@oag(a = "fragment")
/* loaded from: classes.dex */
public class obl extends oaj<obb> {
    public final fr b;
    private final Context f;
    private final int g;
    private final Set h = new LinkedHashSet();
    public final List c = new ArrayList();
    public final lkp d = new lkp() { // from class: oaz
        @Override // defpackage.lkp
        public final void hg(lkr lkrVar, lki lkiVar) {
            if (lkiVar == lki.ON_DESTROY) {
                obl oblVar = obl.this;
                ea eaVar = (ea) lkrVar;
                Object obj = null;
                for (Object obj2 : (Iterable) oblVar.f().g.c()) {
                    if (ffkj.e(((nxm) obj2).d, eaVar.H)) {
                        obj = obj2;
                    }
                }
                nxm nxmVar = (nxm) obj;
                if (nxmVar != null) {
                    if (obl.l()) {
                        Log.v("FragmentNavigator", a.k(lkrVar, nxmVar, "Marking transition complete for entry ", " due to fragment ", " lifecycle reaching DESTROYED"));
                    }
                    oblVar.f().d(nxmVar);
                }
            }
        }
    };
    public final ffji e = new obh(this);

    public obl(Context context, fr frVar, int i) {
        this.f = context;
        this.b = frVar;
        this.g = i;
    }

    static /* synthetic */ void k(obl oblVar, String str, boolean z, int i) {
        if ((i & 4) != 0) {
            ffdx.v(oblVar.c, new obc(str));
        }
        oblVar.c.add(new ffcf(str, Boolean.valueOf(z & ((i & 2) == 0))));
    }

    public static final boolean l() {
        return Log.isLoggable("FragmentManager", 2) || Log.isLoggable("FragmentNavigator", 2);
    }

    private final gg n(nxm nxmVar, nzr nzrVar) {
        nzh nzhVar = nxmVar.b;
        nzhVar.getClass();
        Bundle a = nxmVar.a();
        String str = ((obb) nzhVar).a;
        if (str == null) {
            throw new IllegalStateException("Fragment class was not set");
        }
        if (str.charAt(0) == '.') {
            str = String.valueOf(this.f.getPackageName()).concat(str);
        }
        fr frVar = this.b;
        Context context = this.f;
        em l = frVar.l();
        context.getClassLoader();
        ea b = l.b(str);
        b.getClass();
        b.at(a);
        cg cgVar = new cg(this.b);
        int i = nzrVar != null ? nzrVar.f : -1;
        int i2 = nzrVar != null ? nzrVar.g : -1;
        int i3 = nzrVar != null ? nzrVar.h : -1;
        int i4 = nzrVar != null ? nzrVar.i : -1;
        if (i == -1) {
            if (i2 != -1) {
                i = -1;
            } else {
                if (i3 == -1) {
                    if (i4 != -1) {
                        i = -1;
                        i2 = -1;
                        i3 = -1;
                    }
                    cgVar.x(this.g, b, nxmVar.d);
                    cgVar.p(b);
                    cgVar.B();
                    return cgVar;
                }
                i = -1;
                i2 = -1;
            }
        }
        if (i == -1) {
            i = 0;
        }
        if (i2 == -1) {
            i2 = 0;
        }
        if (i3 == -1) {
            i3 = 0;
        }
        cgVar.A(i, i2, i3, i4 != -1 ? i4 : 0);
        cgVar.x(this.g, b, nxmVar.d);
        cgVar.p(b);
        cgVar.B();
        return cgVar;
    }

    @Override // defpackage.oaj
    public final /* synthetic */ nzh a() {
        return new obb(this);
    }

    @Override // defpackage.oaj
    public final void d(List list, nzr nzrVar) {
        list.getClass();
        if (this.b.ai()) {
            Log.i("FragmentNavigator", "Ignoring navigate() call: FragmentManager has already saved its state");
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            nxm nxmVar = (nxm) it.next();
            boolean isEmpty = ((List) f().f.c()).isEmpty();
            if (nzrVar == null || isEmpty || !nzrVar.b || !this.h.remove(nxmVar.d)) {
                gg n = n(nxmVar, nzrVar);
                if (!isEmpty) {
                    nxm nxmVar2 = (nxm) ffdx.Q((List) f().f.c());
                    if (nxmVar2 != null) {
                        k(this, nxmVar2.d, false, 6);
                    }
                    k(this, nxmVar.d, false, 6);
                    n.v(nxmVar.d);
                }
                n.j();
                if (l()) {
                    Objects.toString(nxmVar);
                    Log.v("FragmentNavigator", "Calling pushWithTransition via navigate() on entry ".concat(String.valueOf(nxmVar)));
                }
                f().i(nxmVar);
            } else {
                fr frVar = this.b;
                frVar.N(new fp(frVar, nxmVar.d), false);
                f().i(nxmVar);
            }
        }
    }

    @Override // defpackage.oaj
    public final Bundle e() {
        if (this.h.isEmpty()) {
            return null;
        }
        return kqr.a(new ffcf("androidx-nav-fragment:navigator:savedIds", new ArrayList(this.h)));
    }

    @Override // defpackage.oaj
    public final void g(final oam oamVar) {
        super.g(oamVar);
        if (l()) {
            Log.v("FragmentNavigator", "onAttach");
        }
        this.b.r(new fx() { // from class: oay
            @Override // defpackage.fx
            public final void h(ea eaVar) {
                Object obj;
                oam oamVar2 = oam.this;
                List list = (List) oamVar2.f.c();
                ListIterator listIterator = list.listIterator(list.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        obj = null;
                        break;
                    } else {
                        obj = listIterator.previous();
                        if (ffkj.e(((nxm) obj).d, eaVar.H)) {
                            break;
                        }
                    }
                }
                obl oblVar = this;
                nxm nxmVar = (nxm) obj;
                if (obl.l()) {
                    Log.v("FragmentNavigator", "Attaching fragment " + eaVar + " associated with entry " + nxmVar + " to FragmentManager " + oblVar.b);
                }
                if (nxmVar != null) {
                    eaVar.ab.f(eaVar, new obk(new obf(oblVar, eaVar, nxmVar)));
                    eaVar.P().c(oblVar.d);
                    oblVar.m(eaVar, oamVar2);
                }
            }
        });
        this.b.s(new obi(oamVar, this));
    }

    @Override // defpackage.oaj
    public final void h(nxm nxmVar) {
        nxmVar.getClass();
        if (this.b.ai()) {
            Log.i("FragmentNavigator", "Ignoring onLaunchSingleTop() call: FragmentManager has already saved its state");
            return;
        }
        gg n = n(nxmVar, null);
        List list = (List) f().f.c();
        if (list.size() > 1) {
            nxm nxmVar2 = (nxm) ffdx.N(list, ffdx.e(list) - 1);
            if (nxmVar2 != null) {
                k(this, nxmVar2.d, false, 6);
            }
            k(this, nxmVar.d, true, 4);
            this.b.ar(nxmVar.d);
            k(this, nxmVar.d, false, 2);
            n.v(nxmVar.d);
        }
        n.j();
        f().g(nxmVar);
    }

    @Override // defpackage.oaj
    public final void i(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("androidx-nav-fragment:navigator:savedIds");
        if (stringArrayList != null) {
            this.h.clear();
            ffdx.w(this.h, stringArrayList);
        }
    }

    @Override // defpackage.oaj
    public final void j(nxm nxmVar, boolean z) {
        nxmVar.getClass();
        if (this.b.ai()) {
            Log.i("FragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return;
        }
        List list = (List) f().f.c();
        int indexOf = list.indexOf(nxmVar);
        List subList = list.subList(indexOf, list.size());
        nxm nxmVar2 = (nxm) ffdx.K(list);
        nxm nxmVar3 = (nxm) ffdx.N(list, indexOf - 1);
        if (nxmVar3 != null) {
            k(this, nxmVar3.d, false, 6);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : subList) {
            nxm nxmVar4 = (nxm) obj;
            ffnl i = ffno.i(ffdx.as(this.c), obj.a);
            String str = nxmVar4.d;
            ffoj ffojVar = new ffoj((ffok) i);
            int i2 = 0;
            while (true) {
                if (!ffojVar.hasNext()) {
                    break;
                }
                Object next = ffojVar.next();
                if (i2 < 0) {
                    ffdx.l();
                }
                if (!ffkj.e(str, next)) {
                    i2++;
                } else if (i2 >= 0) {
                }
            }
            if (!ffkj.e(nxmVar4.d, nxmVar2.d)) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            k(this, ((nxm) it.next()).d, true, 4);
        }
        if (z) {
            for (nxm nxmVar5 : ffdx.af(subList)) {
                if (ffkj.e(nxmVar5, nxmVar2)) {
                    Objects.toString(nxmVar5);
                    Log.i("FragmentNavigator", "FragmentManager cannot save the state of the initial destination ".concat(String.valueOf(nxmVar5)));
                } else {
                    fr frVar = this.b;
                    frVar.N(new fq(frVar, nxmVar5.d), false);
                    this.h.add(nxmVar5.d);
                }
            }
        } else {
            this.b.ar(nxmVar.d);
        }
        if (l()) {
            Log.v("FragmentNavigator", "Calling popWithTransition via popBackStack() on entry " + nxmVar + " with savedState " + z);
        }
        f().h(nxmVar, z);
    }

    public final void m(ea eaVar, oam oamVar) {
        lmx S = eaVar.S();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        obe obeVar = obe.a;
        int i = fflc.a;
        lnz.b(new ffkb(oba.class), obeVar, linkedHashMap);
        ((oba) new lmw(S, lnz.a(linkedHashMap), lnv.a).a(oba.class)).a = new WeakReference(new obd(oamVar, eaVar));
    }
}
