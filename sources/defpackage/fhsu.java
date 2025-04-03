package defpackage;

import java.math.BigInteger;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class fhsu {
    protected final fhtd c;
    protected fhsx d;
    protected fhsx e;
    protected BigInteger f;
    protected BigInteger g;
    protected int h = 0;

    protected fhsu(fhtd fhtdVar) {
        this.c = fhtdVar;
    }

    public fhta b(BigInteger bigInteger, BigInteger bigInteger2) {
        throw null;
    }

    public abstract fhsx c(BigInteger bigInteger);

    protected abstract fhta d(fhsx fhsxVar, fhsx fhsxVar2);

    public abstract fhta e();

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof fhsu) && g((fhsu) obj);
        }
        return true;
    }

    public final fhta f(fhta fhtaVar) {
        if (this == fhtaVar.b) {
            return fhtaVar;
        }
        if (fhtaVar.n()) {
            return e();
        }
        fhta j = fhtaVar.j();
        return b(j.c.c(), j.c().c());
    }

    public final boolean g(fhsu fhsuVar) {
        if (this != fhsuVar) {
            return fhsuVar != null && this.c.equals(fhsuVar.c) && this.d.c().equals(fhsuVar.d.c()) && this.e.c().equals(fhsuVar.e.c());
        }
        return true;
    }

    public final int hashCode() {
        return (this.c.hashCode() ^ Integer.rotateLeft(this.d.c().hashCode(), 8)) ^ Integer.rotateLeft(this.e.c().hashCode(), 16);
    }
}
