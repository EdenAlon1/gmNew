package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsxf extends fflr {
    final /* synthetic */ dsxg a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsxf(Object obj, dsxg dsxgVar) {
        super(obj);
        this.a = dsxgVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v6, types: [dsyj, java.lang.Object] */
    @Override // defpackage.fflr
    protected final void a(ffmx ffmxVar, Object obj, Object obj2) {
        dsxi dsxiVar = (dsxi) obj2;
        dsxi dsxiVar2 = (dsxi) obj;
        ((enrr) dsxg.b.h().h("com/google/android/libraries/compose/ui/rendering/RenderingManager$special$$inlined$distinctObservable$2", "afterChange", 84, "RenderingManager.kt")).D("State switched from %s to %s", dsxiVar2, dsxiVar);
        dtaa d = this.a.d();
        if (d != null) {
            d.gS(dsxiVar);
        }
        this.a.e.invoke(dsxiVar);
        dsxg dsxgVar = this.a;
        dsxiVar2.getClass();
        dsxiVar.getClass();
        int ordinal = dsxiVar.ordinal();
        dszd dszdVar = dsxgVar.f;
        if (ordinal == 0) {
            dszdVar.j(dsxiVar2 == dsxi.b ? dszdVar.d.a() : dszdVar.a());
            dszdVar.k(0, dszdVar.b());
            dsxu dsxuVar = dszdVar.e;
            if (dsxuVar != 0) {
                dsxuVar.h = true;
                ?? invoke = dsxuVar.d.invoke();
                if (invoke != 0) {
                    dsxuVar.h(invoke);
                    return;
                }
                return;
            }
            return;
        }
        if (ordinal == 1) {
            dszd.m(dszdVar, 0, 3);
            dsxu dsxuVar2 = dszdVar.e;
            if (dsxuVar2 != null) {
                dsxuVar2.h = false;
                return;
            }
            return;
        }
        if (ordinal == 2) {
            dszdVar.k(0, -1);
        } else {
            if (ordinal != 3) {
                throw new ffcd();
            }
            dtaa dtaaVar = dszdVar.f;
            if (dtaaVar != null) {
                dtaaVar.gT();
            }
            dszdVar.e();
        }
    }

    @Override // defpackage.fflr
    protected final boolean b(Object obj, Object obj2) {
        return !ffkj.e(obj, obj2);
    }
}
