package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlkz extends dlaf {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public dlkz(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlkz)) {
            return false;
        }
        dlkz dlkzVar = (dlkz) obj;
        return this.a == dlkzVar.a && this.b == dlkzVar.b && this.c == dlkzVar.c && this.d == dlkzVar.d;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }
}
