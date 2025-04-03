package defpackage;

import com.android.vcard.VCardConfig;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class efo {
    public static final List a(int i, int i2, int i3) {
        int i4 = i - (i3 * (i2 - 1));
        int i5 = i4 / i2;
        int i6 = i4 % i2;
        ArrayList arrayList = new ArrayList(i2);
        int i7 = 0;
        while (i7 < i2) {
            arrayList.add(Integer.valueOf((i7 < i6 ? 1 : 0) + i5));
            i7++;
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(defpackage.efh r27, defpackage.hvi r28, defpackage.ehh r29, defpackage.ebe r30, defpackage.dxq r31, defpackage.dxi r32, defpackage.dpq r33, boolean r34, defpackage.dik r35, defpackage.ffji r36, defpackage.hfd r37, int r38, int r39, int r40) {
        /*
            Method dump skipped, instructions count: 704
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.efo.b(efh, hvi, ehh, ebe, dxq, dxi, dpq, boolean, dik, ffji, hfd, int, int, int):void");
    }

    @ffbs
    public static final /* synthetic */ void c(efh efhVar, hvi hviVar, ehh ehhVar, ebe ebeVar, dxq dxqVar, dxi dxiVar, dpq dpqVar, boolean z, ffji ffjiVar, hfd hfdVar, int i) {
        efh efhVar2;
        int i2;
        dxq dxqVar2;
        ffji ffjiVar2;
        hfd hfdVar2;
        ebe ebeVar2;
        dpq dpqVar2;
        boolean z2;
        boolean z3;
        ebe ebfVar;
        dpq a;
        int i3 = i & 6;
        hfd b = hfdVar.b(1485410512);
        if (i3 == 0) {
            efhVar2 = efhVar;
            i2 = (true != b.D(efhVar2) ? 2 : 4) | i;
        } else {
            efhVar2 = efhVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(hviVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.D(ehhVar) ? 128 : 256;
        }
        int i4 = i2 | 27648;
        if ((196608 & i) == 0) {
            dxqVar2 = dxqVar;
            i4 |= true != b.D(dxqVar2) ? 65536 : 131072;
        } else {
            dxqVar2 = dxqVar;
        }
        if ((1572864 & i) == 0) {
            i4 |= true != b.D(dxiVar) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i4 |= 4194304;
        }
        int i5 = i4 | 100663296;
        if ((805306368 & i) == 0) {
            ffjiVar2 = ffjiVar;
            i5 |= true != b.F(ffjiVar2) ? VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES : 536870912;
        } else {
            ffjiVar2 = ffjiVar;
        }
        if (b.J((306783379 & i5) != 306783378, i5 & 1)) {
            b.t();
            if ((i & 1) == 0 || b.G()) {
                z3 = true;
                ebfVar = new ebf(0.0f, 0.0f, 0.0f, 0.0f);
                a = drg.a(b);
            } else {
                b.s();
                ebfVar = ebeVar;
                a = dpqVar;
                z3 = z;
            }
            b.l();
            hfdVar2 = b;
            b(efhVar2, hviVar, ehhVar, ebfVar, dxqVar2, dxiVar, a, z3, dim.a(b), ffjiVar2, hfdVar2, i5 & 239075326, (i5 >> 27) & 14, 0);
            ebeVar2 = ebfVar;
            dpqVar2 = a;
            z2 = z3;
        } else {
            hfdVar2 = b;
            hfdVar2.s();
            ebeVar2 = ebeVar;
            dpqVar2 = dpqVar;
            z2 = z;
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new efm(efhVar, hviVar, ehhVar, ebeVar2, dxqVar, dxiVar, dpqVar2, z2, ffjiVar, i);
        }
    }
}
