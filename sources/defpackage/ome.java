package defpackage;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ome {
    private static final Comparator e = new omc();
    final int[] a;
    final int[] b;
    final List c;
    final omh[] d;
    private final float[] f = new float[3];

    public ome(int[] iArr, int i, omh[] omhVarArr) {
        omd omdVar;
        int i2;
        this.d = omhVarArr;
        int[] iArr2 = new int[32768];
        this.b = iArr2;
        for (int i3 = 0; i3 < iArr.length; i3++) {
            int i4 = iArr[i3];
            int g = g(Color.blue(i4), 8, 5) | (g(Color.red(i4), 8, 5) << 10) | (g(Color.green(i4), 8, 5) << 5);
            iArr[i3] = g;
            iArr2[g] = iArr2[g] + 1;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < 32768; i6++) {
            if (iArr2[i6] > 0) {
                int f = f(i6);
                kps.j(f, this.f);
                if (h(f, this.f)) {
                    iArr2[i6] = 0;
                }
            }
            if (iArr2[i6] > 0) {
                i5++;
            }
        }
        int[] iArr3 = new int[i5];
        this.a = iArr3;
        int i7 = 0;
        for (int i8 = 0; i8 < 32768; i8++) {
            if (iArr2[i8] > 0) {
                iArr3[i7] = i8;
                i7++;
            }
        }
        if (i5 <= i) {
            this.c = new ArrayList();
            for (int i9 = 0; i9 < i5; i9++) {
                int i10 = iArr3[i9];
                this.c.add(new omi(f(i10), iArr2[i10]));
            }
            return;
        }
        PriorityQueue<omd> priorityQueue = new PriorityQueue(i, e);
        priorityQueue.offer(new omd(this, 0, this.a.length - 1));
        while (priorityQueue.size() < i && (omdVar = (omd) priorityQueue.poll()) != null && omdVar.c()) {
            if (!omdVar.c()) {
                throw new IllegalStateException("Can not split a box with only 1 color");
            }
            int i11 = omdVar.e - omdVar.d;
            int i12 = omdVar.g - omdVar.f;
            int i13 = omdVar.i - omdVar.h;
            int i14 = (i11 < i12 || i11 < i13) ? (i12 < i11 || i12 < i13) ? -1 : -2 : -3;
            ome omeVar = omdVar.j;
            int[] iArr4 = omeVar.a;
            int[] iArr5 = omeVar.b;
            e(iArr4, i14, omdVar.a, omdVar.b);
            Arrays.sort(iArr4, omdVar.a, omdVar.b + 1);
            e(iArr4, i14, omdVar.a, omdVar.b);
            int i15 = omdVar.c / 2;
            int i16 = omdVar.a;
            int i17 = 0;
            while (true) {
                int i18 = omdVar.b;
                if (i16 > i18) {
                    i2 = omdVar.a;
                    break;
                }
                i17 += iArr5[iArr4[i16]];
                if (i17 >= i15) {
                    i2 = Math.min(i18 - 1, i16);
                    break;
                }
                i16++;
            }
            omd omdVar2 = new omd(omdVar.j, i2 + 1, omdVar.b);
            omdVar.b = i2;
            omdVar.b();
            priorityQueue.offer(omdVar2);
            priorityQueue.offer(omdVar);
        }
        ArrayList arrayList = new ArrayList(priorityQueue.size());
        for (omd omdVar3 : priorityQueue) {
            ome omeVar2 = omdVar3.j;
            int[] iArr6 = omeVar2.a;
            int[] iArr7 = omeVar2.b;
            int i19 = 0;
            int i20 = 0;
            int i21 = 0;
            int i22 = 0;
            for (int i23 = omdVar3.a; i23 <= omdVar3.b; i23++) {
                int i24 = iArr6[i23];
                int i25 = iArr7[i24];
                i20 += i25;
                i19 += d(i24) * i25;
                i21 += c(i24) * i25;
                i22 += i25 * b(i24);
            }
            float f2 = i20;
            omi omiVar = new omi(a(Math.round(i19 / f2), Math.round(i21 / f2), Math.round(i22 / f2)), i20);
            if (!h(omiVar.a, omiVar.a())) {
                arrayList.add(omiVar);
            }
        }
        this.c = arrayList;
    }

    static int a(int i, int i2, int i3) {
        return Color.rgb(g(i, 5, 8), g(i2, 5, 8), g(i3, 5, 8));
    }

    static int b(int i) {
        return i & 31;
    }

    static int c(int i) {
        return (i >> 5) & 31;
    }

    static int d(int i) {
        return (i >> 10) & 31;
    }

    static void e(int[] iArr, int i, int i2, int i3) {
        if (i == -2) {
            while (i2 <= i3) {
                int i4 = iArr[i2];
                iArr[i2] = b(i4) | (c(i4) << 10) | (d(i4) << 5);
                i2++;
            }
            return;
        }
        if (i != -1) {
            return;
        }
        while (i2 <= i3) {
            int i5 = iArr[i2];
            iArr[i2] = d(i5) | (b(i5) << 10) | (c(i5) << 5);
            i2++;
        }
    }

    private static int f(int i) {
        return a(d(i), c(i), b(i));
    }

    private static int g(int i, int i2, int i3) {
        return (i3 > i2 ? i << (i3 - i2) : i >> (i2 - i3)) & ((1 << i3) - 1);
    }

    private final boolean h(int i, float[] fArr) {
        int length;
        omh[] omhVarArr = this.d;
        if (omhVarArr != null && (length = omhVarArr.length) > 0) {
            for (int i2 = 0; i2 < length; i2++) {
                if (!this.d[i2].a(i, fArr)) {
                    return true;
                }
            }
        }
        return false;
    }
}
