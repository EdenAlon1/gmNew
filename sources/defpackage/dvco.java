package defpackage;

import j$.time.Duration;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvco {
    public static final Duration a(evtz evtzVar, evvt evvtVar) {
        Object obj;
        evtzVar.getClass();
        evvtVar.getClass();
        eygr eygrVar = evtzVar.c;
        eygrVar.getClass();
        Iterator<E> it = eygrVar.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            evvt b = evvt.b(((evtx) obj).c);
            if (b == null) {
                b = evvt.UNRECOGNIZED;
            }
            if (b.equals(evvtVar)) {
                break;
            }
        }
        evtx evtxVar = (evtx) obj;
        if (evtxVar != null) {
            eyev eyevVar = evtxVar.d;
            if (eyevVar == null) {
                eyevVar = eyev.a;
            }
            if (eyevVar != null) {
                return eykn.c(eyevVar);
            }
        }
        eyev eyevVar2 = evtzVar.d;
        if (eyevVar2 == null) {
            eyevVar2 = eyev.a;
        }
        if (eyki.a(eyevVar2, eyki.a) <= 0) {
            return null;
        }
        eyev eyevVar3 = evtzVar.d;
        if (eyevVar3 == null) {
            eyevVar3 = eyev.a;
        }
        eyevVar3.getClass();
        return eykn.c(eyevVar3);
    }
}
