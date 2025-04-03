package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aatw {
    public final alxw a;
    public final alxw b;

    public aatw(alxw alxwVar, alxw alxwVar2) {
        this.a = alxwVar;
        this.b = alxwVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aatw)) {
            return false;
        }
        aatw aatwVar = (aatw) obj;
        return ffkj.e(this.a, aatwVar.a) && ffkj.e(this.b, aatwVar.b);
    }

    public final int hashCode() {
        alxw alxwVar = this.a;
        int hashCode = alxwVar == null ? 0 : alxwVar.hashCode();
        alxw alxwVar2 = this.b;
        return (hashCode * 31) + (alxwVar2 != null ? alxwVar2.hashCode() : 0);
    }

    public final String toString() {
        return "PagingKeyPair(prev=" + this.a + ", next=" + this.b + ")";
    }
}
