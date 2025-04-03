package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drce extends ffhv implements ffjm {
    int a;
    final /* synthetic */ drcf b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public drce(drcf drcfVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = drcfVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((drce) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            drcf drcfVar = this.b;
            final dqiy dqiyVar = drcfVar.al;
            if (dqiyVar == null) {
                ffkj.c("usageProcessor");
                dqiyVar = null;
            }
            fgcm fgcmVar = drcfVar.ao;
            final dqgm dqgmVar = dslv.aI;
            dqgmVar.getClass();
            fgch fgchVar = new fgch(fgcmVar, new drcd((ffxx) dqiyVar.e.e("EntityUsageProcessor#observeFrecency", new ffix() { // from class: dqio
                @Override // defpackage.ffix
                public final Object invoke() {
                    fgcl e = fgcu.e(1, 0, 0, 6);
                    dqgm dqgmVar2 = dqgmVar;
                    dqiy dqiyVar2 = dqiy.this;
                    ffqy.d(dqiyVar2.b, null, null, new dqiv(dqiyVar2, e, dqgmVar2, null), 3);
                    return e;
                }
            }), this.b), new drbz(null));
            drca drcaVar = new drca(this.b, null);
            this.a = 1;
            if (ffyk.b(fgchVar, drcaVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new drce(this.b, ffguVar);
    }
}
