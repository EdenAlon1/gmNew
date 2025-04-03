package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cvuy {
    public final amat a;
    public final amat b;

    public cvuy(amat amatVar, amat amatVar2) {
        this.a = amatVar;
        this.b = amatVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cvuy)) {
            return false;
        }
        cvuy cvuyVar = (cvuy) obj;
        return ffkj.e(this.a, cvuyVar.a) && ffkj.e(this.b, cvuyVar.b);
    }

    public final int hashCode() {
        amat amatVar = this.a;
        int hashCode = amatVar == null ? 0 : amatVar.hashCode();
        amat amatVar2 = this.b;
        return (hashCode * 31) + (amatVar2 != null ? amatVar2.hashCode() : 0);
    }

    public final String toString() {
        return "PagingKeyPair(prev=" + this.a + ", next=" + this.b + ")";
    }
}
