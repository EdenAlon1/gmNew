package defpackage;

import android.graphics.Bitmap;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class omg {
    public static final omj a(Bitmap bitmap, List list, int i, List list2) {
        float f;
        float f2;
        int width = bitmap.getWidth() * bitmap.getHeight();
        double sqrt = width > 12544 ? Math.sqrt(12544.0d / width) : -1.0d;
        int i2 = 0;
        Bitmap createScaledBitmap = sqrt <= eobe.a ? bitmap : Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * sqrt), (int) Math.ceil(bitmap.getHeight() * sqrt), false);
        int width2 = createScaledBitmap.getWidth();
        int height = createScaledBitmap.getHeight();
        int[] iArr = new int[width2 * height];
        createScaledBitmap.getPixels(iArr, 0, width2, 0, 0, width2, height);
        ome omeVar = new ome(iArr, i, list2.isEmpty() ? null : (omh[]) list2.toArray(new omh[list2.size()]));
        if (createScaledBitmap != bitmap) {
            createScaledBitmap.recycle();
        }
        omj omjVar = new omj(omeVar.c, list);
        int size = omjVar.c.size();
        int i3 = 0;
        while (i3 < size) {
            omk omkVar = (omk) omjVar.c.get(i3);
            float f3 = 0.0f;
            float f4 = 0.0f;
            for (int i4 = i2; i4 < 3; i4++) {
                float f5 = omkVar.i[i4];
                if (f5 > 0.0f) {
                    f4 += f5;
                }
            }
            if (f4 != 0.0f) {
                for (int i5 = i2; i5 < 3; i5++) {
                    float[] fArr = omkVar.i;
                    float f6 = fArr[i5];
                    if (f6 > 0.0f) {
                        fArr[i5] = f6 / f4;
                    }
                }
            }
            cpn cpnVar = omjVar.d;
            int size2 = omjVar.b.size();
            int i6 = i2;
            float f7 = 0.0f;
            omi omiVar = null;
            while (i6 < size2) {
                omi omiVar2 = (omi) omjVar.b.get(i6);
                float[] a = omiVar2.a();
                float f8 = a[1];
                float[] fArr2 = omkVar.g;
                if (f8 >= fArr2[i2] && f8 <= fArr2[2]) {
                    float f9 = a[2];
                    float[] fArr3 = omkVar.h;
                    if (f9 >= fArr3[i2] && f9 <= fArr3[2] && !omjVar.e.get(omiVar2.a)) {
                        float[] a2 = omiVar2.a();
                        omi omiVar3 = omjVar.f;
                        int i7 = omiVar3 != null ? omiVar3.b : 1;
                        float c = omkVar.c() > f3 ? omkVar.c() * (1.0f - Math.abs(a2[1] - omkVar.g[1])) : f3;
                        if (omkVar.a() > f3) {
                            f = f3;
                            f2 = omkVar.a() * (1.0f - Math.abs(a2[2] - omkVar.h[1]));
                        } else {
                            f = f3;
                            f2 = f;
                        }
                        float b = c + f2 + (omkVar.b() > f ? omkVar.b() * (omiVar2.b / i7) : f);
                        if (omiVar == null || b > f7) {
                            omiVar = omiVar2;
                            f7 = b;
                        }
                        i6++;
                        f3 = f;
                        i2 = 0;
                    }
                }
                f = f3;
                i6++;
                f3 = f;
                i2 = 0;
            }
            if (omiVar != null) {
                boolean z = omkVar.j;
                omjVar.e.append(omiVar.a, true);
            } else {
                omiVar = null;
            }
            cpnVar.put(omkVar, omiVar);
            i3++;
            i2 = 0;
        }
        omjVar.e.clear();
        return omjVar;
    }
}
