package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqob extends dqoe {
    public final dqnw a;
    private final CharSequence b;
    private final dqns e;

    public dqob(CharSequence charSequence, dqns dqnsVar, dqnw dqnwVar) {
        dqnsVar.getClass();
        this.b = charSequence;
        this.e = dqnsVar;
        this.a = dqnwVar;
    }

    @Override // defpackage.dqof
    public final CharSequence a() {
        return this.b;
    }

    @Override // defpackage.dqof
    public final dqns b() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dqob)) {
            return false;
        }
        dqob dqobVar = (dqob) obj;
        return ffkj.e(this.b, dqobVar.b) && ffkj.e(this.e, dqobVar.e) && this.a == dqobVar.a;
    }

    public final int hashCode() {
        return (((this.b.hashCode() * 31) + this.e.hashCode()) * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "Gender(literal=" + ((Object) this.b) + ", base=" + this.e + ", gender=" + this.a + ")";
    }
}
