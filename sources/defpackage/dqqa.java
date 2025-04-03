package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqqa extends dqqb {
    private final dqnr b;
    private final dqnw c;
    private final dqnw d;
    private final Set e;

    public dqqa(dqnr dqnrVar, dqnw dqnwVar, dqnw dqnwVar2, Set set) {
        dqnwVar.getClass();
        dqnwVar2.getClass();
        this.b = dqnrVar;
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
        dqnw dqnwVar = g() ? dqnw.c : this.c;
        dqnw dqnwVar2 = g() ? dqnw.d : this.d;
        if (dqnzVar == dqnzVar2) {
            sb.append((String) dqqb.a.get(new ffcf(dqnwVar, dqnwVar2)));
            dqql dqqlVar = dqnzVar.h;
            if (dqqlVar != null) {
                sb.append(dqqlVar.a());
            }
        } else {
            h(dqnzVar, dqnzVar2, dqnwVar, dqnwVar2, sb);
        }
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
        if (!(obj instanceof dqqa)) {
            return false;
        }
        dqqa dqqaVar = (dqqa) obj;
        return ffkj.e(this.b, dqqaVar.b) && this.c == dqqaVar.c && this.d == dqqaVar.d && ffkj.e(this.e, dqqaVar.e);
    }

    public final int hashCode() {
        return (((((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public final String toString() {
        return "WithPlainBase(base=" + this.b + ", gender1=" + this.c + ", gender2=" + this.d + ", supportedSkinTones=" + this.e + ")";
    }
}
