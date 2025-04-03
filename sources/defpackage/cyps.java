package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyps {
    public static final void a(final cypq cypqVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(2018364944);
        if (i3 == 0) {
            i2 = (true != b.D(cypqVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
        } else {
            enqv it = cypqVar.a.iterator();
            it.getClass();
            while (it.hasNext()) {
                dndt dndtVar = (dndt) it.next();
                if (dndtVar instanceof dnlz) {
                    b.v(-360836010);
                    dnly.k((dnlz) dndtVar, null, jpo.y(gft.d(b).l, 0L, kal.c(13), null, null, null, null, 0L, null, 0, 0, 0L, null, null, 0, 16777213), null, null, null, null, null, b, 0, 0, 2042);
                    ((hfm) b).Z();
                } else {
                    b.v(-360831417);
                    dndtVar.getClass();
                    dnds.a(dndtVar, null, b, 0, 2);
                    ((hfm) b).Z();
                }
            }
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: cypr
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    cyps.a(cypq.this, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
