package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dndk {
    public final boolean a;
    private final boolean b;

    public dndk(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dndk)) {
            return false;
        }
        dndk dndkVar = (dndk) obj;
        return this.a == dndkVar.a && this.b == dndkVar.b;
    }

    public final int hashCode() {
        return (dndj.a(this.a) * 31) + dndj.a(this.b);
    }

    public final String toString() {
        return "Flags(enableSwipeToShowTimestamps=" + this.a + ", disableNewTimestampsForTalkback=" + this.b + ")";
    }
}
