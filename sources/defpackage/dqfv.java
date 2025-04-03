package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqfv extends fflr {
    final /* synthetic */ dqfw a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqfv(dqfw dqfwVar) {
        super(null);
        this.a = dqfwVar;
    }

    @Override // defpackage.fflr
    protected final void a(ffmx ffmxVar, Object obj, Object obj2) {
        dqfw dqfwVar = this.a;
        if (dqfwVar.d == 0) {
            dqfwVar.d = 1;
            dqfwVar.s(0);
        }
    }

    @Override // defpackage.fflr
    protected final boolean b(Object obj, Object obj2) {
        return !ffkj.e(obj, obj2);
    }
}
