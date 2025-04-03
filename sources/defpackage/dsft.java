package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dsft extends ffhv implements ffjq {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;
    /* synthetic */ Object d;
    /* synthetic */ int e;
    final /* synthetic */ dsfv f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsft(dsfv dsfvVar, ffgu ffguVar) {
        super(6, ffguVar);
        this.f = dsfvVar;
    }

    @Override // defpackage.ffjq
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        int intValue = ((Number) obj5).intValue();
        dsft dsftVar = new dsft(this.f, (ffgu) obj6);
        dsftVar.a = (dsxi) obj;
        dsftVar.b = (dsmm) obj2;
        dsftVar.c = (dtbv) obj3;
        dsftVar.d = (dtbd) obj4;
        dsftVar.e = intValue;
        return dsftVar.b(ffcu.a);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [dtbd, java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        dsos dsosVar;
        ffci.b(obj);
        Object obj2 = this.a;
        Object obj3 = this.b;
        Object obj4 = this.c;
        ?? r2 = this.d;
        int i = this.e;
        dsmm dsmmVar = dsmm.a;
        dsxi dsxiVar = (dsxi) obj2;
        int ordinal = dsxiVar.ordinal();
        dsfv dsfvVar = this.f;
        if (ordinal != 0) {
            if (ordinal == 1) {
                int a = dsfvVar.j.a(dsxiVar);
                obj4.getClass();
                dtbu dtbuVar = (dtbu) obj4;
                dsot q = dsfvVar.q((dsmm) obj3);
                dsosVar = q instanceof dsos ? (dsos) q : null;
                if (dsosVar == null) {
                    dsosVar = new dsor(0, dsfvVar.c.a());
                }
                return new dtay(r2, a, dtbuVar, dsosVar);
            }
            if (ordinal != 2) {
                if (ordinal != 3) {
                    throw new ffcd();
                }
                dsot q2 = dsfvVar.q((dsmm) obj3);
                if (q2 instanceof dsos) {
                    return new dtbe((dsos) q2);
                }
                if (ffkj.e(q2, dsoo.a)) {
                    return dtaw.a;
                }
                throw new ffcd();
            }
        }
        if (!(obj4 instanceof dtbp)) {
            if (obj4 instanceof dtbi) {
                return dtaw.a;
            }
            obj4.getClass();
            return new dtax(r2, i, (dtbu) obj4);
        }
        dsot q3 = dsfvVar.q((dsmm) obj3);
        dsosVar = q3 instanceof dsos ? (dsos) q3 : null;
        if (dsosVar == null) {
            dsosVar = new dsor(0, dsfvVar.c.a());
        }
        return new dtbe(dsosVar);
    }
}
