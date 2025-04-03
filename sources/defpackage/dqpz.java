package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqpz extends dqqb {
    private final dqnq b;
    private final dqnw c;
    private final dqnw d;
    private final Set e;

    public dqpz(dqnq dqnqVar, dqnw dqnwVar, dqnw dqnwVar2, Set set) {
        dqnwVar.getClass();
        dqnwVar2.getClass();
        this.b = dqnqVar;
        this.c = dqnwVar;
        this.d = dqnwVar2;
        this.e = set;
    }

    @Override // defpackage.dqqj
    public final /* synthetic */ dqns a() {
        return this.b;
    }

    @Override // defpackage.dqqb
    public final dqnw b() {
        return this.c;
    }

    @Override // defpackage.dqqb
    public final dqnw c() {
        return this.d;
    }

    @Override // defpackage.dqqb
    public final dqoa d(dqnz dqnzVar, dqnz dqnzVar2) {
        dqqm dqqmVar = dqqn.a;
        StringBuilder sb = dqqn.a.get();
        dqqb.h(dqnzVar, dqnzVar2, this.c, this.d, sb);
        return new dqoa(sb.toString(), this.b, dqnzVar, dqnzVar2);
    }

    @Override // defpackage.dqqb
    public final Set e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dqpz)) {
            return false;
        }
        dqpz dqpzVar = (dqpz) obj;
        return ffkj.e(this.b, dqpzVar.b) && this.c == dqpzVar.c && this.d == dqpzVar.d && ffkj.e(this.e, dqpzVar.e);
    }

    public final int hashCode() {
        return (((((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public final String toString() {
        return "WithPersonComposedBase(base=" + this.b + ", gender1=" + this.c + ", gender2=" + this.d + ", supportedSkinTones=" + this.e + ")";
    }
}
