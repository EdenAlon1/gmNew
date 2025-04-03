package defpackage;

import android.util.Log;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class obi implements fl {
    final /* synthetic */ oam a;
    final /* synthetic */ obl b;

    public obi(oam oamVar, obl oblVar) {
        this.a = oamVar;
        this.b = oblVar;
    }

    @Override // defpackage.fl
    public final void b(ea eaVar, boolean z) {
        Object obj;
        Object obj2;
        eaVar.getClass();
        List ad = ffdx.ad((Collection) this.a.f.c(), (Iterable) this.a.g.c());
        ListIterator listIterator = ad.listIterator(ad.size());
        while (true) {
            obj = null;
            if (!listIterator.hasPrevious()) {
                obj2 = null;
                break;
            } else {
                obj2 = listIterator.previous();
                if (ffkj.e(((nxm) obj2).d, eaVar.H)) {
                    break;
                }
            }
        }
        nxm nxmVar = (nxm) obj2;
        boolean z2 = z && this.b.c.isEmpty() && eaVar.s;
        Iterator it = this.b.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (ffkj.e(((ffcf) next).a, eaVar.H)) {
                obj = next;
                break;
            }
        }
        ffcf ffcfVar = (ffcf) obj;
        if (ffcfVar != null) {
            this.b.c.remove(ffcfVar);
        }
        if (!z2 && obl.l()) {
            Log.v("FragmentNavigator", a.j(nxmVar, eaVar, "OnBackStackChangedCommitted for fragment ", " associated with entry "));
        }
        boolean z3 = ffcfVar != null && ((Boolean) ffcfVar.b).booleanValue();
        if (!z && !z3 && nxmVar == null) {
            throw new IllegalArgumentException(a.i(eaVar, "The fragment ", " is unknown to the FragmentNavigator. Please use the navigate() function to add fragments to the FragmentNavigator managed FragmentManager."));
        }
        if (nxmVar != null) {
            this.b.m(eaVar, this.a);
            if (z2) {
                if (obl.l()) {
                    Log.v("FragmentNavigator", a.k(nxmVar, eaVar, "OnBackStackChangedCommitted for fragment ", " popping associated entry ", " via system back"));
                }
                this.a.h(nxmVar, false);
            }
        }
    }

    @Override // defpackage.fl
    public final void c(ea eaVar, boolean z) {
        Object obj;
        eaVar.getClass();
        if (z) {
            List list = (List) this.a.f.c();
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
            nxm nxmVar = (nxm) obj;
            if (obl.l()) {
                Log.v("FragmentNavigator", a.j(nxmVar, eaVar, "OnBackStackChangedStarted for fragment ", " associated with entry "));
            }
            if (nxmVar != null) {
                oam oamVar = this.a;
                oamVar.d.f(fffi.h((Set) oamVar.d.c(), nxmVar));
                if (!((nxr) oamVar).a.f.contains(nxmVar)) {
                    throw new IllegalStateException("Cannot transition entry that is not in the back stack");
                }
                nxmVar.b(lkj.STARTED);
            }
        }
    }

    @Override // defpackage.fl
    public final /* synthetic */ void a() {
    }

    @Override // defpackage.fl
    public final void d() {
    }

    @Override // defpackage.fl
    public final /* synthetic */ void e() {
    }
}
