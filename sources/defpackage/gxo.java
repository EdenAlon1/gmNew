package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gxo {
    public static final gxo a;
    public final gxe b;
    public final List c;
    public final List d;
    public final float e;
    public final float f;
    public final boolean g;
    private final float h;
    private final float i;
    private final float j;
    private final float k;
    private final cmp l;
    private final cmp m;

    static {
        gxe gxeVar = gxe.a;
        ffel ffelVar = ffel.a;
        a = new gxo(gxeVar, ffelVar, ffelVar, 0.0f, 0.0f, 0.0f, 0.0f);
    }

    public gxo(gxe gxeVar, List list, List list2, float f, float f2, float f3, float f4) {
        this.b = gxeVar;
        this.c = list;
        this.d = list2;
        this.e = f;
        this.f = f2;
        this.h = f3;
        this.i = f4;
        float max = list.isEmpty() ? 0.0f : Math.max(((gxd) ffdx.K((List) ffdx.P(list))).c - ((gxd) ffdx.K((List) ffdx.K(list))).c, f3);
        this.j = max;
        float max2 = list2.isEmpty() ? 0.0f : Math.max(((gxd) ffdx.P((List) ffdx.K(list2))).c - ((gxd) ffdx.P((List) ffdx.P(list2))).c, f4);
        this.k = max2;
        this.l = gxr.b(max, list, true);
        this.m = gxr.b(max2, list2, false);
        this.g = (gxeVar.isEmpty() || f == 0.0f || a() == 0.0f) ? false : true;
    }

    public final float a() {
        return this.b.c().a;
    }

    public final gxe b(float f, float f2, boolean z) {
        gxm gxmVar;
        float f3 = this.j;
        float max = Math.max(0.0f, f);
        float max2 = Math.max(0.0f, f2 - this.k);
        if (f3 <= max && max <= max2) {
            return this.b;
        }
        float a2 = gxr.a(1.0f, 0.0f, 0.0f, f3, max);
        cmp cmpVar = this.l;
        List list = this.c;
        if (max > max2) {
            a2 = gxr.a(0.0f, 1.0f, max2, f2, max);
            cmpVar = this.m;
            list = this.d;
        }
        int size = list.size();
        float a3 = cmpVar.a(0);
        ffev it = ffmk.q(1, size).iterator();
        while (true) {
            if (!((ffmi) it).a) {
                gxmVar = new gxm(0, 0, 0.0f);
                break;
            }
            int a4 = it.a();
            float a5 = cmpVar.a(a4);
            if (a2 <= a5) {
                gxmVar = new gxm(a4 - 1, a4, gxr.a(0.0f, 1.0f, a3, a5, a2));
                break;
            }
            a3 = a5;
        }
        if (z) {
            return (gxe) list.get(ffln.b(gxmVar.c) == 0 ? gxmVar.a : gxmVar.b);
        }
        gxe gxeVar = (gxe) list.get(gxmVar.a);
        gxe gxeVar2 = (gxe) list.get(gxmVar.b);
        float f4 = gxmVar.c;
        ArrayList arrayList = new ArrayList(gxeVar.a());
        int a6 = gxeVar.a();
        for (int i = 0; i < a6; i++) {
            arrayList.add(gxf.a(gxeVar.get(i), gxeVar2.get(i), f4));
        }
        return new gxe(arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gxo)) {
            return false;
        }
        boolean z = this.g;
        if (!z && !((gxo) obj).g) {
            return true;
        }
        gxo gxoVar = (gxo) obj;
        return z == gxoVar.g && this.e == gxoVar.e && this.f == gxoVar.f && this.h == gxoVar.h && this.i == gxoVar.i && a() == gxoVar.a() && this.j == gxoVar.j && this.k == gxoVar.k && ffkj.e(this.l, gxoVar.l) && ffkj.e(this.m, gxoVar.m) && ffkj.e(this.b, gxoVar.b);
    }

    public final int hashCode() {
        if (!this.g) {
            return gxn.a(false);
        }
        return (((((((((((((((((((gxn.a(true) * 31) + Float.floatToIntBits(this.e)) * 31) + Float.floatToIntBits(this.f)) * 31) + Float.floatToIntBits(this.h)) * 31) + Float.floatToIntBits(this.i)) * 31) + Float.floatToIntBits(a())) * 31) + Float.floatToIntBits(this.j)) * 31) + Float.floatToIntBits(this.k)) * 31) + this.l.hashCode()) * 31) + this.m.hashCode()) * 31) + this.b.hashCode();
    }
}
