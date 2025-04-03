package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tpx implements cigv {
    public static final cskc a = cskc.f("BugleCms", tpx.class);
    public final Map b;
    public final cscn c;
    public final axkm d;
    public final axmm e;
    public final errl f;
    private final errl g;

    public tpx(Map map, cscn cscnVar, axkm axkmVar, axmm axmmVar, errl errlVar, errl errlVar2) {
        this.b = map;
        this.c = cscnVar;
        this.d = axkmVar;
        this.e = axmmVar;
        this.g = errlVar;
        this.f = errlVar2;
        for (eszj eszjVar : ((enhk) map).keySet()) {
            csjb d = a.d();
            d.I("Registered EventHandler for ");
            d.I(eszjVar);
            d.r();
        }
    }

    @Override // defpackage.cigv
    public final elfl a(final fbzt fbztVar) {
        fbzs b = fbzs.b(fbztVar.d);
        if (b == null) {
            b = fbzs.UNRECOGNIZED;
        }
        if (b.equals(fbzs.CMS_NOTIFICATION)) {
            return this.d.k().i(new eroh() { // from class: tpu
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    boolean z;
                    final tpx tpxVar = tpx.this;
                    axez axezVar = (axez) obj;
                    if (csgj.a()) {
                        axkl axklVar = tpxVar.d.n;
                        z = axkl.g(axezVar);
                    } else {
                        z = axezVar.e;
                    }
                    fbzt fbztVar2 = fbztVar;
                    if (!z) {
                        csjb e = tpx.a.e();
                        e.I("Ignoring CMS notification, CMS feature disabled on device.");
                        fbzs b2 = fbzs.b(fbztVar2.d);
                        if (b2 == null) {
                            b2 = fbzs.UNRECOGNIZED;
                        }
                        e.A("messageType", b2.name());
                        e.A("messageId", fbztVar2.c);
                        e.r();
                        return elfo.e(true);
                    }
                    if (!tpxVar.e.k(axezVar)) {
                        csjb e2 = tpx.a.e();
                        e2.I("Ignoring CMS notification, device has not yet restored keys.");
                        fbzs b3 = fbzs.b(fbztVar2.d);
                        if (b3 == null) {
                            b3 = fbzs.UNRECOGNIZED;
                        }
                        e2.A("messageType", b3.name());
                        e2.A("messageId", fbztVar2.c);
                        e2.r();
                        return elfo.e(true);
                    }
                    try {
                        eszp eszpVar = (eszp) eyfy.parseFrom(eszp.a, fbztVar2.e, eyfc.a());
                        csjb d = tpx.a.d();
                        d.I("Processing");
                        fbzs b4 = fbzs.b(fbztVar2.d);
                        if (b4 == null) {
                            b4 = fbzs.UNRECOGNIZED;
                        }
                        d.A("messageType", b4.name());
                        d.A("messageId", fbztVar2.c);
                        d.y("eventCount", eszpVar.b.size());
                        d.r();
                        if (eszpVar.b.size() > 1) {
                            csjb e3 = tpx.a.e();
                            e3.I("More than 1 event found in MessageStoreNotification");
                            e3.y("eventCount", eszpVar.b.size());
                            e3.r();
                        }
                        Stream map = Collection.EL.stream(eszpVar.b).map(new Function() { // from class: tpr
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                eszk eszkVar = (eszk) obj2;
                                if (!eszkVar.d.equals("ANDROID_MESSAGES")) {
                                    csjb c = tpx.a.c();
                                    c.I("Ignoring CMS event");
                                    c.A("applicationId", eszkVar.d);
                                    c.r();
                                    return elfo.e(null);
                                }
                                final tpx tpxVar2 = tpx.this;
                                ffbr ffbrVar = (ffbr) tpxVar2.b.get(eszj.a(eszkVar.b));
                                if (ffbrVar != null) {
                                    return elfl.g(((tqz) ffbrVar.b()).a(eszkVar)).f(csgw.class, new eroh() { // from class: tpv
                                        @Override // defpackage.eroh
                                        public final ListenableFuture a(Object obj3) {
                                            final csgw csgwVar = (csgw) obj3;
                                            int i = csgwVar.a;
                                            tpx tpxVar3 = tpx.this;
                                            return tpxVar3.c.a(i).i(new eroh() { // from class: tpt
                                                @Override // defpackage.eroh
                                                public final ListenableFuture a(Object obj4) {
                                                    return ((Boolean) obj4).booleanValue() ? elfo.e(null) : elfo.d(csgw.this);
                                                }
                                            }, tpxVar3.f);
                                        }
                                    }, tpxVar2.f);
                                }
                                csjb d2 = tpx.a.d();
                                d2.I("No handler registered");
                                d2.A("CMS eventType", eszj.a(eszkVar.b));
                                d2.r();
                                return elfo.e(null);
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        int i = engw.d;
                        return elfo.l((Iterable) map.collect(endq.a)).a(new Callable() { // from class: tps
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                return null;
                            }
                        }, tpxVar.f).h(new emwl() { // from class: tpw
                            @Override // defpackage.emwl
                            public final Object apply(Object obj2) {
                                return true;
                            }
                        }, erpp.a);
                    } catch (eygu e4) {
                        csjb e5 = tpx.a.e();
                        e5.I("Exception parsing tachyon notification");
                        fbzs b5 = fbzs.b(fbztVar2.d);
                        if (b5 == null) {
                            b5 = fbzs.UNRECOGNIZED;
                        }
                        e5.A("messageType", b5.name());
                        e5.A("messageId", fbztVar2.c);
                        e5.s(e4);
                        return elfo.e(true);
                    }
                }
            }, this.g);
        }
        csjb e = a.e();
        e.I("Incorrect message type forwarded to handler. Expected CMS_NOTIFICATION.");
        fbzs b2 = fbzs.b(fbztVar.d);
        if (b2 == null) {
            b2 = fbzs.UNRECOGNIZED;
        }
        e.A("messageType", b2.name());
        e.A("messageId", fbztVar.c);
        e.r();
        return elfo.e(true);
    }
}
