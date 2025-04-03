package defpackage;

import j$.util.DesugarCollections;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dwap {
    public static final void a(int i, boolean z, epmd epmdVar, epnx[] epnxVarArr, epmt epmtVar, dvzz dvzzVar) {
        epnx epnxVar = epnxVarArr[i];
        if (epnxVar.d(epmo.a)) {
            z = true;
        } else if (z) {
            eyfw eyfwVar = epmo.a;
            epoa epoaVar = (epoa) epnxVar.instance;
            epnxVar.e(eyfwVar, Long.valueOf((epoaVar.c << 32) | (epoaVar.d & 4294967295L)));
        }
        boolean z2 = z;
        Iterator it = DesugarCollections.unmodifiableList(((epoa) epnxVar.instance).e).iterator();
        while (it.hasNext()) {
            a(((Integer) it.next()).intValue(), z2, epmdVar, epnxVarArr, epmtVar, dvzzVar);
        }
    }

    public static final void b(erhm erhmVar, dvzy dvzyVar, dvzz dvzzVar, epmd epmdVar) {
        if (dvzzVar.b.size() == 1) {
            epmdVar.copyOnWrite();
            epme epmeVar = (epme) epmdVar.instance;
            epme epmeVar2 = epme.a;
            epmeVar.e = erhmVar;
            epmeVar.b |= 2;
            return;
        }
        erhk erhkVar = dvzw.a(dvzyVar).d;
        if (erhkVar == null) {
            erhkVar = erhk.a;
        }
        erhm erhmVar2 = erhkVar.e;
        if (erhmVar2 == null) {
            erhmVar2 = erhm.a;
        }
        epmdVar.copyOnWrite();
        epme epmeVar3 = (epme) epmdVar.instance;
        epme epmeVar4 = epme.a;
        erhmVar2.getClass();
        epmeVar3.e = erhmVar2;
        epmeVar3.b |= 2;
    }
}
