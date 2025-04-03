package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iin extends iij {
    public final String a;
    public final List b;
    public final int c;
    public final ibq d;
    public final float e;
    public final ibq f;
    public final float g;
    public final float h;
    public final int i;
    public final int j;
    public final float k;
    public final float l;
    public final float m;
    public final float n;

    public iin(String str, List list, int i, ibq ibqVar, float f, ibq ibqVar2, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7) {
        this.a = str;
        this.b = list;
        this.c = i;
        this.d = ibqVar;
        this.e = f;
        this.f = ibqVar2;
        this.g = f2;
        this.h = f3;
        this.i = i2;
        this.j = i3;
        this.k = f4;
        this.l = f5;
        this.m = f6;
        this.n = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            iin iinVar = (iin) obj;
            return ffkj.e(this.a, iinVar.a) && ffkj.e(this.d, iinVar.d) && this.e == iinVar.e && ffkj.e(this.f, iinVar.f) && this.g == iinVar.g && this.h == iinVar.h && idm.a(this.i, iinVar.i) && idn.a(this.j, iinVar.j) && this.k == iinVar.k && this.l == iinVar.l && this.m == iinVar.m && this.n == iinVar.n && icw.a(this.c, iinVar.c) && ffkj.e(this.b, iinVar.b);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        ibq ibqVar = this.d;
        int hashCode2 = ((((hashCode * 31) + (ibqVar != null ? ibqVar.hashCode() : 0)) * 31) + Float.floatToIntBits(this.e)) * 31;
        ibq ibqVar2 = this.f;
        return ((((((((((((((((((hashCode2 + (ibqVar2 != null ? ibqVar2.hashCode() : 0)) * 31) + Float.floatToIntBits(this.g)) * 31) + Float.floatToIntBits(this.h)) * 31) + this.i) * 31) + this.j) * 31) + Float.floatToIntBits(this.k)) * 31) + Float.floatToIntBits(this.l)) * 31) + Float.floatToIntBits(this.m)) * 31) + Float.floatToIntBits(this.n)) * 31) + this.c;
    }
}
