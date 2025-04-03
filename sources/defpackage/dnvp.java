package defpackage;

import java.util.LinkedHashSet;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnvp {
    public static final /* synthetic */ int a = 0;
    private static final hik b = new hky(new ffix() { // from class: dnvk
        @Override // defpackage.ffix
        public final Object invoke() {
            int i = dnvp.a;
            return new LinkedHashSet();
        }
    });

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0267  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final defpackage.dnvr r22, java.lang.String r23, boolean r24, defpackage.hfd r25, final int r26, final int r27) {
        /*
            Method dump skipped, instructions count: 719
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dnvp.a(dnvr, java.lang.String, boolean, hfd, int, int):void");
    }

    public static final void b(final dnvj dnvjVar, final String str, final boolean z, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b2 = hfdVar.b(-358282337);
        if (i3 == 0) {
            i2 = (true != b2.D(dnvjVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b2.D(str) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b2.E(z) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && b2.I()) {
            b2.s();
        } else {
            doqc doqcVar = new doqc(str, new doqa(dnvjVar.a, null, null, 30));
            hvi hviVar = hvi.e;
            if (!z) {
                hviVar = dlsj.c(hvi.e);
            }
            dopz.c(doqcVar, hviVar, false, b2, 384);
        }
        hio L = b2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dnvl
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dnvj dnvjVar2 = dnvj.this;
                    int i4 = i;
                    String str2 = str;
                    int a2 = hip.a(i4 | 1);
                    dnvp.b(dnvjVar2, str2, z, (hfd) obj, a2);
                    return ffcu.a;
                }
            };
        }
    }

    private static final boolean c(dnvr dnvrVar) {
        return (dnvrVar.a == null && dnvrVar.b == null && dnvrVar.c == null) ? false : true;
    }
}
