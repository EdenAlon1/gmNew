package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bdpy {
    public static final bdpy a;
    public static final bdpy b;
    public static final bdpy c;
    public final long d;
    public final long e;

    static {
        bdpy bdpyVar = new bdpy(0L, 0L);
        a = bdpyVar;
        bdpy bdpyVar2 = new bdpy(-1L, -1L);
        b = bdpyVar2;
        bdpy bdpyVar3 = new bdpy(-2L, -2L);
        c = bdpyVar3;
        ffdx.g(bdpyVar, bdpyVar2, bdpyVar3);
    }

    public bdpy(long j, long j2) {
        this.d = j;
        this.e = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bdpy)) {
            return false;
        }
        bdpy bdpyVar = (bdpy) obj;
        return this.d == bdpyVar.d && this.e == bdpyVar.e;
    }

    public final int hashCode() {
        return (bdpx.a(this.d) * 31) + bdpx.a(this.e);
    }

    public final String toString() {
        return "ModifiedByKey(amVersionCode=" + this.d + ", stackTraceHash=" + this.e + ")";
    }
}
