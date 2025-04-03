package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqod extends dqoe {
    public final CharSequence a;
    public final dqnz b;
    private final dqns e;

    public dqod(CharSequence charSequence, dqns dqnsVar, dqnz dqnzVar) {
        dqnsVar.getClass();
        this.a = charSequence;
        this.e = dqnsVar;
        this.b = dqnzVar;
    }

    @Override // defpackage.dqof
    public final CharSequence a() {
        return this.a;
    }

    @Override // defpackage.dqof
    public final dqns b() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dqod)) {
            return false;
        }
        dqod dqodVar = (dqod) obj;
        return ffkj.e(this.a, dqodVar.a) && ffkj.e(this.e, dqodVar.e) && this.b == dqodVar.b;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.e.hashCode()) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "SkinTone(literal=" + ((Object) this.a) + ", base=" + this.e + ", skinTone=" + this.b + ")";
    }
}
