package defpackage;

import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cigu implements cigv {
    private static final enru b = enru.c("com/google/android/apps/messaging/shared/net/handler/inboxmessagehandler/DittoInboxMessageHandler");
    public final bzgd a;
    private final chvq c;
    private final errl d;
    private final fazb e;
    private final ffbr f;

    public cigu(bzgd bzgdVar, errl errlVar, chvq chvqVar, ffbr ffbrVar, fazb fazbVar) {
        this.a = bzgdVar;
        this.d = errlVar;
        this.c = chvqVar;
        this.e = fazbVar;
        this.f = ffbrVar;
    }

    @Override // defpackage.cigv
    public final elfl a(final fbzt fbztVar) {
        boolean z;
        fcek a;
        final bzge bzgeVar;
        Object obj;
        final fcek fcekVar;
        final bzge bzgeVar2;
        final ervi erviVar;
        final fcek fcekVar2;
        elfl i;
        String q;
        fbzs b2 = fbzs.b(fbztVar.d);
        if (b2 == null) {
            b2 = fbzs.UNRECOGNIZED;
        }
        if (b2 == fbzs.DITTO) {
            for (bzhr bzhrVar : (Set) this.e.b()) {
                if (!bzhrVar.b()) {
                    ensk e = b.e();
                    e.Y(ente.a, "BugleNetwork");
                    ((enrr) ((enrr) e).h("com/google/android/apps/messaging/shared/net/handler/inboxmessagehandler/DittoInboxMessageHandler", "areDittoRpcsEnabled", 105, "DittoInboxMessageHandler.java")).t("Ignoring RPC from Ditto with reason %s", bzhrVar.a());
                    ((bzea) this.f.b()).d(bzhrVar.a().d);
                    return elfo.e(false);
                }
            }
            try {
                ervi erviVar2 = (ervi) eyfy.parseFrom(ervi.a, fbztVar.e);
                final chvq chvqVar = this.c;
                chvqVar.y.c("Bugle.Ditto.Requests");
                if (((cgcu) chvqVar.U.b()).a()) {
                    fcek fcekVar3 = fbztVar.g;
                    if (fcekVar3 == null) {
                        fcekVar3 = fcek.a;
                    }
                    fcek fcekVar4 = fbztVar.g;
                    if (fcekVar4 == null) {
                        fcekVar4 = fcek.a;
                    }
                    fgtg b3 = fgtg.b(fcekVar4.b);
                    if (b3 == null) {
                        b3 = fgtg.UNRECOGNIZED;
                    }
                    Optional empty = Optional.empty();
                    if (b3.equals(fgtg.EMAIL)) {
                        try {
                            if (chvq.C(erviVar2)) {
                                q = ((eslh) eyfy.parseFrom(eslh.a, erviVar2.d, eyfc.a())).c;
                                z = false;
                            } else {
                                final fcek fcekVar5 = fbztVar.g;
                                if (fcekVar5 == null) {
                                    fcekVar5 = fcek.a;
                                }
                                final byte[] I = fbztVar.h.I();
                                ekzz f = eleg.f("DittoDesktops#getInternalDesktopIdByGaiaEmail");
                                z = false;
                                try {
                                    bsuz a2 = bsve.a();
                                    a2.z("DittoDesktops#getInternalDesktopIdByGaiaEmail");
                                    Optional findFirst = Collection.EL.stream(a2.b().y()).filter(new Predicate() { // from class: bzfe
                                        public final /* synthetic */ Predicate and(Predicate predicate) {
                                            return Predicate$CC.$default$and(this, predicate);
                                        }

                                        @Override // java.util.function.Predicate
                                        /* renamed from: negate */
                                        public final /* synthetic */ Predicate mo439negate() {
                                            return Predicate$CC.$default$negate(this);
                                        }

                                        public final /* synthetic */ Predicate or(Predicate predicate) {
                                            return Predicate$CC.$default$or(this, predicate);
                                        }

                                        @Override // java.util.function.Predicate
                                        public final boolean test(Object obj2) {
                                            cskc cskcVar = bzgd.a;
                                            return bzgd.s((bsrt) obj2, fcek.this.c);
                                        }
                                    }).filter(new Predicate() { // from class: bzff
                                        public final /* synthetic */ Predicate and(Predicate predicate) {
                                            return Predicate$CC.$default$and(this, predicate);
                                        }

                                        @Override // java.util.function.Predicate
                                        /* renamed from: negate */
                                        public final /* synthetic */ Predicate mo439negate() {
                                            return Predicate$CC.$default$negate(this);
                                        }

                                        public final /* synthetic */ Predicate or(Predicate predicate) {
                                            return Predicate$CC.$default$or(this, predicate);
                                        }

                                        @Override // java.util.function.Predicate
                                        public final boolean test(Object obj2) {
                                            cskc cskcVar = bzgd.a;
                                            return Arrays.equals(((bsrt) obj2).u(), I);
                                        }
                                    }).findFirst();
                                    q = findFirst.isPresent() ? ((bsrt) findFirst.get()).q() : "";
                                    f.close();
                                    if (emxe.c(q)) {
                                        throw new chvo();
                                    }
                                } finally {
                                }
                            }
                            empty = Optional.of(fbztVar.h);
                        } catch (chvo unused) {
                            ensk e2 = chvq.c.e();
                            e2.Y(ente.a, "BugleNetwork");
                            ((enrr) ((enrr) e2).h("com/google/android/apps/messaging/shared/net/handler/DittoChannelRequestHandlerV2", "handleRequest", 721, "DittoChannelRequestHandlerV2.java")).t("Failed to find desktop for request %s. Sending unpair push", erviVar2.b);
                            chvu chvuVar = chvqVar.K;
                            fcek fcekVar6 = fbztVar.i;
                            if (fcekVar6 == null) {
                                fcekVar6 = fcek.a;
                            }
                            axnw.e(chvuVar.a(new bzge(fcekVar6, "", Optional.of(fbztVar.h)), erviVar2.b).e(fedn.class, new emwl() { // from class: chtn
                                @Override // defpackage.emwl
                                public final Object apply(Object obj2) {
                                    ensk i2 = chvq.c.i();
                                    i2.Y(ente.a, "BugleNetwork");
                                    ((enrr) ((enrr) ((enrr) i2).g((fedn) obj2)).h("com/google/android/apps/messaging/shared/net/handler/DittoChannelRequestHandlerV2", "sendUnpairGaiaRpc", 683, "DittoChannelRequestHandlerV2.java")).q("sendUnpairGaiaRpc failed with StatusRuntimeException");
                                    return fbzx.a;
                                }
                            }, chvqVar.w));
                            return elfo.e(true);
                        } catch (eygu e3) {
                            ensk i2 = chvq.c.i();
                            i2.Y(ente.a, "BugleNetwork");
                            ((enrr) ((enrr) ((enrr) i2).g(e3)).h("com/google/android/apps/messaging/shared/net/handler/DittoChannelRequestHandlerV2", "handleRequest", 717, "DittoChannelRequestHandlerV2.java")).t("Failed to get pairing attempt id for request %s", erviVar2.b);
                            return elfo.e(true);
                        }
                    } else {
                        z = false;
                        q = fcekVar3.c;
                    }
                    bzge bzgeVar3 = new bzge(fcekVar3, q, empty);
                    a = bzgeVar3.d;
                    fcek fcekVar7 = bzgeVar3.a;
                    ((bzea) chvqVar.p.b()).k(erviVar2.b, a.c, erviVar2.c, fbztVar.c);
                    bzgeVar = bzgeVar3;
                    obj = "";
                    fcekVar = fcekVar7;
                } else {
                    z = false;
                    fcek fcekVar8 = fbztVar.g;
                    if (fcekVar8 == null) {
                        fcekVar8 = fcek.a;
                    }
                    a = bzar.a(fcekVar8.c);
                    bzge bzgeVar4 = new bzge(a, a.c, Optional.empty());
                    fcek fcekVar9 = fbztVar.g;
                    if (fcekVar9 == null) {
                        fcekVar9 = fcek.a;
                    }
                    fgtg b4 = fgtg.b(fcekVar9.b);
                    if (b4 == null) {
                        b4 = fgtg.UNRECOGNIZED;
                    }
                    if (b4.equals(fgtg.EMAIL)) {
                        ensk e4 = chvq.c.e();
                        e4.Y(ente.a, "BugleNetwork");
                        ((enrr) ((enrr) e4).h("com/google/android/apps/messaging/shared/net/handler/DittoChannelRequestHandlerV2", "handleRequest", 750, "DittoChannelRequestHandlerV2.java")).q("Received Gaia paired desktop request when Gaia pairing is disabled.");
                        return elfo.e(true);
                    }
                    ((bzea) chvqVar.p.b()).k(erviVar2.b, a.c, erviVar2.c, fbztVar.c);
                    bzgeVar = bzgeVar4;
                    obj = "";
                    fcekVar = a;
                }
                boolean w = chvqVar.u.w(a);
                int i3 = erviVar2.c;
                esaa b5 = esaa.b(i3);
                if (b5 == null) {
                    b5 = esaa.UNRECOGNIZED;
                }
                if (b5 != esaa.GET_UPDATES && !w) {
                    chvqVar.y.g("Bugle.Ditto.InactiveBrowser.Requests", i3);
                }
                if (((cgcu) chvqVar.U.b()).a()) {
                    elfl d = bzgeVar.a.d.equals("Bugle") ? ((bzgw) chvqVar.Y.b()).d() : elfo.e(obj);
                    erviVar = erviVar2;
                    eroh erohVar = new eroh() { // from class: chus
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj2) {
                            String str = (String) obj2;
                            ervi erviVar3 = erviVar;
                            esaa b6 = esaa.b(erviVar3.c);
                            if (b6 == null) {
                                b6 = esaa.UNRECOGNIZED;
                            }
                            bzge bzgeVar5 = bzgeVar;
                            if (b6 == esaa.GET_UPDATES) {
                                ensk e5 = chvq.c.e();
                                e5.Y(ente.a, "BugleNetwork");
                                ((enrr) ((enrr) e5).h("com/google/android/apps/messaging/shared/net/handler/DittoChannelRequestHandlerV2", "handleRequest", 777, "DittoChannelRequestHandlerV2.java")).D("setRequestId, desktopId=%s, requestId=%s", bzgeVar5.b, erviVar3.b);
                                final fcek fcekVar10 = bzgeVar5.d;
                                String str2 = erviVar3.b;
                                ekzz f2 = eleg.f("DittoDesktops#setRequestId");
                                try {
                                    String[] strArr = bsve.a;
                                    bsvb bsvbVar = new bsvb();
                                    bsvbVar.ap("setRequestId");
                                    bsvbVar.f(new Function() { // from class: bzen
                                        @Override // java.util.function.Function
                                        /* renamed from: andThen */
                                        public final /* synthetic */ Function mo448andThen(Function function) {
                                            return Function$CC.$default$andThen(this, function);
                                        }

                                        @Override // java.util.function.Function
                                        public final Object apply(Object obj3) {
                                            bsvd bsvdVar = (bsvd) obj3;
                                            cskc cskcVar = bzgd.a;
                                            bsvdVar.b(fcek.this.c);
                                            return bsvdVar;
                                        }

                                        public final /* synthetic */ Function compose(Function function) {
                                            return Function$CC.$default$compose(this, function);
                                        }
                                    });
                                    bsvbVar.e(str2);
                                    bsvbVar.b().e();
                                    f2.close();
                                } finally {
                                }
                            }
                            fcek fcekVar11 = fcekVar;
                            fbzt fbztVar2 = fbztVar;
                            chvq chvqVar2 = chvq.this;
                            if (TextUtils.isEmpty(str)) {
                                return chvqVar2.j(erviVar3, fbztVar2, fcekVar11, bzgeVar5);
                            }
                            ensk e6 = chvq.c.e();
                            e6.Y(ente.a, "BugleNetwork");
                            ((enrr) ((enrr) e6).h("com/google/android/apps/messaging/shared/net/handler/DittoChannelRequestHandlerV2", "handleRequest", 785, "DittoChannelRequestHandlerV2.java")).q("Gaia pairing is available, sending GaiaPairingInfo as response error.");
                            fcek fcekVar12 = ((cgcu) chvqVar2.U.b()).a() ? bzgeVar5.d : fcekVar11;
                            ensk e7 = chvq.c.e();
                            e7.Y(ente.a, "BugleNetwork");
                            enrr enrrVar = (enrr) ((enrr) e7).h("com/google/android/apps/messaging/shared/net/handler/DittoChannelRequestHandlerV2", "getGaiaParingInfoResponseForRequest", 893, "DittoChannelRequestHandlerV2.java");
                            esaa b7 = esaa.b(erviVar3.c);
                            if (b7 == null) {
                                b7 = esaa.UNRECOGNIZED;
                            }
                            enrrVar.w("Gaia pairing on. Received DittoRequest: %s %s", b7.a(), ((cgzv) chvqVar2.m.b()).z(erviVar3.b, fcekVar12));
                            if (!chvqVar2.u.D(fcekVar12) && !chvqVar2.A.b(fcekVar12)) {
                                chvqVar2.E(fcekVar11, bzgeVar5);
                                return elfo.e(true);
                            }
                            chvqVar2.A(erviVar3);
                            ensk h = chvq.c.h();
                            h.Y(ente.a, "BugleNetwork");
                            enrr enrrVar2 = (enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/net/handler/DittoChannelRequestHandlerV2", "getGaiaParingInfoResponseForRequest", 910, "DittoChannelRequestHandlerV2.java");
                            esaa b8 = esaa.b(erviVar3.c);
                            if (b8 == null) {
                                b8 = esaa.UNRECOGNIZED;
                            }
                            enrrVar2.w("Gaia pairing on. Handling DittoRequest: %s %s", b8.a(), ((cgzv) chvqVar2.m.b()).z(erviVar3.b, fcekVar12));
                            ervl ervlVar = (ervl) ervo.a.createBuilder();
                            ervm ervmVar = (ervm) ervn.a.createBuilder();
                            ervmVar.copyOnWrite();
                            ervn ervnVar = (ervn) ervmVar.instance;
                            str.getClass();
                            ervnVar.b = str;
                            ervn ervnVar2 = (ervn) ervmVar.build();
                            ervlVar.copyOnWrite();
                            ervo ervoVar = (ervo) ervlVar.instance;
                            ervnVar2.getClass();
                            ervoVar.c = ervnVar2;
                            ervoVar.b = 2;
                            ervo ervoVar2 = (ervo) ervlVar.build();
                            fcek fcekVar13 = ((cgcu) chvqVar2.U.b()).a() ? bzgeVar5.d : fcekVar11;
                            esaa s = chvq.s(erviVar3);
                            if (s == esaa.SETTINGS_UPDATE) {
                                return elfo.e(true);
                            }
                            fcek fcekVar14 = fcekVar13;
                            chwu a3 = chvqVar2.a(s, fcekVar11, erviVar3.b, fbztVar2, true, 1, bzgeVar5);
                            a3.h = ervoVar2.toByteString();
                            chwv a4 = a3.a();
                            ensk e8 = chvq.c.e();
                            e8.Y(ente.a, "BugleNetwork");
                            enrr enrrVar3 = (enrr) ((enrr) e8).h("com/google/android/apps/messaging/shared/net/handler/DittoChannelRequestHandlerV2", "sendDittoResponse", 1406, "DittoChannelRequestHandlerV2.java");
                            int i4 = ervoVar2.b;
                            char c = i4 != 0 ? i4 != 1 ? i4 != 2 ? (char) 0 : (char) 3 : (char) 2 : (char) 1;
                            String str3 = c != 1 ? c != 2 ? c != 3 ? "null" : "NEEDS_GAIA_PAIRING_MIGRATION" : "STATUS_PROTO" : "ERRORTYPE_NOT_SET";
                            if (c == 0) {
                                throw null;
                            }
                            enrrVar3.J("Preparing ditto error %s response for request of type %s %s", str3, s, ((cgzv) chvqVar2.m.b()).y(erviVar3.b, a4.c, fcekVar14));
                            return chvqVar2.n(a4, erviVar3.b, fcekVar14, bzgeVar5);
                        }
                    };
                    fcek fcekVar10 = fcekVar;
                    bzgeVar2 = bzgeVar;
                    fcekVar2 = fcekVar10;
                    i = d.i(erohVar, chvqVar.x);
                } else {
                    final fcek fcekVar11 = fcekVar;
                    bzgeVar2 = bzgeVar;
                    erviVar = erviVar2;
                    fcekVar2 = fcekVar11;
                    i = ((((cgcu) chvqVar.U.b()).a() && bzgeVar2.a.d.equals("Bugle")) ? ((bzgw) chvqVar.Y.b()).h().h(new emwl() { // from class: chva
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            if (!((Boolean) obj2).booleanValue()) {
                                return false;
                            }
                            fcek fcekVar12 = fcekVar11;
                            chvq chvqVar2 = chvq.this;
                            ensk e5 = chvq.c.e();
                            e5.Y(ente.a, "BugleNetwork");
                            ((enrr) ((enrr) e5).h("com/google/android/apps/messaging/shared/net/handler/DittoChannelRequestHandlerV2", "getIsPairingForceRevokedFuture", 861, "DittoChannelRequestHandlerV2.java")).q("Gaia pairing is available, force revoke QR.");
                            ((chep) chvqVar2.v.b()).a(chvqVar2.J.a(fcekVar12));
                            return true;
                        }
                    }, chvqVar.x) : elfo.e(Boolean.valueOf(z))).i(new eroh() { // from class: chuu
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj2) {
                            if (((Boolean) obj2).booleanValue()) {
                                return elfo.e(true);
                            }
                            bzge bzgeVar5 = bzgeVar2;
                            fcek fcekVar12 = fcekVar11;
                            fbzt fbztVar2 = fbztVar;
                            return chvq.this.j(erviVar, fbztVar2, fcekVar12, bzgeVar5);
                        }
                    }, chvqVar.x);
                }
                return ((Boolean) ((cfup) chvq.b.get()).e()).booleanValue() ? i.f(fedn.class, new eroh() { // from class: chuv
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        Status c = Status.c((fedn) obj2);
                        exqd exqdVar = (exqd) exqe.a.createBuilder();
                        int value = c.getCode().value();
                        exqdVar.copyOnWrite();
                        exqe exqeVar = (exqe) exqdVar.instance;
                        exqeVar.b |= 1;
                        exqeVar.c = value;
                        String b6 = emxe.b(c.getDescription());
                        exqdVar.copyOnWrite();
                        exqe exqeVar2 = (exqe) exqdVar.instance;
                        exqeVar2.b |= 4;
                        exqeVar2.d = b6;
                        exqe exqeVar3 = (exqe) exqdVar.build();
                        chvq chvqVar2 = chvq.this;
                        boolean a3 = ((cgcu) chvqVar2.U.b()).a();
                        fcek fcekVar12 = fcekVar2;
                        bzge bzgeVar5 = bzgeVar2;
                        fcek fcekVar13 = a3 ? bzgeVar5.d : fcekVar12;
                        ervi erviVar3 = erviVar;
                        esaa s = chvq.s(erviVar3);
                        if (s == esaa.SETTINGS_UPDATE) {
                            return elfo.e(true);
                        }
                        chwu a4 = chvqVar2.a(s, fcekVar12, erviVar3.b, fbztVar, true, 1, bzgeVar5);
                        a4.h = exqeVar3.toByteString();
                        chwv a5 = a4.a();
                        ensk e5 = chvq.c.e();
                        e5.Y(ente.a, "BugleNetwork");
                        ((enrr) ((enrr) e5).h("com/google/android/apps/messaging/shared/net/handler/DittoChannelRequestHandlerV2", "sendDittoResponse", 1449, "DittoChannelRequestHandlerV2.java")).J("Preparing error %d response for request of type %s %s", Integer.valueOf(exqeVar3.c), s, ((cgzv) chvqVar2.m.b()).y(erviVar3.b, a5.c, fcekVar13));
                        return chvqVar2.n(a5, erviVar3.b, fcekVar13, bzgeVar5);
                    }
                }, chvqVar.x) : i;
            } catch (eygu e5) {
                csjy.h("BugleNetwork", e5, "Exception parsing inbox message");
            }
        } else if (b2 == fbzs.WIREBALL) {
            try {
                fcmx fcmxVar = (fcmx) eyfy.parseFrom(fcmx.a, fbztVar.e);
                int i4 = fcmxVar.b;
                if (fcmv.a(i4) == fcmv.REVOKE_PAIRING) {
                    csjy.i("BugleNetwork", "Handling RevokePairing request");
                    final fcek fcekVar12 = (fcmxVar.b == 5 ? (fcnd) fcmxVar.c : fcnd.a).b;
                    if (fcekVar12 == null) {
                        fcekVar12 = fcek.a;
                    }
                    return elfo.g(new Callable() { // from class: cigs
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return Boolean.valueOf(cigu.this.a.u(fcekVar12));
                        }
                    }, this.d).h(new emwl() { // from class: cigt
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            return true;
                        }
                    }, erpp.a);
                }
                csjy.o("BugleNetwork", "Unexpected wireball message type %s", fcmv.a(i4));
            } catch (eygu e6) {
                csjy.h("BugleNetwork", e6, "Exception parsing wireball message");
            }
        } else {
            csjy.o("BugleNetwork", "Unexpected inbox message type %d", Integer.valueOf(b2.a()));
        }
        return elfo.e(true);
    }
}
