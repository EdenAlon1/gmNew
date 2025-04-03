package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmxy {
    public static final void a(final dmxz dmxzVar, hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        final hvi hviVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1332291043);
        if (i3 == 0) {
            i2 = (true != b.D(dmxzVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(hviVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
            hviVar2 = hviVar;
        } else {
            hviVar2 = hviVar;
            dwfj.e(dmxzVar.c, hviVar2, false, null, null, null, hpx.d(83767770, new dmxx(dmxzVar, dmxzVar.b ? dmzz.s : dmzz.r), b), b, (i2 & 112) | 805306368, 508);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dmxw
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dmxz dmxzVar2 = dmxz.this;
                    int i4 = i;
                    dmxy.a(dmxzVar2, hviVar2, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
