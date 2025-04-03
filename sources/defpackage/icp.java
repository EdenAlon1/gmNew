package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class icp extends icr {
    public final iam a;

    public icp(iam iamVar) {
        this.a = iamVar;
    }

    @Override // defpackage.icr
    public final iam a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof icp) && ffkj.e(this.a, ((icp) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
