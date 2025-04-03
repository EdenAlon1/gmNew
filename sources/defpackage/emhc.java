package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emhc {
    public final int a;
    public final int b;

    public emhc() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof emhc)) {
            return false;
        }
        emhc emhcVar = (emhc) obj;
        return this.a == emhcVar.a && this.b == emhcVar.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return "Size(width=" + this.a + ", height=" + this.b + ")";
    }

    public emhc(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public /* synthetic */ emhc(byte[] bArr) {
        this(0, 0);
    }
}
