package defpackage;

import java.util.EnumSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqqd extends dqqe {
    private final dqnr a;
    private final EnumSet b;

    public dqqd(dqnr dqnrVar) {
        this.a = dqnrVar;
        ffbz ffbzVar = dqnw.a;
        this.b = dqnv.a();
    }

    @Override // defpackage.dqqj
    public final /* synthetic */ dqns a() {
        return this.a;
    }

    @Override // defpackage.dqqe
    public final dqoc b(dqnw dqnwVar, dqnz dqnzVar) {
        CharSequence sb;
        dqnwVar.getClass();
        dqnzVar.getClass();
        if (dqnzVar.h == null && dqnwVar.e == null) {
            sb = this.a.a;
        } else {
            StringBuilder sb2 = new StringBuilder(this.a.a);
            dqql dqqlVar = dqnzVar.h;
            if (dqqlVar != null) {
                sb2.append(dqqlVar.a());
            }
            dqql dqqlVar2 = dqnwVar.e;
            if (dqqlVar2 != null) {
                sb2.append(dqof.c.a());
                sb2.append(dqqlVar2.a());
                sb2.append(dqof.d.a());
            }
            sb = sb2.toString();
        }
        return new dqoc(sb, this.a, dqnwVar, dqnzVar);
    }

    @Override // defpackage.dqqe
    public final /* synthetic */ Set c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dqqd) && ffkj.e(this.a, ((dqqd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "WithPlainBase(base=" + this.a + ")";
    }
}
