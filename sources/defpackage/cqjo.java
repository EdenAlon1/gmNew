package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cqjo {
    public static final cqgj a(Collection collection) {
        Object next;
        collection.getClass();
        ArrayList<cqgj> arrayList = new ArrayList();
        for (Object obj : collection) {
            if (cqjg.g((cqgj) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(ffdx.n(arrayList, 10));
        for (cqgj cqgjVar : arrayList) {
            eyja eyjaVar = (cqgjVar.c == 5 ? (cqgd) cqgjVar.d : cqgd.a).d;
            if (eyjaVar == null) {
                eyjaVar = eyja.a;
            }
            arrayList2.add(eyjaVar);
        }
        eyja eyjaVar2 = eykm.a;
        eykl eyklVar = eykl.a;
        eyklVar.getClass();
        eyja eyjaVar3 = (eyja) ffdx.R(arrayList2, eyklVar);
        ArrayList arrayList3 = new ArrayList(ffdx.n(arrayList, 10));
        for (cqgj cqgjVar2 : arrayList) {
            eyja eyjaVar4 = (cqgjVar2.c == 5 ? (cqgd) cqgjVar2.d : cqgd.a).d;
            if (eyjaVar4 == null) {
                eyjaVar4 = eyja.a;
            }
            arrayList3.add(eyjaVar4);
        }
        eykl eyklVar2 = eykl.a;
        eyklVar2.getClass();
        Iterator it = arrayList3.iterator();
        if (it.hasNext()) {
            next = it.next();
            while (it.hasNext()) {
                Object next2 = it.next();
                if (eyklVar2.compare(next, next2) > 0) {
                    next = next2;
                }
            }
        } else {
            next = null;
        }
        eyja eyjaVar5 = (eyja) next;
        cqgj cqgjVar3 = (cqgj) ffdx.M(arrayList);
        if (cqgjVar3 == null) {
            return null;
        }
        cqge cqgeVar = (cqge) cqgjVar3.toBuilder();
        cqgeVar.getClass();
        DesugarCollections.unmodifiableList(((cqgj) cqgeVar.instance).h).getClass();
        cqgs.i(cqgeVar);
        DesugarCollections.unmodifiableList(((cqgj) cqgeVar.instance).h).getClass();
        List ac = ffdx.ac(arrayList, cqgjVar3);
        cqgeVar.copyOnWrite();
        cqgj cqgjVar4 = (cqgj) cqgeVar.instance;
        cqgjVar4.a();
        eydl.addAll(ac, cqgjVar4.h);
        cqgc cqgcVar = (cqgc) cqgs.b(cqgeVar).toBuilder();
        cqgcVar.getClass();
        if (eyjaVar5 == null) {
            eyjaVar5 = cqgr.b(cqgcVar);
        }
        cqgr.c(eyjaVar5, cqgcVar);
        if (eyjaVar3 == null) {
            eyjaVar3 = cqgr.b(cqgcVar);
        }
        cqgr.d(eyjaVar3, cqgcVar);
        cqgs.f(cqgr.a(cqgcVar), cqgeVar);
        return cqgs.c(cqgeVar);
    }

    public static final cqgj b(cqgj cqgjVar) {
        cqgjVar.getClass();
        if (!cqjg.g(cqgjVar)) {
            return cqgjVar;
        }
        cqge cqgeVar = (cqge) cqgjVar.toBuilder();
        cqgeVar.getClass();
        cqgc cqgcVar = (cqgc) cqgs.b(cqgeVar).toBuilder();
        cqgcVar.getClass();
        cqgr.c(cqgr.b(cqgcVar), cqgcVar);
        cqgr.d(cqgr.b(cqgcVar), cqgcVar);
        cqgs.f(cqgr.a(cqgcVar), cqgeVar);
        return cqgs.c(cqgeVar);
    }

    public static final boolean c(cqgj cqgjVar, cqgj cqgjVar2) {
        cqgjVar.getClass();
        cqgjVar2.getClass();
        Collection<cqgj> a = cqjg.a(cqgjVar2);
        if (a.isEmpty()) {
            return false;
        }
        for (cqgj cqgjVar3 : a) {
            eyja eyjaVar = (cqgjVar3.c == 5 ? (cqgd) cqgjVar3.d : cqgd.a).f;
            if (eyjaVar == null) {
                eyjaVar = eyja.a;
            }
            eyjaVar.getClass();
            eyja eyjaVar2 = (cqgjVar.c == 4 ? (cqgb) cqgjVar.d : cqgb.a).c;
            if (eyjaVar2 == null) {
                eyjaVar2 = eyja.a;
            }
            eyjaVar2.getClass();
            eyja eyjaVar3 = eykm.a;
            if (eykl.a(eyjaVar, eyjaVar2) >= 0) {
                return true;
            }
        }
        return false;
    }
}
