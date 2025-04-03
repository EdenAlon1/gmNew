package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqqc extends dqqe {
    private final dqnq a;
    private final Set b;

    public dqqc(dqnq dqnqVar) {
        this.a = dqnqVar;
        this.b = dqnqVar.b;
    }

    @Override // defpackage.dqqj
    public final /* synthetic */ dqns a() {
        return this.a;
    }

    @Override // defpackage.dqqe
    public final dqoc b(dqnw dqnwVar, dqnz dqnzVar) {
        dqnwVar.getClass();
        dqnzVar.getClass();
        dqqm dqqmVar = dqqn.a;
        StringBuilder sb = dqqn.a.get();
        sb.append(dqnwVar.f.a());
        dqql dqqlVar = dqnzVar.h;
        if (dqqlVar != null) {
            sb.append(dqqlVar.a());
        }
        sb.append(dqof.c.a());
        sb.append(this.a.a);
        sb.append(dqof.d.a());
        return new dqoc(sb.toString(), this.a, dqnwVar, dqnzVar);
    }

    @Override // defpackage.dqqe
    public final Set c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dqqc) && ffkj.e(this.a, ((dqqc) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "WithPersonComposedBase(base=" + this.a + ")";
    }
}
