package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drxl extends fflr {
    final /* synthetic */ drxo a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public drxl(drxo drxoVar) {
        super(null);
        this.a = drxoVar;
    }

    @Override // defpackage.fflr
    protected final void a(ffmx ffmxVar, Object obj, Object obj2) {
        dtaa dtaaVar = (dtaa) obj2;
        final dtaa dtaaVar2 = (dtaa) obj;
        if (dtaaVar2 != null) {
            dtaaVar2.bd();
            drxo drxoVar = this.a;
            dsxk dsxkVar = drxoVar.h;
            if (dsxkVar == null) {
                ffkj.c("renderingStrategy");
                dsxkVar = null;
            }
            fr I = drxoVar.e.I();
            I.getClass();
            dsxl.a(dsxkVar, I, true, new ffji() { // from class: drxg
                @Override // defpackage.ffji
                public final Object invoke(Object obj3) {
                    gg ggVar = (gg) obj3;
                    int i = drxo.j;
                    ggVar.getClass();
                    ggVar.l(dtaa.this);
                    return ffcu.a;
                }
            });
        }
        if (dtaaVar != null) {
            this.a.e(dtaaVar);
        }
        this.a.f.invoke(dtaaVar);
    }

    @Override // defpackage.fflr
    protected final boolean b(Object obj, Object obj2) {
        return !ffkj.e(obj, obj2);
    }
}
