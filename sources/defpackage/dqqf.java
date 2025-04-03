package defpackage;

import java.util.EnumSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqqf extends dqqg {
    private final dqnr a;
    private final EnumSet b;

    public dqqf(dqnr dqnrVar) {
        this.a = dqnrVar;
        ffbz ffbzVar = dqnw.a;
        this.b = dqnv.a();
    }

    @Override // defpackage.dqqj
    public final /* synthetic */ dqns a() {
        return this.a;
    }

    @Override // defpackage.dqqg
    public final dqob b(dqnw dqnwVar) {
        dqnwVar.getClass();
        dqqm dqqmVar = dqqn.a;
        StringBuilder sb = dqqn.a.get();
        sb.append(this.a.a);
        dqql dqqlVar = dqnwVar.e;
        if (dqqlVar != null) {
            sb.append(dqof.c.a());
            sb.append(dqqlVar.a());
            sb.append(dqof.d.a());
        }
        return new dqob(sb.toString(), this.a, dqnwVar);
    }

    @Override // defpackage.dqqg
    public final /* synthetic */ Set c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dqqf) && ffkj.e(this.a, ((dqqf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "WithPlainBase(base=" + this.a + ")";
    }
}
