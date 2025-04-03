package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class coqi extends ffhv implements ffjm {
    int a;
    final /* synthetic */ coqo b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public coqi(coqo coqoVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = coqoVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((coqi) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            cort cortVar = (cort) this.b.e.b();
            cors corsVar = cors.a;
            this.a = 1;
            obj = cortVar.l(corsVar, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        cosz coszVar = (cosz) obj;
        if (coszVar == null) {
            coszVar = cosz.a;
            coszVar.getClass();
        }
        if (!ffkj.e(coszVar.c, ((dkpp) this.b.i.b()).g().a)) {
            String str = coszVar.c;
            str.getClass();
            cosi cosiVar = new cosi(new djro(str), ((dkpp) this.b.i.b()).g(), coszVar.d, ((Integer) ((dkpp) this.b.i.b()).k.d()).intValue());
            cosk coskVar = (cosk) this.b.f.b();
            djrm djrmVar = cosiVar.b;
            eqpc a = coskVar.a(cosiVar.a);
            eqpc a2 = coskVar.a(djrmVar);
            erag eragVar = (erag) erah.a.createBuilder();
            eragVar.getClass();
            eragVar.copyOnWrite();
            erah erahVar = (erah) eragVar.instance;
            erahVar.c = a;
            erahVar.b |= 1;
            eragVar.copyOnWrite();
            erah erahVar2 = (erah) eragVar.instance;
            erahVar2.d = a2;
            erahVar2.b |= 2;
            String a3 = cosi.a(cosiVar.e);
            a3.getClass();
            eragVar.copyOnWrite();
            erah erahVar3 = (erah) eragVar.instance;
            erahVar3.b |= 4;
            erahVar3.e = a3;
            String a4 = cosi.a(cosiVar.f);
            a4.getClass();
            eragVar.copyOnWrite();
            erah erahVar4 = (erah) eragVar.instance;
            erahVar4.b |= 8;
            erahVar4.f = a4;
            eragVar.copyOnWrite();
            erah erahVar5 = (erah) eragVar.instance;
            erahVar5.b |= 16;
            erahVar5.g = cosiVar.c;
            eragVar.copyOnWrite();
            erah erahVar6 = (erah) eragVar.instance;
            erahVar6.b |= 32;
            erahVar6.h = cosiVar.d;
            eyfy build = eragVar.build();
            build.getClass();
            erad eradVar = (erad) erae.a.createBuilder();
            eradVar.getClass();
            eraf.b(6, eradVar);
            eradVar.copyOnWrite();
            erae eraeVar = (erae) eradVar.instance;
            eraeVar.d = (erah) build;
            eraeVar.b |= 64;
            erae a5 = eraf.a(eradVar);
            eolu eoluVar = (eolu) eolv.a.createBuilder();
            eolt eoltVar = eolt.SIM_STATE_TRACKER_EVENT;
            eoluVar.copyOnWrite();
            eolv eolvVar = (eolv) eoluVar.instance;
            eolvVar.j = eoltVar.dk;
            eolvVar.b = 1 | eolvVar.b;
            eoluVar.copyOnWrite();
            eolv eolvVar2 = (eolv) eoluVar.instance;
            eolvVar2.bI = a5;
            eolvVar2.g |= 8192;
            ((akyb) coskVar.a.b()).a().h(eoluVar, alal.LOG_SPEC_SIM_SUBSCRIPTION_INFO_COMPARISON_LOGGING);
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new coqi(this.b, ffguVar);
    }
}
