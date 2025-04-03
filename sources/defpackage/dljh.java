package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dljh implements dljz {
    @Override // defpackage.dljz
    public final Object a(ffji ffjiVar, List list) {
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ewfv b = ewfv.b(((ewfp) it.next()).c);
                if (b == null) {
                    b = ewfv.UNRECOGNIZED;
                }
                if (b == ewfv.TYPE_RULE) {
                    return null;
                }
            }
        }
        if (ffjiVar != null) {
            return new dljg(ffjiVar);
        }
        return null;
    }
}
