package defpackage;

import defpackage.dtry;
import java.util.List;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dtry<R2 extends dtry<R2>> implements dtzj {
    public final dtsd a;

    public dtry(dtsd dtsdVar) {
        this.a = dtsdVar;
    }

    protected abstract dtyq a();

    @Override // defpackage.dtzj
    public final String ag(dtzu dtzuVar) {
        return ((dtqt) this.a).a;
    }

    @Override // defpackage.dtzj
    public final String ah(dtzu dtzuVar, List list) {
        return ((dtqt) this.a).a;
    }

    @Override // defpackage.dtzj
    public final void ai(dtse dtseVar) {
        String[] split = ((dtqt) this.a).a.split("\\.", 2);
        dtseVar.a(split[0], split[1]);
    }

    public final dtry c() {
        Object obj;
        Supplier supplier = ((dtqt) this.a).g;
        if (supplier == null) {
            return null;
        }
        obj = supplier.get();
        return (dtry) obj;
    }

    public final String d() {
        String[] split = ((dtqt) this.a).a.split("\\.", 2);
        if (split.length > 1) {
            return split[1];
        }
        return null;
    }

    public final String e() {
        return ((dtqt) this.a).a.split("\\.", 2)[0];
    }

    public final boolean g() {
        return ((dtqt) this.a).b;
    }

    public final boolean h() {
        return ((dtqt) this.a).c;
    }

    public final String toString() {
        return ((dtqt) this.a).a;
    }
}
