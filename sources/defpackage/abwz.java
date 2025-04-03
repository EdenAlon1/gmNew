package defpackage;

import java.lang.reflect.Array;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abwz {
    /* JADX WARN: Multi-variable type inference failed */
    public static int[][] a(engw engwVar, engw engwVar2) {
        int size = engwVar.size() + 1;
        int i = ((enou) engwVar2).c + 1;
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, size, i);
        iArr[0][0] = 0;
        for (int i2 = 1; i2 < size; i2++) {
            iArr[i2][0] = i2;
        }
        for (int i3 = 1; i3 < i; i3++) {
            iArr[0][i3] = i3;
        }
        for (int i4 = 1; i4 < size; i4++) {
            int i5 = i4 - 1;
            abxb abxbVar = (abxb) engwVar.get(i5);
            for (int i6 = 1; i6 < i; i6++) {
                int i7 = i6 - 1;
                int i8 = !abxbVar.equals((abxb) engwVar2.get(i7)) ? 1 : 0;
                int[] iArr2 = iArr[i4];
                int[] iArr3 = iArr[i5];
                int i9 = iArr3[i7] + i8;
                int i10 = iArr3[i6] + 1;
                int i11 = iArr2[i7] + 1;
                if (i9 >= i10 || i9 >= i11) {
                    i9 = i10 < i11 ? i10 : i11;
                }
                iArr2[i6] = i9;
            }
        }
        return iArr;
    }
}
