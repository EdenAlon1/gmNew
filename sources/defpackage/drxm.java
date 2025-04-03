package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drxm extends fflr {
    final /* synthetic */ drxo a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public drxm(drxo drxoVar) {
        super(null);
        this.a = drxoVar;
    }

    @Override // defpackage.fflr
    protected final void a(ffmx ffmxVar, Object obj, Object obj2) {
        dtaa b;
        ffix ffixVar = (ffix) obj2;
        if (ffixVar == null || (b = this.a.b()) == null) {
            return;
        }
        b.gV(ffixVar);
    }

    @Override // defpackage.fflr
    protected final boolean b(Object obj, Object obj2) {
        return !ffkj.e(obj, obj2);
    }
}
