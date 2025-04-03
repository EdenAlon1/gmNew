package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cwhq extends ffhv implements ffjo {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;
    final /* synthetic */ cwhr d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cwhq(cwhr cwhrVar, ffgu ffguVar) {
        super(4, ffguVar);
        this.d = cwhrVar;
    }

    @Override // defpackage.ffjo
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        cwhq cwhqVar = new cwhq(this.d, (ffgu) obj4);
        cwhqVar.a = (aqux) obj;
        cwhqVar.b = (engw) obj2;
        cwhqVar.c = (cwir) obj3;
        return cwhqVar.b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1, types: [aqux, java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        cwjb cwjbVar;
        ffci.b(obj);
        final ?? r9 = this.a;
        Object obj2 = this.b;
        Object obj3 = this.c;
        if (r9 != 0) {
            final engw engwVar = (engw) obj2;
            if (engwVar.size() >= 2 && ((cwjbVar = ((cwir) obj3).d) == cwjb.a || cwjbVar == cwjb.b || cwjbVar == cwjb.c)) {
                final cwhr cwhrVar = this.d;
                return new cwhs(true, new doia(new doib(cwhrVar.c(r9), r9.o(), new ffix() { // from class: cwhp
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        final engw engwVar2 = engwVar;
                        engwVar2.getClass();
                        final fgcm a = fgdm.a(r9);
                        final cwhr cwhrVar2 = cwhr.this;
                        cwhrVar2.c.d(false, new ffji() { // from class: cwhm
                            @Override // defpackage.ffji
                            public final Object invoke(Object obj4) {
                                ajiy ajiyVar = (ajiy) obj4;
                                ajiyVar.getClass();
                                cwhr cwhrVar3 = cwhr.this;
                                engw engwVar3 = engwVar2;
                                fgcm fgcmVar = a;
                                axol.k(cwhrVar3.a, null, new cwho(fgcmVar, ajiyVar, cwhrVar3, engwVar3, null), 3);
                                return cwhrVar3.b(engwVar3, (aqux) fgcmVar.c(), ajiyVar, fgcmVar);
                            }
                        });
                        return ffcu.a;
                    }
                })));
            }
        }
        return new cwhs();
    }
}
