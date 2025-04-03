package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fitl extends fita {
    private static final long serialVersionUID = -8346152187724495365L;
    private final long a;

    public fitl(firn firnVar, long j) {
        super(firnVar);
        this.a = j;
    }

    @Override // defpackage.firl
    public final long a(long j, int i) {
        return fite.b(j, i * this.a);
    }

    @Override // defpackage.firl
    public final long b(long j, long j2) {
        long j3 = this.a;
        if (j2 != 1) {
            long j4 = 0;
            if (j2 != 0) {
                j4 = j2 * j3;
                if (j4 / j3 != j2) {
                    throw new ArithmeticException(a.D(j3, j2, "Multiplication overflows a long: ", " * "));
                }
            }
            j3 = j4;
        }
        return fite.b(j, j3);
    }

    @Override // defpackage.firl
    public final long c() {
        return this.a;
    }

    @Override // defpackage.firl
    public final boolean e() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof fitl) {
            fitl fitlVar = (fitl) obj;
            if (this.d == fitlVar.d && this.a == fitlVar.a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((int) this.a) + this.d.hashCode();
    }
}
