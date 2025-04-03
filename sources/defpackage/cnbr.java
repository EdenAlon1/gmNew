package defpackage;

import android.content.ContentValues;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnbr implements cnbg {
    public static final entd a = entd.c("BugleReactions");
    public final dtuu b;
    public final cbgf c;
    public final Set d;
    public final asoe e;
    public final cqoh f;

    public cnbr(dtuu dtuuVar, cbgf cbgfVar, asoe asoeVar, Set set, cqoh cqohVar) {
        this.b = dtuuVar;
        this.c = cbgfVar;
        this.e = asoeVar;
        this.d = set;
        this.f = cqohVar;
    }

    @Override // defpackage.cnbg
    public final void a(final cnbt cnbtVar, final MessageIdType messageIdType) {
        ensz enszVar = (ensz) a.h();
        enszVar.Y(csux.p, cnbtVar.a());
        enszVar.Y(cmsm.e, cnbtVar.b());
        enszVar.Y(cmsm.a, messageIdType);
        ((ensz) enszVar.h("com/google/android/apps/messaging/shared/reactions/transport/handler/ReactionsDatabaseHandlerImpl", "handleReaction", 69, "ReactionsDatabaseHandlerImpl.java")).q("Start persisting a reaction into the database.");
        final Function function = new Function() { // from class: cnbo
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function2) {
                return Function$CC.$default$andThen(this, function2);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                cmre cmreVar = (cmre) ((cmrf) obj).toBuilder();
                long epochMilli = cnbr.this.f.f().toEpochMilli();
                cmreVar.copyOnWrite();
                ((cmrf) cmreVar.instance).c = epochMilli;
                cmrf cmrfVar = (cmrf) cmreVar.build();
                cnbt cnbtVar2 = cnbtVar;
                int ordinal = cnbtVar2.d().ordinal();
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        throw new IllegalArgumentException("Unknown reaction action.");
                    }
                    cmri cmriVar = cnbtVar2.e().c;
                    if (cmriVar == null) {
                        cmriVar = cmri.a;
                    }
                    cmre cmreVar2 = (cmre) cmrfVar.toBuilder();
                    cmrg.a(cmreVar2, cmriVar);
                    return (cmrf) cmreVar2.build();
                }
                cmrl c = cnbtVar2.c();
                cmrs e = cnbtVar2.e();
                cmre cmreVar3 = (cmre) cmrfVar.toBuilder();
                cmri cmriVar2 = e.c;
                if (cmriVar2 == null) {
                    cmriVar2 = cmri.a;
                }
                cmrg.a(cmreVar3, cmriVar2);
                int i = 0;
                while (true) {
                    if (i >= ((cmrf) cmreVar3.instance).b.size()) {
                        cmrn cmrnVar = (cmrn) cmro.a.createBuilder();
                        cmrnVar.copyOnWrite();
                        cmro cmroVar = (cmro) cmrnVar.instance;
                        c.getClass();
                        cmroVar.c = c;
                        cmroVar.b |= 1;
                        cmrnVar.a(e);
                        cmreVar3.b((cmro) cmrnVar.build());
                        break;
                    }
                    cmro a2 = cmreVar3.a(i);
                    cmrl cmrlVar = a2.c;
                    if (cmrlVar == null) {
                        cmrlVar = cmrl.a;
                    }
                    if (cmrlVar.d.equals(c.d)) {
                        cmrn cmrnVar2 = (cmrn) a2.toBuilder();
                        cmrnVar2.a(e);
                        cmreVar3.d(i, cmrnVar2);
                        break;
                    }
                    i++;
                }
                return (cmrf) cmreVar3.build();
            }

            public final /* synthetic */ Function compose(Function function2) {
                return Function$CC.$default$compose(this, function2);
            }
        };
        this.b.d("ReactionsDbHandler#updateReactionsTable", new Runnable() { // from class: cnbp
            @Override // java.lang.Runnable
            public final void run() {
                cmrl c;
                final cnbr cnbrVar = cnbr.this;
                final cnbt cnbtVar2 = cnbtVar;
                if (cnbrVar.e.a()) {
                    final ConversationIdType a2 = cnbtVar2.a();
                    String[] strArr = bueg.a;
                    bued buedVar = new bued();
                    buedVar.ap("removeExistingReactionAnimationEffectFromConversation");
                    buedVar.f(new Function() { // from class: cnbq
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function2) {
                            return Function$CC.$default$andThen(this, function2);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            buef buefVar = (buef) obj;
                            entd entdVar = cnbr.a;
                            bueb a3 = bueg.a();
                            a3.f(new Function() { // from class: cnbj
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function2) {
                                    return Function$CC.$default$andThen(this, function2);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj2) {
                                    buef buefVar2 = (buef) obj2;
                                    int intValue = bueg.c().intValue();
                                    if (intValue < 59520) {
                                        dtub.w("animation_effect", intValue);
                                    }
                                    buefVar2.aq(new dtrx("message_reactions.animation_effect", 6));
                                    return buefVar2;
                                }

                                public final /* synthetic */ Function compose(Function function2) {
                                    return Function$CC.$default$compose(this, function2);
                                }
                            });
                            a3.e(new Function() { // from class: cnbk
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function2) {
                                    return Function$CC.$default$andThen(this, function2);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj2) {
                                    entd entdVar2 = cnbr.a;
                                    return ((budk) obj2).b;
                                }

                                public final /* synthetic */ Function compose(Function function2) {
                                    return Function$CC.$default$compose(this, function2);
                                }
                            });
                            buxo d = MessagesTable.d();
                            d.c(MessagesTable.c.a);
                            final ConversationIdType conversationIdType = ConversationIdType.this;
                            d.h(new Function() { // from class: cnbl
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function2) {
                                    return Function$CC.$default$andThen(this, function2);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj2) {
                                    buxz buxzVar = (buxz) obj2;
                                    entd entdVar2 = cnbr.a;
                                    buxzVar.m(ConversationIdType.this);
                                    return buxzVar;
                                }

                                public final /* synthetic */ Function compose(Function function2) {
                                    return Function$CC.$default$compose(this, function2);
                                }
                            });
                            a3.D(dtvz.i(d.b(), MessagesTable.c.a, bueg.c.b).g());
                            buefVar.aq(new dtru("message_reactions.message_id", 3, a3.b()));
                            return buefVar;
                        }

                        public final /* synthetic */ Function compose(Function function2) {
                            return Function$CC.$default$compose(this, function2);
                        }
                    });
                    buedVar.d();
                    buedVar.a().e();
                }
                final MessageIdType messageIdType2 = messageIdType;
                final Function function2 = function;
                bueg.f(cnbtVar2.b(), new Consumer() { // from class: cnbm
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        Object apply;
                        entd entdVar = cnbr.a;
                        cmrf m = ((buco) obj).m();
                        if (m == null) {
                            m = cmrf.a;
                        }
                        cnbt cnbtVar3 = cnbtVar2;
                        apply = Function.this.apply(m);
                        String[] strArr2 = bueg.a;
                        bued buedVar2 = new bued();
                        buedVar2.ap("updateReactedMessage");
                        buedVar2.e((cmrf) apply);
                        if (asmw.a() && cnbtVar3.d() == cmrm.ADD_REACTION) {
                            cmrl c2 = cnbtVar3.c();
                            int intValue = bueg.c().intValue();
                            int intValue2 = bueg.c().intValue();
                            if (intValue2 < 59520) {
                                dtub.w("animation_effect", intValue2);
                            }
                            if (intValue >= 59520) {
                                if (c2 == null) {
                                    buedVar2.a.putNull("animation_effect");
                                } else {
                                    buedVar2.a.put("animation_effect", c2.toByteArray());
                                }
                            }
                        }
                        buedVar2.c(cnbtVar3.b());
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                }, new Runnable() { // from class: cnbn
                    @Override // java.lang.Runnable
                    public final void run() {
                        Object apply;
                        entd entdVar = cnbr.a;
                        apply = Function.this.apply(cmrf.a);
                        String[] strArr2 = bueg.a;
                        buct buctVar = new buct();
                        cnbt cnbtVar3 = cnbtVar2;
                        buctVar.e(cnbtVar3.b());
                        buctVar.h((cmrf) apply);
                        if (asmw.a() && cnbtVar3.d() == cmrm.ADD_REACTION) {
                            buctVar.c(cnbtVar3.c());
                        }
                        buctVar.a().s();
                    }
                });
                if (!messageIdType2.c()) {
                    int ordinal = cnbtVar2.d().ordinal();
                    if (ordinal == 1) {
                        c = cnbtVar2.c();
                    } else {
                        if (ordinal != 2) {
                            throw new IllegalArgumentException("Could not get reaction for action: " + cnbtVar2.d().a());
                        }
                        c = cmrq.a(cmrv.REACTION_TYPE_UNSPECIFIED);
                    }
                    buct buctVar = new buct();
                    buctVar.e(messageIdType2);
                    buctVar.f(cnbtVar2.b());
                    buctVar.d(c);
                    cmrv b = cmrv.b(c.e);
                    if (b == null) {
                        b = cmrv.UNRECOGNIZED;
                    }
                    buctVar.g(b);
                    final buco a3 = buctVar.a();
                    final dtve b2 = bueg.b();
                    dtub.b(bueg.b(), "message_reactions", a3, new Function() { // from class: buch
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function3) {
                            return Function$CC.$default$andThen(this, function3);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return Long.valueOf(dtve.this.T("message_reactions", (ContentValues) obj, 5));
                        }

                        public final /* synthetic */ Function compose(Function function3) {
                            return Function$CC.$default$compose(this, function3);
                        }
                    }, new Consumer() { // from class: buci
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void o(Object obj) {
                            buco.this.r((Long) obj);
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                }
                cnbrVar.b.g(new dtut() { // from class: cnbh
                    @Override // defpackage.dtut
                    public final ekzz a() {
                        entd entdVar = cnbr.a;
                        return eleg.f("RDHI::updateReactionsTable::runAfterCommit");
                    }
                }, "reactionFor".concat(String.valueOf(cnbtVar2.b().b())), new Runnable() { // from class: cnbi
                    @Override // java.lang.Runnable
                    public final void run() {
                        cnbt cnbtVar3 = cnbtVar2;
                        cnbr cnbrVar2 = cnbr.this;
                        cnbrVar2.c.l(cnbtVar3.a(), cnbtVar3.b(), new String[0]);
                        ensz enszVar2 = (ensz) cnbr.a.h();
                        enszVar2.Y(csux.p, cnbtVar3.a());
                        enszVar2.Y(cmsm.e, cnbtVar3.b());
                        enszVar2.Y(cmsm.a, messageIdType2);
                        ((ensz) enszVar2.h("com/google/android/apps/messaging/shared/reactions/transport/handler/ReactionsDatabaseHandlerImpl", "updateReactionsTable", 128, "ReactionsDatabaseHandlerImpl.java")).q("Persisted reaction in the database. Notifying about message change.");
                        enqu listIterator = ((enpx) cnbrVar2.d).listIterator();
                        while (listIterator.hasNext()) {
                            ((bdfl) ((cnbu) listIterator.next()).a.b()).b(cnbtVar3.a(), false, byyt.UNARCHIVED);
                        }
                    }
                });
            }
        });
    }
}
