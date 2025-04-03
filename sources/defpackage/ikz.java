package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ikz {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final boolean e;
    public final float f;
    public final int g;
    public final boolean h;
    public final List i;
    public final long j;
    public final long k;

    public ikz(long j, long j2, long j3, long j4, boolean z, float f, int i, boolean z2, List list, long j5, long j6) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = z;
        this.f = f;
        this.g = i;
        this.h = z2;
        this.i = list;
        this.j = j5;
        this.k = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ikz)) {
            return false;
        }
        ikz ikzVar = (ikz) obj;
        return ikt.b(this.a, ikzVar.a) && this.b == ikzVar.b && iak.i(this.c, ikzVar.c) && iak.i(this.d, ikzVar.d) && this.e == ikzVar.e && Float.compare(this.f, ikzVar.f) == 0 && ilq.b(this.g, ikzVar.g) && this.h == ikzVar.h && ffkj.e(this.i, ikzVar.i) && iak.i(this.j, ikzVar.j) && iak.i(this.k, ikzVar.k);
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        float f = this.f;
        boolean z = this.e;
        int a = (((((((((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + iaj.a(this.c)) * 31) + iaj.a(this.d)) * 31) + iky.a(z)) * 31) + Float.floatToIntBits(f);
        List list = this.i;
        return (((((((((a * 31) + this.g) * 31) + iky.a(this.h)) * 31) + list.hashCode()) * 31) + iaj.a(this.j)) * 31) + iaj.a(this.k);
    }

    public final String toString() {
        return "PointerInputEventData(id=" + ((Object) ikt.a(this.a)) + ", uptime=" + this.b + ", positionOnScreen=" + ((Object) iak.h(this.c)) + ", position=" + ((Object) iak.h(this.d)) + ", down=" + this.e + ", pressure=" + this.f + ", type=" + ((Object) ilq.a(this.g)) + ", activeHover=" + this.h + ", historical=" + this.i + ", scrollDelta=" + ((Object) iak.h(this.j)) + ", originalEventPosition=" + ((Object) iak.h(this.k)) + ')';
    }
}
