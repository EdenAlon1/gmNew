package defpackage;

import android.util.Property;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehlg extends Property {
    public ehlg(Class cls) {
        super(cls, "animationFraction");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        int[] iArr = ehli.a;
        return Float.valueOf(((ehli) obj).g);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        int i;
        ehli ehliVar = (ehli) obj;
        float floatValue = ((Float) obj2).floatValue();
        ehliVar.g = floatValue;
        float f = floatValue * 5400.0f;
        ehlx ehlxVar = (ehlx) ehliVar.k.get(0);
        float f2 = ehliVar.g * 1520.0f;
        ehlxVar.a = (-20.0f) + f2;
        ehlxVar.b = f2;
        int i2 = 0;
        while (true) {
            i = (int) f;
            if (i2 >= 4) {
                break;
            }
            ehlxVar.b += ehliVar.d.getInterpolation(ehli.f(i, ehli.a[i2], 667)) * 250.0f;
            ehlxVar.a += ehliVar.d.getInterpolation(ehli.f(i, ehli.b[i2], 667)) * 250.0f;
            i2++;
        }
        float f3 = ehlxVar.a;
        float f4 = ehlxVar.b;
        float f5 = f3 + ((f4 - f3) * ehliVar.h);
        ehlxVar.a = f5;
        ehlxVar.a = f5 / 360.0f;
        ehlxVar.b = f4 / 360.0f;
        int i3 = 0;
        while (true) {
            if (i3 >= 4) {
                break;
            }
            float f6 = ehli.f(i, ehli.c[i3], 333);
            if (f6 > 0.0f && f6 < 1.0f) {
                int i4 = i3 + ehliVar.f;
                int[] iArr = ehliVar.e.c;
                int length = iArr.length;
                int i5 = i4 % length;
                int i6 = (i5 + 1) % length;
                int i7 = iArr[i5];
                int i8 = iArr[i6];
                ((ehlx) ehliVar.k.get(0)).c = egyx.a(ehliVar.d.getInterpolation(f6), Integer.valueOf(i7), Integer.valueOf(i8)).intValue();
                break;
            }
            i3++;
        }
        ehliVar.j.invalidateSelf();
    }
}
