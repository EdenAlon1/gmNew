package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efzy implements lms {
    private final Map a;

    public efzy(Map map) {
        this.a = map;
    }

    @Override // defpackage.lms
    public final lml a(Class cls) {
        ffbr ffbrVar = (ffbr) this.a.get(cls);
        if (ffbrVar == null) {
            Iterator<E> it = ((enhk) this.a).entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (cls.isAssignableFrom((Class) entry.getKey())) {
                    ffbrVar = (ffbr) entry.getValue();
                    break;
                }
            }
        }
        if (ffbrVar != null) {
            return (lml) ffbrVar.b();
        }
        throw new IllegalArgumentException("Unknown ViewModel class ".concat(cls.toString()));
    }

    @Override // defpackage.lms
    public final /* synthetic */ lml b(Class cls, lnx lnxVar) {
        return lmr.c(this, cls);
    }

    @Override // defpackage.lms
    public final /* synthetic */ lml c(ffmo ffmoVar, lnx lnxVar) {
        return lmr.a(this, ffmoVar, lnxVar);
    }
}
