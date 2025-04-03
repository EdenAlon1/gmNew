package defpackage;

import j$.util.StringJoiner;
import j$.util.function.Function$CC;
import java.util.EnumSet;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpmk implements avkj {
    public static final awud a;
    public static final entd b;
    public final ffbr c;
    public final ffbr d;
    public final ffbr e;
    public final ffbr f;
    public final ffbr g;
    public final ffbr h;
    public final ffbr i;
    public final ffbr j;
    public final errl k;
    public final ffbr l;
    public final ffbr m;
    public final ffbr n;
    private final ffbr o;
    private final errm p;

    static {
        awty awtyVar = (awty) awud.a.createBuilder();
        awuc awucVar = awuc.PENDING;
        awtyVar.copyOnWrite();
        awud awudVar = (awud) awtyVar.instance;
        awudVar.c = awucVar.f;
        awudVar.b |= 1;
        a = (awud) awtyVar.build();
        b = entd.c("BugleTachygram");
    }

    public cpmk(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8, ffbr ffbrVar9, ffbr ffbrVar10, ffbr ffbrVar11, errm errmVar, errl errlVar, ffbr ffbrVar12) {
        this.c = ffbrVar;
        this.d = ffbrVar2;
        this.e = ffbrVar3;
        this.f = ffbrVar4;
        this.g = ffbrVar5;
        this.h = ffbrVar6;
        this.i = ffbrVar7;
        this.o = ffbrVar8;
        this.k = errlVar;
        this.l = ffbrVar10;
        this.j = ffbrVar9;
        this.m = ffbrVar11;
        this.p = errmVar;
        this.n = ffbrVar12;
    }

    public static cfkl i(String str) {
        cetp cetpVar = new cetp();
        cetpVar.a = str;
        return cetpVar.a();
    }

    @Override // defpackage.avkj
    public final elfl a(final awtv awtvVar) {
        return elfo.g(new Callable() { // from class: cpmg
            @Override // java.util.concurrent.Callable
            public final Object call() {
                cpiy cpiyVar = (cpiy) cpmk.this.f.b();
                awtv awtvVar2 = awtvVar;
                awwf awwfVar = awtvVar2.c;
                if (awwfVar == null) {
                    awwfVar = awwf.a;
                }
                ((cevh) cpiyVar.a.b()).a(ceyr.h("tachygram_add_user_to_group", awtvVar2, cpmk.i(awwfVar.c)));
                ensz enszVar = (ensz) cpmk.b.h();
                ensn ensnVar = csux.J;
                awwf awwfVar2 = awtvVar2.c;
                if (awwfVar2 == null) {
                    awwfVar2 = awwf.a;
                }
                enszVar.Y(ensnVar, awwfVar2.c);
                ((ensz) enszVar.h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramOutgoingChatApi", "addUserToGroupChat", 204, "TachygramOutgoingChatApi.java")).q("AddUserToGroupChatRequest is queued.");
                eyee eyeeVar = awtvVar2.e;
                awtw awtwVar = (awtw) awtx.a.createBuilder();
                awud awudVar = cpmk.a;
                awtwVar.copyOnWrite();
                awtx awtxVar = (awtx) awtwVar.instance;
                awudVar.getClass();
                awtxVar.c = awudVar;
                awtxVar.b |= 1;
                awtwVar.copyOnWrite();
                awtx awtxVar2 = (awtx) awtwVar.instance;
                eyeeVar.getClass();
                awtxVar2.b |= 2;
                awtxVar2.d = eyeeVar;
                return (awtx) awtwVar.build();
            }
        }, this.k);
    }

    @Override // defpackage.avkj
    public final elfl b(final awuw awuwVar) {
        return elfo.g(new Callable() { // from class: cpmi
            @Override // java.util.concurrent.Callable
            public final Object call() {
                cpji cpjiVar = (cpji) cpmk.this.e.b();
                awuw awuwVar2 = awuwVar;
                ((cevh) cpjiVar.a.b()).a(ceyr.h("tachygram_create_group", awuwVar2, cpmk.i(awuwVar2.c)));
                ensz enszVar = (ensz) cpmk.b.h();
                enszVar.Y(csux.J, awuwVar2.c);
                ((ensz) enszVar.h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramOutgoingChatApi", "createGroupChat", 182, "TachygramOutgoingChatApi.java")).q("CreateGroupChatRequest is queued.");
                eyee eyeeVar = awuwVar2.h;
                awuy awuyVar = (awuy) awuz.a.createBuilder();
                awud awudVar = cpmk.a;
                awuyVar.copyOnWrite();
                awuz awuzVar = (awuz) awuyVar.instance;
                awudVar.getClass();
                awuzVar.c = awudVar;
                awuzVar.b |= 1;
                awuyVar.copyOnWrite();
                awuz awuzVar2 = (awuz) awuyVar.instance;
                eyeeVar.getClass();
                awuzVar2.b |= 4;
                awuzVar2.e = eyeeVar;
                eqyl eqylVar = eqyl.RCS_TACHYGRAM;
                awuyVar.copyOnWrite();
                awuz awuzVar3 = (awuz) awuyVar.instance;
                awuzVar3.f = eqylVar.h;
                awuzVar3.b |= 8;
                return (awuz) awuyVar.build();
            }
        }, this.k);
    }

    @Override // defpackage.avkj
    public final elfl c(final awyl awylVar) {
        return elfo.g(new Callable() { // from class: cpmh
            @Override // java.util.concurrent.Callable
            public final Object call() {
                cpne cpneVar = (cpne) cpmk.this.g.b();
                awyl awylVar2 = awylVar;
                awwf awwfVar = awylVar2.c;
                if (awwfVar == null) {
                    awwfVar = awwf.a;
                }
                ((cevh) cpneVar.a.b()).a(ceyr.h("tachygram_remove_user_from_group", awylVar2, cpmk.i(awwfVar.c)));
                ensz enszVar = (ensz) cpmk.b.h();
                ensn ensnVar = csux.J;
                awwf awwfVar2 = awylVar2.c;
                if (awwfVar2 == null) {
                    awwfVar2 = awwf.a;
                }
                enszVar.Y(ensnVar, awwfVar2.c);
                ((ensz) enszVar.h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramOutgoingChatApi", "removeUserFromGroupChat", 226, "TachygramOutgoingChatApi.java")).q("RemoveUserFromGroupChatRequest is queued.");
                eyee eyeeVar = awylVar2.e;
                awym awymVar = (awym) awyn.a.createBuilder();
                awud awudVar = cpmk.a;
                awymVar.copyOnWrite();
                awyn awynVar = (awyn) awymVar.instance;
                awudVar.getClass();
                awynVar.c = awudVar;
                awynVar.b |= 1;
                awymVar.copyOnWrite();
                awyn awynVar2 = (awyn) awymVar.instance;
                eyeeVar.getClass();
                awynVar2.b |= 2;
                awynVar2.d = eyeeVar;
                return (awyn) awymVar.build();
            }
        }, this.k);
    }

    @Override // defpackage.avkj
    public final elfl d(final awyr awyrVar) {
        return elfo.g(new Callable() { // from class: cpmd
            @Override // java.util.concurrent.Callable
            public final Object call() {
                cpmk cpmkVar = cpmk.this;
                cpnk cpnkVar = (cpnk) cpmkVar.d.b();
                awyr awyrVar2 = awyrVar;
                awui awuiVar = awyrVar2.c;
                if (awuiVar == null) {
                    awuiVar = awui.a;
                }
                String str = awyrVar2.e;
                cetp cetpVar = new cetp();
                cetpVar.a = cpmkVar.j(awuiVar, str);
                ((cevh) cpnkVar.a.b()).a(ceyr.h("tachygram_revoke_message", awyrVar2, cetpVar.a()));
                ensz enszVar = (ensz) cpmk.b.h();
                enszVar.Y(csux.a, awyrVar2.d);
                ((ensz) enszVar.h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramOutgoingChatApi", "revokeMessage", 165, "TachygramOutgoingChatApi.java")).q("RevokeChatMessageRequest is queued.");
                eyee eyeeVar = awyrVar2.f;
                awys awysVar = (awys) awyt.a.createBuilder();
                awud awudVar = cpmk.a;
                awysVar.copyOnWrite();
                awyt awytVar = (awyt) awysVar.instance;
                awudVar.getClass();
                awytVar.c = awudVar;
                awytVar.b |= 1;
                awysVar.copyOnWrite();
                awyt awytVar2 = (awyt) awysVar.instance;
                eyeeVar.getClass();
                awytVar2.b |= 2;
                awytVar2.d = eyeeVar;
                return (awyt) awysVar.build();
            }
        }, this.k);
    }

    @Override // defpackage.avkj
    public final elfl e(final awyz awyzVar) {
        ekzz f = eleg.f("TachygramOutgoingChatApi::sendMessage");
        try {
            cpor cporVar = (cpor) this.j.b();
            if ((awyzVar.b & 2048) != 0) {
                axad axadVar = awyzVar.n;
                if (axadVar == null) {
                    axadVar = axad.a;
                }
                cporVar.d(axadVar, bdhg.a(awyzVar.h), 5);
            }
            elfl g = elfo.g(new Callable() { // from class: cpmj
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    ekzz f2 = eleg.f("TachygramOutgoingChatApi::sendMessageNowWithoutUsingPwq");
                    final cpmk cpmkVar = cpmk.this;
                    final awyz awyzVar2 = awyzVar;
                    try {
                        cpob cpobVar = (cpob) cpmkVar.l.b();
                        ekzz f3 = eleg.f("TachygramSendMessageWorkHandler::processSendChatMessageRequest");
                        try {
                            final cpnb cpnbVar = cpobVar.b;
                            ekzz f4 = eleg.f("TachygramOutgoingOperationTemplate::processWithoutUsingPwq");
                            try {
                                elfl d = cpnbVar.d(awyzVar2, null, new Function() { // from class: cpml
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo448andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj) {
                                        cpnb cpnbVar2 = cpnb.this;
                                        return ((elfl) obj).j(((Long) cpnbVar2.h.b()).longValue(), TimeUnit.SECONDS, cpnbVar2.i);
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                });
                                f4.b(d);
                                f4.close();
                                f3.b(d);
                                f3.close();
                                elfl h = d.e(Throwable.class, new emwl() { // from class: cpma
                                    @Override // defpackage.emwl
                                    public final Object apply(Object obj) {
                                        ensz enszVar = (ensz) cpmk.b.j();
                                        enszVar.Y(csux.a, awyz.this.h);
                                        ((ensz) ((ensz) enszVar.g((Throwable) obj)).h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramOutgoingChatApi", "sendMessageNowWithoutUsingPwq", 298, "TachygramOutgoingChatApi.java")).q("Attempt to send chat message directly failed(or) timed-out so enqueueing it to pwq.");
                                        return avui.FAIL_RETRY;
                                    }
                                }, cpmkVar.k).h(new emwl() { // from class: cpmb
                                    @Override // defpackage.emwl
                                    public final Object apply(Object obj) {
                                        int ordinal = ((avui) obj).ordinal();
                                        awyz awyzVar3 = awyzVar2;
                                        if (ordinal == 0) {
                                            ensk n = cpmk.b.n();
                                            n.Y(csux.a, awyzVar3.h);
                                            ((ensz) n.h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramOutgoingChatApi", "sendMessageNowWithoutUsingPwq", 311, "TachygramOutgoingChatApi.java")).q("SendChatMessageRequest is sent successfully");
                                            return null;
                                        }
                                        if (ordinal != 1) {
                                            if (ordinal != 2) {
                                                return null;
                                            }
                                            ensz enszVar = (ensz) cpmk.b.j();
                                            enszVar.Y(csux.a, awyzVar3.h);
                                            ((ensz) enszVar.h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramOutgoingChatApi", "sendMessageNowWithoutUsingPwq", 317, "TachygramOutgoingChatApi.java")).q("SendChatMessageRequest failed, returning to Postmaster layer");
                                            return null;
                                        }
                                        cpmk cpmkVar2 = cpmk.this;
                                        ensk n2 = cpmk.b.n();
                                        n2.Y(csux.a, awyzVar3.h);
                                        ((ensz) n2.h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramOutgoingChatApi", "sendMessageNowWithoutUsingPwq", 325, "TachygramOutgoingChatApi.java")).q("SendChatMessageRequest is queued in Pwq after retryable failure.");
                                        ((cpnp) cpmkVar2.c.b()).a(awyzVar3, cpmkVar2.h(awyzVar3));
                                        return null;
                                    }
                                }, cpmkVar.k);
                                f2.b(h);
                                cetc cetcVar = (cetc) cpmkVar.m.b();
                                int d2 = cetcVar.d(EnumSet.allOf(cetb.class), h, new Supplier() { // from class: cpmc
                                    @Override // java.util.function.Supplier
                                    public final Object get() {
                                        return ((cins) cpmk.this.n.b()).b();
                                    }
                                });
                                cetcVar.f("Bugle.DataModel.Action.SendMessage.Rcs.Tachygram.AttachingAndroidFutureWrapper.Count", d2);
                                if (d2 == 1) {
                                    ((cpnp) cpmkVar.c.b()).a(awyzVar2, cpmkVar.h(awyzVar2));
                                } else {
                                    axnw.h(h);
                                }
                                f2.close();
                                cpor cporVar2 = (cpor) cpmkVar.j.b();
                                if ((awyzVar2.b & 2048) != 0) {
                                    axad axadVar2 = awyzVar2.n;
                                    if (axadVar2 == null) {
                                        axadVar2 = axad.a;
                                    }
                                    cporVar2.d(axadVar2, bdhg.a(awyzVar2.h), 6);
                                }
                                ensz enszVar = (ensz) cpmk.b.h();
                                enszVar.Y(csux.a, awyzVar2.h);
                                enszVar.Y(csux.o, awyzVar2.i);
                                ((ensz) enszVar.h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramOutgoingChatApi", "sendMessage", 140, "TachygramOutgoingChatApi.java")).q("SendChatMessageRequest is queued.");
                                eyee eyeeVar = awyzVar2.l;
                                awzc awzcVar = (awzc) awzd.a.createBuilder();
                                awud awudVar = cpmk.a;
                                awzcVar.copyOnWrite();
                                awzd awzdVar = (awzd) awzcVar.instance;
                                awudVar.getClass();
                                awzdVar.c = awudVar;
                                awzdVar.b |= 1;
                                awzcVar.copyOnWrite();
                                awzd awzdVar2 = (awzd) awzcVar.instance;
                                eyeeVar.getClass();
                                awzdVar2.b |= 2;
                                awzdVar2.d = eyeeVar;
                                eopq a2 = cpje.a();
                                awzcVar.copyOnWrite();
                                awzd awzdVar3 = (awzd) awzcVar.instance;
                                a2.getClass();
                                awzdVar3.h = a2;
                                awzdVar3.b |= 32;
                                return (awzd) awzcVar.build();
                            } finally {
                            }
                        } finally {
                        }
                    } catch (Throwable th) {
                        try {
                            f2.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
            }, this.p);
            f.b(g);
            f.close();
            return g;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.avkj
    public final elfl f(final axaj axajVar) {
        return elfo.g(new Callable() { // from class: cpmf
            @Override // java.util.concurrent.Callable
            public final Object call() {
                cpkf cpkfVar = (cpkf) cpmk.this.i.b();
                axaj axajVar2 = axajVar;
                awwf awwfVar = axajVar2.c;
                if (awwfVar == null) {
                    awwfVar = awwf.a;
                }
                ((cevh) cpkfVar.a.b()).a(ceyr.h("tachygram_get_group_info", axajVar2, cpmk.i(awwfVar.c)));
                ensz enszVar = (ensz) cpmk.b.h();
                ensn ensnVar = csux.J;
                awwf awwfVar2 = axajVar2.c;
                if (awwfVar2 == null) {
                    awwfVar2 = awwf.a;
                }
                enszVar.Y(ensnVar, awwfVar2.c);
                ((ensz) enszVar.h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramOutgoingChatApi", "triggerChatGroupFullStateUpdate", 270, "TachygramOutgoingChatApi.java")).q("TriggerChatGroupFullStateUpdateRequest is queued.");
                eyee eyeeVar = axajVar2.d;
                axak axakVar = (axak) axal.a.createBuilder();
                awud awudVar = cpmk.a;
                axakVar.copyOnWrite();
                axal axalVar = (axal) axakVar.instance;
                awudVar.getClass();
                axalVar.c = awudVar;
                axalVar.b |= 1;
                axakVar.copyOnWrite();
                axal axalVar2 = (axal) axakVar.instance;
                eyeeVar.getClass();
                axalVar2.b |= 2;
                axalVar2.d = eyeeVar;
                return (axal) axakVar.build();
            }
        }, this.k);
    }

    @Override // defpackage.avkj
    public final elfl g(final axaq axaqVar) {
        return elfo.g(new Callable() { // from class: cpme
            @Override // java.util.concurrent.Callable
            public final Object call() {
                cpop cpopVar = (cpop) cpmk.this.h.b();
                axaq axaqVar2 = axaqVar;
                awwf awwfVar = axaqVar2.c;
                if (awwfVar == null) {
                    awwfVar = awwf.a;
                }
                ((cevh) cpopVar.a.b()).a(ceyr.h("tachygram_update_group", axaqVar2, cpmk.i(awwfVar.c)));
                ensz enszVar = (ensz) cpmk.b.h();
                ensn ensnVar = csux.J;
                awwf awwfVar2 = axaqVar2.c;
                if (awwfVar2 == null) {
                    awwfVar2 = awwf.a;
                }
                enszVar.Y(ensnVar, awwfVar2.c);
                ((ensz) enszVar.h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramOutgoingChatApi", "updateGroupChat", 248, "TachygramOutgoingChatApi.java")).q("UpdateGroupChatRequest is queued.");
                eyee eyeeVar = axaqVar2.e;
                axas axasVar = (axas) axat.a.createBuilder();
                awud awudVar = cpmk.a;
                axasVar.copyOnWrite();
                axat axatVar = (axat) axasVar.instance;
                awudVar.getClass();
                axatVar.c = awudVar;
                axatVar.b |= 1;
                axasVar.copyOnWrite();
                axat axatVar2 = (axat) axasVar.instance;
                eyeeVar.getClass();
                axatVar2.b |= 2;
                axatVar2.d = eyeeVar;
                return (axat) axasVar.build();
            }
        }, this.k);
    }

    public final cfkl h(awyz awyzVar) {
        StringJoiner stringJoiner = new StringJoiner(",");
        awui awuiVar = awyzVar.d;
        if (awuiVar == null) {
            awuiVar = awui.a;
        }
        StringJoiner add = stringJoiner.add("conversation: ".concat(String.valueOf(j(awuiVar, awyzVar.i))));
        awya awyaVar = awyzVar.m;
        if (awyaVar == null) {
            awyaVar = awya.a;
        }
        awxz b2 = awxz.b(awyaVar.c);
        if (b2 == null) {
            b2 = awxz.UNKNOWN_MESSAGE_SOURCE;
        }
        StringJoiner add2 = add.add("messageSource: " + b2.d);
        awya awyaVar2 = awyzVar.m;
        if (awyaVar2 == null) {
            awyaVar2 = awya.a;
        }
        awxx b3 = awxx.b(awyaVar2.d);
        if (b3 == null) {
            b3 = awxx.UNKNOWN_MESSAGE_PRIORITY;
        }
        String stringJoiner2 = add2.add("messagePriority: " + b3.e).toString();
        cetp cetpVar = new cetp();
        cetpVar.a = stringJoiner2;
        cetpVar.b = "sendMessage-pwq-dedupe-tag:".concat(String.valueOf(awyzVar.h));
        return cetpVar.a();
    }

    public final String j(awui awuiVar, String str) {
        awuh b2 = awuh.b(awuiVar.c);
        if (b2 == null) {
            b2 = awuh.UNKNOWN_TYPE;
        }
        return b2.equals(awuh.GROUP) ? str : Long.toString(((akvz) this.o.b()).c(awuiVar.d));
    }
}
