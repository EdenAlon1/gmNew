package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drzf extends fflr {
    final /* synthetic */ drzi a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public drzf(drzi drziVar) {
        super(null);
        this.a = drziVar;
    }

    @Override // defpackage.fflr
    protected final void a(ffmx ffmxVar, Object obj, Object obj2) {
        drzi drziVar = this.a;
        dtaa dtaaVar = (dtaa) obj2;
        if (drziVar.l) {
            if (drziVar.m || drziVar.i) {
                drziVar.j(dtaaVar);
            }
        }
    }

    @Override // defpackage.fflr
    protected final boolean b(Object obj, Object obj2) {
        return !ffkj.e(obj, obj2);
    }
}
