package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyrx {
    public static final void a(final cyrt cyrtVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(603494105);
        if (i3 == 0) {
            i2 = (true != b.D(cyrtVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
        } else {
            dwfo.a(null, null, dwfk.b(gft.a(b).D, 0L, b, 14), null, null, hpx.d(1053118795, new cyrw(cyrtVar), b), b, 196608, 27);
            b = b;
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: cyrv
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    cyrx.a(cyrt.this, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void b(final engw engwVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1524843218);
        if (i3 == 0) {
            i2 = (true != b.D(engwVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
        } else {
            enqv it = engwVar.iterator();
            it.getClass();
            while (it.hasNext()) {
                dndt dndtVar = (dndt) it.next();
                dndtVar.getClass();
                dnds.a(dndtVar, jfw.a(hvi.e, jii.a(R.string.group_member_details, b)), b, 0, 0);
            }
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: cyru
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    cyrx.b(engw.this, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
