package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drhq implements drht {
    private final int a;
    private final boolean b;

    public drhq(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    @Override // defpackage.drht
    public final int a() {
        return this.a;
    }

    @Override // defpackage.drht
    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof drhq)) {
            return false;
        }
        drhq drhqVar = (drhq) obj;
        return this.a == drhqVar.a && this.b == drhqVar.b;
    }

    public final int hashCode() {
        return (this.a * 31) + (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        return "Basic(errorMessageStringResource=" + this.a + ", isRetryable=" + this.b + ")";
    }
}
