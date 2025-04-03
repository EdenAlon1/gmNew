package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dykq implements erqj {
    final /* synthetic */ dzja a;
    final /* synthetic */ long b;
    final /* synthetic */ dykr c;

    public dykq(dykr dykrVar, dzja dzjaVar, long j) {
        this.a = dzjaVar;
        this.b = j;
        this.c = dykrVar;
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        dzam dzamVar = (dzam) obj;
        this.c.e(this.a);
        dzhl r = dzhm.r();
        r.n(this.a.c().f());
        r.g(10105);
        dzhx dzhxVar = new dzhx();
        dzhxVar.b = emxc.j(Integer.valueOf(dzamVar.a()));
        dyhj.a();
        dzhxVar.c = emxc.j(Long.valueOf(System.currentTimeMillis() - this.b));
        r.b(dzhxVar.a());
        this.c.e.b(r.a());
        if (dzamVar.b()) {
            dykr dykrVar = this.c;
            final dzja dzjaVar = this.a;
            cgjj cgjjVar = dykrVar.i;
            if (((Boolean) cgjjVar.c.b()).booleanValue()) {
                cgjk.a.m("Lighter bootstrap succeeded, trigger full sync");
                final cglm cglmVar = (cglm) cgjjVar.d;
                final erog erogVar = new erog() { // from class: cgll
                    @Override // defpackage.erog
                    public final ListenableFuture a() {
                        final cglm cglmVar2 = cglm.this;
                        elfl i = cglmVar2.a().i(new eroh() { // from class: cglh
                            @Override // defpackage.eroh
                            public final ListenableFuture a(Object obj2) {
                                cgkv cgkvVar = (cgkv) cglm.this.c.b();
                                cglm.a.longValue();
                                return cgkvVar.c(0L);
                            }
                        }, cglmVar2.f);
                        final dzja dzjaVar2 = dzjaVar;
                        return i.i(new eroh() { // from class: cglk
                            @Override // defpackage.eroh
                            public final ListenableFuture a(Object obj2) {
                                final dzja dzjaVar3 = dzjaVar2;
                                final emxc b = dzjaVar3.c().b();
                                boolean g = b.g();
                                final cglm cglmVar3 = cglm.this;
                                if (g) {
                                    return ((cgkv) cglmVar3.c.b()).b().h(new emwl() { // from class: cglj
                                        @Override // defpackage.emwl
                                        public final Object apply(Object obj3) {
                                            cglm cglmVar4 = cglm.this;
                                            if (((Long) obj3).longValue() >= ((dypj) ((dygx) cglmVar4.d.b()).f()).b.b(dzjaVar3).d()) {
                                                cglmVar4.b.m("Bugle synced with Lighter, no need to sync.");
                                                return null;
                                            }
                                            emxc emxcVar = b;
                                            cglf cglfVar = cglmVar4.g;
                                            cgld cgldVar = (cgld) cgle.a.createBuilder();
                                            String str = (String) emxcVar.c();
                                            cgldVar.copyOnWrite();
                                            cgle cgleVar = (cgle) cgldVar.instance;
                                            cgleVar.b |= 1;
                                            cgleVar.c = str;
                                            long epochMilli = ((cqoh) cglmVar4.h.b()).f().toEpochMilli();
                                            cgldVar.copyOnWrite();
                                            cgle cgleVar2 = (cgle) cgldVar.instance;
                                            cgleVar2.b |= 2;
                                            cgleVar2.d = epochMilli;
                                            cgle cgleVar3 = (cgle) cgldVar.build();
                                            cetp cetpVar = new cetp();
                                            cetpVar.d = "incremental_sync_cancelation_tag";
                                            ((cevh) cglfVar.a.b()).a(ceyr.h("lighter_incremental_sync", cgleVar3, cetpVar.a()));
                                            return null;
                                        }
                                    }, cglmVar3.e);
                                }
                                cglmVar3.b.r("AccountContext doesn't have gaia email");
                                return elfo.e(null);
                            }
                        }, cglmVar2.f);
                    }
                };
                ((cgkv) cglmVar.c.b()).a().i(new eroh() { // from class: cgli
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        return !((Boolean) obj2).booleanValue() ? elfo.e(null) : elfo.h(erogVar, cglm.this.f);
                    }
                }, cglmVar.f);
            }
        }
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        this.c.e(this.a);
    }
}
