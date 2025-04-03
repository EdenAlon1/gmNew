package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enyv {
    public static List a(int i, int i2, enxk enxkVar) {
        int a;
        int a2;
        ArrayList arrayList = new ArrayList(i);
        ArrayList arrayList2 = new ArrayList();
        int i3 = 0;
        while (i3 < i) {
            long e = enxkVar.e();
            long j = e / 6;
            int i4 = (int) (e % 6);
            if (e < 0) {
                throw new IOException("Invalid face: " + i4 + ", from faceAndCount: " + e);
            }
            int i5 = (int) j;
            if (i5 < 0) {
                throw new IOException("Invalid count: " + i5 + ", from faceAndCount: " + e);
            }
            enyt enytVar = new enyt(i4, i5);
            arrayList2.add(enytVar);
            i3 += enytVar.b;
        }
        Iterator it = arrayList2.iterator();
        Iterator emptyIterator = !it.hasNext() ? Collections.emptyIterator() : new enys(it);
        enyu enyuVar = new enyu();
        enyu enyuVar2 = new enyu();
        for (int i6 = 0; i6 < i; i6++) {
            if (i6 == 0) {
                int i7 = (i2 + 7) >> 3;
                int i8 = i7 + i7;
                byte[] bArr = new byte[i8];
                if (enxkVar.a.read(bArr) < i8) {
                    throw new IOException("EOF");
                }
                long reverseBytes = Long.reverseBytes(ermr.c(Arrays.copyOf(bArr, 8)));
                a = enyuVar.a(enxi.c(reverseBytes));
                a2 = enyuVar2.a(enxi.b(reverseBytes));
            } else {
                long e2 = enxkVar.e();
                a = enyuVar.a(enxi.a(enxi.c(e2)));
                a2 = enyuVar2.a(enxi.a(enxi.b(e2)));
            }
            arrayList.add(enyr.m(enzn.i(((Integer) emptyIterator.next()).intValue(), enzn.c(b(a, i2)), enzn.c(b(a2, i2)))));
        }
        int d = enxkVar.d();
        if (d > i) {
            throw new IOException("Number of off-center points is greater than total amount of points.");
        }
        for (int i9 = 0; i9 < d; i9++) {
            try {
                arrayList.set(enxkVar.d(), new enyr(enxkVar.b(), enxkVar.b(), enxkVar.b()));
            } catch (IndexOutOfBoundsException e3) {
                throw new IOException("Insufficient or invalid data: ", e3);
            }
        }
        return arrayList;
    }

    private static double b(int i, int i2) {
        return (i + 0.5d) / (1 << i2);
    }
}
