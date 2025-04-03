package defpackage;

import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqqi extends dqqj {
    private final dqns a;

    public dqqi(dqns dqnsVar) {
        this.a = dqnsVar;
    }

    @Override // defpackage.dqqj
    public final dqns a() {
        return this.a;
    }

    public final dqod b(dqnz dqnzVar) {
        String a;
        dqqm dqqmVar = dqqn.a;
        StringBuilder sb = dqqn.a.get();
        sb.append(((dqnr) this.a).a);
        dqql dqqlVar = dqnzVar.h;
        if (dqqlVar != null && (a = dqqlVar.a()) != null) {
            sb.append(a);
        }
        return new dqod(sb.toString(), this.a, dqnzVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dqqi) && ffkj.e(this.a, ((dqqi) obj).a);
    }

    @Override // defpackage.dqqj
    public final Set f() {
        ffbz ffbzVar = dqnz.a;
        LinkedHashSet linkedHashSet = new LinkedHashSet(dqny.a().size());
        for (dqnz dqnzVar : dqny.a()) {
            dqnzVar.getClass();
            linkedHashSet.add(b(dqnzVar));
        }
        return linkedHashSet;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SkinToneSet(base=" + this.a + ")";
    }
}
