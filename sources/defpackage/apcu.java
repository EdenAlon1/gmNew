package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class apcu extends ffhv implements ffjm {
    final /* synthetic */ apcv a;
    final /* synthetic */ alxr b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public apcu(apcv apcvVar, alxr alxrVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = apcvVar;
        this.b = alxrVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((apcu) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        alxr alxrVar = this.b;
        emxf.b(alxrVar.a().equals(alxq.b), "Logging file download events supported only for RCS messages.");
        Long p = alxrVar.p();
        eoop eoopVar = (eoop) eopq.a.createBuilder();
        cqvy cqvyVar = this.a.a;
        long a = ((akvz) cqvyVar.c.b()).a(alxrVar.f());
        eoopVar.copyOnWrite();
        eopq eopqVar = (eopq) eoopVar.instance;
        eopqVar.b |= 1073741824;
        eopqVar.G = a;
        long longValue = p != null ? p.longValue() : 0L;
        eoopVar.copyOnWrite();
        eopq eopqVar2 = (eopq) eoopVar.instance;
        eopqVar2.b |= 128;
        eopqVar2.n = longValue;
        eoopVar.copyOnWrite();
        eopq eopqVar3 = (eopq) eoopVar.instance;
        eopqVar3.g = 3;
        eopqVar3.b |= 1;
        eoopVar.copyOnWrite();
        eopq eopqVar4 = (eopq) eoopVar.instance;
        eopqVar4.h = 32;
        eopqVar4.b |= 2;
        eqyl a2 = ((avkk) cqvyVar.d.b()).a();
        eoopVar.copyOnWrite();
        eopq eopqVar5 = (eopq) eoopVar.instance;
        eopqVar5.aa = a2.h;
        eopqVar5.c |= 2097152;
        int i = true == alxrVar.v() ? 2 : 3;
        eoopVar.copyOnWrite();
        eopq eopqVar6 = (eopq) eoopVar.instance;
        eopqVar6.S = i - 1;
        eopqVar6.c |= 16384;
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eolt eoltVar = eolt.BUGLE_MESSAGE;
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eolvVar.j = eoltVar.dk;
        eolvVar.b |= 1;
        eopq eopqVar7 = (eopq) eoopVar.build();
        eoluVar.copyOnWrite();
        eolv eolvVar2 = (eolv) eoluVar.instance;
        eopqVar7.getClass();
        eolvVar2.l = eopqVar7;
        eolvVar2.b |= 4;
        ((akyb) cqvyVar.b.b()).a().j(eoluVar, alal.LOG_SPEC_MESSAGE_DELIVERY_NORTHSTAR_EVENTS);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new apcu(this.a, this.b, ffguVar);
    }
}
