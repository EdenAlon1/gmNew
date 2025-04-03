package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fisw extends fita {
    private static final long serialVersionUID = -485345310999208286L;
    final firl a;
    final boolean b;
    final firk c;

    public fisw(firl firlVar, firk firkVar) {
        super(firlVar.d());
        if (!firlVar.f()) {
            throw new IllegalArgumentException();
        }
        this.a = firlVar;
        this.b = fisx.O(firlVar);
        this.c = firkVar;
    }

    private final int g(long j) {
        int b = this.c.b(j);
        long j2 = b;
        if (((j - j2) ^ j) >= 0 || (j ^ j2) >= 0) {
            return b;
        }
        throw new ArithmeticException("Subtracting time zone offset caused overflow");
    }

    private final int h(long j) {
        int a = this.c.a(j);
        long j2 = a;
        if (((j + j2) ^ j) >= 0 || (j ^ j2) < 0) {
            return a;
        }
        throw new ArithmeticException("Adding time zone offset caused overflow");
    }

    @Override // defpackage.firl
    public final long a(long j, int i) {
        int h = h(j);
        boolean z = this.b;
        long a = this.a.a(j + h, i);
        if (!z) {
            h = g(a);
        }
        return a - h;
    }

    @Override // defpackage.firl
    public final long b(long j, long j2) {
        int h = h(j);
        boolean z = this.b;
        long b = this.a.b(j + h, j2);
        if (!z) {
            h = g(b);
        }
        return b - h;
    }

    @Override // defpackage.firl
    public final long c() {
        return this.a.c();
    }

    @Override // defpackage.firl
    public final boolean e() {
        return this.b ? this.a.e() : this.a.e() && this.c.k();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof fisw) {
            fisw fiswVar = (fisw) obj;
            if (this.a.equals(fiswVar.a) && this.c.equals(fiswVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        firk firkVar = this.c;
        return firkVar.hashCode() ^ this.a.hashCode();
    }
}
