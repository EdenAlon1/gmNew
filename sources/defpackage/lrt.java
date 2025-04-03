package defpackage;

import android.net.Uri;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lrt {
    public static final Object a = new Object();
    private static final lqw q;

    @Deprecated
    public Object c;
    public long e;
    public long f;
    public long g;
    public boolean h;
    public boolean i;
    public lqs j;
    public boolean k;
    public long l;
    public long m;
    public int n;
    public int o;
    public long p;
    public Object b = a;
    public lqw d = q;

    static {
        lql lqlVar = new lql();
        lqlVar.b("androidx.media3.common.Timeline");
        lqlVar.a = Uri.EMPTY;
        q = lqlVar.a();
        lvf.N(1);
        lvf.N(2);
        lvf.N(3);
        lvf.N(4);
        lvf.N(5);
        lvf.N(6);
        lvf.N(7);
        lvf.N(8);
        lvf.N(9);
        lvf.N(10);
        lvf.N(11);
        lvf.N(12);
        lvf.N(13);
    }

    public final long a() {
        return lvf.z(this.l);
    }

    public final long b() {
        return lvf.z(this.m);
    }

    public final boolean c() {
        return this.j != null;
    }

    public final void d(Object obj, lqw lqwVar, boolean z, boolean z2, lqs lqsVar, long j) {
        this.b = obj;
        if (lqwVar == null) {
            lqwVar = q;
        }
        this.d = lqwVar;
        this.c = null;
        this.e = -9223372036854775807L;
        this.f = -9223372036854775807L;
        this.g = -9223372036854775807L;
        this.h = z;
        this.i = z2;
        this.j = lqsVar;
        this.l = 0L;
        this.m = j;
        this.n = 0;
        this.o = 0;
        this.p = 0L;
        this.k = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass().equals(obj.getClass())) {
            lrt lrtVar = (lrt) obj;
            Object obj2 = this.b;
            Object obj3 = lrtVar.b;
            int i = lvf.a;
            if (Objects.equals(obj2, obj3) && Objects.equals(this.d, lrtVar.d) && Objects.equals(null, null) && Objects.equals(this.j, lrtVar.j) && this.e == lrtVar.e && this.f == lrtVar.f && this.g == lrtVar.g && this.h == lrtVar.h && this.i == lrtVar.i && this.k == lrtVar.k && this.l == lrtVar.l && this.m == lrtVar.m && this.n == lrtVar.n && this.o == lrtVar.o && this.p == lrtVar.p) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((this.b.hashCode() + 217) * 31) + this.d.hashCode();
        lqs lqsVar = this.j;
        int hashCode2 = ((hashCode * 961) + (lqsVar == null ? 0 : lqsVar.hashCode())) * 31;
        long j = this.e;
        int i = (hashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.g;
        int i3 = (((((((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.h ? 1 : 0)) * 31) + (this.i ? 1 : 0)) * 31) + (this.k ? 1 : 0)) * 31;
        long j4 = this.l;
        int i4 = (i3 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.m;
        int i5 = (((((i4 + ((int) (j5 ^ (j5 >>> 32)))) * 31) + this.n) * 31) + this.o) * 31;
        long j6 = this.p;
        return i5 + ((int) (j6 ^ (j6 >>> 32)));
    }
}
