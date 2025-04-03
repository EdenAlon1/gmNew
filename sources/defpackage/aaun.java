package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaun {
    public final alxr a;
    public final alxr b;

    public aaun(alxr alxrVar, alxr alxrVar2) {
        this.a = alxrVar;
        this.b = alxrVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aaun)) {
            return false;
        }
        aaun aaunVar = (aaun) obj;
        return ffkj.e(this.a, aaunVar.a) && ffkj.e(this.b, aaunVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        alxr alxrVar = this.b;
        return hashCode + (alxrVar == null ? 0 : alxrVar.hashCode());
    }

    public final String toString() {
        return "CachedMessage(current=" + this.a + ", prev=" + this.b + ")";
    }
}
