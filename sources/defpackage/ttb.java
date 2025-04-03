package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ttb extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ ttc c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ttb(ttc ttcVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = ttcVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ttb) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [comc, java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object obj2;
        ffhh ffhhVar = ffhh.a;
        if (this.b != 0) {
            obj2 = this.a;
            ffci.b(obj);
        } else {
            ffci.b(obj);
            if (!((ersq) ((arhr) this.c.e).a.b()).a("bugle.backfill_rcs_msisdn_missing_field")) {
                ttc.a.p("Skipping RcsMsisdnBackfillMissingFieldSyncletTask run because the flag is off.");
                return ffcu.a;
            }
            ttc ttcVar = this.c;
            ccbz ccbzVar = ccbz.CONVERSATION_RCS_MSISDN_BACKFILL_TASK;
            axkm axkmVar = ((axkm) ttcVar.d.b()).n.a;
            final String name = ccbzVar.name();
            elfl h = axkmVar.e.get().h().h(new emwl() { // from class: axge
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.emwl
                public final Object apply(Object obj3) {
                    cskc cskcVar = axkm.a;
                    String str = name;
                    axem axemVar = axem.a;
                    str.getClass();
                    eyhm eyhmVar = ((axez) obj3).F;
                    return eyhmVar.containsKey(str) ? (axem) eyhmVar.get(str) : axemVar;
                }
            }, axkmVar.f).h(new emwl() { // from class: axkk
                @Override // defpackage.emwl
                public final Object apply(Object obj3) {
                    int a = axek.a(((axem) obj3).c);
                    boolean z = true;
                    if (a != 0 && a != 1) {
                        z = false;
                    }
                    return Boolean.valueOf(z);
                }
            }, erpp.a);
            this.a = ccbzVar;
            this.b = 1;
            obj = fgfz.c(h, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
            obj2 = ccbzVar;
        }
        if (!((Boolean) obj).booleanValue()) {
            ttc.a.p("Skipping RcsMsisdnBackfillMissingFieldSyncletTask because it has already run.");
            return ffcu.a;
        }
        ttc.a.p("Starting RcsMsisdnBackfillMissingFieldSyncletTask.");
        ttc ttcVar2 = this.c;
        int a = ttcVar2.c.a();
        ccbx ccbxVar = (ccbx) ccca.a.createBuilder();
        ccbxVar.getClass();
        obj2.getClass();
        ccbxVar.copyOnWrite();
        ccca cccaVar = (ccca) ccbxVar.instance;
        cccaVar.d = ((ccbz) obj2).e;
        cccaVar.b |= 4;
        cccb cccbVar = (cccb) cccc.a.createBuilder();
        cccbVar.getClass();
        cccbVar.copyOnWrite();
        cccc ccccVar = (cccc) cccbVar.instance;
        ccccVar.b = 1 | ccccVar.b;
        ccccVar.c = a;
        cccbVar.copyOnWrite();
        cccc ccccVar2 = (cccc) cccbVar.instance;
        ccccVar2.b |= 2;
        ccccVar2.d = 2;
        cccbVar.copyOnWrite();
        cccc ccccVar3 = (cccc) cccbVar.instance;
        ccccVar3.b |= 4;
        ccccVar3.e = ccue.a(5);
        ccbb.b(ccbv.a(cccbVar), ccbxVar);
        ccca a2 = ccbb.a(ccbxVar);
        cetp cetpVar = new cetp();
        cetpVar.b = "RcsMsisdnBackfillMissingFieldSyncletTask";
        ((cevh) ttcVar2.b.a.b()).a(ceyr.h("cms_backfill_missing_field_work_handler", a2, cetpVar.a()));
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ttb(this.c, ffguVar);
    }
}
