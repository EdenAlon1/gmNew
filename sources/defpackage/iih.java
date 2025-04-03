package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iih extends iij implements Iterable, fflg {
    public final String a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final List i;
    public final List j;

    public iih(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, List list2) {
        this.a = str;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = f5;
        this.g = f6;
        this.h = f7;
        this.i = list;
        this.j = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof iih)) {
            iih iihVar = (iih) obj;
            return ffkj.e(this.a, iihVar.a) && this.b == iihVar.b && this.c == iihVar.c && this.d == iihVar.d && this.e == iihVar.e && this.f == iihVar.f && this.g == iihVar.g && this.h == iihVar.h && ffkj.e(this.i, iihVar.i) && ffkj.e(this.j, iihVar.j);
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((((((((((this.a.hashCode() * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c)) * 31) + Float.floatToIntBits(this.d)) * 31) + Float.floatToIntBits(this.e)) * 31) + Float.floatToIntBits(this.f)) * 31) + Float.floatToIntBits(this.g)) * 31) + Float.floatToIntBits(this.h)) * 31) + this.i.hashCode()) * 31) + this.j.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator<iij> iterator() {
        return new iig(this);
    }

    public iih() {
        this("", 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, iii.a, ffel.a);
    }
}
