package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lrb {
    public final lra[] a;
    public final long b;

    public lrb(long j, lra... lraVarArr) {
        this.b = j;
        this.a = lraVarArr;
    }

    public final int a() {
        return this.a.length;
    }

    public final lra b(int i) {
        return this.a[i];
    }

    public final lrb c(lra... lraVarArr) {
        int length = lraVarArr.length;
        if (length == 0) {
            return this;
        }
        long j = this.b;
        lra[] lraVarArr2 = this.a;
        int i = lvf.a;
        int length2 = lraVarArr2.length;
        Object[] copyOf = Arrays.copyOf(lraVarArr2, length2 + length);
        System.arraycopy(lraVarArr, 0, copyOf, length2, length);
        return new lrb(j, (lra[]) copyOf);
    }

    public final lrb d(lrb lrbVar) {
        return lrbVar == null ? this : c(lrbVar.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            lrb lrbVar = (lrb) obj;
            if (Arrays.equals(this.a, lrbVar.a) && this.b == lrbVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.a) * 31) + ermr.a(this.b);
    }

    public final String toString() {
        long j = this.b;
        return "entries=" + Arrays.toString(this.a) + (j == -9223372036854775807L ? "" : a.s(j, ", presentationTimeUs="));
    }

    public lrb(List list) {
        this((lra[]) list.toArray(new lra[0]));
    }

    public lrb(lra... lraVarArr) {
        this(-9223372036854775807L, lraVarArr);
    }
}
