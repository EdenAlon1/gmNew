package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zwl implements zsu {
    public final apmq a;
    public final boolean b;
    public final String c;

    public zwl(apmq apmqVar, boolean z, String str) {
        this.a = apmqVar;
        this.b = z;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zwl)) {
            return false;
        }
        zwl zwlVar = (zwl) obj;
        return ffkj.e(this.a, zwlVar.a) && this.b == zwlVar.b && ffkj.e(this.c, zwlVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + (true != this.b ? 1237 : 1231)) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "PermanentFailureBubbleArgs(content=" + this.a + ", isHighlighted=" + this.b + ", contentDescription=" + this.c + ")";
    }
}
