package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhqs {
    public final byte[] a;
    public final int b;

    public fhqs(byte[] bArr, int i) {
        this.a = fics.c(bArr);
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fhqs)) {
            return false;
        }
        fhqs fhqsVar = (fhqs) obj;
        if (fhqsVar.b == this.b) {
            return Arrays.equals(this.a, fhqsVar.a);
        }
        return false;
    }

    public final int hashCode() {
        return this.b ^ fics.a(this.a);
    }
}
