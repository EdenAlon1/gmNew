package defpackage;

import android.util.Property;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehll extends Property {
    public ehll(Class cls) {
        super(cls, "animationFraction");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        int[] iArr = ehln.a;
        return Float.valueOf(((ehln) obj).f);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        int i;
        ehln ehlnVar = (ehln) obj;
        float floatValue = ((Float) obj2).floatValue();
        ehlnVar.f = floatValue;
        float f = floatValue * 6000.0f;
        ehlx ehlxVar = (ehlx) ehlnVar.k.get(0);
        float f2 = ehlnVar.f * 1080.0f;
        int[] iArr = ehln.a;
        int length = iArr.length;
        int i2 = 0;
        float f3 = 0.0f;
        while (true) {
            i = (int) f;
            if (i2 >= 4) {
                break;
            }
            f3 += ehlnVar.c.getInterpolation(ehln.f(i, iArr[i2], 500)) * 90.0f;
            i2++;
        }
        ehlxVar.g = f2 + f3;
        float interpolation = ehlnVar.c.getInterpolation(ehln.f(i, 0, 3000)) - ehlnVar.c.getInterpolation(ehln.f(i, 3000, 3000));
        ehlxVar.a = 0.0f;
        float[] fArr = ehln.b;
        float a = ehjj.a(fArr[0], fArr[1], interpolation);
        ehlxVar.b = a;
        float f4 = ehlnVar.g;
        if (f4 > 0.0f) {
            ehlxVar.b = a * (1.0f - f4);
        }
        int i3 = 0;
        while (true) {
            int[] iArr2 = ehln.a;
            int length2 = iArr2.length;
            if (i3 >= 4) {
                break;
            }
            float f5 = ehln.f(i, iArr2[i3], 100);
            if (f5 >= 0.0f && f5 <= 1.0f) {
                int i4 = i3 + ehlnVar.e;
                int[] iArr3 = ehlnVar.d.c;
                int length3 = iArr3.length;
                int i5 = i4 % length3;
                int i6 = (i5 + 1) % length3;
                int i7 = iArr3[i5];
                int i8 = iArr3[i6];
                ((ehlx) ehlnVar.k.get(0)).c = egyx.a(ehlnVar.c.getInterpolation(f5), Integer.valueOf(i7), Integer.valueOf(i8)).intValue();
                break;
            }
            i3++;
        }
        ehlnVar.j.invalidateSelf();
    }
}
