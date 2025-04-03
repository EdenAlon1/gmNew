package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final /* synthetic */ class dsfm extends ffkh implements ffji {
    public dsfm(Object obj) {
        super(1, obj, dsfv.class, "onRenderingStateChanged", "onRenderingStateChanged(Lcom/google/android/libraries/compose/ui/rendering/RenderingState;)V", 0);
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        dsxi dsxiVar = (dsxi) obj;
        dsxiVar.getClass();
        dsfv dsfvVar = (dsfv) this.g;
        enru enruVar = dsfv.b;
        dsmm dsmmVar = dsmm.a;
        if (dsxiVar.ordinal() == 3) {
            dskc dskcVar = (dskc) dsfvVar.l.c(dsfv.a[0]);
            if (dskcVar != null) {
                dskcVar.setSelected(false);
            }
            dsfvVar.l.d(dsfv.a[0], null);
        }
        dsfvVar.f.f(dsxiVar);
        dsfv.s(dsfvVar, 0, 0, 3);
        return ffcu.a;
    }
}
