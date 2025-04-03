package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xho implements xhp, doxx {
    public final doxs a;
    public final xhn b;
    public final xhi c;

    public xho(doxs doxsVar, xhn xhnVar) {
        doxsVar.getClass();
        this.a = doxsVar;
        this.b = xhnVar;
        this.c = xhnVar.a;
    }

    public static /* synthetic */ xho b(xho xhoVar, xhn xhnVar) {
        return new xho(xhoVar.a, xhnVar);
    }

    @Override // defpackage.xhp
    public final xhi a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xho)) {
            return false;
        }
        xho xhoVar = (xho) obj;
        return ffkj.e(this.a, xhoVar.a) && ffkj.e(this.b, xhoVar.b);
    }

    @Override // defpackage.doxx
    public final Object fn() {
        return this.a.fn();
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "Processed(attachment=" + this.a.fo() + ", metadata=" + this.b + ")";
    }
}
