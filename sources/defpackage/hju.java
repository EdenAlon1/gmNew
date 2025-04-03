package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hju {
    /* JADX WARN: Multi-variable type inference failed */
    public static final List a(hjv hjvVar, int i, hjv hjvVar2, boolean z, boolean z2, boolean z3) {
        ffel ffelVar;
        boolean z4;
        int i2;
        int i3;
        int j = hjvVar.j(i);
        int i4 = i + j;
        int b = hjvVar.b(i);
        int b2 = hjvVar.b(i4);
        int i5 = b2 - b;
        boolean z5 = i >= 0 && (hjvVar.b[(hjvVar.h(i) * 5) + 1] & 201326592) != 0;
        hjvVar2.E(j);
        hjvVar2.F(i5, hjvVar2.q);
        if (hjvVar.g < i4) {
            hjvVar.G(i4);
        }
        if (hjvVar.k < b2) {
            hjvVar.H(b2, i4);
        }
        int[] iArr = hjvVar2.b;
        int i6 = hjvVar2.q;
        int i7 = i6 * 5;
        ffdo.l(hjvVar.b, iArr, i7, i * 5, i4 * 5);
        Object[] objArr = hjvVar2.c;
        int i8 = hjvVar2.i;
        System.arraycopy(hjvVar.c, b, objArr, i8, i5);
        int i9 = hjvVar2.s;
        iArr[i7 + 2] = i9;
        int i10 = i6 - i;
        int i11 = i6 + j;
        int c = i8 - hjvVar2.c(iArr, i6);
        int i12 = hjvVar2.m;
        int i13 = hjvVar2.l;
        int length = objArr.length;
        boolean z6 = z5;
        int i14 = i12;
        int i15 = i6;
        while (i15 < i11) {
            int i16 = i15 * 5;
            if (i15 != i6) {
                int i17 = i16 + 2;
                iArr[i17] = iArr[i17] + i10;
            }
            int[] iArr2 = iArr;
            int c2 = hjvVar2.c(iArr, i15) + c;
            if (i14 < i15) {
                i2 = i6;
                i3 = 0;
            } else {
                i2 = i6;
                i3 = hjvVar2.k;
            }
            iArr2[i16 + 4] = hjv.W(c2, i3, i13, length);
            if (i15 == i14) {
                i14++;
            }
            i15++;
            i6 = i2;
            iArr = iArr2;
        }
        int[] iArr3 = iArr;
        hjvVar2.m = i14;
        int b3 = hjt.b(hjvVar.d, i, hjvVar.f());
        int b4 = hjt.b(hjvVar.d, i4, hjvVar.f());
        if (b3 < b4) {
            ArrayList arrayList = hjvVar.d;
            ArrayList arrayList2 = new ArrayList(b4 - b3);
            for (int i18 = b3; i18 < b4; i18++) {
                hen henVar = (hen) arrayList.get(i18);
                henVar.a += i10;
                arrayList2.add(henVar);
            }
            hjvVar2.d.addAll(hjt.b(hjvVar2.d, hjvVar2.q, hjvVar2.f()), arrayList2);
            arrayList.subList(b3, b4).clear();
            ffelVar = arrayList2;
        } else {
            ffelVar = ffel.a;
        }
        if (!ffelVar.isEmpty()) {
            HashMap hashMap = hjvVar.e;
            HashMap hashMap2 = hjvVar2.e;
            if (hashMap != null && hashMap2 != null) {
                int size = ffelVar.size();
                for (int i19 = 0; i19 < size; i19++) {
                    hen henVar2 = (hen) ffelVar.get(i19);
                    hgw hgwVar = (hgw) hashMap.get(henVar2);
                    if (hgwVar != null) {
                        hashMap.remove(henVar2);
                        hashMap2.put(henVar2, hgwVar);
                    }
                }
            }
        }
        int i20 = hjvVar2.s;
        if (hjvVar2.t(i9) != null) {
            int i21 = i20 + 1;
            int i22 = hjvVar2.q;
            while (i21 < i22) {
                i21 += hjt.a(hjvVar2.b, i21);
            }
            throw null;
        }
        int l = hjvVar.l(i);
        if (z3) {
            if (z) {
                boolean z7 = l >= 0;
                if (z7) {
                    hjvVar.M();
                    hjvVar.y(l - hjvVar.q);
                    hjvVar.M();
                }
                hjvVar.y(i - hjvVar.q);
                z4 = hjvVar.U();
                if (z7) {
                    hjvVar.K();
                    hjvVar.X();
                    hjvVar.K();
                    hjvVar.X();
                }
            } else {
                boolean V = hjvVar.V(i, j);
                hjvVar.J(b, i5, i - 1);
                z4 = V;
            }
            if (z4) {
                hfp.j("Unexpectedly removed anchors");
            }
        }
        int i23 = hjvVar2.o;
        int i24 = iArr3[i7 + 1];
        hjvVar2.o = i23 + ((1073741824 & i24) != 0 ? 1 : i24 & 67108863);
        if (z2) {
            hjvVar2.q = i11;
            hjvVar2.i = i8 + i5;
        }
        if (z6) {
            hjvVar2.Q(i9);
        }
        return ffelVar;
    }
}
