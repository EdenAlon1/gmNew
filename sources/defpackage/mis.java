package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mis {
    public final long a;
    public final lru b;
    public final int c;
    public final mtl d;
    public final long e;
    public final lru f;
    public final int g;
    public final mtl h;
    public final long i;
    public final long j;

    public mis(long j, lru lruVar, int i, mtl mtlVar, long j2, lru lruVar2, int i2, mtl mtlVar2, long j3, long j4) {
        this.a = j;
        this.b = lruVar;
        this.c = i;
        this.d = mtlVar;
        this.e = j2;
        this.f = lruVar2;
        this.g = i2;
        this.h = mtlVar2;
        this.i = j3;
        this.j = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            mis misVar = (mis) obj;
            if (this.a == misVar.a && this.c == misVar.c && this.e == misVar.e && this.g == misVar.g && this.i == misVar.i && this.j == misVar.j && emxb.a(this.b, misVar.b) && emxb.a(this.d, misVar.d) && emxb.a(this.f, misVar.f) && emxb.a(this.h, misVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), this.b, Integer.valueOf(this.c), this.d, Long.valueOf(this.e), this.f, Integer.valueOf(this.g), this.h, Long.valueOf(this.i), Long.valueOf(this.j)});
    }
}
