package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmci {
    public final int a;
    public final int b;

    public dmci() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmci)) {
            return false;
        }
        dmci dmciVar = (dmci) obj;
        return this.a == dmciVar.a && this.b == dmciVar.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Style(colors=");
        sb.append((Object) (this.a != 1 ? "MONOCHROME" : "DEFAULT"));
        sb.append(", size=");
        sb.append((Object) (this.b != 1 ? "LARGE" : "DEFAULT"));
        sb.append(")");
        return sb.toString();
    }

    public dmci(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public /* synthetic */ dmci(byte[] bArr) {
        this(1, 1);
    }
}
