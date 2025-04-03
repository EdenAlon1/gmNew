package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iku {
    public final long a;
    public final long b;
    public final long c;
    public final boolean d;
    public final float e;
    public final long f;
    public final long g;
    public final boolean h;
    public final int i;
    public final long j;
    public final long k;
    public iku l;
    private List m;
    private boolean n;
    private boolean o;

    public iku(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, long j6) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = z;
        this.e = f;
        this.f = j4;
        this.g = j5;
        this.h = z2;
        this.i = i;
        this.j = j6;
        this.k = 0L;
        this.n = z3;
        this.o = z3;
    }

    public final List a() {
        List list = this.m;
        return list == null ? ffel.a : list;
    }

    public final void b() {
        iku ikuVar = this.l;
        if (ikuVar != null) {
            ikuVar.b();
        } else {
            this.n = true;
            this.o = true;
        }
    }

    public final boolean c() {
        iku ikuVar = this.l;
        return ikuVar != null ? ikuVar.c() : this.n || this.o;
    }

    public final String toString() {
        return "PointerInputChange(id=" + ((Object) ikt.a(this.a)) + ", uptimeMillis=" + this.b + ", position=" + ((Object) iak.h(this.c)) + ", pressed=" + this.d + ", pressure=" + this.e + ", previousUptimeMillis=" + this.f + ", previousPosition=" + ((Object) iak.h(this.g)) + ", previousPressed=" + this.h + ", isConsumed=" + c() + ", type=" + ((Object) ilq.a(this.i)) + ", historical=" + a() + ",scrollDelta=" + ((Object) iak.h(this.j)) + ')';
    }

    public /* synthetic */ iku(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, int i, List list, long j6, long j7) {
        this(j, j2, j3, z, f, j4, j5, z2, false, i, j6);
        this.m = list;
        this.k = j7;
    }
}
