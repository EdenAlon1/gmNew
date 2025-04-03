package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaqd {
    public static final void a(final aaqb aaqbVar, hfd hfdVar, final int i) {
        int i2 = i & 1;
        hfd b = hfdVar.b(1604746169);
        if (i2 == 0 && b.I()) {
            b.s();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: aaqc
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i3 = i;
                    aaqd.a(aaqb.this, (hfd) obj, hip.a(i3 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
