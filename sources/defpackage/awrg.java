package defpackage;

import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Instant;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awrg extends ceut {
    private static final enru h = enru.c("com/google/android/apps/messaging/shared/chatapi/incoming/SendChatMessageResponseHandler");
    public final bbfr a;
    public final ffbr b;
    public final ffbr c;
    public final errl d;
    public final errl e;
    public final cnkb f;
    public final ffbr g;
    private final cfyt i;
    private final ffbr j;
    private final Map k;
    private final avla l;
    private final avtu m;
    private final ffbr n;
    private final ffbr o;
    private final cqoh p;
    private final autk q;
    private final ffbr r;

    public awrg(bbfr bbfrVar, cfyt cfytVar, ffbr ffbrVar, ffbr ffbrVar2, cnkb cnkbVar, avla avlaVar, avtu avtuVar, ffbr ffbrVar3, ffbr ffbrVar4, Map map, errl errlVar, errl errlVar2, ffbr ffbrVar5, ffbr ffbrVar6, cqoh cqohVar, autk autkVar, ffbr ffbrVar7) {
        this.a = bbfrVar;
        this.i = cfytVar;
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.f = cnkbVar;
        this.l = avlaVar;
        this.m = avtuVar;
        this.n = ffbrVar3;
        this.j = ffbrVar4;
        this.k = map;
        this.d = errlVar;
        this.e = errlVar2;
        this.g = ffbrVar5;
        this.o = ffbrVar6;
        this.p = cqohVar;
        this.q = autkVar;
        this.r = ffbrVar7;
    }

    private final elfl m(awzd awzdVar, awzj awzjVar, eyja eyjaVar, eqxi eqxiVar) {
        awud awudVar = awzdVar.c;
        if (awudVar == null) {
            awudVar = awud.a;
        }
        awud awudVar2 = awudVar;
        eyja eyjaVar2 = awzdVar.e;
        if (eyjaVar2 == null) {
            eyjaVar2 = eyja.a;
        }
        Instant f = this.p.f();
        if (eykj.d(eyjaVar2).isBefore(eykj.d(eyjaVar))) {
            ensk h2 = h.h();
            h2.Y(ente.a, "BugleDataModel");
            ((enrr) ((enrr) h2).h("com/google/android/apps/messaging/shared/chatapi/incoming/SendChatMessageResponseHandler", "getValidTimestamp", 689, "SendChatMessageResponseHandler.java")).q("Overriding transport sent timestamp because is in the past");
            eyjaVar2 = eykj.b(f);
        } else if (eykj.d(eyjaVar2).isAfter(f)) {
            ensk h3 = h.h();
            h3.Y(ente.a, "BugleDataModel");
            ((enrr) ((enrr) h3).h("com/google/android/apps/messaging/shared/chatapi/incoming/SendChatMessageResponseHandler", "getValidTimestamp", 693, "SendChatMessageResponseHandler.java")).q("Overriding transport sent timestamp because is in the future");
            eyjaVar2 = eykj.b(f);
        }
        eyja eyjaVar3 = eyjaVar2;
        boolean z = awzdVar.f;
        eopq eopqVar = awzdVar.h;
        if (eopqVar == null) {
            eopqVar = eopq.a;
        }
        eopq eopqVar2 = eopqVar;
        awyp awypVar = awzdVar.g;
        if (awypVar == null) {
            awypVar = awyp.a;
        }
        return n(awzjVar, awudVar2, eyjaVar3, z, eopqVar2, awypVar, eqxiVar);
    }

    private final elfl n(final awzj awzjVar, final awud awudVar, final eyja eyjaVar, final boolean z, final eopq eopqVar, final awyp awypVar, final eqxi eqxiVar) {
        return ((clfy) this.o.b()).a(clfx.SENT).i(new eroh() { // from class: awrb
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final awzj awzjVar2 = awzjVar;
                final bdhg a = bdhg.a(awzjVar2.e);
                final awrg awrgVar = awrg.this;
                avle avleVar = (avle) awrgVar.g.b();
                axad axadVar = awzjVar2.g;
                if (axadVar == null) {
                    axadVar = axad.a;
                }
                final eopq eopqVar2 = eopqVar;
                avleVar.a(axadVar, a);
                eqyl b = eqyl.b(eopqVar2.aa);
                if (b == null) {
                    b = eqyl.UNKNOWN_RCS_TYPE;
                }
                final eqxi eqxiVar2 = eqxiVar;
                final awyp awypVar2 = awypVar;
                final boolean z2 = z;
                final eyja eyjaVar2 = eyjaVar;
                return awrgVar.l(awudVar, awzjVar2, b).h(new emwl() { // from class: awqw
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        return awrg.this.a.f(a, (awud) obj2, eykj.d(eyjaVar2), z2, eopqVar2, awypVar2, eqxiVar2);
                    }
                }, awrgVar.d).i(new eroh() { // from class: awqx
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        return ((Action) obj2).e();
                    }
                }, awrgVar.d).h(new emwl() { // from class: awqy
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        axad axadVar2 = awzjVar2.g;
                        if (axadVar2 == null) {
                            axadVar2 = axad.a;
                        }
                        ((avle) awrg.this.g.b()).b(axadVar2, a);
                        return avui.SUCCESS;
                    }
                }, awrgVar.d);
            }
        }, this.d);
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("SendChatMessageResponseHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        return awzd.a.getParserForType();
    }

    @Override // defpackage.ceut
    protected final /* bridge */ /* synthetic */ elfl j(ceuw ceuwVar, eyhs eyhsVar) {
        return k((awzd) eyhsVar).h(new emwl() { // from class: awqz
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                int ordinal = ((avui) obj).ordinal();
                return ordinal != 0 ? ordinal != 1 ? ceyt.k() : ceyt.m() : ceyt.i();
            }
        }, erpp.a);
    }

    final elfl k(final awzd awzdVar) {
        Throwable th;
        int i;
        int i2;
        final eqxi eqxiVar;
        int i3;
        final bdhg bdhgVar;
        final int i4;
        try {
            final awzj awzjVar = (awzj) eyfy.parseFrom(awzj.a, awzdVar.d, eyfc.a());
            awud awudVar = awzdVar.c;
            if (awudVar == null) {
                awudVar = awud.a;
            }
            enru enruVar = h;
            ensk e = enruVar.e();
            e.Y(ente.a, "BugleDataModel");
            enrr enrrVar = (enrr) e;
            enrrVar.Y(csux.f, bdhg.a(awzjVar.e));
            enrr enrrVar2 = (enrr) enrrVar.h("com/google/android/apps/messaging/shared/chatapi/incoming/SendChatMessageResponseHandler", "processSendChatMessageResponse", 183, "SendChatMessageResponseHandler.java");
            awuc b = awuc.b(awudVar.c);
            if (b == null) {
                b = awuc.UNKNOWN_STATUS;
            }
            awua b2 = awua.b(awudVar.d);
            if (b2 == null) {
                b2 = awua.UNKNOWN_CAUSE;
            }
            enrrVar2.D("Received response for sent message [chatApiResult.status=%s, chatApiResult.cause=%s]", b, b2);
            awuc b3 = awuc.b(awudVar.c);
            if (b3 == null) {
                b3 = awuc.UNKNOWN_STATUS;
            }
            if (b3 == awuc.FAILED_PERMANENTLY || b3 == awuc.FAILED_TRANSIENTLY) {
                eqxh eqxhVar = (eqxh) eqxi.a.createBuilder();
                th = null;
                eqxj eqxjVar = (eqxj) eqxk.a.createBuilder();
                eqxjVar.copyOnWrite();
                i = 8;
                eqxk eqxkVar = (eqxk) eqxjVar.instance;
                eqxkVar.e = 2;
                i2 = 4;
                eqxkVar.b |= 4;
                eqwy eqwyVar = (eqwy) this.l.fP(b3);
                eqxjVar.copyOnWrite();
                eqxk eqxkVar2 = (eqxk) eqxjVar.instance;
                eqxkVar2.g = eqwyVar.f;
                eqxkVar2.b |= 16;
                avtu avtuVar = this.m;
                awua b4 = awua.b(awudVar.d);
                if (b4 == null) {
                    b4 = awua.UNKNOWN_CAUSE;
                }
                eqww eqwwVar = (eqww) avtuVar.fP(b4);
                eqxjVar.copyOnWrite();
                eqxk eqxkVar3 = (eqxk) eqxjVar.instance;
                eqxkVar3.f = eqwwVar.C;
                eqxkVar3.b |= 8;
                eqxhVar.copyOnWrite();
                eqxi eqxiVar2 = (eqxi) eqxhVar.instance;
                eqxk eqxkVar4 = (eqxk) eqxjVar.build();
                eqxkVar4.getClass();
                eqxiVar2.c = eqxkVar4;
                eqxiVar2.b |= 1;
                eqxiVar = (eqxi) eqxhVar.build();
            } else {
                eqxiVar = null;
                i = 8;
                th = null;
                i2 = 4;
            }
            switch (awzjVar.c) {
                case 0:
                    i3 = 11;
                    break;
                case 1:
                case 8:
                case 9:
                case 11:
                case 12:
                default:
                    i3 = 0;
                    break;
                case 2:
                    i3 = 1;
                    break;
                case 3:
                    i3 = 2;
                    break;
                case 4:
                    i3 = 3;
                    break;
                case 5:
                    i3 = i2;
                    break;
                case 6:
                    i3 = 5;
                    break;
                case 7:
                    i3 = 6;
                    break;
                case 10:
                    i3 = 7;
                    break;
                case 13:
                    i3 = i;
                    break;
                case 14:
                    i3 = 9;
                    break;
                case 15:
                    i3 = 10;
                    break;
            }
            if (i3 == 0) {
                throw th;
            }
            switch (i3 - 1) {
                case 0:
                    eqxi eqxiVar3 = eqxiVar;
                    if (this.q.a()) {
                        eyja eyjaVar = (awzjVar.c == 2 ? (awyx) awzjVar.d : awyx.a).c;
                        if (eyjaVar == null) {
                            eyjaVar = eyja.a;
                        }
                        return m(awzdVar, awzjVar, eyjaVar, eqxiVar3);
                    }
                    awud awudVar2 = awzdVar.c;
                    if (awudVar2 == null) {
                        awudVar2 = awud.a;
                    }
                    awud awudVar3 = awudVar2;
                    eyja eyjaVar2 = (awzjVar.c == 2 ? (awyx) awzjVar.d : awyx.a).c;
                    if (eyjaVar2 == null) {
                        eyjaVar2 = eyja.a;
                    }
                    boolean z = awzdVar.f;
                    eopq eopqVar = awzdVar.h;
                    if (eopqVar == null) {
                        eopqVar = eopq.a;
                    }
                    awyp awypVar = awzdVar.g;
                    if (awypVar == null) {
                        awypVar = awyp.a;
                    }
                    return n(awzjVar, awudVar3, eyjaVar2, z, eopqVar, awypVar, eqxiVar3);
                case 1:
                    eqxi eqxiVar4 = eqxiVar;
                    if (this.q.a()) {
                        eyja eyjaVar3 = (awzjVar.c == 3 ? (awzh) awzjVar.d : awzh.a).c;
                        if (eyjaVar3 == null) {
                            eyjaVar3 = eyja.a;
                        }
                        return m(awzdVar, awzjVar, eyjaVar3, eqxiVar4);
                    }
                    awud awudVar4 = awzdVar.c;
                    if (awudVar4 == null) {
                        awudVar4 = awud.a;
                    }
                    awud awudVar5 = awudVar4;
                    eyja eyjaVar4 = (awzjVar.c == 3 ? (awzh) awzjVar.d : awzh.a).c;
                    if (eyjaVar4 == null) {
                        eyjaVar4 = eyja.a;
                    }
                    boolean z2 = awzdVar.f;
                    eopq eopqVar2 = awzdVar.h;
                    if (eopqVar2 == null) {
                        eopqVar2 = eopq.a;
                    }
                    awyp awypVar2 = awzdVar.g;
                    if (awypVar2 == null) {
                        awypVar2 = awyp.a;
                    }
                    return n(awzjVar, awudVar5, eyjaVar4, z2, eopqVar2, awypVar2, eqxiVar4);
                case 2:
                    eqxi eqxiVar5 = eqxiVar;
                    if (this.q.a()) {
                        eyja eyjaVar5 = (awzjVar.c == i2 ? (awzf) awzjVar.d : awzf.a).c;
                        if (eyjaVar5 == null) {
                            eyjaVar5 = eyja.a;
                        }
                        return m(awzdVar, awzjVar, eyjaVar5, eqxiVar5);
                    }
                    awud awudVar6 = awzdVar.c;
                    if (awudVar6 == null) {
                        awudVar6 = awud.a;
                    }
                    awud awudVar7 = awudVar6;
                    eyja eyjaVar6 = (awzjVar.c == 4 ? (awzf) awzjVar.d : awzf.a).c;
                    if (eyjaVar6 == null) {
                        eyjaVar6 = eyja.a;
                    }
                    boolean z3 = awzdVar.f;
                    eopq eopqVar3 = awzdVar.h;
                    if (eopqVar3 == null) {
                        eopqVar3 = eopq.a;
                    }
                    awyp awypVar3 = awzdVar.g;
                    if (awypVar3 == null) {
                        awypVar3 = awyp.a;
                    }
                    return n(awzjVar, awudVar7, eyjaVar6, z3, eopqVar3, awypVar3, eqxiVar5);
                case 3:
                    avle avleVar = (avle) this.g.b();
                    axad axadVar = awzjVar.g;
                    if (axadVar == null) {
                        axadVar = axad.a;
                    }
                    avleVar.a(axadVar, bdhg.a(awzjVar.e));
                    bdhg a = bdhg.a((awzjVar.c == 5 ? (awzo) awzjVar.d : awzo.a).c);
                    if (a.f().isEmpty()) {
                        ensk j = enruVar.j();
                        j.Y(ente.a, "BugleDataModel");
                        enrr enrrVar3 = (enrr) j;
                        enrrVar3.Y(csux.f, bdhg.a(awzjVar.e));
                        ((enrr) enrrVar3.h("com/google/android/apps/messaging/shared/chatapi/incoming/SendChatMessageResponseHandler", "doProcessMessageReceipt", 444, "SendChatMessageResponseHandler.java")).q("Invalid empty RCS Message ID in receipt sent confirmation");
                        return elfo.e(avui.FAIL_NO_RETRY);
                    }
                    awzn b5 = awzn.b((awzjVar.c == 5 ? (awzo) awzjVar.d : awzo.a).d);
                    if (b5 == null) {
                        b5 = awzn.UNKNOWN_RECEIPT_TYPE;
                    }
                    int ordinal = b5.ordinal();
                    if (ordinal == 1) {
                        bdhgVar = a;
                        i4 = 1;
                    } else if (ordinal == 2) {
                        bdhgVar = a;
                        i4 = 10;
                    } else {
                        if (ordinal != 3 || !((augx) this.r.b()).a()) {
                            ensk j2 = enruVar.j();
                            j2.Y(ente.a, "BugleDataModel");
                            enrr enrrVar4 = (enrr) j2;
                            enrrVar4.Y(csux.f, a);
                            ((enrr) enrrVar4.h("com/google/android/apps/messaging/shared/chatapi/incoming/SendChatMessageResponseHandler", "doProcessMessageReceipt", 466, "SendChatMessageResponseHandler.java")).q("Invalid SendMessageOpaqueData.receipt_type.");
                            return elfo.e(avui.FAIL_NO_RETRY);
                        }
                        bdhgVar = a;
                        i4 = 3;
                    }
                    return elfo.h(new erog() { // from class: awrd
                        @Override // defpackage.erog
                        public final ListenableFuture a() {
                            awzd awzdVar2 = awzdVar;
                            awud awudVar8 = awzdVar2.c;
                            if (awudVar8 == null) {
                                awudVar8 = awud.a;
                            }
                            eopq eopqVar4 = awzdVar2.h;
                            if (eopqVar4 == null) {
                                eopqVar4 = eopq.a;
                            }
                            final eopq eopqVar5 = eopqVar4;
                            final bdhg bdhgVar2 = bdhgVar;
                            final awrg awrgVar = awrg.this;
                            final MessageCoreData x = ((bdmq) awrgVar.b.b()).x(bdhgVar2);
                            awuc awucVar = awuc.OK;
                            awuc b6 = awuc.b(awudVar8.c);
                            if (b6 == null) {
                                b6 = awuc.UNKNOWN_STATUS;
                            }
                            final int i5 = i4;
                            if (awucVar.equals(b6)) {
                                altk altkVar = (altk) awrgVar.c.b();
                                eqyl b7 = eqyl.b(eopqVar5.aa);
                                if (b7 == null) {
                                    b7 = eqyl.UNKNOWN_RCS_TYPE;
                                }
                                altkVar.C(bdhgVar2, x, i5, b7);
                                return elfo.e(avui.SUCCESS);
                            }
                            eqyl b8 = eqyl.b(eopqVar5.aa);
                            if (b8 == null) {
                                b8 = eqyl.UNKNOWN_RCS_TYPE;
                            }
                            awzj awzjVar2 = awzjVar;
                            final eqxi eqxiVar6 = eqxiVar;
                            return awrgVar.l(awudVar8, awzjVar2, b8).i(new eroh() { // from class: awrc
                                @Override // defpackage.eroh
                                public final ListenableFuture a(Object obj) {
                                    awuc awucVar2 = awuc.FAILED_PERMANENTLY;
                                    awuc b9 = awuc.b(((awud) obj).c);
                                    if (b9 == null) {
                                        b9 = awuc.UNKNOWN_STATUS;
                                    }
                                    awrg awrgVar2 = awrg.this;
                                    eqxi eqxiVar7 = eqxiVar6;
                                    int i6 = i5;
                                    bdhg bdhgVar3 = bdhgVar2;
                                    awrgVar2.f.a(bdhgVar3, i6, awucVar2.equals(b9));
                                    altk altkVar2 = (altk) awrgVar2.c.b();
                                    if (eqxiVar7 == null) {
                                        eqxiVar7 = ckdp.a();
                                    }
                                    eqxi eqxiVar8 = eqxiVar7;
                                    eqyl b10 = eqyl.b(eopqVar5.aa);
                                    if (b10 == null) {
                                        b10 = eqyl.UNKNOWN_RCS_TYPE;
                                    }
                                    altkVar2.D(bdhgVar3, x, i6, eqxiVar8, b10);
                                    return elfo.e(avui.SUCCESS);
                                }
                            }, awrgVar.e);
                        }
                    }, this.e).h(new emwl() { // from class: awre
                        @Override // defpackage.emwl
                        public final Object apply(Object obj) {
                            avle avleVar2 = (avle) awrg.this.g.b();
                            awzj awzjVar2 = awzjVar;
                            axad axadVar2 = awzjVar2.g;
                            if (axadVar2 == null) {
                                axadVar2 = axad.a;
                            }
                            avleVar2.b(axadVar2, bdhg.a(awzjVar2.e));
                            return avui.SUCCESS;
                        }
                    }, this.d);
                case 4:
                    bdhg a2 = bdhg.a(awzjVar.e);
                    awuc awucVar = awuc.OK;
                    awud awudVar8 = awzdVar.c;
                    if (awudVar8 == null) {
                        awudVar8 = awud.a;
                    }
                    awuc b6 = awuc.b(awudVar8.c);
                    if (b6 == null) {
                        b6 = awuc.UNKNOWN_STATUS;
                    }
                    if (awucVar.equals(b6)) {
                        ensk h2 = enruVar.h();
                        h2.Y(ente.a, "BugleDataModel");
                        enrr enrrVar5 = (enrr) h2;
                        enrrVar5.Y(csux.f, a2);
                        ((enrr) enrrVar5.h("com/google/android/apps/messaging/shared/chatapi/incoming/SendChatMessageResponseHandler", "doProcessTypingIndicator", 499, "SendChatMessageResponseHandler.java")).q("Typing indicator successfully sent.");
                    } else {
                        ensk j3 = enruVar.j();
                        j3.Y(ente.a, "BugleDataModel");
                        enrr enrrVar6 = (enrr) j3;
                        enrrVar6.Y(csux.f, a2);
                        ((enrr) enrrVar6.h("com/google/android/apps/messaging/shared/chatapi/incoming/SendChatMessageResponseHandler", "doProcessTypingIndicator", 504, "SendChatMessageResponseHandler.java")).q("Typing indicator failed to send.");
                    }
                    avle avleVar2 = (avle) this.g.b();
                    axad axadVar2 = awzjVar.g;
                    if (axadVar2 == null) {
                        axadVar2 = axad.a;
                    }
                    avleVar2.a(axadVar2, bdhg.a(awzjVar.e));
                    avle avleVar3 = (avle) this.g.b();
                    axad axadVar3 = awzjVar.g;
                    if (axadVar3 == null) {
                        axadVar3 = axad.a;
                    }
                    avleVar3.b(axadVar3, bdhg.a(awzjVar.e));
                    return elfo.e(avui.SUCCESS);
                case 5:
                    if (this.q.a()) {
                        eyja eyjaVar7 = (awzjVar.c == 7 ? (awzz) awzjVar.d : awzz.a).c;
                        if (eyjaVar7 == null) {
                            eyjaVar7 = eyja.a;
                        }
                        return m(awzdVar, awzjVar, eyjaVar7, eqxiVar);
                    }
                    awud awudVar9 = awzdVar.c;
                    if (awudVar9 == null) {
                        awudVar9 = awud.a;
                    }
                    awud awudVar10 = awudVar9;
                    eyja eyjaVar8 = (awzjVar.c == 7 ? (awzz) awzjVar.d : awzz.a).c;
                    if (eyjaVar8 == null) {
                        eyjaVar8 = eyja.a;
                    }
                    eqxi eqxiVar6 = eqxiVar;
                    boolean z4 = awzdVar.f;
                    eopq eopqVar4 = awzdVar.h;
                    if (eopqVar4 == null) {
                        eopqVar4 = eopq.a;
                    }
                    awyp awypVar4 = awzdVar.g;
                    if (awypVar4 == null) {
                        awypVar4 = awyp.a;
                    }
                    return n(awzjVar, awudVar10, eyjaVar8, z4, eopqVar4, awypVar4, eqxiVar6);
                case 6:
                    bdhg a3 = bdhg.a(awzjVar.e);
                    awuc awucVar2 = awuc.OK;
                    awud awudVar11 = awzdVar.c;
                    if (awudVar11 == null) {
                        awudVar11 = awud.a;
                    }
                    awuc b7 = awuc.b(awudVar11.c);
                    if (b7 == null) {
                        b7 = awuc.UNKNOWN_STATUS;
                    }
                    if (awucVar2.equals(b7)) {
                        ensk h3 = enruVar.h();
                        h3.Y(ente.a, "BugleDataModel");
                        enrr enrrVar7 = (enrr) h3;
                        enrrVar7.Y(csux.f, a3);
                        ((enrr) enrrVar7.h("com/google/android/apps/messaging/shared/chatapi/incoming/SendChatMessageResponseHandler", "doProcessRbmSpamReport", 527, "SendChatMessageResponseHandler.java")).q("RBM spam report successfully sent.");
                        ((curu) this.n.b()).d(a3);
                    } else {
                        ensk j4 = enruVar.j();
                        j4.Y(ente.a, "BugleDataModel");
                        enrr enrrVar8 = (enrr) j4;
                        enrrVar8.Y(csux.f, a3);
                        ((enrr) enrrVar8.h("com/google/android/apps/messaging/shared/chatapi/incoming/SendChatMessageResponseHandler", "doProcessRbmSpamReport", 533, "SendChatMessageResponseHandler.java")).q("RBM spam report failed to send.");
                        ((curu) this.n.b()).c(a3, eqxiVar);
                    }
                    return elfo.e(avui.SUCCESS);
                case 7:
                    bdhg a4 = bdhg.a(awzjVar.e);
                    awuc awucVar3 = awuc.OK;
                    awud awudVar12 = awzdVar.c;
                    if (awudVar12 == null) {
                        awudVar12 = awud.a;
                    }
                    awuc b8 = awuc.b(awudVar12.c);
                    if (b8 == null) {
                        b8 = awuc.UNKNOWN_STATUS;
                    }
                    if (awucVar3.equals(b8)) {
                        ensk h4 = enruVar.h();
                        h4.Y(ente.a, "BugleDataModel");
                        enrr enrrVar9 = (enrr) h4;
                        enrrVar9.Y(csux.f, a4);
                        ((enrr) enrrVar9.h("com/google/android/apps/messaging/shared/chatapi/incoming/SendChatMessageResponseHandler", "doProcessProtoMessage", 564, "SendChatMessageResponseHandler.java")).q("Proto message successfully sent.");
                    } else {
                        ensk j5 = enruVar.j();
                        j5.Y(ente.a, "BugleDataModel");
                        enrr enrrVar10 = (enrr) j5;
                        enrrVar10.Y(csux.f, a4);
                        ((enrr) enrrVar10.h("com/google/android/apps/messaging/shared/chatapi/incoming/SendChatMessageResponseHandler", "doProcessProtoMessage", 569, "SendChatMessageResponseHandler.java")).q("Proto message failed to send.");
                    }
                    return elfo.e(avui.SUCCESS);
                case 8:
                    bdhg a5 = bdhg.a(awzjVar.e);
                    awud awudVar13 = awzdVar.c;
                    if (awudVar13 == null) {
                        awudVar13 = awud.a;
                    }
                    awuc b9 = awuc.b(awudVar13.c);
                    if (b9 == null) {
                        b9 = awuc.UNKNOWN_STATUS;
                    }
                    if (b9.equals(awuc.OK)) {
                        ensk h5 = enruVar.h();
                        h5.Y(ente.a, "BugleDataModel");
                        enrr enrrVar11 = (enrr) h5;
                        enrrVar11.Y(csux.f, a5);
                        ((enrr) enrrVar11.h("com/google/android/apps/messaging/shared/chatapi/incoming/SendChatMessageResponseHandler", "doProcessMlsMessage", 583, "SendChatMessageResponseHandler.java")).q("Zinnia message successfully sent.");
                    } else {
                        ensk j6 = enruVar.j();
                        j6.Y(ente.a, "BugleDataModel");
                        enrr enrrVar12 = (enrr) j6;
                        enrrVar12.Y(csux.f, a5);
                        ((enrr) enrrVar12.h("com/google/android/apps/messaging/shared/chatapi/incoming/SendChatMessageResponseHandler", "doProcessMlsMessage", 588, "SendChatMessageResponseHandler.java")).q("Zinnia message failed to send.");
                    }
                    return elfo.e(avui.SUCCESS);
                case 9:
                    bdhg a6 = bdhg.a(awzjVar.e);
                    awud awudVar14 = awzdVar.c;
                    if (awudVar14 == null) {
                        awudVar14 = awud.a;
                    }
                    awuc b10 = awuc.b(awudVar14.c);
                    if (b10 == null) {
                        b10 = awuc.UNKNOWN_STATUS;
                    }
                    if (b10.equals(awuc.OK)) {
                        ensk h6 = enruVar.h();
                        h6.Y(ente.a, "BugleDataModel");
                        enrr enrrVar13 = (enrr) h6;
                        enrrVar13.Y(csux.f, a6);
                        ((enrr) enrrVar13.h("com/google/android/apps/messaging/shared/chatapi/incoming/SendChatMessageResponseHandler", "doProcessRbmDeepLinkContext", 546, "SendChatMessageResponseHandler.java")).q("RBM deeplink context successfully sent.");
                        ((curu) this.n.b()).d(a6);
                    } else {
                        ensk j7 = enruVar.j();
                        j7.Y(ente.a, "BugleDataModel");
                        enrr enrrVar14 = (enrr) j7;
                        enrrVar14.Y(csux.f, a6);
                        ((enrr) enrrVar14.h("com/google/android/apps/messaging/shared/chatapi/incoming/SendChatMessageResponseHandler", "doProcessRbmDeepLinkContext", 552, "SendChatMessageResponseHandler.java")).q("RBM deeplink context failed to send.");
                    }
                    return elfo.e(avui.SUCCESS);
                default:
                    ensk j8 = enruVar.j();
                    j8.Y(ente.a, "BugleDataModel");
                    enrr enrrVar15 = (enrr) j8;
                    enrrVar15.Y(csux.f, bdhg.a(awzjVar.e));
                    ((enrr) enrrVar15.h("com/google/android/apps/messaging/shared/chatapi/incoming/SendChatMessageResponseHandler", "processSendChatMessageResponse", 274, "SendChatMessageResponseHandler.java")).q("No case handled in SendMessageOpaqueData.getDataCase()");
                    return elfo.e(avui.FAIL_NO_RETRY);
            }
        } catch (eygu e2) {
            ensk j9 = h.j();
            j9.Y(ente.a, "BugleDataModel");
            ((enrr) ((enrr) ((enrr) j9).g(e2)).h("com/google/android/apps/messaging/shared/chatapi/incoming/SendChatMessageResponseHandler", "processSendChatMessageResponse", (char) 172, "SendChatMessageResponseHandler.java")).q("Failed to parse SendChatMessageResponse.opaque_data.");
            return this.i.b(e2).h(new emwl() { // from class: awra
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    return avui.FAIL_NO_RETRY;
                }
            }, erpp.a);
        }
    }

    public final elfl l(final awud awudVar, awzj awzjVar, eqyl eqylVar) {
        awuc b = awuc.b(awudVar.c);
        if (b == null) {
            b = awuc.UNKNOWN_STATUS;
        }
        if (b.equals(awuc.OK)) {
            return elfo.e(awudVar);
        }
        awyd b2 = awyd.b(awudVar.e);
        if (b2 == null) {
            b2 = awyd.RECOVERY_STRATEGY_UNSPECIFIED;
        }
        ensk e = h.e();
        e.Y(ente.a, "BugleDataModel");
        ((enrr) ((enrr) e).h("com/google/android/apps/messaging/shared/chatapi/incoming/SendChatMessageResponseHandler", "recoverFailedChatApiResult", 329, "SendChatMessageResponseHandler.java")).t("Recovering for RecoveryStrategy: %s", b2);
        emxf.p(this.k.containsKey(b2), "No converter provided for recovery strategy %s", b2);
        avub avubVar = (avub) this.k.get(b2);
        avubVar.getClass();
        axbq a = avubVar.a(awzjVar);
        final axcc axccVar = (axcc) this.j.b();
        eqylVar.getClass();
        return (eqylVar.ordinal() != 3 ? new axca() { // from class: axcb
            @Override // defpackage.axca
            public final axbo a(awyd awydVar) {
                awydVar.getClass();
                return axcc.this.b;
            }
        } : axccVar.a).a(b2).a(a).h(new emwl() { // from class: awrf
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                awud awudVar2 = awud.this;
                axbn axbnVar = (axbn) obj;
                if (axbnVar != axbn.d && axbnVar != axbn.b) {
                    return awudVar2;
                }
                awty awtyVar = (awty) awudVar2.toBuilder();
                awuc awucVar = awuc.FAILED_PERMANENTLY;
                awtyVar.copyOnWrite();
                awud awudVar3 = (awud) awtyVar.instance;
                awudVar3.c = awucVar.f;
                awudVar3.b |= 1;
                return (awud) awtyVar.build();
            }
        }, this.d);
    }
}
