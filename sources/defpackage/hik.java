package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class hik<T> extends hfw<T> {
    public hik(ffix ffixVar) {
        super(ffixVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.hfw
    public final hld b(hil hilVar, hld hldVar) {
        hgr hgrVar = null;
        if (hldVar instanceof hgr) {
            if (hilVar.d) {
                hgrVar = (hgr) hldVar;
                hgrVar.a.b(hilVar.a());
            }
        } else if (hldVar instanceof hkz) {
            if ((hilVar.b || hilVar.e != null) && !hilVar.d) {
                hkz hkzVar = (hkz) hldVar;
                if (ffkj.e(hilVar.a(), hkzVar.a)) {
                    hgrVar = hkzVar;
                }
            }
        } else if (hldVar instanceof hgg) {
            ffji ffjiVar = ((hgg) hldVar).a;
        }
        if (hgrVar != null) {
            return hgrVar;
        }
        if (!hilVar.d) {
            return new hkz(hilVar.a());
        }
        Object obj = hilVar.e;
        hke hkeVar = hilVar.c;
        if (hkeVar == null) {
            hkeVar = hla.a;
        }
        return new hgr(new hic(obj, hkeVar));
    }

    public abstract hil c(Object obj);

    public final hil d(Object obj) {
        hil c = c(obj);
        c.f = false;
        return c;
    }
}
