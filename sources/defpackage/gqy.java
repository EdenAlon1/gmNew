package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gqy extends gqz {
    public final hun a;
    public final hun b;
    private final boolean c;

    public gqy() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gqy)) {
            return false;
        }
        gqy gqyVar = (gqy) obj;
        boolean z = gqyVar.c;
        return ffkj.e(this.a, gqyVar.a) && ffkj.e(this.b, gqyVar.b);
    }

    public final int hashCode() {
        return ((this.a.hashCode() + 38347) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "Attached(alwaysMinimize=false, minimizedAlignment=" + this.a + ", expandedAlignment=" + this.b + ')';
    }

    public /* synthetic */ gqy(byte[] bArr) {
        int i = huo.a;
        hun hunVar = hum.j;
        this.c = false;
        this.a = hunVar;
        this.b = hunVar;
    }
}
