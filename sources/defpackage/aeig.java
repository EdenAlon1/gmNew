package defpackage;

import android.os.CancellationSignal;
import com.google.android.apps.messaging.label.data.classification.SuperSortLabel;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aeig extends ofe {
    final CancellationSignal c = new CancellationSignal();
    public final dtrs d = new aeif(this);
    final /* synthetic */ aeij e;

    public aeig(aeij aeijVar) {
        this.e = aeijVar;
    }

    @Override // defpackage.ody
    public final void c() {
        this.c.cancel();
        aeij aeijVar = this.e;
        if (aeijVar.s == aeii.FINISHED) {
            aeijVar.s = aeii.REFRESHING;
        }
        long epochMilli = aeijVar.c.f().toEpochMilli();
        long j = epochMilli - this.e.x.get();
        if (j < ((Integer) this.e.y.e()).intValue()) {
            ensk e = aeij.b.e();
            e.Y(ente.a, "ConversationListDataSources");
            ((enrr) ((enrr) ((enrr) e).g(eldx.b(new RuntimeException("HomeScreenInvalidationFrequencyException")))).h("com/google/android/apps/messaging/home/list/ConversationListDataSources$ConversationListDataSource", "invalidate", 878, "ConversationListDataSources.java")).s("Home Screen invalidated too quickly. timeSinceLastInvalidation: %d", j);
        }
        this.e.x.set(epochMilli);
        super.c();
    }

    @Override // defpackage.ofe
    public final /* bridge */ /* synthetic */ Object d(Object obj) {
        aely aelyVar = (aely) obj;
        return new aehg(aelyVar.k().w(), aelyVar.k().o(), aelyVar.k().ae(), aelyVar.k().C());
    }

    @Override // defpackage.ofe
    public final void g(final ofb ofbVar, final oey oeyVar) {
        ekzm b = this.e.f.b("ConversationListDataSources.create#loadAfter");
        try {
            axnw.h(elfo.e(ctsx.a).h(new emwl() { // from class: aeie
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    aeig aeigVar = aeig.this;
                    ctsx ctsxVar = (ctsx) obj;
                    aeigVar.e.f();
                    ofb ofbVar2 = ofbVar;
                    try {
                        aeij aeijVar = aeigVar.e;
                        aeze aezeVar = aeijVar.m;
                        cgix cgixVar = aeijVar.k;
                        SuperSortLabel superSortLabel = (SuperSortLabel) aeijVar.l.get();
                        agzg g = agzh.g();
                        g.f(aeij.a((aeho) ofbVar2.a));
                        aeho aehoVar = (aeho) ofbVar2.a;
                        ((afcq) g).a = aehoVar.b();
                        g.b(aehoVar.d());
                        g.d(ofbVar2.b);
                        g.e(ctsxVar);
                        agzh a = g.a();
                        dtrs dtrsVar = aeigVar.d;
                        Map map = aeigVar.e.w;
                        CancellationSignal cancellationSignal = aeigVar.c;
                        aeze.c("queryNextPage", cgixVar, superSortLabel, false);
                        List d = aezeVar.d(aezeVar.a(aezeVar.b(cgixVar, superSortLabel).h(a, aezeVar.b), dtrsVar, cancellationSignal), map, superSortLabel, cancellationSignal);
                        oey oeyVar2 = oeyVar;
                        csjb d2 = aeij.a.d();
                        d2.I("loadAfter");
                        d2.A("key", ((aeho) ofbVar2.a).b());
                        d2.y("load size", ofbVar2.b);
                        d2.y("returned list size", d.size());
                        d2.r();
                        aeigVar.e.s = aeii.FINISHED;
                        oeyVar2.a(d);
                        return null;
                    } catch (dtyy unused) {
                        csjb d3 = aeij.a.d();
                        d3.I("Inflight query was cancelled, due to invalidation.");
                        d3.r();
                        return null;
                    }
                }
            }, this.e.g));
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ofe
    public final void h(final ofb ofbVar, final oey oeyVar) {
        ekzm b = this.e.f.b("ConversationListDataSources.create#loadBefore");
        try {
            axnw.h(elfo.e(ctsx.a).h(new emwl() { // from class: aeid
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    aeig aeigVar = aeig.this;
                    ctsx ctsxVar = (ctsx) obj;
                    aeigVar.e.f();
                    ofb ofbVar2 = ofbVar;
                    try {
                        aeij aeijVar = aeigVar.e;
                        aeze aezeVar = aeijVar.m;
                        cgix cgixVar = aeijVar.k;
                        SuperSortLabel superSortLabel = (SuperSortLabel) aeijVar.l.get();
                        agzg g = agzh.g();
                        g.f(aeij.a((aeho) ofbVar2.a));
                        aeho aehoVar = (aeho) ofbVar2.a;
                        ((afcq) g).a = aehoVar.b();
                        g.b(aehoVar.d());
                        g.d(ofbVar2.b);
                        g.e(ctsxVar);
                        agzh a = g.a();
                        dtrs dtrsVar = aeigVar.d;
                        Map map = aeigVar.e.w;
                        CancellationSignal cancellationSignal = aeigVar.c;
                        aeze.c("queryPrevPage", cgixVar, superSortLabel, false);
                        List d = aezeVar.d(aezeVar.a(aezeVar.b(cgixVar, superSortLabel).j(a, aezeVar.b), dtrsVar, cancellationSignal), map, superSortLabel, cancellationSignal);
                        oey oeyVar2 = oeyVar;
                        csjb d2 = aeij.a.d();
                        d2.I("loadBefore");
                        d2.A("key", ((aeho) ofbVar2.a).b());
                        d2.y("load size", ofbVar2.b);
                        d2.y("returned list size", d.size());
                        d2.r();
                        aeigVar.e.s = aeii.FINISHED;
                        oeyVar2.a(d);
                        return null;
                    } catch (dtyy unused) {
                        csjb d3 = aeij.a.d();
                        d3.I("Inflight query was cancelled, due to invalidation.");
                        d3.r();
                        return null;
                    }
                }
            }, this.e.g));
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ofe
    public final void i(ofa ofaVar, final oez oezVar) {
        ekzm b = this.e.f.b("ConversationListDataSources.create#loadInitial");
        try {
            final aeho aehoVar = (aeho) ofaVar.a;
            if (aehoVar != null) {
                this.e.q = false;
            }
            aeij aeijVar = this.e;
            final int i = aeijVar.q ? aeijVar.t : ofaVar.b;
            ekzz f = eleg.f("ConversationListDataSources#loadInitialSync");
            try {
                aeij aeijVar2 = this.e;
                if (aeijVar2.v == null) {
                    aeijVar2.v = elfo.e(ctsx.a);
                }
                aeij aeijVar3 = this.e;
                elfl h = aeijVar3.v.h(new emwl() { // from class: aeic
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:101:0x025a A[Catch: all -> 0x0450, TryCatch #7 {all -> 0x0450, blocks: (B:83:0x0173, B:84:0x0176, B:86:0x0187, B:89:0x018f, B:92:0x0213, B:93:0x0223, B:96:0x0238, B:98:0x0248, B:99:0x024f, B:101:0x025a, B:102:0x0260, B:115:0x027c, B:114:0x0279, B:125:0x0221, B:124:0x021e, B:130:0x028e, B:141:0x0288, B:140:0x0285, B:95:0x0229, B:91:0x01ac, B:110:0x0274, B:120:0x0219), top: B:73:0x00b7, inners: #9, #14, #16, #20 }] */
                    /* JADX WARN: Removed duplicated region for block: B:104:0x025f  */
                    /* JADX WARN: Removed duplicated region for block: B:105:0x024d  */
                    /* JADX WARN: Removed duplicated region for block: B:16:0x02b2  */
                    /* JADX WARN: Removed duplicated region for block: B:63:0x0088 A[Catch: all -> 0x0452, TRY_ENTER, TRY_LEAVE, TryCatch #11 {all -> 0x0452, blocks: (B:3:0x0015, B:63:0x0088, B:74:0x00b7, B:76:0x00c6), top: B:2:0x0015 }] */
                    /* JADX WARN: Removed duplicated region for block: B:8:0x004d A[Catch: all -> 0x0037, TRY_ENTER, TryCatch #15 {all -> 0x0037, blocks: (B:179:0x001b, B:181:0x001f, B:184:0x0025, B:8:0x004d, B:10:0x005a, B:11:0x005e, B:66:0x0094, B:68:0x009b, B:72:0x00ab, B:187:0x002f), top: B:178:0x001b }] */
                    /* JADX WARN: Removed duplicated region for block: B:98:0x0248 A[Catch: all -> 0x0450, TryCatch #7 {all -> 0x0450, blocks: (B:83:0x0173, B:84:0x0176, B:86:0x0187, B:89:0x018f, B:92:0x0213, B:93:0x0223, B:96:0x0238, B:98:0x0248, B:99:0x024f, B:101:0x025a, B:102:0x0260, B:115:0x027c, B:114:0x0279, B:125:0x0221, B:124:0x021e, B:130:0x028e, B:141:0x0288, B:140:0x0285, B:95:0x0229, B:91:0x01ac, B:110:0x0274, B:120:0x0219), top: B:73:0x00b7, inners: #9, #14, #16, #20 }] */
                    /* JADX WARN: Type inference failed for: r0v94, types: [akzt] */
                    /* JADX WARN: Type inference failed for: r14v10 */
                    /* JADX WARN: Type inference failed for: r14v4 */
                    /* JADX WARN: Type inference failed for: r14v5 */
                    /* JADX WARN: Type inference failed for: r14v6 */
                    /* JADX WARN: Type inference failed for: r14v7 */
                    /* JADX WARN: Type inference failed for: r14v8 */
                    /* JADX WARN: Type inference failed for: r14v9, types: [int] */
                    /* JADX WARN: Type inference failed for: r21v0 */
                    /* JADX WARN: Type inference failed for: r21v1 */
                    /* JADX WARN: Type inference failed for: r21v2 */
                    @Override // defpackage.emwl
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object apply(java.lang.Object r23) {
                        /*
                            Method dump skipped, instructions count: 1119
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeic.apply(java.lang.Object):java.lang.Object");
                    }
                }, aeijVar3.g);
                f.b(h);
                axnw.h(h);
                f.close();
                b.close();
            } finally {
            }
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
