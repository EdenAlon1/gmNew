package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlvg {
    public final boolean a;
    public final boolean b;

    public dlvg(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlvg)) {
            return false;
        }
        dlvg dlvgVar = (dlvg) obj;
        return this.a == dlvgVar.a && this.b == dlvgVar.b;
    }

    public final int hashCode() {
        return (dlvf.a(this.a) * 31) + dlvf.a(this.b);
    }

    public final String toString() {
        return "Flags(enableSwipeToShowTimestamps=" + this.a + ", disableNewTimestampsForTalkback=" + this.b + ")";
    }
}
