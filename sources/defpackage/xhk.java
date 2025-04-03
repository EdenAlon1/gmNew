package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xhk implements xhm, doxx {
    public final xhi a;
    public final doyc b;

    public xhk(xhi xhiVar, doyc doycVar) {
        doycVar.getClass();
        this.a = xhiVar;
        this.b = doycVar;
    }

    @Override // defpackage.xhp
    public final xhi a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xhk)) {
            return false;
        }
        xhk xhkVar = (xhk) obj;
        return ffkj.e(this.a, xhkVar.a) && ffkj.e(this.b, xhkVar.b);
    }

    @Override // defpackage.doxx
    public final Object fn() {
        return this.b.e();
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "Resolved(instanceId=" + this.a + ", attachment=" + this.b.fo() + ")";
    }
}
