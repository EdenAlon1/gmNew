package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqnr extends dqns {
    public final CharSequence a;

    public dqnr(CharSequence charSequence) {
        charSequence.getClass();
        this.a = charSequence;
    }

    @Override // defpackage.dqof
    public final CharSequence a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dqnr) && ffkj.e(this.a, ((dqnr) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Plain(literal=" + ((Object) this.a) + ")";
    }
}
