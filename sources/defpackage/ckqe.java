package defpackage;

import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckqe extends ceut {
    public static final entd a = entd.c("BugleGroupManagement");
    public final errl b;
    public final errl c;
    public final errl d;
    public final ffbr e;
    public final avkj f;
    public final avkc g;
    public final ffbr h;
    public final ffbr i;
    public final avkh j;
    public final ffbr k;
    private final ayfy l;
    private final bdvi m;

    public ckqe(errl errlVar, errl errlVar2, errl errlVar3, ffbr ffbrVar, ayfy ayfyVar, bdvi bdviVar, avkj avkjVar, avkc avkcVar, ffbr ffbrVar2, ffbr ffbrVar3, avkh avkhVar, ffbr ffbrVar4) {
        this.b = errlVar;
        this.d = errlVar2;
        this.c = errlVar3;
        this.e = ffbrVar;
        this.l = ayfyVar;
        this.m = bdviVar;
        this.f = avkjVar;
        this.g = avkcVar;
        this.h = ffbrVar2;
        this.i = ffbrVar3;
        this.j = avkhVar;
        this.k = ffbrVar4;
    }

    public static boolean n(ckqh ckqhVar) {
        ckqg b = ckqg.b(ckqhVar.d);
        if (b == null) {
            b = ckqg.UNRECOGNIZED;
        }
        if (b.equals(ckqg.DELETE)) {
            return true;
        }
        ckqg b2 = ckqg.b(ckqhVar.d);
        if (b2 == null) {
            b2 = ckqg.UNRECOGNIZED;
        }
        return b2.equals(ckqg.DELETE_IF_EMPTY);
    }

    public static boolean o(awud awudVar) {
        awuc b = awuc.b(awudVar.c);
        if (b == null) {
            b = awuc.UNKNOWN_STATUS;
        }
        if (Objects.equals(b, awuc.OK)) {
            return false;
        }
        awuc b2 = awuc.b(awudVar.c);
        if (b2 == null) {
            b2 = awuc.UNKNOWN_STATUS;
        }
        return !Objects.equals(b2, awuc.PENDING);
    }

    @Override // defpackage.ceut, defpackage.ceve
    public final cety a() {
        cetx l = cety.l();
        ((ceti) l).c = eogt.LEAVE_RCS_CONVERSATION_ACTION;
        return l.h();
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("LeaveRcsGroupConversationHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        return ckqh.a.getParserForType();
    }

    @Override // defpackage.ceut
    protected final /* bridge */ /* synthetic */ elfl j(ceuw ceuwVar, eyhs eyhsVar) {
        final ckqh ckqhVar = (ckqh) eyhsVar;
        return elfo.h(new erog() { // from class: ckpt
            @Override // defpackage.erog
            public final ListenableFuture a() {
                elfl f;
                final ckqh ckqhVar2 = ckqhVar;
                ConversationIdType b = bdgq.b(ckqhVar2.c);
                final ckqe ckqeVar = ckqe.this;
                ffbr ffbrVar = ckqeVar.e;
                final UUID randomUUID = UUID.randomUUID();
                int i = ((enou) ((bczy) ffbrVar.b()).L(b)).c;
                int i2 = i - 1;
                cknc ckncVar = (cknc) ckqeVar.h.b();
                randomUUID.getClass();
                String uuid = randomUUID.toString();
                eomk eomkVar = (eomk) eoml.a.createBuilder();
                eomkVar.getClass();
                eomkVar.copyOnWrite();
                eoml eomlVar = (eoml) eomkVar.instance;
                eomlVar.b |= 1;
                eomlVar.c = i;
                eomkVar.copyOnWrite();
                eoml eomlVar2 = (eoml) eomkVar.instance;
                eomlVar2.b |= 2;
                eomlVar2.d = i2;
                eyfy build = eomkVar.build();
                build.getClass();
                cknc.r(ckncVar, 20, 0, uuid, null, (eoml) build, null, 42);
                final bseh r = ((bczy) ckqeVar.e.b()).r(b);
                if (r == null) {
                    ensk n = ckqe.a.n();
                    n.Y(csux.o, b.toString());
                    ((ensz) n.h("com/google/android/apps/messaging/shared/rcs/groups/leave/LeaveRcsGroupConversationHandler", "processPendingWorkItem", 191, "LeaveRcsGroupConversationHandler.java")).q("Cannot leave RCS group conversation. The conversation does not exist.");
                    ((cknc) ckqeVar.h.b()).j(randomUUID.toString());
                    return elfo.e(ceyt.k());
                }
                if (r.k() != 2) {
                    ensz enszVar = (ensz) ckqe.a.j();
                    enszVar.Y(csux.o, b.toString());
                    ((ensz) enszVar.h("com/google/android/apps/messaging/shared/rcs/groups/leave/LeaveRcsGroupConversationHandler", "processPendingWorkItem", BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED, "LeaveRcsGroupConversationHandler.java")).q("Cannot leave conversation because this is not an RCS group conversation.");
                    ((cknc) ckqeVar.h.b()).j(randomUUID.toString());
                    return elfo.e(ceyt.k());
                }
                int m = r.m();
                switch (m) {
                    case 0:
                    case 1:
                        if (emxe.c(r.ac())) {
                            ensz enszVar2 = (ensz) ckqe.a.j();
                            enszVar2.Y(csux.o, r.C().toString());
                            enszVar2.Y(csux.J, r.ad());
                            ((ensz) enszVar2.h("com/google/android/apps/messaging/shared/rcs/groups/leave/LeaveRcsGroupConversationHandler", "leaveConversationWithoutValidConferenceUri", 461, "LeaveRcsGroupConversationHandler.java")).q("Attempting to leave RCS group conversation without conference URI.");
                            if (ckqe.n(ckqhVar2)) {
                                return ckqeVar.l(ckqhVar2, r.C());
                            }
                            ckqeVar.m(r, null, randomUUID, null, !ckqhVar2.f);
                            return elfo.e(ceyt.k());
                        }
                        if (((atrz) ckqeVar.k.b()).a()) {
                            if ((ckqhVar2.b & 8) != 0) {
                                awui awuiVar = ckqhVar2.h;
                                if (awuiVar == null) {
                                    awuiVar = awui.a;
                                }
                                f = elfo.e(awuiVar);
                            } else {
                                f = elfo.d(new cjzk());
                            }
                        } else if ((ckqhVar2.b & 4) != 0) {
                            ensz enszVar3 = (ensz) ckqe.a.e();
                            enszVar3.Y(csux.p, r.C());
                            enszVar3.Y(csux.J, r.ad());
                            enszVar3.Y(csux.t, Integer.valueOf(ckqhVar2.g));
                            ((ensz) enszVar3.h("com/google/android/apps/messaging/shared/rcs/groups/leave/LeaveRcsGroupConversationHandler", "getSelfChatEndpointLegacy", 441, "LeaveRcsGroupConversationHandler.java")).q("Request contains subId, using it for getting self identity");
                            f = elfo.e(((ckac) ckqeVar.i.b()).b(ckqhVar2.g));
                        } else {
                            ensz enszVar4 = (ensz) ckqe.a.e();
                            enszVar4.Y(csux.p, r.C());
                            enszVar4.Y(csux.J, r.ad());
                            ((ensz) enszVar4.h("com/google/android/apps/messaging/shared/rcs/groups/leave/LeaveRcsGroupConversationHandler", "getSelfChatEndpointLegacy", 449, "LeaveRcsGroupConversationHandler.java")).q("Getting self identity based on Conversation table");
                            f = ((ckac) ckqeVar.i.b()).f(r.C());
                        }
                        return f.i(new eroh() { // from class: ckpz
                            @Override // defpackage.eroh
                            public final ListenableFuture a(Object obj) {
                                final bseh bsehVar = r;
                                final awui awuiVar2 = (awui) obj;
                                String ad = bsehVar.ad();
                                ad.getClass();
                                String ac = bsehVar.ac();
                                ac.getClass();
                                awwe awweVar = (awwe) awwf.a.createBuilder();
                                awweVar.copyOnWrite();
                                awwf awwfVar = (awwf) awweVar.instance;
                                awwfVar.b |= 1;
                                awwfVar.c = ad;
                                final ckqe ckqeVar2 = ckqe.this;
                                awui a2 = ckqeVar2.g.a(ac, true);
                                awweVar.copyOnWrite();
                                awwf awwfVar2 = (awwf) awweVar.instance;
                                a2.getClass();
                                awwfVar2.d = a2;
                                awwfVar2.b |= 2;
                                awwf awwfVar3 = (awwf) awweVar.build();
                                awyi awyiVar = (awyi) awyj.a.createBuilder();
                                awyiVar.copyOnWrite();
                                awyj awyjVar = (awyj) awyiVar.instance;
                                awyjVar.b |= 1;
                                awyjVar.c = ad;
                                final UUID uuid2 = randomUUID;
                                String uuid3 = uuid2.toString();
                                awyiVar.copyOnWrite();
                                awyj awyjVar2 = (awyj) awyiVar.instance;
                                uuid3.getClass();
                                awyjVar2.b |= 8;
                                awyjVar2.e = uuid3;
                                awyj awyjVar3 = (awyj) awyiVar.build();
                                awyk awykVar = (awyk) awyl.a.createBuilder();
                                awykVar.copyOnWrite();
                                awyl awylVar = (awyl) awykVar.instance;
                                awwfVar3.getClass();
                                awylVar.c = awwfVar3;
                                awylVar.b |= 1;
                                eyee byteString = awyjVar3.toByteString();
                                awykVar.copyOnWrite();
                                awyl awylVar2 = (awyl) awykVar.instance;
                                awylVar2.b |= 2;
                                awylVar2.e = byteString;
                                awykVar.a(awuiVar2);
                                awykVar.copyOnWrite();
                                awyl awylVar3 = (awyl) awykVar.instance;
                                awuiVar2.getClass();
                                awylVar3.f = awuiVar2;
                                awylVar3.b |= 4;
                                elfl c = ckqeVar2.f.c((awyl) awykVar.build());
                                final ckqh ckqhVar3 = ckqhVar2;
                                return c.i(new eroh() { // from class: ckpu
                                    @Override // defpackage.eroh
                                    public final ListenableFuture a(Object obj2) {
                                        awyn awynVar = (awyn) obj2;
                                        int i3 = awynVar.b & 1;
                                        final ckqe ckqeVar3 = ckqe.this;
                                        final bseh bsehVar2 = bsehVar;
                                        final UUID uuid4 = uuid2;
                                        final ckqh ckqhVar4 = ckqhVar3;
                                        if (i3 == 0) {
                                            ckqeVar3.m(bsehVar2, null, uuid4, null, !ckqhVar4.f);
                                            return elfo.e(ceyt.k());
                                        }
                                        awud awudVar = awynVar.c;
                                        if (awudVar == null) {
                                            awudVar = awud.a;
                                        }
                                        awud awudVar2 = awudVar;
                                        if (ckqe.o(awudVar2)) {
                                            ckqeVar3.m(bsehVar2, null, uuid4, awudVar2, !ckqhVar4.f);
                                            return elfo.e(ceyt.k());
                                        }
                                        final awui awuiVar3 = awuiVar2;
                                        return (elfl) Optional.ofNullable(bsehVar2.ad()).map(new Function() { // from class: ckqc
                                            @Override // java.util.function.Function
                                            /* renamed from: andThen */
                                            public final /* synthetic */ Function mo448andThen(Function function) {
                                                return Function$CC.$default$andThen(this, function);
                                            }

                                            @Override // java.util.function.Function
                                            public final Object apply(Object obj3) {
                                                final String str = (String) obj3;
                                                elfl e = elfo.e(Optional.empty());
                                                final ckqe ckqeVar4 = ckqe.this;
                                                final awui awuiVar4 = awuiVar3;
                                                elfl i4 = e.i(new eroh() { // from class: ckpx
                                                    @Override // defpackage.eroh
                                                    public final ListenableFuture a(Object obj4) {
                                                        final awvs awvsVar = (awvs) awvt.c.createBuilder();
                                                        awvsVar.copyOnWrite();
                                                        awvt awvtVar = (awvt) awvsVar.instance;
                                                        String str2 = str;
                                                        str2.getClass();
                                                        awvtVar.d |= 1;
                                                        awvtVar.e = str2;
                                                        awvsVar.copyOnWrite();
                                                        awvt awvtVar2 = (awvt) awvsVar.instance;
                                                        awui awuiVar5 = awuiVar4;
                                                        awuiVar5.getClass();
                                                        awvtVar2.r = awuiVar5;
                                                        awvtVar2.d |= 512;
                                                        awvsVar.b(awuiVar5);
                                                        awxe awxeVar = (awxe) awxf.a.createBuilder();
                                                        awxeVar.copyOnWrite();
                                                        awxf awxfVar = (awxf) awxeVar.instance;
                                                        awuiVar5.getClass();
                                                        awxfVar.c = awuiVar5;
                                                        awxfVar.b |= 1;
                                                        awxf awxfVar2 = (awxf) awxeVar.build();
                                                        awvsVar.copyOnWrite();
                                                        awvt awvtVar3 = (awvt) awvsVar.instance;
                                                        awxfVar2.getClass();
                                                        awvtVar3.p = awxfVar2;
                                                        awvtVar3.d |= 128;
                                                        ((Optional) obj4).ifPresent(new Consumer() { // from class: ckpw
                                                            @Override // java.util.function.Consumer
                                                            /* renamed from: accept */
                                                            public final void o(Object obj5) {
                                                                entd entdVar = ckqe.a;
                                                                String a3 = ((azhq) obj5).a();
                                                                awvs awvsVar2 = awvs.this;
                                                                awvsVar2.copyOnWrite();
                                                                awvt awvtVar4 = (awvt) awvsVar2.instance;
                                                                eygj eygjVar = awvt.a;
                                                                awvtVar4.d |= 2;
                                                                awvtVar4.f = a3;
                                                            }

                                                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                                                return Consumer$CC.$default$andThen(this, consumer);
                                                            }
                                                        });
                                                        return ckqe.this.j.c((awvt) awvsVar.build());
                                                    }
                                                }, ckqeVar4.c);
                                                final bseh bsehVar3 = bsehVar2;
                                                final UUID uuid5 = uuid4;
                                                final ckqh ckqhVar5 = ckqhVar4;
                                                return i4.h(new emwl() { // from class: ckpy
                                                    @Override // defpackage.emwl
                                                    public final Object apply(Object obj4) {
                                                        awud awudVar3 = (awud) obj4;
                                                        boolean o = ckqe.o(awudVar3);
                                                        ckqe ckqeVar5 = ckqe.this;
                                                        UUID uuid6 = uuid5;
                                                        if (!o) {
                                                            ((cknc) ckqeVar5.h.b()).k(uuid6.toString());
                                                            return ceyt.i();
                                                        }
                                                        ckqeVar5.m(bsehVar3, null, uuid6, awudVar3, !ckqhVar5.f);
                                                        return ceyt.k();
                                                    }
                                                }, ckqeVar4.b);
                                            }

                                            public final /* synthetic */ Function compose(Function function) {
                                                return Function$CC.$default$compose(this, function);
                                            }
                                        }).orElseGet(new Supplier() { // from class: ckqd
                                            @Override // java.util.function.Supplier
                                            public final Object get() {
                                                ckqe.this.m(bsehVar2, null, uuid4, null, !ckqhVar4.f);
                                                return elfo.e(ceyt.k());
                                            }
                                        });
                                    }
                                }, ckqeVar2.b);
                            }
                        }, ckqeVar.d).e(avkg.class, new emwl() { // from class: ckqa
                            @Override // defpackage.emwl
                            public final Object apply(Object obj) {
                                return ckqe.this.k(r, (avkg) obj, randomUUID, ckqhVar2);
                            }
                        }, ckqeVar.b).e(cjzk.class, new emwl() { // from class: ckqb
                            @Override // defpackage.emwl
                            public final Object apply(Object obj) {
                                return ckqe.this.k(r, (cjzk) obj, randomUUID, ckqhVar2);
                            }
                        }, ckqeVar.b);
                    case 2:
                    case 3:
                    case 5:
                    case 6:
                        ensk n2 = ckqe.a.n();
                        n2.Y(csux.o, b.toString());
                        n2.Y(csux.G, byyq.a(m));
                        ((ensz) n2.h("com/google/android/apps/messaging/shared/rcs/groups/leave/LeaveRcsGroupConversationHandler", "processPendingWorkItem", 222, "LeaveRcsGroupConversationHandler.java")).q("Leaving RCS group in a join state that should not trigger a server leave group request.");
                        if (ckqe.n(ckqhVar2)) {
                            ((cknc) ckqeVar.h.b()).k(randomUUID.toString());
                            return ckqeVar.l(ckqhVar2, b);
                        }
                        ckqeVar.m(r, null, randomUUID, null, !ckqhVar2.f);
                        return elfo.e(ceyt.k());
                    case 4:
                    case 7:
                    case 8:
                        ensk n3 = ckqe.a.n();
                        n3.Y(csux.o, b.toString());
                        n3.Y(csux.G, byyq.a(m));
                        ((ensz) n3.h("com/google/android/apps/messaging/shared/rcs/groups/leave/LeaveRcsGroupConversationHandler", "processPendingWorkItem", 251, "LeaveRcsGroupConversationHandler.java")).q("Leaving RCS group in a pending setup join state.");
                        ckqeVar.m(r, null, randomUUID, null, !ckqhVar2.f);
                        return elfo.e(ceyt.k());
                    case 9:
                        return elfo.e(ceyt.i());
                    default:
                        throw new IllegalStateException("Unhandled join state while leaving RCS group.");
                }
            }
        }, this.b);
    }

    public final ceyt k(bseh bsehVar, Throwable th, UUID uuid, ckqh ckqhVar) {
        m(bsehVar, th, uuid, null, !ckqhVar.f);
        return ceyt.k();
    }

    public final elfl l(ckqh ckqhVar, ConversationIdType conversationIdType) {
        ensk n = a.n();
        n.Y(csux.o, conversationIdType.toString());
        ensz enszVar = (ensz) n.h("com/google/android/apps/messaging/shared/rcs/groups/leave/LeaveRcsGroupConversationHandler", "deleteConversation", 513, "LeaveRcsGroupConversationHandler.java");
        ckqg b = ckqg.b(ckqhVar.d);
        if (b == null) {
            b = ckqg.UNRECOGNIZED;
        }
        enszVar.t("We have successfully left the conversation. Deleting the conversation with a deletion strategy of %s.", b);
        ayfy ayfyVar = this.l;
        aygb f = aygc.f();
        f.b(conversationIdType);
        eyja eyjaVar = ckqhVar.e;
        if (eyjaVar == null) {
            eyjaVar = eyja.a;
        }
        f.c(eykm.b(eyjaVar));
        ckqg b2 = ckqg.b(ckqhVar.d);
        if (b2 == null) {
            b2 = ckqg.UNRECOGNIZED;
        }
        f.e(b2.equals(ckqg.DELETE_IF_EMPTY));
        f.f(eoko.CONVERSATION_FROM_LIST);
        return ayfyVar.a(f.a()).h(new emwl() { // from class: ckpv
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                entd entdVar = ckqe.a;
                return ceyt.i();
            }
        }, erpp.a);
    }

    public final void m(bseh bsehVar, Throwable th, UUID uuid, awud awudVar, boolean z) {
        ensz enszVar = (ensz) a.j();
        enszVar.Y(csux.o, bsehVar.C().toString());
        enszVar.Y(csux.J, bsehVar.ad());
        enszVar.Y(csux.H, Long.valueOf(bsehVar.v()));
        ((ensz) ((ensz) enszVar.g(th)).h("com/google/android/apps/messaging/shared/rcs/groups/leave/LeaveRcsGroupConversationHandler", "handleLeaveGroupFailed", 556, "LeaveRcsGroupConversationHandler.java")).q("Error while leaving RCS group conversation.");
        if (z) {
            this.m.e(R.string.self_left_group_conversation_failed);
        }
        cknc ckncVar = (cknc) this.h.b();
        String uuid2 = uuid.toString();
        uuid2.getClass();
        cknc.m(ckncVar, uuid2, awudVar, 4);
    }
}
