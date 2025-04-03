package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsxe extends fflr {
    final /* synthetic */ dsxg a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsxe(dsxg dsxgVar) {
        super(null);
        this.a = dsxgVar;
    }

    @Override // defpackage.fflr
    protected final void a(ffmx ffmxVar, Object obj, Object obj2) {
        dtaa dtaaVar = (dtaa) obj2;
        dtaa dtaaVar2 = (dtaa) obj;
        ((enrr) dsxg.b.h().h("com/google/android/libraries/compose/ui/rendering/RenderingManager$special$$inlined$distinctObservable$1", "afterChange", 78, "RenderingManager.kt")).D("Screen switched from %s to %s", dtaaVar2, dtaaVar);
        final dsxg dsxgVar = this.a;
        if (dtaaVar2 != null) {
            dsxgVar.f.g(dtaaVar2);
            if (dsxgVar.b() != dsxi.d) {
                dsxgVar.i(dtaaVar2);
            }
        }
        if (dtaaVar != null) {
            Object obj3 = dsxgVar.g.get(dtaaVar.t());
            ffix ffixVar = null;
            dtaaVar.bG(obj3 instanceof dtab ? (dtab) obj3 : null);
            ffix ffixVar2 = new ffix() { // from class: dsxb
                @Override // defpackage.ffix
                public final Object invoke() {
                    dsxg.this.j();
                    return ffcu.a;
                }
            };
            ffix ffixVar3 = true != dtaaVar.bI() ? ffixVar2 : null;
            if (ffixVar3 == null) {
                ffixVar2.invoke();
            } else {
                ffixVar = ffixVar3;
            }
            dtaaVar.aP = ffixVar;
            dsxgVar.f(dtaaVar);
            dszd dszdVar = dsxgVar.f;
            dszdVar.f = dtaaVar;
            dszh c = dszdVar.c();
            if (c != null) {
                c.a(dtaaVar, dszdVar.d);
            }
        }
    }

    @Override // defpackage.fflr
    protected final boolean b(Object obj, Object obj2) {
        return !ffkj.e(obj, obj2);
    }
}
