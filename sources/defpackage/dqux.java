package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqux extends fflr {
    final /* synthetic */ dquy a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqux(Object obj, dquy dquyVar) {
        super(obj);
        this.a = dquyVar;
    }

    @Override // defpackage.fflr
    protected final void a(ffmx ffmxVar, Object obj, Object obj2) {
        List list = (List) obj2;
        List list2 = (List) obj;
        if (this.a.p.indexOfKey(0) < 0) {
            this.a.p.put(0, 0);
        }
        if (this.a.i.isEmpty()) {
            return;
        }
        dquy dquyVar = this.a;
        dqie.b(dqie.a(ffdx.ai(list2, dquyVar.q), ffdx.ai(list, this.a.q), null, null, 28), dquyVar.q, dquyVar);
    }

    @Override // defpackage.fflr
    protected final boolean b(Object obj, Object obj2) {
        return !ffkj.e(obj, obj2);
    }
}
