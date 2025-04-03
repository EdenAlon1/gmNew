package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class oam {
    public final obq b = new obq();
    public final fgcm c;
    public final fgcm d;
    public boolean e;
    public final fgdj f;
    public final fgdj g;

    public oam() {
        fgcm a = fgdm.a(ffel.a);
        this.c = a;
        fgcm a2 = fgdm.a(ffen.a);
        this.d = a2;
        this.f = new fgco(a);
        this.g = new fgco(a2);
    }

    public abstract nxm a(nzh nzhVar, Bundle bundle);

    public void d(nxm nxmVar) {
        throw null;
    }

    public void e(nxm nxmVar, boolean z) {
        synchronized (this.b) {
            fgcm fgcmVar = this.c;
            Iterable iterable = (Iterable) fgcmVar.c();
            ArrayList arrayList = new ArrayList();
            for (Object obj : iterable) {
                if (ffkj.e((nxm) obj, nxmVar)) {
                    break;
                } else {
                    arrayList.add(obj);
                }
            }
            fgcmVar.f(arrayList);
        }
    }

    public void f(nxm nxmVar) {
        throw null;
    }

    public final void g(nxm nxmVar) {
        int i;
        synchronized (this.b) {
            List am = ffdx.am((Collection) this.f.c());
            ListIterator listIterator = am.listIterator(am.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    i = -1;
                    break;
                } else if (ffkj.e(((nxm) listIterator.previous()).d, nxmVar.d)) {
                    i = listIterator.nextIndex();
                    break;
                }
            }
            am.set(i, nxmVar);
            this.c.f(am);
        }
    }

    public final void h(nxm nxmVar, boolean z) {
        Object obj;
        Iterable iterable = (Iterable) this.d.c();
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((nxm) it.next()) == nxmVar) {
                    Iterable iterable2 = (Iterable) this.f.c();
                    if ((iterable2 instanceof Collection) && ((Collection) iterable2).isEmpty()) {
                        return;
                    }
                    Iterator it2 = iterable2.iterator();
                    while (it2.hasNext()) {
                        if (((nxm) it2.next()) == nxmVar) {
                        }
                    }
                    return;
                }
            }
        }
        fgcm fgcmVar = this.d;
        fgcmVar.f(fffi.h((Set) fgcmVar.c(), nxmVar));
        List list = (List) this.f.c();
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            nxm nxmVar2 = (nxm) obj;
            if (!ffkj.e(nxmVar2, nxmVar) && ((List) this.f.c()).lastIndexOf(nxmVar2) < ((List) this.f.c()).lastIndexOf(nxmVar)) {
                break;
            }
        }
        nxm nxmVar3 = (nxm) obj;
        if (nxmVar3 != null) {
            fgcm fgcmVar2 = this.d;
            fgcmVar2.f(fffi.h((Set) fgcmVar2.c(), nxmVar3));
        }
        e(nxmVar, z);
    }

    public final void i(nxm nxmVar) {
        nxmVar.getClass();
        Iterable iterable = (Iterable) this.d.c();
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((nxm) it.next()) == nxmVar) {
                    Iterable iterable2 = (Iterable) this.f.c();
                    if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                        Iterator it2 = iterable2.iterator();
                        while (it2.hasNext()) {
                            if (((nxm) it2.next()) == nxmVar) {
                                return;
                            }
                        }
                    }
                }
            }
        }
        nxm nxmVar2 = (nxm) ffdx.Q((List) this.f.c());
        if (nxmVar2 != null) {
            fgcm fgcmVar = this.d;
            fgcmVar.f(fffi.h((Set) fgcmVar.c(), nxmVar2));
        }
        fgcm fgcmVar2 = this.d;
        fgcmVar2.f(fffi.h((Set) fgcmVar2.c(), nxmVar));
        f(nxmVar);
    }
}
