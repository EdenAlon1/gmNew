package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
abstract class duuf {
    final long h;

    public duuf(long j) {
        this.h = j;
    }

    static long c(int i, int i2, int i3) {
        return (i2 << 32) | (i << 60) | i3;
    }

    public abstract int a();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof duuf) && this.h == ((duuf) obj).h;
    }

    public int hashCode() {
        return ermr.a(this.h);
    }
}
