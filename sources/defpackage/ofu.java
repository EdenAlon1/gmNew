package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ofu extends ofx {
    public final Throwable a;

    public ofu(Throwable th) {
        super(false);
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ofu)) {
            return false;
        }
        ofu ofuVar = (ofu) obj;
        return this.c == ofuVar.c && ffkj.e(this.a, ofuVar.a);
    }

    public final int hashCode() {
        boolean z = this.c;
        return (true != z ? 1237 : 1231) + this.a.hashCode();
    }

    public final String toString() {
        return "Error(endOfPaginationReached=" + this.c + ", error=" + this.a + ')';
    }
}
