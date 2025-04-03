package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aafk implements zsu {
    public final apqb a;
    public final boolean b;
    public final String c;
    public final boolean d;
    public final ffix e;
    public final ffix f;

    public aafk(apqb apqbVar, boolean z, String str, boolean z2, ffix ffixVar, ffix ffixVar2) {
        this.a = apqbVar;
        this.b = z;
        this.c = str;
        this.d = z2;
        this.e = ffixVar;
        this.f = ffixVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aafk)) {
            return false;
        }
        aafk aafkVar = (aafk) obj;
        return ffkj.e(this.a, aafkVar.a) && this.b == aafkVar.b && ffkj.e(this.c, aafkVar.c) && this.d == aafkVar.d && ffkj.e(this.e, aafkVar.e) && ffkj.e(this.f, aafkVar.f);
    }

    public final int hashCode() {
        return (((((((((this.a.hashCode() * 31) + aafj.a(this.b)) * 31) + this.c.hashCode()) * 31) + aafj.a(this.d)) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    public final String toString() {
        return "PendingBubbleArgs(content=" + this.a + ", isHighlighted=" + this.b + ", contentDescription=" + this.c + ", isOutgoing=" + this.d + ", onCancelTransfer=" + this.e + ", onResumeTransfer=" + this.f + ")";
    }
}
