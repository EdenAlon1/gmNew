package defpackage;

import java.math.BigInteger;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhqp {
    private BigInteger a;
    private BigInteger b;
    private BigInteger c;

    public fhqp(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, int i) {
        if (i > bigInteger.bitLength() && !ficz.b("org.bouncycastle.dh.allow_unsafe_p_value")) {
            throw new IllegalArgumentException("unsafe p value so small specific l required");
        }
        this.a = bigInteger2;
        this.b = bigInteger;
        this.c = bigInteger3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fhqp)) {
            return false;
        }
        fhqp fhqpVar = (fhqp) obj;
        BigInteger bigInteger = this.c;
        if (bigInteger != null) {
            if (!bigInteger.equals(fhqpVar.c)) {
                return false;
            }
        } else if (fhqpVar.c != null) {
            return false;
        }
        return fhqpVar.b.equals(this.b) && fhqpVar.a.equals(this.a);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() ^ this.a.hashCode();
        BigInteger bigInteger = this.c;
        return hashCode ^ (bigInteger != null ? bigInteger.hashCode() : 0);
    }
}
