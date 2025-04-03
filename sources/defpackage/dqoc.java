package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqoc extends dqoe {
    public final dqnw a;
    public final dqnz b;
    private final CharSequence e;
    private final dqns f;

    public dqoc(CharSequence charSequence, dqns dqnsVar, dqnw dqnwVar, dqnz dqnzVar) {
        dqnsVar.getClass();
        this.e = charSequence;
        this.f = dqnsVar;
        this.a = dqnwVar;
        this.b = dqnzVar;
    }

    @Override // defpackage.dqof
    public final CharSequence a() {
        return this.e;
    }

    @Override // defpackage.dqof
    public final dqns b() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dqoc)) {
            return false;
        }
        dqoc dqocVar = (dqoc) obj;
        return ffkj.e(this.e, dqocVar.e) && ffkj.e(this.f, dqocVar.f) && this.a == dqocVar.a && this.b == dqocVar.b;
    }

    public final int hashCode() {
        return (((((this.e.hashCode() * 31) + this.f.hashCode()) * 31) + this.a.hashCode()) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "GenderAndSkinTone(literal=" + ((Object) this.e) + ", base=" + this.f + ", gender=" + this.a + ", skinTone=" + this.b + ")";
    }
}
