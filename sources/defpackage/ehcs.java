package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehcs {
    public final ehcr a;
    public final List b;
    public final List c;
    public final float d;
    public final float e;
    private final float[] f;
    private final float[] g;

    public ehcs(ehcr ehcrVar, List list, List list2) {
        this.a = ehcrVar;
        this.b = DesugarCollections.unmodifiableList(list);
        this.c = DesugarCollections.unmodifiableList(list2);
        float f = ((ehcr) list.get(list.size() - 1)).b().a - ehcrVar.b().a;
        this.d = f;
        float f2 = ehcrVar.d().a - ((ehcr) list2.get(list2.size() - 1)).d().a;
        this.e = f2;
        this.f = g(f, list, true);
        this.g = g(f2, list2, false);
    }

    public static ehcr d(ehcr ehcrVar, int i, int i2, float f, int i3, int i4, int i5) {
        ArrayList arrayList = new ArrayList(ehcrVar.c);
        arrayList.add(i2, (ehcq) arrayList.remove(i));
        ehcp ehcpVar = new ehcp(ehcrVar.a, i5);
        int i6 = 0;
        while (i6 < arrayList.size()) {
            ehcq ehcqVar = (ehcq) arrayList.get(i6);
            float f2 = ehcqVar.d;
            ehcpVar.g(f + (f2 / 2.0f), ehcqVar.c, f2, i6 >= i3 && i6 <= i4, ehcqVar.e, ehcqVar.f);
            f += ehcqVar.d;
            i6++;
        }
        return ehcpVar.b();
    }

    public static ehcr e(ehcr ehcrVar, float f, int i) {
        return d(ehcrVar, 0, 0, f, ehcrVar.d, ehcrVar.e, i);
    }

    public static ehcr f(ehcr ehcrVar, float f, int i, boolean z, float f2) {
        int i2;
        ArrayList arrayList = new ArrayList(ehcrVar.c);
        ehcp ehcpVar = new ehcp(ehcrVar.a, i);
        Iterator it = ehcrVar.c.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            if (((ehcq) it.next()).e) {
                i3++;
            }
        }
        float size = f / (ehcrVar.c.size() - i3);
        float f3 = true != z ? 0.0f : f;
        int i4 = 0;
        while (i4 < arrayList.size()) {
            ehcq ehcqVar = (ehcq) arrayList.get(i4);
            if (ehcqVar.e) {
                ehcpVar.g(ehcqVar.b, ehcqVar.c, ehcqVar.d, false, true, ehcqVar.f);
                i2 = i4;
            } else {
                boolean z2 = i4 >= ehcrVar.d && i4 <= ehcrVar.e;
                float f4 = ehcqVar.d - size;
                float a = ehcn.a(f4, ehcrVar.a, f2);
                float f5 = f3 + (f4 / 2.0f);
                float abs = Math.abs(f5 - ehcqVar.b);
                float f6 = ehcqVar.f;
                i2 = i4;
                float f7 = true != z ? 0.0f : abs;
                if (true == z) {
                    abs = 0.0f;
                }
                ehcpVar.d(f5, a, f4, z2, false, f6, f7, abs);
                f3 += f4;
            }
            i4 = i2 + 1;
        }
        return ehcpVar.b();
    }

    private static float[] g(float f, List list, boolean z) {
        int size = list.size();
        float[] fArr = new float[size];
        int i = 1;
        while (i < size) {
            int i2 = i - 1;
            ehcr ehcrVar = (ehcr) list.get(i2);
            ehcr ehcrVar2 = (ehcr) list.get(i);
            fArr[i] = i == size + (-1) ? 1.0f : fArr[i2] + ((z ? ehcrVar2.b().a - ehcrVar.b().a : ehcrVar.d().a - ehcrVar2.d().a) / f);
            i++;
        }
        return fArr;
    }

    public final ehcr a() {
        return (ehcr) this.c.get(this.c.size() - 1);
    }

    public final ehcr b(float f, float f2, float f3) {
        float a;
        List list;
        float[] fArr;
        float[] fArr2;
        float f4 = c().a().g;
        float f5 = a().a().h;
        float f6 = this.d;
        float f7 = f6 + f2;
        if (f6 == f4) {
            f7 += f4;
        }
        float f8 = this.e;
        float f9 = f3 - f8;
        if (f8 == f5) {
            f9 -= f5;
        }
        if (f < f7) {
            a = egyv.a(1.0f, 0.0f, f2, f7, f);
            list = this.b;
            fArr = this.f;
        } else {
            if (f <= f9) {
                return this.a;
            }
            a = egyv.a(0.0f, 1.0f, f9, f3, f);
            list = this.c;
            fArr = this.g;
        }
        int size = list.size();
        float f10 = fArr[0];
        int i = 1;
        while (true) {
            if (i >= size) {
                fArr2 = new float[]{0.0f, 0.0f, 0.0f};
                break;
            }
            float f11 = fArr[i];
            if (a <= f11) {
                fArr2 = new float[]{egyv.a(0.0f, 1.0f, f10, f11, a), i - 1, i};
                break;
            }
            i++;
            f10 = f11;
        }
        ehcr ehcrVar = (ehcr) list.get((int) fArr2[1]);
        ehcr ehcrVar2 = (ehcr) list.get((int) fArr2[2]);
        float f12 = fArr2[0];
        if (ehcrVar.a != ehcrVar2.a) {
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same item size.");
        }
        List list2 = ehcrVar.c;
        List list3 = ehcrVar2.c;
        if (list2.size() != list3.size()) {
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same number of keylines.");
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < ehcrVar.c.size(); i2++) {
            ehcq ehcqVar = (ehcq) list2.get(i2);
            ehcq ehcqVar2 = (ehcq) list3.get(i2);
            float f13 = ehcqVar.a;
            float f14 = f13 + ((ehcqVar2.a - f13) * f12);
            float f15 = ehcqVar.b;
            float f16 = f15 + ((ehcqVar2.b - f15) * f12);
            float f17 = ehcqVar.c;
            float f18 = f17 + ((ehcqVar2.c - f17) * f12);
            float f19 = ehcqVar.d;
            arrayList.add(new ehcq(f14, f16, f18, f19 + ((ehcqVar2.d - f19) * f12), false, 0.0f, 0.0f, 0.0f));
        }
        return new ehcr(ehcrVar.a, arrayList, egyv.b(ehcrVar.d, ehcrVar2.d, f12), egyv.b(ehcrVar.e, ehcrVar2.e, f12), ehcrVar.f);
    }

    public final ehcr c() {
        return (ehcr) this.b.get(this.b.size() - 1);
    }
}
