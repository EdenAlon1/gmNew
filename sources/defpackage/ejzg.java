package defpackage;

import android.util.Log;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejzg implements ejze {
    private static final int b(List list, List list2, int i, int i2, int i3, int i4, emwj emwjVar) {
        for (int i5 = 0; i5 < i3; i5++) {
            int i6 = i5 * i4;
            if (!emwjVar.d(list.get(i + i6), list2.get(i6 + i2))) {
                return i5;
            }
        }
        return i3;
    }

    private static final void c(List list, List list2, int i, int i2, vk vkVar) {
        int size = i < 0 ? list.size() + i : i;
        if (i < 0) {
            i += list2.size();
        }
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = size + i3;
            if (!efaz.a(list.get(i4), list2.get(i + i3))) {
                vkVar.q(i4);
            }
        }
    }

    @Override // defpackage.ejze
    public final void a(List list, List list2, emwj emwjVar, vk vkVar) {
        int[] iArr;
        boolean z;
        if (Log.isLoggable("TTDataService", 3)) {
            Log.d("TTDataService", "Source Items:      ".concat(list.toString()));
            Log.d("TTDataService", "Destination Items: ".concat(String.valueOf(String.valueOf(list2))));
        }
        int size = list.size();
        int size2 = list2.size();
        int min = Math.min(size, size2);
        List list3 = list;
        List list4 = list2;
        int b = b(list3, list4, 0, 0, min, 1, emwjVar);
        if (b == size && size == size2) {
            c(list3, list4, 0, b, vkVar);
            return;
        }
        int b2 = b(list3, list4, size - 1, size2 - 1, min - b, -1, emwjVar);
        if (Log.isLoggable("TTDataService", 3)) {
            Log.d("TTDataService", a.h(b, "Start Index:  "));
            Log.d("TTDataService", a.h(b2, "End Trim:     "));
        }
        int i = size - b2;
        int i2 = size2 - b2;
        if (b > Math.min(i, i2)) {
            vkVar.p();
            return;
        }
        c(list3, list4, 0, b, vkVar);
        c(list3, list4, -b2, b2, vkVar);
        int i3 = i2 - b;
        int[] iArr2 = new int[Math.min(i - b, i3)];
        int[] iArr3 = new int[i3];
        int i4 = b;
        int i5 = 0;
        boolean z2 = false;
        int i6 = 0;
        while (i4 < i) {
            Object obj = list3.get(i4);
            int i7 = b;
            while (true) {
                if (i7 >= i2) {
                    iArr = iArr2;
                    z = false;
                    break;
                }
                Object obj2 = list4.get(i7);
                if (emwjVar.d(obj, obj2)) {
                    int i8 = i7 - b;
                    iArr = iArr2;
                    if (iArr3[i8] == 1) {
                        vkVar.p();
                        return;
                    }
                    iArr[i5] = i8;
                    iArr3[i8] = 1;
                    z2 |= !(i4 == i7);
                    i5++;
                    if (!efaz.a(obj, obj2)) {
                        vkVar.q(i4 - i6);
                    }
                    z = true;
                } else {
                    i7++;
                    list4 = list2;
                }
            }
            if (!z) {
                vkVar.y(i4 - i6);
                i6++;
            }
            i4++;
            list3 = list;
            list4 = list2;
            iArr2 = iArr;
        }
        int[] iArr4 = iArr2;
        if (i5 == 0) {
            vkVar.w(b, i3);
            return;
        }
        int i9 = 0;
        for (int i10 = 0; i10 < i3; i10++) {
            if (iArr3[i10] == 1) {
                iArr3[i10] = i9;
                i9++;
            } else {
                iArr3[i10] = -1;
            }
        }
        for (int i11 = 0; i11 < i5; i11++) {
            iArr4[i11] = iArr3[iArr4[i11]];
        }
        if (i3 - i5 != 0) {
            int i12 = 0;
            for (int i13 = i3 - 1; i13 >= 0; i13--) {
                if (iArr3[i13] == -1) {
                    i12++;
                    iArr3[i3 - i12] = i13;
                }
            }
        }
        if (z2) {
            for (int i14 = 0; i14 < i5; i14++) {
                iArr3[i14] = i14;
            }
            if (Log.isLoggable("TTDataService", 3)) {
                Log.d("TTDataService", "Async Source Positions:      ".concat(String.valueOf(Arrays.toString(iArr3))));
                Log.d("TTDataService", "Async Destination Positions: ".concat(String.valueOf(Arrays.toString(iArr4))));
            }
            int i15 = i5 - 1;
            int i16 = 0;
            while (i16 < i5) {
                int i17 = i16 + 1;
                for (int i18 = i17; i18 < i5; i18++) {
                    int i19 = iArr3[i16];
                    int i20 = iArr3[i18];
                    if (i19 < i20) {
                        iArr3[i18] = i20 - 1;
                    }
                }
                for (int i21 = i15; i21 >= 0; i21--) {
                    int i22 = iArr4[i15];
                    int i23 = iArr4[i21];
                    if (i22 < i23) {
                        iArr4[i21] = i23 - 1;
                    }
                }
                i15--;
                i16 = i17;
            }
            int i24 = 0;
            while (i24 < i5) {
                int i25 = i24 + 1;
                for (int i26 = i25; i26 < i5; i26++) {
                    int i27 = iArr4[i24];
                    int i28 = iArr3[i26];
                    if (i27 > i28) {
                        iArr4[i24] = i27 + 1;
                    } else {
                        iArr3[i26] = i28 + 1;
                    }
                }
                i24 = i25;
            }
            if (Log.isLoggable("TTDataService", 3)) {
                Log.d("TTDataService", "Sync Source Positions:      ".concat(String.valueOf(Arrays.toString(iArr3))));
                Log.d("TTDataService", "Sync Destination Positions: ".concat(String.valueOf(Arrays.toString(iArr4))));
            }
            for (int i29 = 0; i29 < i5; i29++) {
                int i30 = iArr3[i29] + b;
                int i31 = iArr4[i29] + b;
                if (i30 != i31) {
                    vkVar.t(i30, i31);
                }
            }
        }
        while (i5 < i3) {
            vkVar.s(iArr3[i5] + b);
            i5++;
        }
    }
}
