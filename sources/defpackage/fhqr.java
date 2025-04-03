package defpackage;

import java.math.BigInteger;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhqr {
    public final BigInteger a;
    public final BigInteger b;
    public final BigInteger c;
    public final fhqs d;

    public fhqr(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, fhqs fhqsVar) {
        this.a = bigInteger3;
        this.c = bigInteger;
        this.b = bigInteger2;
        this.d = fhqsVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fhqr)) {
            return false;
        }
        fhqr fhqrVar = (fhqr) obj;
        return fhqrVar.c.equals(this.c) && fhqrVar.b.equals(this.b) && fhqrVar.a.equals(this.a);
    }

    public final int hashCode() {
        return (this.c.hashCode() ^ this.b.hashCode()) ^ this.a.hashCode();
    }
}
