package defpackage;

import android.os.Bundle;
import android.util.Log;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nxr extends oam {
    public final /* synthetic */ nyj a;
    private final oaj h;

    public nxr(nyj nyjVar, oaj oajVar) {
        oajVar.getClass();
        this.a = nyjVar;
        this.h = oajVar;
    }

    @Override // defpackage.oam
    public final nxm a(nzh nzhVar, Bundle bundle) {
        nyj nyjVar = this.a;
        return nxg.b(nyjVar.a, nzhVar, bundle, nyjVar.a(), nyjVar.l);
    }

    public final void c(nxm nxmVar) {
        nxmVar.getClass();
        synchronized (this.b) {
            fgcm fgcmVar = this.c;
            fgcmVar.f(ffdx.ae((Collection) fgcmVar.c(), nxmVar));
        }
    }

    @Override // defpackage.oam
    public final void d(nxm nxmVar) {
        nyk nykVar;
        nxmVar.getClass();
        boolean e = ffkj.e(this.a.t.get(nxmVar), true);
        this.d.f(fffi.f((Set) this.d.c(), nxmVar));
        this.a.t.remove(nxmVar);
        if (this.a.f.contains(nxmVar)) {
            if (this.e) {
                return;
            }
            this.a.n();
            nyj nyjVar = this.a;
            nyjVar.g.h(ffdx.am(nyjVar.f));
            nyj nyjVar2 = this.a;
            nyjVar2.h.h(nyjVar2.h());
            return;
        }
        this.a.w(nxmVar);
        if (nxmVar.e.c.a(lkj.CREATED)) {
            nxmVar.b(lkj.DESTROYED);
        }
        ffdn ffdnVar = this.a.f;
        if (!ffdnVar.isEmpty()) {
            Iterator<E> it = ffdnVar.iterator();
            while (it.hasNext()) {
                if (ffkj.e(((nxm) it.next()).d, nxmVar.d)) {
                    break;
                }
            }
        }
        if (!e && (nykVar = this.a.l) != null) {
            nykVar.a(nxmVar.d);
        }
        this.a.n();
        nyj nyjVar3 = this.a;
        nyjVar3.h.h(nyjVar3.h());
    }

    @Override // defpackage.oam
    public final void e(nxm nxmVar, boolean z) {
        oaj a = this.a.p.a(nxmVar.b.c);
        this.a.t.put(nxmVar, Boolean.valueOf(z));
        if (!ffkj.e(a, this.h)) {
            Object obj = this.a.q.get(a);
            obj.getClass();
            ((nxr) obj).e(nxmVar, z);
            return;
        }
        nyj nyjVar = this.a;
        ffji ffjiVar = nyjVar.s;
        if (ffjiVar != null) {
            ffjiVar.invoke(nxmVar);
            super.e(nxmVar, z);
            return;
        }
        nxq nxqVar = new nxq(this, nxmVar, z);
        int indexOf = nyjVar.f.indexOf(nxmVar);
        if (indexOf < 0) {
            Log.i("NavController", a.i(nxmVar, "Ignoring pop of ", " as it was not found on the current back stack"));
            return;
        }
        int i = indexOf + 1;
        ffdn ffdnVar = nyjVar.f;
        if (i != ffdnVar.a) {
            nyjVar.p(((nxm) ffdnVar.get(i)).b.j, true, false);
        }
        nyj.v(nyjVar, nxmVar);
        nxqVar.invoke();
        nyjVar.o();
        nyjVar.x();
    }

    @Override // defpackage.oam
    public final void f(nxm nxmVar) {
        nxmVar.getClass();
        oaj a = this.a.p.a(nxmVar.b.c);
        if (!ffkj.e(a, this.h)) {
            Object obj = this.a.q.get(a);
            if (obj != null) {
                ((nxr) obj).f(nxmVar);
                return;
            }
            throw new IllegalStateException("NavigatorBackStack for " + nxmVar.b.c + " should already be created");
        }
        ffji ffjiVar = this.a.r;
        if (ffjiVar != null) {
            ffjiVar.invoke(nxmVar);
            c(nxmVar);
        } else {
            Log.i("NavController", "Ignoring add of destination " + nxmVar.b + " outside of the call to navigate(). ");
        }
    }
}
