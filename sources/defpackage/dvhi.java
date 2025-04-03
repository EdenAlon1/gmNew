package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvhi implements emva {
    @Override // defpackage.emva
    public final /* synthetic */ boolean b(Object obj, Object obj2) {
        if (obj != null) {
            ewai ewaiVar = (ewai) obj;
            if (ewaiVar.b == 4) {
                dvdt dvdtVar = ((dvgj) obj2).a;
                if (dvdtVar.b == 2) {
                    dvdx dvdxVar = (dvdx) dvdtVar.c;
                    ewan ewanVar = (ewan) ewaiVar.c;
                    ewal b = ewal.b(dvdxVar.b);
                    if (b == null) {
                        b = ewal.UNKNOWN;
                    }
                    ewal b2 = ewal.b(ewanVar.d);
                    if (b2 == null) {
                        b2 = ewal.UNKNOWN;
                    }
                    if (b != b2) {
                        return false;
                    }
                    if (ewanVar.c.size() == 0) {
                        return true;
                    }
                    Iterator<E> it = dvdxVar.c.iterator();
                    while (it.hasNext()) {
                        if (dvgy.b(((dvdw) it.next()).b, ewanVar)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
