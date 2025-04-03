package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dwas {
    static erhm a(dvzx dvzxVar, boolean z) {
        List b = dvzxVar.b();
        for (int i = !z ? 1 : 0; i < b.size(); i++) {
            dvxr dvxrVar = (dvxr) b.get(i);
            erhk erhkVar = dvxrVar.d;
            if (erhkVar == null) {
                erhkVar = erhk.a;
            }
            if ((erhkVar.b & 2048) != 0) {
                erhk erhkVar2 = dvxrVar.d;
                if (erhkVar2 == null) {
                    erhkVar2 = erhk.a;
                }
                erhm erhmVar = erhkVar2.e;
                return erhmVar == null ? erhm.a : erhmVar;
            }
        }
        return null;
    }
}
