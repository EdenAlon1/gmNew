package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsmj extends fflr {
    final /* synthetic */ dsml a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsmj(Object obj, dsml dsmlVar) {
        super(obj);
        this.a = dsmlVar;
    }

    @Override // defpackage.fflr
    protected final void a(ffmx ffmxVar, Object obj, Object obj2) {
        dsmg dsmgVar = (dsmg) obj2;
        dsmg dsmgVar2 = (dsmg) obj;
        if (dsmgVar2 instanceof dsme) {
            ((dsme) dsmgVar2).a.b();
        }
        if (dsmgVar instanceof dsme) {
            ((dsme) dsmgVar).a.a(this.a);
        }
    }

    @Override // defpackage.fflr
    protected final boolean b(Object obj, Object obj2) {
        return !ffkj.e(obj, obj2);
    }
}
