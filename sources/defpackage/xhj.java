package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xhj implements xhm, doxx {
    public final xhi a;
    public final dren b;

    public xhj(xhi xhiVar, dren drenVar) {
        drenVar.getClass();
        this.a = xhiVar;
        this.b = drenVar;
    }

    @Override // defpackage.xhp
    public final xhi a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xhj)) {
            return false;
        }
        xhj xhjVar = (xhj) obj;
        return ffkj.e(this.a, xhjVar.a) && ffkj.e(this.b, xhjVar.b);
    }

    @Override // defpackage.doxx
    public final Object fn() {
        return this.b.fn();
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "Pending.RemoteResolved(instanceId=" + this.a + ", attachment=" + this.b.fo() + ")";
    }
}
