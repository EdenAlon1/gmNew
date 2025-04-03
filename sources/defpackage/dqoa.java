package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqoa extends dqoe {
    private final CharSequence a;
    private final dqns b;
    private final dqnz e;
    private final dqnz f;

    public dqoa(CharSequence charSequence, dqns dqnsVar, dqnz dqnzVar, dqnz dqnzVar2) {
        dqnsVar.getClass();
        this.a = charSequence;
        this.b = dqnsVar;
        this.e = dqnzVar;
        this.f = dqnzVar2;
    }

    @Override // defpackage.dqof
    public final CharSequence a() {
        return this.a;
    }

    @Override // defpackage.dqof
    public final dqns b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dqoa)) {
            return false;
        }
        dqoa dqoaVar = (dqoa) obj;
        return ffkj.e(this.a, dqoaVar.a) && ffkj.e(this.b, dqoaVar.b) && this.e == dqoaVar.e && this.f == dqoaVar.f;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    public final String toString() {
        return "DualSkinTone(literal=" + ((Object) this.a) + ", base=" + this.b + ", skinTone1=" + this.e + ", skinTone2=" + this.f + ")";
    }
}
