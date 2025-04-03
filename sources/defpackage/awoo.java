package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import java.util.EnumSet;
import java.util.concurrent.Callable;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awoo implements avkh {
    public final ffbr b;
    public final awnv c;
    public final awnw d;
    public final awgx e;
    public final awgq f;
    public final awgv g;
    public final awgt h;
    public final clie i;
    public final cetc j;
    public final ffbr k;
    public final ffbr l;
    private final ffbr n;
    private final ffbr o;
    private final akvz p;
    private final ffbr q;
    private final errl r;
    private final errl s;
    private final avuh t;
    private final ffbr u;
    private final ffbr v;
    private final ffbr w;
    private final ffbr x;
    private final atmb y;
    private static final cskc m = cskc.g("BugleDataModel", "IncomingChatApiImpl");
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/chatapi/incoming/IncomingChatApiImpl");

    public awoo(ffbr ffbrVar, ffbr ffbrVar2, awnv awnvVar, awnw awnwVar, ffbr ffbrVar3, awgx awgxVar, awgq awgqVar, awgv awgvVar, awgt awgtVar, akvz akvzVar, ffbr ffbrVar4, errl errlVar, errl errlVar2, clie clieVar, avuh avuhVar, cetc cetcVar, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8, ffbr ffbrVar9, ffbr ffbrVar10, atmb atmbVar) {
        this.n = ffbrVar;
        this.b = ffbrVar2;
        this.c = awnvVar;
        this.d = awnwVar;
        this.o = ffbrVar3;
        this.e = awgxVar;
        this.f = awgqVar;
        this.g = awgvVar;
        this.h = awgtVar;
        this.p = akvzVar;
        this.q = ffbrVar4;
        this.r = errlVar;
        this.s = errlVar2;
        this.i = clieVar;
        this.t = avuhVar;
        this.j = cetcVar;
        this.k = ffbrVar5;
        this.u = ffbrVar6;
        this.v = ffbrVar7;
        this.w = ffbrVar8;
        this.x = ffbrVar9;
        this.l = ffbrVar10;
        this.y = atmbVar;
    }

    public static elfl l(cevg cevgVar) {
        return cevgVar.a().h(new emwl() { // from class: awny
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ceyt ceytVar = (ceyt) obj;
                if (ceytVar.e() || ceytVar.f()) {
                    awty awtyVar = (awty) awud.a.createBuilder();
                    awuc awucVar = awuc.OK;
                    awtyVar.copyOnWrite();
                    awud awudVar = (awud) awtyVar.instance;
                    awudVar.c = awucVar.f;
                    awudVar.b |= 1;
                    return (awud) awtyVar.build();
                }
                awty awtyVar2 = (awty) awud.a.createBuilder();
                awuc awucVar2 = awuc.FAILED_PERMANENTLY;
                awtyVar2.copyOnWrite();
                awud awudVar2 = (awud) awtyVar2.instance;
                awudVar2.c = awucVar2.f;
                awudVar2.b |= 1;
                awua awuaVar = awua.UNKNOWN_CAUSE;
                awtyVar2.copyOnWrite();
                awud awudVar3 = (awud) awtyVar2.instance;
                awudVar3.d = awuaVar.v;
                awudVar3.b |= 2;
                return (awud) awtyVar2.build();
            }
        }, erpp.a);
    }

    private static Optional m(eyhs eyhsVar, eyee eyeeVar) {
        try {
            return Optional.of(eyhsVar.getParserForType().i(eyeeVar, eyfc.a()));
        } catch (eygu unused) {
            return Optional.empty();
        }
    }

    private static boolean n(awui awuiVar) {
        awuh awuhVar = awuh.GROUP;
        awuh b = awuh.b(awuiVar.c);
        if (b == null) {
            b = awuh.UNKNOWN_TYPE;
        }
        return !awuhVar.equals(b) || awuiVar.d.startsWith("sip:");
    }

    @Override // defpackage.avkh
    public final elfl a(final awtx awtxVar) {
        final Optional m2 = m(awtt.a, awtxVar.d);
        if (!m2.isEmpty()) {
            return elfo.h(new erog() { // from class: awof
                @Override // defpackage.erog
                public final ListenableFuture a() {
                    String str = ((awtt) m2.get()).c;
                    awoo awooVar = awoo.this;
                    return awoo.l(((cevh) awooVar.f.a.b()).a(ceyr.h("on_add_user_to_group_chat_complete", awtxVar, awooVar.k(str))));
                }
            }, this.r);
        }
        m.r("Invalid opaque data in AddUserToGroupChatResponse");
        ((cknc) this.v.b()).d();
        awty awtyVar = (awty) awud.a.createBuilder();
        awuc awucVar = awuc.FAILED_PERMANENTLY;
        awtyVar.copyOnWrite();
        awud awudVar = (awud) awtyVar.instance;
        awudVar.c = awucVar.f;
        awudVar.b |= 1;
        awua awuaVar = awua.INVALID_OPAQUE_DATA;
        awtyVar.copyOnWrite();
        awud awudVar2 = (awud) awtyVar.instance;
        awudVar2.d = awuaVar.v;
        awudVar2.b |= 2;
        return elfo.e((awud) awtyVar.build());
    }

    @Override // defpackage.avkh
    public final elfl b(final awuz awuzVar) {
        final Optional m2 = m(awut.a, awuzVar.e);
        if (!m2.isEmpty()) {
            return elfo.h(new erog() { // from class: awoa
                @Override // defpackage.erog
                public final ListenableFuture a() {
                    String str = ((awut) m2.get()).c;
                    awoo awooVar = awoo.this;
                    return awoo.l(((cevh) awooVar.h.a.b()).a(ceyr.h("on_create_group_chat_complete", awuzVar, awooVar.k(str))));
                }
            }, this.r);
        }
        m.r("Invalid opaque data in CreateGroupChatResponse");
        ((cknc) this.v.b()).h();
        awty awtyVar = (awty) awud.a.createBuilder();
        awuc awucVar = awuc.FAILED_PERMANENTLY;
        awtyVar.copyOnWrite();
        awud awudVar = (awud) awtyVar.instance;
        awudVar.c = awucVar.f;
        awudVar.b |= 1;
        awua awuaVar = awua.INVALID_OPAQUE_DATA;
        awtyVar.copyOnWrite();
        awud awudVar2 = (awud) awtyVar.instance;
        awudVar2.d = awuaVar.v;
        awudVar2.b |= 2;
        return elfo.e((awud) awtyVar.build());
    }

    @Override // defpackage.avkh
    public final elfl c(final awvt awvtVar) {
        elfl h;
        ekzz f = eleg.f("IncomingChatApiImpl#onGroupEventNotification");
        try {
            awui awuiVar = awvtVar.o;
            if (awuiVar == null) {
                awuiVar = awui.a;
            }
            if (n(awuiVar)) {
                h = elfo.h(new erog() { // from class: awoe
                    @Override // defpackage.erog
                    public final ListenableFuture a() {
                        awxp awxpVar = (awxp) awxr.a.createBuilder();
                        awxpVar.copyOnWrite();
                        awxr awxrVar = (awxr) awxpVar.instance;
                        awvt awvtVar2 = awvtVar;
                        awvtVar2.getClass();
                        awxrVar.c = awvtVar2;
                        awxrVar.b = 1;
                        awxr awxrVar2 = (awxr) awxpVar.build();
                        awoo awooVar = awoo.this;
                        return awoo.l(awooVar.c.a(awxrVar2, awooVar.k(awvtVar2.e)));
                    }
                }, this.r);
            } else {
                csjb e = m.e();
                e.I("Invalid group destination");
                e.g(awvtVar.e);
                e.r();
                awty awtyVar = (awty) awud.a.createBuilder();
                awuc awucVar = awuc.FAILED_PERMANENTLY;
                awtyVar.copyOnWrite();
                awud awudVar = (awud) awtyVar.instance;
                awudVar.c = awucVar.f;
                awudVar.b |= 1;
                awua awuaVar = awua.INVALID_REPLY_TO_CHAT_ENDPOINT;
                awtyVar.copyOnWrite();
                awud awudVar2 = (awud) awtyVar.instance;
                awudVar2.d = awuaVar.v;
                awudVar2.b |= 2;
                h = elfo.e((awud) awtyVar.build());
            }
            f.b(h);
            f.close();
            return h;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.avkh
    public final elfl d(final awvy awvyVar) {
        elfl h;
        ekzz f = eleg.f("IncomingChatApiImpl#onGroupFullStateNotification");
        try {
            awui awuiVar = awvyVar.f;
            if (awuiVar == null) {
                awuiVar = awui.a;
            }
            if (n(awuiVar)) {
                h = elfo.h(new erog() { // from class: awod
                    @Override // defpackage.erog
                    public final ListenableFuture a() {
                        awxp awxpVar = (awxp) awxr.a.createBuilder();
                        awxpVar.copyOnWrite();
                        awxr awxrVar = (awxr) awxpVar.instance;
                        awvy awvyVar2 = awvyVar;
                        awvyVar2.getClass();
                        awxrVar.c = awvyVar2;
                        awxrVar.b = 2;
                        awxr awxrVar2 = (awxr) awxpVar.build();
                        awoo awooVar = awoo.this;
                        return awoo.l(awooVar.c.a(awxrVar2, awooVar.k(awvyVar2.d)));
                    }
                }, this.r);
            } else {
                csjb e = m.e();
                e.I("Invalid group destination");
                e.g(awvyVar.d);
                e.r();
                awty awtyVar = (awty) awud.a.createBuilder();
                awuc awucVar = awuc.FAILED_PERMANENTLY;
                awtyVar.copyOnWrite();
                awud awudVar = (awud) awtyVar.instance;
                awudVar.c = awucVar.f;
                awudVar.b |= 1;
                awua awuaVar = awua.INVALID_REPLY_TO_CHAT_ENDPOINT;
                awtyVar.copyOnWrite();
                awud awudVar2 = (awud) awtyVar.instance;
                awudVar2.d = awuaVar.v;
                awudVar2.b |= 2;
                h = elfo.e((awud) awtyVar.build());
            }
            f.b(h);
            f.close();
            return h;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.avkh
    public final elfl e(awxk awxkVar) {
        Optional empty;
        elfl h;
        elfl c;
        ekzz f = eleg.f("IncomingChatApiImpl#onIncomingMessage");
        try {
            awui awuiVar = awxkVar.g;
            if (awuiVar == null) {
                awuiVar = awui.a;
            }
            if (n(awuiVar)) {
                if ((!this.y.a() && (awxkVar.c & 2) == 0) || (this.y.a() && (awxkVar.c & 4) == 0)) {
                    ensk j = a.j();
                    j.Y(ente.a, "BugleDataModel");
                    enrr enrrVar = (enrr) j;
                    enrrVar.Y(csux.p, bdgq.b(awxkVar.m));
                    ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/chatapi/incoming/IncomingChatApiImpl", "validateIncomingChatMessageRequest", 247, "IncomingChatApiImpl.java")).t("Missing sender destination token for message: %s", awxkVar.l);
                    ((avkz) this.q.b()).e(awxkVar, eqwy.CHAT_API_FAILED_PERMANENTLY, 11);
                    awty awtyVar = (awty) awud.a.createBuilder();
                    awuc awucVar = awuc.FAILED_PERMANENTLY;
                    awtyVar.copyOnWrite();
                    awud awudVar = (awud) awtyVar.instance;
                    awudVar.c = awucVar.f;
                    awudVar.b |= 1;
                    awua awuaVar = awua.INVALID_SENDER_TOKEN;
                    awtyVar.copyOnWrite();
                    awud awudVar2 = (awud) awtyVar.instance;
                    awudVar2.d = awuaVar.v;
                    awudVar2.b |= 2;
                    empty = Optional.of((awud) awtyVar.build());
                }
                awui awuiVar2 = awxkVar.g;
                if (awuiVar2 == null) {
                    awuiVar2 = awui.a;
                }
                awuh b = awuh.b(awuiVar2.c);
                if (b == null) {
                    b = awuh.UNKNOWN_TYPE;
                }
                if (b.equals(awuh.GROUP)) {
                    if (!this.y.a() && (awxkVar.c & 16) != 0) {
                    }
                    if (this.y.a() && (awxkVar.c & 32) != 0) {
                    }
                    ensk j2 = a.j();
                    j2.Y(ente.a, "BugleDataModel");
                    enrr enrrVar2 = (enrr) j2;
                    enrrVar2.Y(csux.p, bdgq.b(awxkVar.m));
                    ((enrr) enrrVar2.h("com/google/android/apps/messaging/shared/chatapi/incoming/IncomingChatApiImpl", "validateIncomingChatMessageRequest", 262, "IncomingChatApiImpl.java")).t("Missing group token for a group message: %s", awxkVar.l);
                    ((avkz) this.q.b()).e(awxkVar, eqwy.CHAT_API_FAILED_PERMANENTLY, 12);
                    awty awtyVar2 = (awty) awud.a.createBuilder();
                    awuc awucVar2 = awuc.FAILED_PERMANENTLY;
                    awtyVar2.copyOnWrite();
                    awud awudVar3 = (awud) awtyVar2.instance;
                    awudVar3.c = awucVar2.f;
                    awudVar3.b |= 1;
                    awua awuaVar2 = awua.INVALID_GROUP_TOKEN;
                    awtyVar2.copyOnWrite();
                    awud awudVar4 = (awud) awtyVar2.instance;
                    awudVar4.d = awuaVar2.v;
                    awudVar4.b |= 2;
                    empty = Optional.of((awud) awtyVar2.build());
                }
                awui awuiVar3 = awxkVar.j;
                if (awuiVar3 == null) {
                    awuiVar3 = awui.a;
                }
                if (((ctvb) this.n.b()).I(awuiVar3.d)) {
                    empty = Optional.empty();
                } else {
                    ensk j3 = a.j();
                    j3.Y(ente.a, "BugleDataModel");
                    enrr enrrVar3 = (enrr) j3;
                    enrrVar3.Y(csux.e, awxkVar.l);
                    enrrVar3.Y(csux.p, bdgq.b(awxkVar.m));
                    enrr enrrVar4 = (enrr) enrrVar3.h("com/google/android/apps/messaging/shared/chatapi/incoming/IncomingChatApiImpl", "validateIncomingChatMessageRequest", 278, "IncomingChatApiImpl.java");
                    awui awuiVar4 = awxkVar.j;
                    if (awuiVar4 == null) {
                        awuiVar4 = awui.a;
                    }
                    awuh b2 = awuh.b(awuiVar4.c);
                    if (b2 == null) {
                        b2 = awuh.UNKNOWN_TYPE;
                    }
                    String name = b2.name();
                    awui awuiVar5 = awxkVar.j;
                    if (awuiVar5 == null) {
                        awuiVar5 = awui.a;
                    }
                    enrrVar4.D("Invalid selfChatEndpoint for receiverType: %s, receiverId: %s", name, awuiVar5.d);
                    ((avkz) this.q.b()).e(awxkVar, eqwy.CHAT_API_FAILED_PERMANENTLY, 9);
                    awty awtyVar3 = (awty) awud.a.createBuilder();
                    awuc awucVar3 = awuc.FAILED_PERMANENTLY;
                    awtyVar3.copyOnWrite();
                    awud awudVar5 = (awud) awtyVar3.instance;
                    awudVar5.c = awucVar3.f;
                    awudVar5.b |= 1;
                    awua awuaVar3 = awua.INVALID_SELF_CHAT_ENDPOINT;
                    awtyVar3.copyOnWrite();
                    awud awudVar6 = (awud) awtyVar3.instance;
                    awudVar6.d = awuaVar3.v;
                    awudVar6.b |= 2;
                    empty = Optional.of((awud) awtyVar3.build());
                }
            } else {
                ensk j4 = a.j();
                j4.Y(ente.a, "BugleDataModel");
                enrr enrrVar5 = (enrr) j4;
                enrrVar5.Y(csux.e, awxkVar.l);
                enrrVar5.Y(csux.p, bdgq.b(awxkVar.m));
                enrr enrrVar6 = (enrr) enrrVar5.h("com/google/android/apps/messaging/shared/chatapi/incoming/IncomingChatApiImpl", "validateIncomingChatMessageRequest", 231, "IncomingChatApiImpl.java");
                awui awuiVar6 = awxkVar.g;
                if (awuiVar6 == null) {
                    awuiVar6 = awui.a;
                }
                awuh b3 = awuh.b(awuiVar6.c);
                if (b3 == null) {
                    b3 = awuh.UNKNOWN_TYPE;
                }
                enrrVar6.t("Invalid destination for endpoint type: %s", b3.name());
                ((avkz) this.q.b()).e(awxkVar, eqwy.CHAT_API_FAILED_PERMANENTLY, 3);
                awty awtyVar4 = (awty) awud.a.createBuilder();
                awuc awucVar4 = awuc.FAILED_PERMANENTLY;
                awtyVar4.copyOnWrite();
                awud awudVar7 = (awud) awtyVar4.instance;
                awudVar7.c = awucVar4.f;
                awudVar7.b |= 1;
                awua awuaVar4 = awua.INVALID_REPLY_TO_CHAT_ENDPOINT;
                awtyVar4.copyOnWrite();
                awud awudVar8 = (awud) awtyVar4.instance;
                awudVar8.d = awuaVar4.v;
                awudVar8.b |= 2;
                empty = Optional.of((awud) awtyVar4.build());
            }
            if (empty.isPresent()) {
                h = elfo.e(empty.get());
            } else {
                avkz avkzVar = (avkz) this.q.b();
                eoop eoopVar = (eoop) eopq.a.createBuilder();
                String str = awxkVar.l;
                eoopVar.copyOnWrite();
                eopq eopqVar = (eopq) eoopVar.instance;
                str.getClass();
                eopqVar.b |= Integer.MIN_VALUE;
                eopqVar.H = str;
                eopq eopqVar2 = awxkVar.q;
                if (eopqVar2 == null) {
                    eopqVar2 = eopq.a;
                }
                eqyl b4 = eqyl.b(eopqVar2.aa);
                if (b4 == null) {
                    b4 = eqyl.UNKNOWN_RCS_TYPE;
                }
                eoopVar.copyOnWrite();
                eopq eopqVar3 = (eopq) eoopVar.instance;
                eopqVar3.aa = b4.h;
                eopqVar3.c |= 2097152;
                eoopVar.copyOnWrite();
                eopq eopqVar4 = (eopq) eoopVar.instance;
                eopqVar4.g = 8;
                eopqVar4.b |= 1;
                eoopVar.copyOnWrite();
                eopq eopqVar5 = (eopq) eoopVar.instance;
                eopqVar5.h = 2;
                eopqVar5.b |= 2;
                avkzVar.d((eopq) eoopVar.build());
                awuh awuhVar = awuh.BOT;
                awui awuiVar7 = awxkVar.d;
                if (awuiVar7 == null) {
                    awuiVar7 = awui.a;
                }
                awuh b5 = awuh.b(awuiVar7.c);
                if (b5 == null) {
                    b5 = awuh.UNKNOWN_TYPE;
                }
                if (awuhVar == b5) {
                    awpu awpuVar = (awpu) this.w.b();
                    awxkVar.getClass();
                    c = axol.c(awpuVar.a, ffhe.a, ffsm.a, new awpt(awpuVar, awxkVar, null));
                    h = c.h(new emwl() { // from class: awok
                        @Override // defpackage.emwl
                        public final Object apply(Object obj) {
                            int ordinal = ((avui) obj).ordinal();
                            if (ordinal == 0) {
                                ensk h2 = awoo.a.h();
                                h2.Y(ente.a, "BugleDataModel");
                                ((enrr) ((enrr) h2).h("com/google/android/apps/messaging/shared/chatapi/incoming/IncomingChatApiImpl", "workQueueResultToChatResultWithRetries", 655, "IncomingChatApiImpl.java")).q("Successfully processed incoming message");
                                awty awtyVar5 = (awty) awud.a.createBuilder();
                                awuc awucVar5 = awuc.OK;
                                awtyVar5.copyOnWrite();
                                awud awudVar9 = (awud) awtyVar5.instance;
                                awudVar9.c = awucVar5.f;
                                awudVar9.b |= 1;
                                return (awud) awtyVar5.build();
                            }
                            if (ordinal == 1) {
                                ensk j5 = awoo.a.j();
                                j5.Y(ente.a, "BugleDataModel");
                                ((enrr) ((enrr) j5).h("com/google/android/apps/messaging/shared/chatapi/incoming/IncomingChatApiImpl", "workQueueResultToChatResultWithRetries", 665, "IncomingChatApiImpl.java")).q("Failed to process incoming message transiently");
                                awty awtyVar6 = (awty) awud.a.createBuilder();
                                awuc awucVar6 = awuc.FAILED_TRANSIENTLY;
                                awtyVar6.copyOnWrite();
                                awud awudVar10 = (awud) awtyVar6.instance;
                                awudVar10.c = awucVar6.f;
                                awudVar10.b |= 1;
                                awua awuaVar5 = awua.UNKNOWN_CAUSE;
                                awtyVar6.copyOnWrite();
                                awud awudVar11 = (awud) awtyVar6.instance;
                                awudVar11.d = awuaVar5.v;
                                awudVar11.b |= 2;
                                return (awud) awtyVar6.build();
                            }
                            if (ordinal != 2) {
                                throw new IllegalArgumentException("Unsupported WorkQueueResultType");
                            }
                            ensk j6 = awoo.a.j();
                            j6.Y(ente.a, "BugleDataModel");
                            ((enrr) ((enrr) j6).h("com/google/android/apps/messaging/shared/chatapi/incoming/IncomingChatApiImpl", "workQueueResultToChatResultWithRetries", 658, "IncomingChatApiImpl.java")).q("Failed to process incoming message permanently");
                            awty awtyVar7 = (awty) awud.a.createBuilder();
                            awuc awucVar7 = awuc.FAILED_PERMANENTLY;
                            awtyVar7.copyOnWrite();
                            awud awudVar12 = (awud) awtyVar7.instance;
                            awudVar12.c = awucVar7.f;
                            awudVar12.b |= 1;
                            awua awuaVar6 = awua.UNKNOWN_CAUSE;
                            awtyVar7.copyOnWrite();
                            awud awudVar13 = (awud) awtyVar7.instance;
                            awudVar13.d = awuaVar6.v;
                            awudVar13.b |= 2;
                            return (awud) awtyVar7.build();
                        }
                    }, erpp.a);
                } else {
                    ensk h2 = a.h();
                    h2.Y(ente.a, "BugleDataModel");
                    enrr enrrVar7 = (enrr) h2;
                    enrrVar7.Y(csux.e, awxkVar.l);
                    ((enrr) enrrVar7.h("com/google/android/apps/messaging/shared/chatapi/incoming/IncomingChatApiImpl", "processMessageAfterValidation", 321, "IncomingChatApiImpl.java")).q("Received incoming message.");
                    awqr awqrVar = (awqr) this.u.b();
                    awxn awxnVar = (awxn) awxo.a.createBuilder();
                    awxnVar.copyOnWrite();
                    awxo awxoVar = (awxo) awxnVar.instance;
                    awxkVar.getClass();
                    awxoVar.c = awxkVar;
                    awxoVar.b |= 1;
                    awxnVar.copyOnWrite();
                    awxo awxoVar2 = (awxo) awxnVar.instance;
                    awxoVar2.b |= 2;
                    awxoVar2.d = true;
                    h = awqrVar.a((awxo) awxnVar.build()).h(new emwl() { // from class: awok
                        @Override // defpackage.emwl
                        public final Object apply(Object obj) {
                            int ordinal = ((avui) obj).ordinal();
                            if (ordinal == 0) {
                                ensk h22 = awoo.a.h();
                                h22.Y(ente.a, "BugleDataModel");
                                ((enrr) ((enrr) h22).h("com/google/android/apps/messaging/shared/chatapi/incoming/IncomingChatApiImpl", "workQueueResultToChatResultWithRetries", 655, "IncomingChatApiImpl.java")).q("Successfully processed incoming message");
                                awty awtyVar5 = (awty) awud.a.createBuilder();
                                awuc awucVar5 = awuc.OK;
                                awtyVar5.copyOnWrite();
                                awud awudVar9 = (awud) awtyVar5.instance;
                                awudVar9.c = awucVar5.f;
                                awudVar9.b |= 1;
                                return (awud) awtyVar5.build();
                            }
                            if (ordinal == 1) {
                                ensk j5 = awoo.a.j();
                                j5.Y(ente.a, "BugleDataModel");
                                ((enrr) ((enrr) j5).h("com/google/android/apps/messaging/shared/chatapi/incoming/IncomingChatApiImpl", "workQueueResultToChatResultWithRetries", 665, "IncomingChatApiImpl.java")).q("Failed to process incoming message transiently");
                                awty awtyVar6 = (awty) awud.a.createBuilder();
                                awuc awucVar6 = awuc.FAILED_TRANSIENTLY;
                                awtyVar6.copyOnWrite();
                                awud awudVar10 = (awud) awtyVar6.instance;
                                awudVar10.c = awucVar6.f;
                                awudVar10.b |= 1;
                                awua awuaVar5 = awua.UNKNOWN_CAUSE;
                                awtyVar6.copyOnWrite();
                                awud awudVar11 = (awud) awtyVar6.instance;
                                awudVar11.d = awuaVar5.v;
                                awudVar11.b |= 2;
                                return (awud) awtyVar6.build();
                            }
                            if (ordinal != 2) {
                                throw new IllegalArgumentException("Unsupported WorkQueueResultType");
                            }
                            ensk j6 = awoo.a.j();
                            j6.Y(ente.a, "BugleDataModel");
                            ((enrr) ((enrr) j6).h("com/google/android/apps/messaging/shared/chatapi/incoming/IncomingChatApiImpl", "workQueueResultToChatResultWithRetries", 658, "IncomingChatApiImpl.java")).q("Failed to process incoming message permanently");
                            awty awtyVar7 = (awty) awud.a.createBuilder();
                            awuc awucVar7 = awuc.FAILED_PERMANENTLY;
                            awtyVar7.copyOnWrite();
                            awud awudVar12 = (awud) awtyVar7.instance;
                            awudVar12.c = awucVar7.f;
                            awudVar12.b |= 1;
                            awua awuaVar6 = awua.UNKNOWN_CAUSE;
                            awtyVar7.copyOnWrite();
                            awud awudVar13 = (awud) awtyVar7.instance;
                            awudVar13.d = awuaVar6.v;
                            awudVar13.b |= 2;
                            return (awud) awtyVar7.build();
                        }
                    }, erpp.a);
                    this.j.d(EnumSet.of(cetb.WAKELOCK, cetb.BACKGROUND_SERVICE), h, new Supplier() { // from class: awol
                        @Override // java.util.function.Supplier
                        public final Object get() {
                            return null;
                        }
                    });
                }
            }
            f.b(h);
            f.close();
            return h;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.avkh
    public final elfl f(final awyn awynVar) {
        final Optional m2 = m(awyj.a, awynVar.d);
        if (!m2.isEmpty()) {
            return elfo.h(new erog() { // from class: awoc
                @Override // defpackage.erog
                public final ListenableFuture a() {
                    String str = ((awyj) m2.get()).c;
                    awoo awooVar = awoo.this;
                    return awoo.l(((cevh) awooVar.g.a.b()).a(ceyr.h("on_remove_user_from_group_chat_complete", awynVar, awooVar.k(str))));
                }
            }, this.r);
        }
        m.r("Invalid opaque data in RemoveUserFromGroupChatResponse");
        cknc ckncVar = (cknc) this.v.b();
        cknc.r(ckncVar, 19, 3, null, null, null, ckncVar.n(3, null), 28);
        awty awtyVar = (awty) awud.a.createBuilder();
        awuc awucVar = awuc.FAILED_PERMANENTLY;
        awtyVar.copyOnWrite();
        awud awudVar = (awud) awtyVar.instance;
        awudVar.c = awucVar.f;
        awudVar.b |= 1;
        awua awuaVar = awua.INVALID_OPAQUE_DATA;
        awtyVar.copyOnWrite();
        awud awudVar2 = (awud) awtyVar.instance;
        awudVar2.d = awuaVar.v;
        awudVar2.b |= 2;
        return elfo.e((awud) awtyVar.build());
    }

    @Override // defpackage.avkh
    public final elfl g(final awyt awytVar) {
        final Optional m2 = m(awyv.a, awytVar.d);
        if (!m2.isEmpty()) {
            return elfo.h(new erog() { // from class: awoj
                @Override // defpackage.erog
                public final ListenableFuture a() {
                    String str = ((awyv) m2.get()).c;
                    awoo awooVar = awoo.this;
                    return awoo.l(((cevh) awooVar.d.a.b()).a(ceyr.h("chatapi_revoke_chat_message_response", awytVar, awooVar.k(str))));
                }
            }, this.r);
        }
        m.r("Invalid opaque data in RevokeChatMessageResponse");
        awty awtyVar = (awty) awud.a.createBuilder();
        awuc awucVar = awuc.FAILED_PERMANENTLY;
        awtyVar.copyOnWrite();
        awud awudVar = (awud) awtyVar.instance;
        awudVar.c = awucVar.f;
        awudVar.b |= 1;
        awua awuaVar = awua.INVALID_OPAQUE_DATA;
        awtyVar.copyOnWrite();
        awud awudVar2 = (awud) awtyVar.instance;
        awudVar2.d = awuaVar.v;
        awudVar2.b |= 2;
        return elfo.e((awud) awtyVar.build());
    }

    @Override // defpackage.avkh
    public final elfl h(final awzd awzdVar) {
        Predicate mo439negate;
        Optional m2 = m(awzj.a, awzdVar.d);
        Optional map = m2.map(new Function() { // from class: awog
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                axad axadVar = ((awzj) obj).g;
                return axadVar == null ? axad.a : axadVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        mo439negate = Predicate$CC.isEqual(axad.a).mo439negate();
        final axad axadVar = (axad) map.filter(mo439negate).orElse((axad) this.t.fP(cslr.a()));
        if (((Boolean) ((cfup) clie.c.get()).e()).booleanValue()) {
            clie clieVar = this.i;
            eopq eopqVar = awzdVar.h;
            if (eopqVar == null) {
                eopqVar = eopq.a;
            }
            clieVar.c(axadVar, bdhg.a(eopqVar.H), 4, 17);
        }
        if (!m2.isEmpty()) {
            return elfo.h(new erog() { // from class: awoh
                @Override // defpackage.erog
                public final ListenableFuture a() {
                    final awoo awooVar = awoo.this;
                    final elfl k = ((awrg) awooVar.b.b()).k(awzdVar);
                    elfl i = k.i(new eroh() { // from class: awom
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj) {
                            avui avuiVar = (avui) obj;
                            if (avuiVar != avui.SUCCESS) {
                                ((akzt) awoo.this.k.b()).e("Bugle.Rcs.ChatApi.Failure.ProcessSendChatMessageResponse.Count", avuiVar == avui.FAIL_RETRY ? 1 : 2);
                            }
                            return k;
                        }
                    }, erpp.a);
                    awooVar.j.b(i);
                    return awoo.l(new ceyu(i.h(new emwl() { // from class: awon
                        @Override // defpackage.emwl
                        public final Object apply(Object obj) {
                            return avuj.a((avui) obj);
                        }
                    }, erpp.a), elfo.e(true)));
                }
            }, this.s).h(new emwl() { // from class: awoi
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    awud awudVar = (awud) obj;
                    if (((Boolean) ((cfup) clie.c.get()).e()).booleanValue()) {
                        awzd awzdVar2 = awzdVar;
                        awoo awooVar = awoo.this;
                        eopq eopqVar2 = awzdVar2.h;
                        if (eopqVar2 == null) {
                            eopqVar2 = eopq.a;
                        }
                        awooVar.i.c(axadVar, bdhg.a(eopqVar2.H), 9, 17);
                    }
                    return awudVar;
                }
            }, this.s);
        }
        m.r("Invalid opaque data in SendChatMessageResponse");
        awty awtyVar = (awty) awud.a.createBuilder();
        awuc awucVar = awuc.FAILED_PERMANENTLY;
        awtyVar.copyOnWrite();
        awud awudVar = (awud) awtyVar.instance;
        awudVar.c = awucVar.f;
        awudVar.b |= 1;
        awua awuaVar = awua.INVALID_OPAQUE_DATA;
        awtyVar.copyOnWrite();
        awud awudVar2 = (awud) awtyVar.instance;
        awudVar2.d = awuaVar.v;
        awudVar2.b |= 2;
        return elfo.e((awud) awtyVar.build());
    }

    @Override // defpackage.avkh
    public final elfl i(final axal axalVar) {
        final Optional m2 = m(axah.a, axalVar.d);
        if (!m2.isEmpty()) {
            return elfo.h(new erog() { // from class: awob
                @Override // defpackage.erog
                public final ListenableFuture a() {
                    String str = ((axah) m2.get()).c;
                    awoo awooVar = awoo.this;
                    return awoo.l(((cevh) awooVar.e.a.b()).a(ceyr.h("on_trigger_chat_group_full_state_update_complete", axalVar, awooVar.k(str))));
                }
            }, this.r);
        }
        m.r("Invalid opaque data in TriggerChatGroupFullStateUpdateResponse");
        awty awtyVar = (awty) awud.a.createBuilder();
        awuc awucVar = awuc.FAILED_PERMANENTLY;
        awtyVar.copyOnWrite();
        awud awudVar = (awud) awtyVar.instance;
        awudVar.c = awucVar.f;
        awudVar.b |= 1;
        awua awuaVar = awua.INVALID_OPAQUE_DATA;
        awtyVar.copyOnWrite();
        awud awudVar2 = (awud) awtyVar.instance;
        awudVar2.d = awuaVar.v;
        awudVar2.b |= 2;
        return elfo.e((awud) awtyVar.build());
    }

    @Override // defpackage.avkh
    public final elfl j(final axat axatVar) {
        if (((auac) this.x.b()).a()) {
            return elfo.g(new Callable() { // from class: awnz
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    awhc awhcVar = (awhc) awoo.this.l.b();
                    axat axatVar2 = axatVar;
                    axatVar2.getClass();
                    axan axanVar = (axan) eyfy.parseFrom(axan.a, axatVar2.d, eyfc.a());
                    axanVar.getClass();
                    String str = axanVar.c;
                    str.getClass();
                    awud awudVar = axatVar2.c;
                    if (awudVar == null) {
                        awudVar = awud.a;
                    }
                    awudVar.getClass();
                    if (awhcVar.a(str, awudVar)) {
                        awty awtyVar = (awty) awud.a.createBuilder();
                        awtyVar.getClass();
                        awue.b(awuc.OK, awtyVar);
                        return awue.a(awtyVar);
                    }
                    awty awtyVar2 = (awty) awud.a.createBuilder();
                    awtyVar2.getClass();
                    awue.b(awuc.FAILED_PERMANENTLY, awtyVar2);
                    return awue.a(awtyVar2);
                }
            }, this.s);
        }
        final awhi awhiVar = (awhi) this.o.b();
        try {
            final axan axanVar = (axan) eyfy.parseFrom(axan.a, axatVar.d, eyfc.a());
            awud awudVar = axatVar.c;
            if (awudVar == null) {
                awudVar = awud.a;
            }
            awuc b = awuc.b(awudVar.c);
            if (b == null) {
                b = awuc.UNKNOWN_STATUS;
            }
            if (b.equals(awuc.OK)) {
                cknc ckncVar = awhiVar.d;
                String str = axanVar.c;
                str.getClass();
                cknc.r(ckncVar, 23, 2, str, null, null, null, 56);
            } else {
                cknc ckncVar2 = awhiVar.d;
                String str2 = axanVar.c;
                awud awudVar2 = axatVar.c;
                if (awudVar2 == null) {
                    awudVar2 = awud.a;
                }
                ckncVar2.p(str2, awudVar2, 3);
            }
            return elfo.g(new Callable() { // from class: awhe
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    axat axatVar2 = axatVar;
                    String str3 = axanVar.c;
                    awud awudVar3 = axatVar2.c;
                    if (awudVar3 == null) {
                        awudVar3 = awud.a;
                    }
                    return awhi.this.a(str3, awudVar3);
                }
            }, awhiVar.e);
        } catch (eygu e) {
            awhi.a.s("Received update group operation response with invalid opaque data", e);
            cknc ckncVar3 = awhiVar.d;
            cknc.r(ckncVar3, 23, 3, null, null, null, ckncVar3.n(3, null), 20);
            awty awtyVar = (awty) awud.a.createBuilder();
            awuc awucVar = awuc.FAILED_PERMANENTLY;
            awtyVar.copyOnWrite();
            awud awudVar3 = (awud) awtyVar.instance;
            awudVar3.c = awucVar.f;
            awudVar3.b |= 1;
            return elfo.e((awud) awtyVar.build());
        }
    }

    public final cfkl k(String str) {
        cetp cetpVar = new cetp();
        cetpVar.a = Long.toString(this.p.c(str));
        return cetpVar.a();
    }
}
