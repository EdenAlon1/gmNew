package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class doqp {
    public final String a;
    public final ffix b;

    public doqp(String str, ffix ffixVar) {
        this.a = str;
        this.b = ffixVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof doqp)) {
            return false;
        }
        doqp doqpVar = (doqp) obj;
        return ffkj.e(this.a, doqpVar.a) && ffkj.e(this.b, doqpVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "TooltipAction(text=" + this.a + ", onClick=" + this.b + ")";
    }
}
