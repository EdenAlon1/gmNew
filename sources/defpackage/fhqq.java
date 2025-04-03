package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhqq {
    private final byte[] a;
    private final int b;

    public fhqq(byte[] bArr, int i) {
        this.a = fics.c(bArr);
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fhqq)) {
            return false;
        }
        fhqq fhqqVar = (fhqq) obj;
        if (fhqqVar.b == this.b) {
            return Arrays.equals(this.a, fhqqVar.a);
        }
        return false;
    }

    public final int hashCode() {
        return this.b ^ fics.a(this.a);
    }
}
