package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ndt {
    public final int a;
    public final byte[] b;
    public final int c;
    public final int d;

    public ndt(int i, byte[] bArr, int i2, int i3) {
        this.a = i;
        this.b = bArr;
        this.c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ndt ndtVar = (ndt) obj;
            if (this.a == ndtVar.a && this.c == ndtVar.c && this.d == ndtVar.d && Arrays.equals(this.b, ndtVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a * 31) + Arrays.hashCode(this.b)) * 31) + this.c) * 31) + this.d;
    }
}
