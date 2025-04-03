package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sor {
    public final int a;
    public final int b;
    public final int c;

    public sor() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sor)) {
            return false;
        }
        sor sorVar = (sor) obj;
        return this.a == sorVar.a && this.b == sorVar.b && this.c == sorVar.c;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.c;
    }

    public final String toString() {
        return "BugleDatabaseAssetInfo(messageCount=" + this.a + ", conversationCount=" + this.b + ", attachmentCount=" + this.c + ")";
    }

    public sor(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public /* synthetic */ sor(byte[] bArr) {
        this(0, 0, 0);
    }
}
