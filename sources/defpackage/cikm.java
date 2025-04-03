package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cikm implements erqj {
    final /* synthetic */ chwv a;
    final /* synthetic */ boolean b;
    final /* synthetic */ cikn c;

    public cikm(cikn ciknVar, chwv chwvVar, boolean z) {
        this.a = chwvVar;
        this.b = z;
        this.c = ciknVar;
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.c.g.e("Bugle.Ditto.Response.Status", Status.b.getCode().value());
        this.c.g.c("Bugle.Ditto.RetryExecutor.Rpc.Success.Count");
        esaa b = esaa.b(this.a.m().d);
        if (b == null) {
            b = esaa.UNRECOGNIZED;
        }
        if (b != esaa.GET_UPDATES) {
            chwv chwvVar = this.a;
            bzea bzeaVar = (bzea) chwvVar.a.b();
            ervk ervkVar = chwvVar.i;
            bzeaVar.n(ervkVar.b, chwvVar.b.c, ervkVar.g, chwvVar.c);
        }
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        this.c.g.e("Bugle.Ditto.Response.Status", Status.c(th).getCode().value());
        this.a.h(th);
        if (this.b) {
            if (!chfh.c(Status.c(th).getCode())) {
                this.c.g.c("Bugle.Ditto.RetryExecutor.Rpc.Failure.Without.Retry.Count");
                return;
            }
            this.c.g.c("Bugle.Ditto.RetryExecutor.Rpc.Retry.Count");
            final cikn ciknVar = this.c;
            final chwv chwvVar = this.a;
            cila m = chwvVar.m();
            cetp cetpVar = new cetp();
            esaa b = esaa.b(m.d);
            if (b == null) {
                b = esaa.UNRECOGNIZED;
            }
            if (b != esaa.GET_UPDATES) {
                cikn.a.m("Ditto response RPC failed, scheduling retry...");
                ((cikx) ciknVar.d.b()).a(m, cetpVar.a());
                chdj chdjVar = ((cgcu) ciknVar.l.b()).a() ? (chdj) ciknVar.i.b() : ciknVar.j;
                final String p = ((cgcu) ciknVar.l.b()).a() ? chwvVar.p() : "Bugle";
                chdjVar.s().i(new eroh() { // from class: cikj
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        fcdu fcduVar = (fcdu) obj;
                        fcduVar.getClass();
                        cikn ciknVar2 = cikn.this;
                        fcfn a = ciknVar2.h.a(p);
                        eyee eyeeVar = fcduVar.b;
                        a.copyOnWrite();
                        fcfo fcfoVar = (fcfo) a.instance;
                        fcfo fcfoVar2 = fcfo.a;
                        eyeeVar.getClass();
                        fcfoVar.f = eyeeVar;
                        fcfo fcfoVar3 = (fcfo) a.build();
                        final chwv chwvVar2 = chwvVar;
                        chhw a2 = ((cgcu) chwvVar2.h.b()).a() ? ciknVar2.c.a() : ciknVar2.k;
                        fbyf fbyfVar = (fbyf) fbyg.a.createBuilder();
                        fcff fcffVar = (fcff) fcfg.a.createBuilder();
                        String str = chwvVar2.f;
                        fcffVar.copyOnWrite();
                        fcfg fcfgVar = (fcfg) fcffVar.instance;
                        str.getClass();
                        fcfgVar.c = str;
                        fcek fcekVar = chwvVar2.g;
                        fcffVar.copyOnWrite();
                        fcfg fcfgVar2 = (fcfg) fcffVar.instance;
                        fcekVar.getClass();
                        fcfgVar2.d = fcekVar;
                        fcfgVar2.b |= 1;
                        fbyfVar.a((fcfg) fcffVar.build());
                        fbyfVar.copyOnWrite();
                        fbyg fbygVar = (fbyg) fbyfVar.instance;
                        fcfoVar3.getClass();
                        fbygVar.c = fcfoVar3;
                        fbygVar.b |= 1;
                        return a2.a((fbyg) fbyfVar.build()).h(new emwl() { // from class: chwt
                            @Override // defpackage.emwl
                            public final Object apply(Object obj2) {
                                csjy.j("BugleNetwork", "Acked message, messageId=%s", chwv.this.f);
                                return null;
                            }
                        }, erpp.a);
                    }
                }, ciknVar.b);
                return;
            }
            try {
                erxi erxiVar = (erxi) eyfy.parseFrom(erxi.a, m.f, eyfc.a());
                int i = erxiVar.b;
                int a = erxh.a(i);
                if (a == 0) {
                    throw null;
                }
                int i2 = a - 1;
                if (i2 == 2) {
                    fcek fcekVar = m.c;
                    if (fcekVar == null) {
                        fcekVar = fcek.a;
                    }
                    cetpVar.a = fcekVar.c;
                    cikn.a.m("Ditto Conversation Update RPC failed, scheduling retry...");
                    ((cevh) ((cijz) ciknVar.f.b()).a.b()).g(ceyr.h("ditto_conversation_retry_handler", m, cetpVar.a()));
                    return;
                }
                if (i2 == 3) {
                    fcek fcekVar2 = m.c;
                    if (fcekVar2 == null) {
                        fcekVar2 = fcek.a;
                    }
                    cetpVar.a = fcekVar2.c;
                    cikn.a.m("Ditto Message Update RPC failed, scheduling retry...");
                    ((cevh) ((cikf) ciknVar.e.b()).a.b()).g(ceyr.h("ditto_message_retry_handler", m, cetpVar.a()));
                    return;
                }
                if (i2 == 5) {
                    fcek fcekVar3 = m.c;
                    if (fcekVar3 == null) {
                        fcekVar3 = fcek.a;
                    }
                    cetpVar.b = "settings_update_".concat(String.valueOf(fcekVar3.c));
                    cikn.a.m("Ditto Settings Update RPC failed, scheduling retry...");
                } else if (i2 == 6) {
                    esea b2 = esea.b((i == 6 ? (esec) erxiVar.c : esec.a).b);
                    if (b2 == null) {
                        b2 = esea.UNRECOGNIZED;
                    }
                    switch (b2.ordinal()) {
                        case 1:
                        case 2:
                        case 3:
                            fcek fcekVar4 = m.c;
                            if (fcekVar4 == null) {
                                fcekVar4 = fcek.a;
                            }
                            cetpVar.b = "browser_inactive_".concat(String.valueOf(fcekVar4.c));
                            break;
                        case 5:
                        case 6:
                            fcek fcekVar5 = m.c;
                            if (fcekVar5 == null) {
                                fcekVar5 = fcek.a;
                            }
                            cetpVar.b = "connectivity_update_".concat(String.valueOf(fcekVar5.c));
                            break;
                        case 7:
                        case 8:
                            fcek fcekVar6 = m.c;
                            if (fcekVar6 == null) {
                                fcekVar6 = fcek.a;
                            }
                            cetpVar.b = "battery_update_".concat(String.valueOf(fcekVar6.c));
                            break;
                    }
                    cikn.a.m("Ditto User Alert RPC failed, scheduling retry...");
                } else if (i2 == 8) {
                    return;
                } else {
                    cikn.a.m("Ditto GetUpdates RPC failed, scheduling retry...");
                }
                ((cikx) ciknVar.d.b()).a(m, cetpVar.a());
            } catch (eygu e) {
                cikn.a.o("Failed to parse GetUpdatesResponse while scheduling retry.", e);
            }
        }
    }
}
