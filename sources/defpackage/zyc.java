package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zyc {
    public final boolean a;
    public final boolean b;

    public zyc(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zyc)) {
            return false;
        }
        zyc zycVar = (zyc) obj;
        return this.a == zycVar.a && this.b == zycVar.b;
    }

    public final int hashCode() {
        return (zyb.a(this.a) * 31) + zyb.a(this.b);
    }

    public final String toString() {
        return "Flags(enableSwipeToShowTimestamps=" + this.a + ", disableNewTimestampsForTalkback=" + this.b + ")";
    }

    public zyc() {
        this(false, false);
    }
}
