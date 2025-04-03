package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mtl {
    public final Object a;
    public final int b;
    public final int c;
    public final long d;
    public final int e;

    private mtl(Object obj, int i, int i2, long j, int i3) {
        this.a = obj;
        this.b = i;
        this.c = i2;
        this.d = j;
        this.e = i3;
    }

    public final mtl a(Object obj) {
        return this.a.equals(obj) ? this : new mtl(obj, this.b, this.c, this.d, this.e);
    }

    public final boolean b() {
        return this.b != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mtl)) {
            return false;
        }
        mtl mtlVar = (mtl) obj;
        return this.a.equals(mtlVar.a) && this.b == mtlVar.b && this.c == mtlVar.c && this.d == mtlVar.d && this.e == mtlVar.e;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() + 527) * 31) + this.b) * 31) + this.c) * 31) + ((int) this.d)) * 31) + this.e;
    }

    public mtl(Object obj) {
        this(obj, -1L);
    }

    public mtl(Object obj, long j) {
        this(obj, -1, -1, j, -1);
    }

    public mtl(Object obj, int i, int i2, long j) {
        this(obj, i, i2, j, -1);
    }

    public mtl(Object obj, long j, int i) {
        this(obj, -1, -1, j, i);
    }
}
