package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zsm {
    public final boolean a;
    public final int b;

    public zsm() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zsm)) {
            return false;
        }
        zsm zsmVar = (zsm) obj;
        return this.a == zsmVar.a && this.b == zsmVar.b;
    }

    public final int hashCode() {
        return ((true != this.a ? 1237 : 1231) * 31) + this.b;
    }

    public final String toString() {
        return "Flags(splitTallText=" + this.a + ", stricterSplittingForTallTextMessagesLimit=" + this.b + ")";
    }

    public zsm(boolean z, int i) {
        this.a = z;
        this.b = i;
    }

    public /* synthetic */ zsm(byte[] bArr) {
        this(false, 5000);
    }
}
