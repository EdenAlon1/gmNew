package defpackage;

import android.util.Log;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oaw implements lkp {
    final /* synthetic */ oax a;

    public oaw(oax oaxVar) {
        this.a = oaxVar;
    }

    @Override // defpackage.lkp
    public final void hg(lkr lkrVar, lki lkiVar) {
        int i;
        int ordinal = lkiVar.ordinal();
        if (ordinal == 0) {
            dn dnVar = (dn) lkrVar;
            Iterable iterable = (Iterable) this.a.f().f.c();
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    if (ffkj.e(((nxm) it.next()).d, dnVar.H)) {
                        return;
                    }
                }
            }
            dnVar.hw();
            return;
        }
        Object obj = null;
        if (ordinal == 2) {
            dn dnVar2 = (dn) lkrVar;
            for (Object obj2 : (Iterable) this.a.f().g.c()) {
                if (ffkj.e(((nxm) obj2).d, dnVar2.H)) {
                    obj = obj2;
                }
            }
            nxm nxmVar = (nxm) obj;
            if (nxmVar != null) {
                this.a.f().d(nxmVar);
                return;
            }
            return;
        }
        if (ordinal != 4) {
            if (ordinal != 5) {
                return;
            }
            dn dnVar3 = (dn) lkrVar;
            for (Object obj3 : (Iterable) this.a.f().g.c()) {
                if (ffkj.e(((nxm) obj3).d, dnVar3.H)) {
                    obj = obj3;
                }
            }
            nxm nxmVar2 = (nxm) obj;
            if (nxmVar2 != null) {
                this.a.f().d(nxmVar2);
            }
            dnVar3.P().d(this);
            return;
        }
        dn dnVar4 = (dn) lkrVar;
        if (dnVar4.hn().isShowing()) {
            return;
        }
        List list = (List) this.a.f().f.c();
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                if (ffkj.e(((nxm) listIterator.previous()).d, dnVar4.H)) {
                    i = listIterator.nextIndex();
                    break;
                }
            } else {
                i = -1;
                break;
            }
        }
        nxm nxmVar3 = (nxm) ffdx.N(list, i);
        if (!ffkj.e(ffdx.Q(list), nxmVar3)) {
            Log.i("DialogFragmentNavigator", a.i(dnVar4, "Dialog ", " was dismissed while it was not the top of the back stack, popping all dialogs above this dismissed dialog"));
        }
        if (nxmVar3 != null) {
            this.a.k(i, nxmVar3, false);
        }
    }
}
