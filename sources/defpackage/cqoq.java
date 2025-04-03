package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cqoq implements cqor {
    private final String a;

    public cqoq(String str) {
        this.a = str;
    }

    @Override // defpackage.cqor
    public final ekzz a() {
        return eleg.f(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof cqoq) {
            return this.a.equals(((cqoq) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "TraceSpanSupplier: ".concat(this.a);
    }
}
