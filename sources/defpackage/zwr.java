package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zwr implements zsu {
    public final boolean a;
    public final String b;
    private final apmq c;

    public zwr(apmq apmqVar, boolean z, String str) {
        this.c = apmqVar;
        this.a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zwr)) {
            return false;
        }
        zwr zwrVar = (zwr) obj;
        return ffkj.e(this.c, zwrVar.c) && this.a == zwrVar.a && ffkj.e(this.b, zwrVar.b);
    }

    public final int hashCode() {
        return (((this.c.hashCode() * 31) + (true != this.a ? 1237 : 1231)) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "SatelliteAttachmentFailureBubbleArgs(content=" + this.c + ", isHighlighted=" + this.a + ", contentDescription=" + this.b + ")";
    }
}
