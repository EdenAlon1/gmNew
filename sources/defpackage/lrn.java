package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lrn {
    public final Object a;
    public final int b;
    public final lqw c;
    public final Object d;
    public final int e;
    public final long f;
    public final long g;
    public final int h;
    public final int i;

    static {
        lvf.N(0);
        lvf.N(1);
        lvf.N(2);
        lvf.N(3);
        lvf.N(4);
        lvf.N(5);
        lvf.N(6);
    }

    public lrn(Object obj, int i, lqw lqwVar, Object obj2, int i2, long j, long j2, int i3, int i4) {
        this.a = obj;
        this.b = i;
        this.c = lqwVar;
        this.d = obj2;
        this.e = i2;
        this.f = j;
        this.g = j2;
        this.h = i3;
        this.i = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            lrn lrnVar = (lrn) obj;
            if (this.b == lrnVar.b && this.e == lrnVar.e && this.f == lrnVar.f && this.g == lrnVar.g && this.h == lrnVar.h && this.i == lrnVar.i && emxb.a(this.c, lrnVar.c) && emxb.a(this.a, lrnVar.a) && emxb.a(this.d, lrnVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), this.c, this.d, Integer.valueOf(this.e), Long.valueOf(this.f), Long.valueOf(this.g), Integer.valueOf(this.h), Integer.valueOf(this.i)});
    }
}
