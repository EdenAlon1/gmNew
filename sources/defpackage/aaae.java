package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaae implements zsu {
    public final apnm a;
    public final boolean b;
    public final String c;
    public final long d;

    public aaae(apnm apnmVar, boolean z, String str, long j) {
        this.a = apnmVar;
        this.b = z;
        this.c = str;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aaae)) {
            return false;
        }
        aaae aaaeVar = (aaae) obj;
        return ffkj.e(this.a, aaaeVar.a) && this.b == aaaeVar.b && ffkj.e(this.c, aaaeVar.c) && this.d == aaaeVar.d;
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() * 31) + (true != this.b ? 1237 : 1231)) * 31) + this.c.hashCode();
        long j = this.d;
        return (hashCode * 31) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "BreadcrumbBubbleArgs(content=" + this.a + ", isHighlighted=" + this.b + ", contentDescription=" + this.c + ", timestamp=" + this.d + ")";
    }
}
