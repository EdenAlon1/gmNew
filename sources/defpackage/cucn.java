package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cucn {
    public final fbcx a;
    public final cukz b;
    public final String c;

    public cucn(fbcx fbcxVar, cukz cukzVar, String str) {
        fbcxVar.getClass();
        this.a = fbcxVar;
        this.b = cukzVar;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cucn)) {
            return false;
        }
        cucn cucnVar = (cucn) obj;
        return this.a == cucnVar.a && ffkj.e(this.b, cucnVar.b) && ffkj.e(this.c, cucnVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "Action(type=" + this.a + ", contributorsClassificationSources=" + this.b + ", spamPolicyConfigId=" + this.c + ")";
    }
}
