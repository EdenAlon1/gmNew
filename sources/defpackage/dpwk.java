package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpwk implements dpwl {
    public final int a;
    private final dszq b;

    public dpwk(int i, dszq dszqVar) {
        this.a = i;
        this.b = dszqVar;
    }

    @Override // defpackage.dpwl
    public final dszq a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dpwk)) {
            return false;
        }
        dpwk dpwkVar = (dpwk) obj;
        return this.a == dpwkVar.a && ffkj.e(this.b, dpwkVar.b);
    }

    public final int hashCode() {
        dszq dszqVar = this.b;
        return (this.a * 31) + (dszqVar == null ? 0 : dszqVar.hashCode());
    }

    public final String toString() {
        return "ResourceIcon(resId=" + this.a + ", backgroundColor=" + this.b + ")";
    }
}
