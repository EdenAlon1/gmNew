package defpackage;

import androidx.car.app.model.Alert;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ebk {
    public static final ipo a(ebj ebjVar, int i, int i2, int i3, int i4, int i5, ipq ipqVar, List list, iqk[] iqkVarArr, int i6, int i7, int[] iArr, int i8) {
        int i9;
        int i10;
        float f;
        ipl iplVar;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17 = i3;
        int i18 = i4;
        List list2 = list;
        int i19 = i7 - i6;
        int[] iArr2 = new int[i19];
        int i20 = i6;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        float f2 = 0.0f;
        int i24 = 0;
        while (true) {
            int i25 = Alert.DURATION_SHOW_INDEFINITELY;
            if (i20 >= i7) {
                break;
            }
            ipl iplVar2 = (ipl) list2.get(i20);
            float a = ebi.a(ebi.b(iplVar2));
            if (a > 0.0f) {
                f2 += a;
                i21++;
                i12 = i20;
            } else {
                int i26 = i17 - i22;
                int i27 = i18 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i18;
                iqk iqkVar = iqkVarArr[i20];
                if (iqkVar == null) {
                    if (i17 == Integer.MAX_VALUE) {
                        i12 = i20;
                        i14 = i22;
                        i15 = i26;
                    } else {
                        i12 = i20;
                        i14 = i22;
                        if (i26 < 0) {
                            i15 = i26;
                            i16 = i27;
                            i25 = 0;
                            i13 = i21;
                            iqkVar = iplVar2.e(ebjVar.i(0, i25, i16, false));
                        } else {
                            i25 = i26;
                            i15 = i25;
                        }
                    }
                    i16 = i27;
                    i13 = i21;
                    iqkVar = iplVar2.e(ebjVar.i(0, i25, i16, false));
                } else {
                    i12 = i20;
                    i13 = i21;
                    i14 = i22;
                    i15 = i26;
                }
                iqk iqkVar2 = iqkVar;
                int g = ebjVar.g(iqkVar2);
                int f3 = ebjVar.f(iqkVar2);
                iArr2[i12 - i6] = g;
                int i28 = i15 - g;
                if (i28 < 0) {
                    i28 = 0;
                }
                i23 = Math.min(i5, i28);
                i22 = i14 + g + i23;
                i24 = Math.max(i24, f3);
                iqkVarArr[i12] = iqkVar2;
                i21 = i13;
            }
            i20 = i12 + 1;
        }
        int i29 = i22;
        if (i21 == 0) {
            i10 = i29 - i23;
            i9 = 0;
        } else {
            i9 = i17 - i29;
            long j = i5;
            if (i17 == Integer.MAX_VALUE) {
                i17 = i;
            }
            long j2 = j * (r19 - 1);
            long j3 = (i17 - i29) - j2;
            if (j3 < 0) {
                j3 = 0;
            }
            float f4 = j3 / f2;
            int i30 = i6;
            int i31 = i7;
            while (i30 < i31) {
                long round = j3 - Math.round(ebi.a(ebi.b((ipl) list2.get(i30))) * f4);
                i30++;
                j3 = round;
            }
            int i32 = i6;
            int i33 = 0;
            while (i32 < i31) {
                if (iqkVarArr[i32] == null) {
                    ipl iplVar3 = (ipl) list2.get(i32);
                    f = f4;
                    ebl b = ebi.b(iplVar3);
                    float a2 = ebi.a(b);
                    if (i18 == Integer.MAX_VALUE) {
                        iplVar = iplVar3;
                        i11 = Alert.DURATION_SHOW_INDEFINITELY;
                    } else {
                        iplVar = iplVar3;
                        i11 = i18;
                    }
                    if (a2 <= 0.0f) {
                        edc.b("All weights <= 0 should have placeables");
                    }
                    int signum = Long.signum(j3);
                    j3 -= signum;
                    int max = Math.max(0, Math.round(a2 * f) + signum);
                    iqk e = iplVar.e(ebjVar.i(((b == null || b.b) && max != Integer.MAX_VALUE) ? max : 0, max, i11, true));
                    int g2 = ebjVar.g(e);
                    int f5 = ebjVar.f(e);
                    iArr2[i32 - i6] = g2;
                    i33 += g2;
                    i24 = Math.max(i24, f5);
                    iqkVarArr[i32] = e;
                } else {
                    f = f4;
                }
                i32++;
                i18 = i4;
                f4 = f;
                list2 = list;
                i31 = i7;
            }
            int i34 = (int) (i33 + j2);
            if (i34 < 0) {
                i34 = 0;
            }
            if (i34 <= i9) {
                i9 = i34;
            }
            i10 = i29;
        }
        int i35 = i9 + i10;
        if (i35 < 0) {
            i35 = 0;
        }
        int max2 = Math.max(i35, i);
        int max3 = Math.max(i24, Math.max(i2, 0));
        int[] iArr3 = new int[i19];
        ebjVar.h(max2, iArr2, iArr3, ipqVar);
        return ebjVar.j(iqkVarArr, ipqVar, iArr3, max2, max3, iArr, i8, i6, i7);
    }
}
