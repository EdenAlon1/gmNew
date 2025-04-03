package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eehq {
    public static final eelw a(eeit eeitVar, String str, eekh eekhVar, eekg eekgVar, eekt eektVar, eell eellVar, List list, eekw eekwVar) {
        eelw eelwVar = new eelw(new eelf(str, eeitVar));
        eelwVar.p(eekhVar);
        eelwVar.p(eekgVar);
        eelwVar.p(eektVar);
        eelwVar.p(eellVar);
        eelwVar.m("Via");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            eelwVar.k((eeku) it.next());
        }
        eelwVar.p(eekwVar);
        return eelwVar;
    }
}
