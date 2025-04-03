package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmzq {
    public final boolean a;
    private final boolean b;

    public dmzq(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmzq)) {
            return false;
        }
        dmzq dmzqVar = (dmzq) obj;
        return this.a == dmzqVar.a && this.b == dmzqVar.b;
    }

    public final int hashCode() {
        return (dmzp.a(this.a) * 31) + dmzp.a(this.b);
    }

    public final String toString() {
        return "Flags(enableSwipeToShowTimestamps=" + this.a + ", disableNewTimestampsForTalkback=" + this.b + ")";
    }

    public dmzq() {
        this(false, false);
    }
}
