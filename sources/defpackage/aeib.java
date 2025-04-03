package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aeib extends dtrs {
    final /* synthetic */ aeij a;

    public aeib(aeij aeijVar) {
        this.a = aeijVar;
    }

    @Override // defpackage.dtrs
    public final /* bridge */ /* synthetic */ void b(dtyq dtyqVar, dtuk dtukVar) {
        csjb d = aeij.a.d();
        d.I("About to invalidate on prefetch");
        d.A("TriggerQuery", aeij.b(dtukVar));
        d.r();
    }

    @Override // defpackage.dtrs
    public final /* bridge */ /* synthetic */ void gb(dtyq dtyqVar) {
        csjb c = aeij.a.c();
        c.I("Invalidate data source during prefetch");
        c.A("loadingStatus", this.a.s);
        c.r();
        aeij aeijVar = this.a;
        aeijVar.u = null;
        ofe ofeVar = aeijVar.o;
        if (ofeVar != null) {
            ofeVar.c();
        }
    }
}
