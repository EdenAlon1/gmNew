package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clfs implements clfq {
    public static final cskc a = cskc.g("BugleRcs", "GetMessagesMethod");
    private final clna b;
    private final cqoh c;
    private final errl d;

    public clfs(clna clnaVar, cqoh cqohVar, errl errlVar) {
        this.b = clnaVar;
        this.c = cqohVar;
        this.d = errlVar;
    }

    @Override // defpackage.clfq
    public final elfl a(axad axadVar) {
        clnb clnbVar = (clnb) clnc.a.createBuilder();
        eyja b = eykj.b(this.c.f());
        clnbVar.copyOnWrite();
        clnc clncVar = (clnc) clnbVar.instance;
        b.getClass();
        clncVar.c = b;
        clncVar.b |= 1;
        clnbVar.copyOnWrite();
        clnc clncVar2 = (clnc) clnbVar.instance;
        axadVar.getClass();
        clncVar2.e = axadVar;
        clncVar2.b |= 4;
        return ((cevh) this.b.a.b()).a(ceyr.g("rcs_engine_get_single_message", (clnc) clnbVar.build())).a().h(new emwl() { // from class: clfr
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ceyt ceytVar = (ceyt) obj;
                if (ceytVar.e()) {
                    csjb a2 = clfs.a.a();
                    a2.I("GetMessagesMethod processing done.");
                    a2.r();
                    return null;
                }
                csjb e = clfs.a.e();
                e.I("GetMessagesMethod processing failed");
                e.B("isRetryable", ceytVar.f());
                e.r();
                return null;
            }
        }, this.d);
    }

    @Override // defpackage.clfq
    public final void b() {
        clnb clnbVar = (clnb) clnc.a.createBuilder();
        eyja b = eykj.b(this.c.f());
        clnbVar.copyOnWrite();
        clnc clncVar = (clnc) clnbVar.instance;
        b.getClass();
        clncVar.c = b;
        clncVar.b |= 1;
        clnbVar.copyOnWrite();
        clnc clncVar2 = (clnc) clnbVar.instance;
        clncVar2.b |= 2;
        clncVar2.d = true;
        clnc clncVar3 = (clnc) clnbVar.build();
        cetp cetpVar = new cetp();
        cetpVar.b = "perform_catch_up_work_item_dedup_tag";
        this.b.a(clncVar3, cetpVar.a());
    }
}
