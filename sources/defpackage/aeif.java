package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aeif extends dtrs {
    final /* synthetic */ aeig a;

    public aeif(aeig aeigVar) {
        this.a = aeigVar;
    }

    @Override // defpackage.dtrs
    public final /* bridge */ /* synthetic */ void b(dtyq dtyqVar, dtuk dtukVar) {
        csjb d = aeij.a.d();
        d.I("About to invalidate on query change");
        d.A("TriggerQuery", aeij.b(dtukVar));
        d.r();
    }

    @Override // defpackage.dtrs
    public final /* bridge */ /* synthetic */ void gb(dtyq dtyqVar) {
        csjb c = aeij.a.c();
        c.I("Invalidate data source on query changes");
        c.A("loadingStatus", this.a.e.s);
        c.r();
        this.a.c();
    }
}
