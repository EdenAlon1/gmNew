package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class djw {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    private final long e;

    public djw(long j, long j2, long j3, long j4, long j5) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof djw)) {
            return false;
        }
        long j = this.a;
        djw djwVar = (djw) obj;
        long j2 = djwVar.a;
        long j3 = ibw.a;
        return ffcp.a(j, j2) && ffcp.a(this.b, djwVar.b) && ffcp.a(this.c, djwVar.c) && ffcp.a(this.d, djwVar.d) && ffcp.a(this.e, djwVar.e);
    }

    public final int hashCode() {
        long j = ibw.a;
        int a = ffco.a(this.a);
        long j2 = this.e;
        long j3 = this.d;
        return (((((((a * 31) + ffco.a(this.b)) * 31) + ffco.a(this.c)) * 31) + ffco.a(j3)) * 31) + ffco.a(j2);
    }

    public final String toString() {
        return "ContextMenuColors(backgroundColor=" + ((Object) ibw.g(this.a)) + ", textColor=" + ((Object) ibw.g(this.b)) + ", iconColor=" + ((Object) ibw.g(this.c)) + ", disabledTextColor=" + ((Object) ibw.g(this.d)) + ", disabledIconColor=" + ((Object) ibw.g(this.e)) + ')';
    }
}
