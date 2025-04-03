package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fitn extends fitc {
    private static final long serialVersionUID = -3205227092378684157L;
    private final int b;

    public fitn(firl firlVar, firn firnVar) {
        super(firlVar, firnVar);
        this.b = 100;
    }

    @Override // defpackage.fitc, defpackage.firl
    public final long a(long j, int i) {
        return this.a.b(j, i * 100);
    }

    @Override // defpackage.fitc, defpackage.firl
    public final long b(long j, long j2) {
        long j3 = j2 * 100;
        if (j3 / 100 == j2) {
            return this.a.b(j, j3);
        }
        throw new ArithmeticException(a.y(j2, "Multiplication overflows a long: ", " * 100"));
    }

    @Override // defpackage.fitc, defpackage.firl
    public final long c() {
        return this.a.c() * 100;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof fitn) {
            fitn fitnVar = (fitn) obj;
            if (this.a.equals(fitnVar.a) && this.d == fitnVar.d) {
                int i = fitnVar.b;
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + 100 + this.a.hashCode();
    }
}
