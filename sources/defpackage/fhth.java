package defpackage;

import java.math.BigInteger;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fhth implements fhtd {
    protected final BigInteger a;

    public fhth(BigInteger bigInteger) {
        this.a = bigInteger;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof fhth) {
            return this.a.equals(((fhth) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
