package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dllb {
    public final long a;
    public final byte[] b;

    public dllb(long j, byte[] bArr) {
        this.a = j;
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dllb)) {
            return false;
        }
        dllb dllbVar = (dllb) obj;
        return this.a == dllbVar.a && ffkj.e(this.b, dllbVar.b);
    }

    public final int hashCode() {
        long j = this.a;
        return (((int) (j ^ (j >>> 32))) * 31) + Arrays.hashCode(this.b);
    }

    public final String toString() {
        return "DEFAULT\n" + this.a + "\n" + eoeg.e.j(this.b);
    }
}
