package defpackage;

import android.content.Context;
import android.util.Log;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: PG */
@oag(a = "dialog")
/* loaded from: classes.dex */
public final class oax extends oaj<oav> {
    public final Set b = new LinkedHashSet();
    public final oaw c = new oaw(this);
    public final Map d = new LinkedHashMap();
    private final Context e;
    private final fr f;

    public oax(Context context, fr frVar) {
        this.e = context;
        this.f = frVar;
    }

    private final dn l(nxm nxmVar) {
        nzh nzhVar = nxmVar.b;
        nzhVar.getClass();
        oav oavVar = (oav) nzhVar;
        String g = oavVar.g();
        if (g.charAt(0) == '.') {
            g = String.valueOf(this.e.getPackageName()).concat(g);
        }
        fr frVar = this.f;
        Context context = this.e;
        em l = frVar.l();
        context.getClassLoader();
        ea b = l.b(g);
        b.getClass();
        if (!dn.class.isAssignableFrom(b.getClass())) {
            throw new IllegalArgumentException("Dialog destination " + oavVar.g() + " is not an instance of DialogFragment");
        }
        dn dnVar = (dn) b;
        dnVar.at(nxmVar.a());
        dnVar.P().c(this.c);
        this.d.put(nxmVar.d, dnVar);
        return dnVar;
    }

    @Override // defpackage.oaj
    public final /* synthetic */ nzh a() {
        return new oav(this);
    }

    @Override // defpackage.oaj
    public final void d(List list, nzr nzrVar) {
        list.getClass();
        if (this.f.ai()) {
            Log.i("DialogFragmentNavigator", "Ignoring navigate() call: FragmentManager has already saved its state");
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            nxm nxmVar = (nxm) it.next();
            l(nxmVar).s(this.f, nxmVar.d);
            nxm nxmVar2 = (nxm) ffdx.Q((List) f().f.c());
            boolean au = ffdx.au((Iterable) f().g.c(), nxmVar2);
            f().i(nxmVar);
            if (nxmVar2 != null && !au) {
                f().d(nxmVar2);
            }
        }
    }

    @Override // defpackage.oaj
    public final void g(oam oamVar) {
        lkk P;
        super.g(oamVar);
        for (nxm nxmVar : (List) oamVar.f.c()) {
            dn dnVar = (dn) this.f.h(nxmVar.d);
            if (dnVar == null || (P = dnVar.P()) == null) {
                this.b.add(nxmVar.d);
            } else {
                P.c(this.c);
            }
        }
        this.f.r(new fx() { // from class: oau
            @Override // defpackage.fx
            public final void h(ea eaVar) {
                oax oaxVar = oax.this;
                Set set = oaxVar.b;
                fflf.f(set);
                if (set.remove(eaVar.H)) {
                    eaVar.P().c(oaxVar.c);
                }
                Map map = oaxVar.d;
                String str = eaVar.H;
                fflf.g(map);
                map.remove(str);
            }
        });
    }

    @Override // defpackage.oaj
    public final void h(nxm nxmVar) {
        nxmVar.getClass();
        if (this.f.ai()) {
            Log.i("DialogFragmentNavigator", "Ignoring onLaunchSingleTop() call: FragmentManager has already saved its state");
            return;
        }
        dn dnVar = (dn) this.d.get(nxmVar.d);
        if (dnVar == null) {
            ea h = this.f.h(nxmVar.d);
            dnVar = h instanceof dn ? (dn) h : null;
        }
        if (dnVar != null) {
            dnVar.P().d(this.c);
            dnVar.hw();
        }
        l(nxmVar).s(this.f, nxmVar.d);
        oam f = f();
        List list = (List) f.f.c();
        ListIterator listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            nxm nxmVar2 = (nxm) listIterator.previous();
            if (ffkj.e(nxmVar2.d, nxmVar.d)) {
                fgcm fgcmVar = f.d;
                fgcmVar.f(fffi.h(fffi.h((Set) fgcmVar.c(), nxmVar2), nxmVar));
                f.g(nxmVar);
                return;
            }
        }
        throw new NoSuchElementException("List contains no element matching the predicate.");
    }

    @Override // defpackage.oaj
    public final void j(nxm nxmVar, boolean z) {
        nxmVar.getClass();
        if (this.f.ai()) {
            Log.i("DialogFragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return;
        }
        List list = (List) f().f.c();
        int indexOf = list.indexOf(nxmVar);
        Iterator it = ffdx.af(list.subList(indexOf, list.size())).iterator();
        while (it.hasNext()) {
            ea h = this.f.h(((nxm) it.next()).d);
            if (h != null) {
                ((dn) h).hw();
            }
        }
        k(indexOf, nxmVar, z);
    }

    public final void k(int i, nxm nxmVar, boolean z) {
        nxm nxmVar2 = (nxm) ffdx.N((List) f().f.c(), i - 1);
        boolean au = ffdx.au((Iterable) f().g.c(), nxmVar2);
        f().h(nxmVar, z);
        if (nxmVar2 == null || au) {
            return;
        }
        f().d(nxmVar2);
    }
}
