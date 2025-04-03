package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.babu;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class babu implements cfvv {
    public static final cskc a = cskc.g("BugleNetwork", "TachyonAccountDeletedHandler");
    public final cfyt b;
    public final asjt c;
    public final Context d;
    public final errl e;
    private final babf f;
    private final errl g;

    /* compiled from: PG */
    public interface a {
        cgxw c();

        tsp r();
    }

    public babu(babf babfVar, cfyt cfytVar, asjt asjtVar, Context context, errl errlVar, errl errlVar2) {
        this.f = babfVar;
        this.b = cfytVar;
        this.c = asjtVar;
        this.d = context;
        this.e = errlVar;
        this.g = errlVar2;
    }

    @Override // defpackage.cfvv
    public final int a(euxg euxgVar) {
        return 0;
    }

    @Override // defpackage.cfvv
    public final void b(euxg euxgVar) {
        a.p("Received account deleted notification from Tachyon");
        axnw.h(this.f.a().i(new eroh() { // from class: babo
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                babu.a.p("Checks tachyon registration.");
                babu babuVar = babu.this;
                final babu.a aVar = (babu.a) ekhv.a(babuVar.d, babu.a.class, (eisx) obj);
                return aVar.c().c().i(new eroh() { // from class: babt
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        final tsp r = babu.a.this.r();
                        return r.e.s().e(chdh.class, new emwl() { // from class: tsh
                            @Override // defpackage.emwl
                            public final Object apply(Object obj3) {
                                chdh chdhVar = (chdh) obj3;
                                tsp.a.r("Failed to get Tachyon registration for dasher account");
                                final tsp tspVar = tsp.this;
                                axnw.h(tspVar.j.k().i(new eroh() { // from class: tsj
                                    @Override // defpackage.eroh
                                    public final ListenableFuture a(Object obj4) {
                                        if (!((axez) obj4).e) {
                                            tsp.a.p("The CMS feature is already disabled. Skipping disabling restricted dasher account");
                                            return elfo.e(null);
                                        }
                                        final tsp tspVar2 = tsp.this;
                                        tsp.a.p("Disabling restricted dasher account.");
                                        return tspVar2.i.d(tspVar2.c, 1, 1).i(new eroh() { // from class: tsd
                                            @Override // defpackage.eroh
                                            public final ListenableFuture a(Object obj5) {
                                                tsp tspVar3 = tsp.this;
                                                return tspVar3.b.b(tspVar3.c);
                                            }
                                        }, tspVar2.k).h(new emwl() { // from class: tsg
                                            @Override // defpackage.emwl
                                            public final Object apply(Object obj5) {
                                                String str = (String) obj5;
                                                csjb e = tsp.a.e();
                                                e.I("Dasher account has been disabled");
                                                e.M("accountName", str);
                                                e.r();
                                                str.getClass();
                                                tsp.this.h.r(str);
                                                return null;
                                            }
                                        }, tspVar2.l);
                                    }
                                }, tspVar.l));
                                throw chdhVar;
                            }
                        }, r.k);
                    }
                }, babuVar.e);
            }
        }, this.e).h(new emwl() { // from class: babp
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return null;
            }
        }, erpp.a).e(babn.class, new emwl() { // from class: babq
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                babu.a.p("No linked account. Skips checking tachyon registration.");
                return null;
            }
        }, this.g).e(chdh.class, new emwl() { // from class: babr
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                babu.a.p("The multi-device feature is disabled by the admin for the Dasher account.");
                return null;
            }
        }, this.g).e(fedn.class, new emwl() { // from class: babs
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                fedn fednVar = (fedn) obj;
                babu.a.s("Caught StatusRuntimeException. Failed to verify tachyon registration.", fednVar);
                babu babuVar = babu.this;
                if (babuVar.c.a()) {
                    crze.c("Uncaught exception", fednVar);
                    return null;
                }
                babuVar.b.b(fednVar);
                return null;
            }
        }, this.g));
    }

    @Override // defpackage.cfvv
    public final void c() {
    }
}
