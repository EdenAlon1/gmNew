package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.function.Consumer$CC;
import java.util.concurrent.Callable;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckzj extends ceut {
    public static final entd a = entd.c("BugleGroupManagement");
    public final errl b;
    public final errl c;
    public final ffbr d;
    public final ffbr e;
    public final avkj f;
    public final ffbr g;
    public final ffbr h;
    public final ffbr i;

    public ckzj(errl errlVar, errl errlVar2, ffbr ffbrVar, ffbr ffbrVar2, avkj avkjVar, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5) {
        this.b = errlVar;
        this.c = errlVar2;
        this.d = ffbrVar;
        this.e = ffbrVar2;
        this.f = avkjVar;
        this.g = ffbrVar3;
        this.h = ffbrVar4;
        this.i = ffbrVar5;
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("RemoveMembersFromRcsConversationHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        return ckzl.a.getParserForType();
    }

    @Override // defpackage.ceut
    protected final /* bridge */ /* synthetic */ elfl j(ceuw ceuwVar, eyhs eyhsVar) {
        final ckzl ckzlVar = (ckzl) eyhsVar;
        final ConversationIdType b = bdgq.b(ckzlVar.c);
        return elfo.g(new ckzi(this, b), this.b).i(new eroh() { // from class: ckzf
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final bseh bsehVar = (bseh) obj;
                if (bsehVar == null) {
                    ConversationIdType conversationIdType = b;
                    ensz enszVar = (ensz) ckzj.a.j();
                    enszVar.Y(csux.o, conversationIdType.toString());
                    enszVar.Y(csux.J, null);
                    ((ensz) enszVar.h("com/google/android/apps/messaging/shared/rcs/groups/participants/RemoveMembersFromRcsConversationHandler", "processPendingWorkItemAsync", 116, "RemoveMembersFromRcsConversationHandler.java")).q("Conversation is null when attempting to remove users from RCS group conversation.");
                    return elfo.e(ceyt.k());
                }
                final ckzl ckzlVar2 = ckzlVar;
                emxf.a(1 == (ckzlVar2.b & 1));
                final String str = ckzlVar2.e;
                awui awuiVar = ckzlVar2.d;
                if (awuiVar == null) {
                    awuiVar = awui.a;
                }
                final awui awuiVar2 = awuiVar;
                axad axadVar = ckzlVar2.f;
                if (axadVar == null) {
                    axadVar = axad.a;
                }
                final axad axadVar2 = axadVar;
                final ckzj ckzjVar = ckzj.this;
                if (emxe.c(bsehVar.ad())) {
                    ((cknc) ckzjVar.e.b()).l(axadVar2, eqww.CHAT_API_INVALID_CONVERSATION_ID);
                    throw new IllegalStateException("No RCS group ID found for the conversation.");
                }
                if (emxe.c(bsehVar.ac())) {
                    ((cknc) ckzjVar.e.b()).l(axadVar2, eqww.CHAT_API_INVALID_CONFERENCE_URI);
                    throw new IllegalStateException("No RCS conference ID found for the conversation.");
                }
                final String ad = bsehVar.ad();
                ad.getClass();
                String ac = bsehVar.ac();
                ac.getClass();
                final awwf a2 = ((avkf) ckzjVar.g.b()).a(ad, ac);
                elfl i = elfo.g(new Callable() { // from class: ckze
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return ((bdrr) ckzj.this.i.b()).b(str);
                    }
                }, ckzjVar.b).i(new eroh() { // from class: ckzg
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        final ckzj ckzjVar2 = ckzj.this;
                        axad axadVar3 = axadVar2;
                        ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) obj2;
                        if (bindData == null) {
                            ((cknc) ckzjVar2.e.b()).l(axadVar3, eqww.CHAT_API_INVALID_REMOTE_PARTICIPANT);
                            throw new IllegalStateException("Could not resolve Recipient for given bugleParticipantId.");
                        }
                        aoku q = ((aolr) ckzjVar2.h.b()).q(bindData);
                        if (q.e().isEmpty()) {
                            ((cknc) ckzjVar2.e.b()).l(axadVar3, eqww.CHAT_API_REMOTE_PARTICIPANT_NOT_RCS_CAPABLE);
                            throw new IllegalStateException("no RCS identifier found for the participant to remove");
                        }
                        final awui awuiVar3 = awuiVar2;
                        final awwf awwfVar = a2;
                        String str2 = ad;
                        String str3 = str;
                        final awui awuiVar4 = (awui) q.e().get();
                        awyi awyiVar = (awyi) awyj.a.createBuilder();
                        awyiVar.copyOnWrite();
                        awyj awyjVar = (awyj) awyiVar.instance;
                        awyjVar.b |= 1;
                        awyjVar.c = str2;
                        awyiVar.copyOnWrite();
                        awyj awyjVar2 = (awyj) awyiVar.instance;
                        str3.getClass();
                        awyjVar2.b |= 2;
                        awyjVar2.d = str3;
                        awyiVar.copyOnWrite();
                        awyj awyjVar3 = (awyj) awyiVar.instance;
                        axadVar3.getClass();
                        awyjVar3.f = axadVar3;
                        awyjVar3.b |= 16;
                        final awyj awyjVar4 = (awyj) awyiVar.build();
                        return elfo.h(new erog() { // from class: ckzh
                            @Override // defpackage.erog
                            public final ListenableFuture a() {
                                awyk awykVar = (awyk) awyl.a.createBuilder();
                                awykVar.copyOnWrite();
                                awyl awylVar = (awyl) awykVar.instance;
                                awwf awwfVar2 = awwfVar;
                                awwfVar2.getClass();
                                awylVar.c = awwfVar2;
                                awylVar.b |= 1;
                                awykVar.a(awuiVar4);
                                awyj awyjVar5 = awyjVar4;
                                eyee byteString = awyjVar5.toByteString();
                                awykVar.copyOnWrite();
                                awyl awylVar2 = (awyl) awykVar.instance;
                                awylVar2.b |= 2;
                                awylVar2.e = byteString;
                                awykVar.copyOnWrite();
                                awyl awylVar3 = (awyl) awykVar.instance;
                                awui awuiVar5 = awuiVar3;
                                awuiVar5.getClass();
                                awylVar3.f = awuiVar5;
                                awylVar3.b |= 4;
                                axad axadVar4 = awyjVar5.f;
                                if (axadVar4 == null) {
                                    axadVar4 = axad.a;
                                }
                                ckzj ckzjVar3 = ckzj.this;
                                awykVar.copyOnWrite();
                                awyl awylVar4 = (awyl) awykVar.instance;
                                axadVar4.getClass();
                                awylVar4.g = axadVar4;
                                awylVar4.b |= 8;
                                return ckzjVar3.f.c((awyl) awykVar.build());
                            }
                        }, ckzjVar2.b);
                    }
                }, ckzjVar.b).i(new eroh() { // from class: ckzb
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        awyn awynVar = (awyn) obj2;
                        awud awudVar = awynVar.c;
                        if (awudVar == null) {
                            awudVar = awud.a;
                        }
                        awuc b2 = awuc.b(awudVar.c);
                        if (b2 == null) {
                            b2 = awuc.UNKNOWN_STATUS;
                        }
                        bseh bsehVar2 = bsehVar;
                        if (b2.equals(awuc.PENDING) || b2.equals(awuc.OK)) {
                            ensz enszVar2 = (ensz) ckzj.a.e();
                            enszVar2.Y(csux.p, bsehVar2.C());
                            enszVar2.Y(csux.J, bsehVar2.ad());
                            ((ensz) enszVar2.h("com/google/android/apps/messaging/shared/rcs/groups/participants/RemoveMembersFromRcsConversationHandler", "removeUserFromValidRcsGroupConversation", 141, "RemoveMembersFromRcsConversationHandler.java")).q("Users successfully queued to be removed from RCS group conversation.");
                            return elfo.e(ceyt.i());
                        }
                        ckzl ckzlVar3 = ckzlVar2;
                        ckzj ckzjVar2 = ckzj.this;
                        ensz enszVar3 = (ensz) ckzj.a.e();
                        enszVar3.Y(csux.p, bsehVar2.C());
                        enszVar3.Y(csux.J, bsehVar2.ad());
                        ((ensz) enszVar3.h("com/google/android/apps/messaging/shared/rcs/groups/participants/RemoveMembersFromRcsConversationHandler", "removeUserFromValidRcsGroupConversation", 149, "RemoveMembersFromRcsConversationHandler.java")).q("Users not successfully queued to be removed from RCS group conversation.");
                        cknc ckncVar = (cknc) ckzjVar2.e.b();
                        axad axadVar3 = ckzlVar3.f;
                        if (axadVar3 == null) {
                            axadVar3 = axad.a;
                        }
                        axad axadVar4 = axadVar3;
                        awud awudVar2 = awynVar.c;
                        if (awudVar2 == null) {
                            awudVar2 = awud.a;
                        }
                        axadVar4.getClass();
                        cknc.r(ckncVar, 19, 3, null, axadVar4, null, ckncVar.n(3, awudVar2), 20);
                        return elfo.e(ceyt.k());
                    }
                }, ckzjVar.c);
                i.k(new csvw(new Consumer() { // from class: ckzc
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj2) {
                        entd entdVar = ckzj.a;
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                }, new Consumer() { // from class: ckzd
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj2) {
                        cknc ckncVar = (cknc) ckzj.this.e.b();
                        axad axadVar3 = ckzlVar2.f;
                        if (axadVar3 == null) {
                            axadVar3 = axad.a;
                        }
                        axadVar3.getClass();
                        ckncVar.l(axadVar3, eqww.CHAT_API_ERROR_CAUSE_UNKNOWN);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                }), ckzjVar.c);
                return i;
            }
        }, this.c);
    }
}
