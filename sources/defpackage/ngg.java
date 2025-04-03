package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ngg extends ngd {
    public final int a;
    public final int b;
    public final int c;
    public final int[] d;
    public final int[] e;

    public ngg(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = iArr;
        this.e = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ngg nggVar = (ngg) obj;
            if (this.a == nggVar.a && this.b == nggVar.b && this.c == nggVar.c && Arrays.equals(this.d, nggVar.d) && Arrays.equals(this.e, nggVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a + 527) * 31) + this.b) * 31) + this.c) * 31) + Arrays.hashCode(this.d)) * 31) + Arrays.hashCode(this.e);
    }
}
