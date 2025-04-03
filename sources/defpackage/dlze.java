package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlze {
    public final boolean a;
    private final boolean b;

    public dlze() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlze)) {
            return false;
        }
        dlze dlzeVar = (dlze) obj;
        return this.a == dlzeVar.a && this.b == dlzeVar.b;
    }

    public final int hashCode() {
        return (dlzd.a(this.a) * 31) + dlzd.a(this.b);
    }

    public final String toString() {
        return "Flags(enableSwipeToShowTimestamps=" + this.a + ", disableNewTimestampsForTalkback=" + this.b + ")";
    }

    public dlze(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public /* synthetic */ dlze(byte[] bArr) {
        this(false, false);
    }
}
