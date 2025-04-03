package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckyx extends ceut {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/rcs/groups/participants/AddMembersToRcsConversationHandler");
    public final errl b;
    public final errl c;
    public final ffbr d;
    public final ffbr e;
    public final avkj f;
    public final avkc g;
    public final ffbr h;
    public final ffbr i;
    public final avuh j;
    public final ffbr k;
    public final ffbr l;
    public final ffbr m;
    public final atxy n;

    public ckyx(errl errlVar, errl errlVar2, ffbr ffbrVar, ffbr ffbrVar2, avkj avkjVar, avkc avkcVar, ffbr ffbrVar3, ffbr ffbrVar4, avuh avuhVar, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, atxy atxyVar) {
        this.b = errlVar;
        this.c = errlVar2;
        this.d = ffbrVar;
        this.e = ffbrVar2;
        this.f = avkjVar;
        this.g = avkcVar;
        this.h = ffbrVar3;
        this.i = ffbrVar4;
        this.j = avuhVar;
        this.k = ffbrVar5;
        this.l = ffbrVar6;
        this.m = ffbrVar7;
        this.n = atxyVar;
    }

    public static void k(Level level, ConversationIdType conversationIdType, String str, String str2) {
        enrr a2 = a.a(level);
        a2.Y(ente.a, "BugleGroupManagement");
        a2.Y(csux.o, conversationIdType.toString());
        a2.Y(csux.J, str);
        ((enrr) a2.h("com/google/android/apps/messaging/shared/rcs/groups/participants/AddMembersToRcsConversationHandler", "logForLogcat", 631, "AddMembersToRcsConversationHandler.java")).q(str2);
    }

    @Override // defpackage.ceut, defpackage.ceve
    public final cety a() {
        cetx l = cety.l();
        ((ceti) l).c = eogt.ADD_MEMBERS_TO_RCS_CONVERSATION_ACTION;
        return l.h();
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("AddMembersToRcsConversationHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        return ckyz.a.getParserForType();
    }

    @Override // defpackage.ceut
    protected final /* bridge */ /* synthetic */ elfl j(ceuw ceuwVar, eyhs eyhsVar) {
        final ckyz ckyzVar = (ckyz) eyhsVar;
        final ConversationIdType b = bdgq.b(ckyzVar.c);
        return elfo.g(new ckyw(this, b), this.b).i(new eroh() { // from class: ckye
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                elfl d;
                Object apply;
                elfl a2;
                final bseh bsehVar = (bseh) obj;
                if (bsehVar == null) {
                    ckyx.k(Level.WARNING, b, null, "Conversation is null when attempting to add users to RCS group conversation.");
                    return elfo.e(ceyt.k());
                }
                final ckyz ckyzVar2 = ckyzVar;
                final ckyx ckyxVar = ckyx.this;
                final ConversationIdType C = bsehVar.C();
                boolean z = true;
                if ((ckyzVar2.b & 1) != 0) {
                    awui awuiVar = ckyzVar2.e;
                    if (awuiVar == null) {
                        awuiVar = awui.a;
                    }
                    d = elfo.e(Optional.of(awuiVar));
                } else {
                    d = ((ckac) ckyxVar.l.b()).d(bsehVar.C());
                }
                char c = 2;
                if (!((atzz) ckyxVar.m.b()).a() && bsehVar.A().equals(ayhd.RCS_GROUP_SELF_ONLY)) {
                    final axad axadVar = (axad) ckyxVar.j.fP(cslr.a());
                    ((avld) ckyxVar.i.b()).f(emxe.b(bsehVar.ad()), ckyzVar2.d.size(), 2, axadVar);
                    if (emxe.c(bsehVar.ad())) {
                        ckyx.k(Level.WARNING, bsehVar.C(), bsehVar.ad(), "Cannot add users to a conversation without RCS conversation ID.");
                        ((avld) ckyxVar.i.b()).c(emxe.b(bsehVar.ad()), eqww.CHAT_API_INVALID_CONVERSATION_ID, axadVar);
                        return elfo.e(ceyt.k());
                    }
                    ckyx.k(Level.INFO, bsehVar.C(), bsehVar.ad(), "Attempting to re-create the group instead of adding participants to empty group");
                    final String ad = bsehVar.ad();
                    ad.getClass();
                    elfl h = d.h(new emwl() { // from class: ckyi
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            return (awui) ((Optional) obj2).orElseThrow(new Supplier() { // from class: ckxy
                                @Override // java.util.function.Supplier
                                public final Object get() {
                                    return new IllegalStateException("Sender is absent");
                                }
                            });
                        }
                    }, ckyxVar.b).h(new emwl() { // from class: ckyk
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            awui awuiVar2 = (awui) obj2;
                            eygr eygrVar = ckyzVar2.d;
                            awus awusVar = (awus) awut.a.createBuilder();
                            bseh bsehVar2 = bsehVar;
                            String ad2 = bsehVar2.ad();
                            ad2.getClass();
                            awusVar.copyOnWrite();
                            awut awutVar = (awut) awusVar.instance;
                            awutVar.b |= 1;
                            awutVar.c = ad2;
                            awusVar.copyOnWrite();
                            awut.a((awut) awusVar.instance);
                            awusVar.copyOnWrite();
                            awut awutVar2 = (awut) awusVar.instance;
                            axad axadVar2 = axadVar;
                            axadVar2.getClass();
                            awutVar2.e = axadVar2;
                            awutVar2.b |= 4;
                            awut awutVar3 = (awut) awusVar.build();
                            awuv awuvVar = (awuv) awuw.a.createBuilder();
                            String ad3 = bsehVar2.ad();
                            ad3.getClass();
                            awuvVar.copyOnWrite();
                            awuw awuwVar = (awuw) awuvVar.instance;
                            awuwVar.b |= 1;
                            awuwVar.c = ad3;
                            String b2 = emxe.b(bsehVar2.X());
                            awuvVar.copyOnWrite();
                            awuw awuwVar2 = (awuw) awuvVar.instance;
                            awuwVar2.b |= 2;
                            awuwVar2.d = b2;
                            awuvVar.copyOnWrite();
                            awuw awuwVar3 = (awuw) awuvVar.instance;
                            awuiVar2.getClass();
                            awuwVar3.f = awuiVar2;
                            awuwVar3.b |= 8;
                            Stream stream = Collection.EL.stream(eygrVar);
                            final ckyx ckyxVar2 = ckyx.this;
                            Stream map = stream.map(new Function() { // from class: ckxz
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj3) {
                                    return ((aolm) ckyx.this.k.b()).d((aora) obj3);
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            }).map(new Function() { // from class: ckya
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj3) {
                                    return ((aoku) obj3).e();
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            }).map(new Function() { // from class: ckyb
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj3) {
                                    return (awui) ((Optional) obj3).get();
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            });
                            int i = engw.d;
                            awuvVar.a((Iterable) map.collect(endq.a));
                            eyee byteString = awutVar3.toByteString();
                            awuvVar.copyOnWrite();
                            awuw awuwVar4 = (awuw) awuvVar.instance;
                            awuwVar4.b |= 16;
                            awuwVar4.h = byteString;
                            return (awuw) awuvVar.build();
                        }
                    }, ckyxVar.c);
                    final avkj avkjVar = ckyxVar.f;
                    avkjVar.getClass();
                    return h.i(new eroh() { // from class: ckyl
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj2) {
                            return avkj.this.b((awuw) obj2);
                        }
                    }, ckyxVar.c).h(new emwl() { // from class: ckym
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            awud awudVar = ((awuz) obj2).c;
                            if (awudVar == null) {
                                awudVar = awud.a;
                            }
                            awuc awucVar = awuc.OK;
                            awuc b2 = awuc.b(awudVar.c);
                            if (b2 == null) {
                                b2 = awuc.UNKNOWN_STATUS;
                            }
                            String str = ad;
                            bseh bsehVar2 = bsehVar;
                            if (!awucVar.equals(b2)) {
                                awuc awucVar2 = awuc.PENDING;
                                awuc b3 = awuc.b(awudVar.c);
                                if (b3 == null) {
                                    b3 = awuc.UNKNOWN_STATUS;
                                }
                                if (!awucVar2.equals(b3)) {
                                    ensk j = ckyx.a.j();
                                    j.Y(ente.a, "BugleGroupManagement");
                                    enrr enrrVar = (enrr) j;
                                    enrrVar.Y(csux.o, bsehVar2.C().toString());
                                    enrrVar.Y(csux.J, str);
                                    enrr enrrVar2 = (enrr) enrrVar.h("com/google/android/apps/messaging/shared/rcs/groups/participants/AddMembersToRcsConversationHandler", "createGroupWithChatApi", 545, "AddMembersToRcsConversationHandler.java");
                                    awua b4 = awua.b(awudVar.d);
                                    if (b4 == null) {
                                        b4 = awua.UNKNOWN_CAUSE;
                                    }
                                    axad axadVar2 = axadVar;
                                    ckyx ckyxVar2 = ckyx.this;
                                    enrrVar2.t("Failed to fallback addUsersToGroup to createGroup, cause=%s", b4.name());
                                    ((avld) ckyxVar2.i.b()).b(str, awudVar, axadVar2);
                                    return ceyt.k();
                                }
                            }
                            ckyx.k(Level.FINE, bsehVar2.C(), str, "Fallback addUsersToGroup to createGroup request accepted by transport");
                            return ceyt.i();
                        }
                    }, ckyxVar.c).e(IllegalArgumentException.class, new emwl() { // from class: ckyn
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            IllegalArgumentException illegalArgumentException = (IllegalArgumentException) obj2;
                            ensk j = ckyx.a.j();
                            j.Y(ente.a, "BugleGroupManagement");
                            enrr enrrVar = (enrr) ((enrr) j).g(illegalArgumentException);
                            enrrVar.Y(csux.o, bsehVar.C().toString());
                            ensn ensnVar = csux.J;
                            String str = ad;
                            enrrVar.Y(ensnVar, str);
                            ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/rcs/groups/participants/AddMembersToRcsConversationHandler", "createGroupWithChatApi", 562, "AddMembersToRcsConversationHandler.java")).q("Failed to fallback addUsersToGroup to createGroup Chat API rejected the request.");
                            ((avld) ckyx.this.i.b()).c(str, illegalArgumentException instanceof IllegalArgumentException ? eqww.CHAT_API_TRANSPORT_ILLEGAL_ARGUMENTS : eqww.CHAT_API_GENERIC_TRANSPORT_ERROR, axadVar);
                            return ceyt.k();
                        }
                    }, ckyxVar.c);
                }
                final engw engwVar = (engw) Collection.EL.stream(engw.n(ckyzVar2.d)).map(new Function() { // from class: ckyd
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return ((aolm) ckyx.this.k.b()).d((aora) obj2);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).collect(endq.a);
                ckzn ckznVar = (ckzn) ckyxVar.h.b();
                int size = engwVar.size();
                int i = 0;
                emxf.m(size > 0, "Number of users added must be positive.");
                ((akzt) ckznVar.a.b()).e("Bugle.Bugle.Rcs.Groups.AddingUsersToRcsConversation.UserCount", size);
                ckyx.k(Level.FINE, bsehVar.C(), bsehVar.ad(), "Adding users to RCS group using ChatApi");
                if (emxe.c(bsehVar.ad())) {
                    ckyx.k(Level.WARNING, bsehVar.C(), bsehVar.ad(), "Cannot add users to a conversation without RCS conversation ID.");
                    ((akzt) ((ckzn) ckyxVar.h.b()).a.b()).c("Bugle.Bugle.Rcs.Groups.AddingUsersToRcsConversation.NoRcsConversationId");
                    ((cknc) ckyxVar.e.b()).d();
                    a2 = elfo.e(false);
                } else if (emxe.c(bsehVar.ac())) {
                    ckyx.k(Level.WARNING, bsehVar.C(), bsehVar.ad(), "Cannot add users to a conversation without RCS conference URI.");
                    ((akzt) ((ckzn) ckyxVar.h.b()).a.b()).c("Bugle.Bugle.Rcs.Groups.AddingUsersToRcsConversation.NoRcsConferenceUri");
                    ((cknc) ckyxVar.e.b()).d();
                    a2 = elfo.e(false);
                } else if (((ersq) ((atxz) ckyxVar.n).a.b()).a("bugle.add_multiple_group_members_in_single_request")) {
                    a2 = d.i(new eroh() { // from class: ckyp
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj2) {
                            awui awuiVar2 = (awui) ((Optional) obj2).orElseThrow(new Supplier() { // from class: ckyj
                                @Override // java.util.function.Supplier
                                public final Object get() {
                                    return new IllegalStateException("Sender is absent");
                                }
                            });
                            final ckyx ckyxVar2 = ckyx.this;
                            final UUID randomUUID = UUID.randomUUID();
                            ((cknc) ckyxVar2.e.b()).f(randomUUID);
                            bseh bsehVar2 = bsehVar;
                            String ad2 = bsehVar2.ad();
                            ad2.getClass();
                            String ac = bsehVar2.ac();
                            ac.getClass();
                            awwe awweVar = (awwe) awwf.a.createBuilder();
                            awweVar.copyOnWrite();
                            awwf awwfVar = (awwf) awweVar.instance;
                            awwfVar.b |= 1;
                            awwfVar.c = ad2;
                            awui a3 = ckyxVar2.g.a(ac, true);
                            awweVar.copyOnWrite();
                            awwf awwfVar2 = (awwf) awweVar.instance;
                            a3.getClass();
                            awwfVar2.d = a3;
                            awwfVar2.b |= 2;
                            awwf awwfVar3 = (awwf) awweVar.build();
                            Stream map = Collection.EL.stream(engwVar).map(new Function() { // from class: ckyo
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj3) {
                                    Optional e = ((aoku) obj3).e();
                                    final ckyx ckyxVar3 = ckyx.this;
                                    final UUID uuid = randomUUID;
                                    return (awui) e.orElseThrow(new Supplier() { // from class: ckyc
                                        @Override // java.util.function.Supplier
                                        public final Object get() {
                                            ((cknc) ckyx.this.e.b()).e(uuid);
                                            return new IllegalStateException("no RCS identifier found for the participant to add");
                                        }
                                    });
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            });
                            int i2 = engw.d;
                            engw engwVar2 = (engw) map.collect(endq.a);
                            awts awtsVar = (awts) awtt.a.createBuilder();
                            awtsVar.copyOnWrite();
                            awtt awttVar = (awtt) awtsVar.instance;
                            awttVar.b |= 1;
                            awttVar.c = ad2;
                            String uuid = randomUUID.toString();
                            awtsVar.copyOnWrite();
                            awtt awttVar2 = (awtt) awtsVar.instance;
                            uuid.getClass();
                            awttVar2.b |= 2;
                            awttVar2.e = uuid;
                            awtt awttVar3 = (awtt) awtsVar.build();
                            awtu awtuVar = (awtu) awtv.a.createBuilder();
                            awtuVar.copyOnWrite();
                            awtv awtvVar = (awtv) awtuVar.instance;
                            awwfVar3.getClass();
                            awtvVar.c = awwfVar3;
                            awtvVar.b |= 1;
                            awtuVar.copyOnWrite();
                            awtv awtvVar2 = (awtv) awtuVar.instance;
                            awtvVar2.a();
                            eydl.addAll(engwVar2, awtvVar2.d);
                            awtuVar.copyOnWrite();
                            awtv awtvVar3 = (awtv) awtuVar.instance;
                            awuiVar2.getClass();
                            awtvVar3.f = awuiVar2;
                            awtvVar3.b |= 4;
                            eyee byteString = awttVar3.toByteString();
                            awtuVar.copyOnWrite();
                            awtv awtvVar4 = (awtv) awtuVar.instance;
                            awtvVar4.b |= 2;
                            awtvVar4.e = byteString;
                            return ckyxVar2.f.a((awtv) awtuVar.build());
                        }
                    }, ckyxVar.c).h(new emwl() { // from class: ckyq
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            awtx awtxVar = (awtx) obj2;
                            awud awudVar = awtxVar.c;
                            if (awudVar == null) {
                                awudVar = awud.a;
                            }
                            awuc b2 = awuc.b(awudVar.c);
                            if (b2 == null) {
                                b2 = awuc.UNKNOWN_STATUS;
                            }
                            if (b2.equals(awuc.PENDING) || b2.equals(awuc.OK)) {
                                return true;
                            }
                            bseh bsehVar2 = bsehVar;
                            ensk j = ckyx.a.j();
                            j.Y(ente.a, "BugleGroupManagement");
                            enrr enrrVar = (enrr) j;
                            enrrVar.Y(csux.p, bsehVar2.C());
                            enrrVar.Y(csux.J, bsehVar2.ad());
                            enrr enrrVar2 = (enrr) enrrVar.h("com/google/android/apps/messaging/shared/rcs/groups/participants/AddMembersToRcsConversationHandler", "addUsersToGroupWithChatApi", 327, "AddMembersToRcsConversationHandler.java");
                            awud awudVar2 = awtxVar.c;
                            if (awudVar2 == null) {
                                awudVar2 = awud.a;
                            }
                            awua b3 = awua.b(awudVar2.d);
                            if (b3 == null) {
                                b3 = awua.UNKNOWN_CAUSE;
                            }
                            ckyx ckyxVar2 = ckyx.this;
                            enrrVar2.r("Failed to add user to group: %s", b3.v);
                            ((cknc) ckyxVar2.e.b()).c(awtxVar);
                            return false;
                        }
                    }, ckyxVar.c).e(RuntimeException.class, new emwl() { // from class: ckyr
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            ensk j = ckyx.a.j();
                            j.Y(ente.a, "BugleGroupManagement");
                            enrr enrrVar = (enrr) ((enrr) j).g(((RuntimeException) obj2).getCause());
                            bseh bsehVar2 = bsehVar;
                            enrrVar.Y(csux.p, bsehVar2.C());
                            enrrVar.Y(csux.J, bsehVar2.ad());
                            ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/rcs/groups/participants/AddMembersToRcsConversationHandler", "addUsersToGroupWithChatApi", 342, "AddMembersToRcsConversationHandler.java")).q("Failed to addUserToGroup - Chat API rejected the request.");
                            ((cknc) ckyx.this.e.b()).d();
                            return false;
                        }
                    }, ckyxVar.c);
                } else {
                    final ArrayList arrayList = new ArrayList();
                    int size2 = engwVar.size();
                    while (i < size2) {
                        aoku aokuVar = (aoku) engwVar.get(i);
                        ffbr ffbrVar = ckyxVar.e;
                        UUID randomUUID = UUID.randomUUID();
                        ((cknc) ffbrVar.b()).f(randomUUID);
                        String ad2 = bsehVar.ad();
                        ad2.getClass();
                        String ac = bsehVar.ac();
                        ac.getClass();
                        awwe awweVar = (awwe) awwf.a.createBuilder();
                        awweVar.copyOnWrite();
                        char c2 = c;
                        awwf awwfVar = (awwf) awweVar.instance;
                        awwfVar.b |= 1;
                        awwfVar.c = ad2;
                        awui a3 = ckyxVar.g.a(ac, z);
                        awweVar.copyOnWrite();
                        awwf awwfVar2 = (awwf) awweVar.instance;
                        a3.getClass();
                        awwfVar2.d = a3;
                        awwfVar2.b |= 2;
                        final awwf awwfVar3 = (awwf) awweVar.build();
                        if (aokuVar.e().isEmpty()) {
                            ((cknc) ckyxVar.e.b()).e(randomUUID);
                            throw new IllegalStateException("no RCS identifier found for the participant to add");
                        }
                        final awui awuiVar2 = (awui) aokuVar.e().get();
                        awts awtsVar = (awts) awtt.a.createBuilder();
                        awtsVar.copyOnWrite();
                        awtt awttVar = (awtt) awtsVar.instance;
                        awttVar.b |= 1;
                        awttVar.c = ad2;
                        String uuid = randomUUID.toString();
                        awtsVar.copyOnWrite();
                        awtt awttVar2 = (awtt) awtsVar.instance;
                        uuid.getClass();
                        awttVar2.b |= 2;
                        awttVar2.e = uuid;
                        final awtt awttVar3 = (awtt) awtsVar.build();
                        arrayList.add(d.h(new emwl() { // from class: ckyf
                            @Override // defpackage.emwl
                            public final Object apply(Object obj2) {
                                return (awui) ((Optional) obj2).orElseThrow(new Supplier() { // from class: ckyv
                                    @Override // java.util.function.Supplier
                                    public final Object get() {
                                        return new IllegalStateException("Sender is absent");
                                    }
                                });
                            }
                        }, ckyxVar.b).i(new eroh() { // from class: ckyg
                            @Override // defpackage.eroh
                            public final ListenableFuture a(Object obj2) {
                                awui awuiVar3 = (awui) obj2;
                                awtu awtuVar = (awtu) awtv.a.createBuilder();
                                awtuVar.copyOnWrite();
                                awtv awtvVar = (awtv) awtuVar.instance;
                                awwf awwfVar4 = awwfVar3;
                                awwfVar4.getClass();
                                awtvVar.c = awwfVar4;
                                awtvVar.b |= 1;
                                awtuVar.copyOnWrite();
                                awtv awtvVar2 = (awtv) awtuVar.instance;
                                awtvVar2.a();
                                awtvVar2.d.add(awuiVar2);
                                awtuVar.copyOnWrite();
                                awtv awtvVar3 = (awtv) awtuVar.instance;
                                awuiVar3.getClass();
                                awtvVar3.f = awuiVar3;
                                awtvVar3.b |= 4;
                                eyee byteString = awttVar3.toByteString();
                                awtuVar.copyOnWrite();
                                awtv awtvVar4 = (awtv) awtuVar.instance;
                                awtvVar4.b |= 2;
                                awtvVar4.e = byteString;
                                return ckyx.this.f.a((awtv) awtuVar.build());
                            }
                        }, ckyxVar.b));
                        i++;
                        c = c2;
                        z = true;
                    }
                    apply = (((atzz) ckyxVar.m.b()).a() ? new Function() { // from class: ckys
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            return elfo.j((List) obj2);
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    } : new Function() { // from class: ckyt
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            return elfo.l((List) obj2);
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).apply(arrayList);
                    a2 = ((elfn) apply).a(new Callable() { // from class: ckyu
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            awtx awtxVar;
                            int i2 = 0;
                            for (elfl elflVar : arrayList) {
                                bseh bsehVar2 = bsehVar;
                                ckyx ckyxVar2 = ckyx.this;
                                if (((atzz) ckyxVar2.m.b()).a()) {
                                    try {
                                        awtxVar = (awtx) erqt.q(elflVar);
                                    } catch (ExecutionException e) {
                                        ensk j = ckyx.a.j();
                                        j.Y(ente.a, "BugleGroupManagement");
                                        enrr enrrVar = (enrr) ((enrr) j).g(e.getCause());
                                        enrrVar.Y(csux.p, bsehVar2.C());
                                        enrrVar.Y(csux.J, bsehVar2.ad());
                                        ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/rcs/groups/participants/AddMembersToRcsConversationHandler", "addUsersToGroupWithChatApi", 384, "AddMembersToRcsConversationHandler.java")).q("Failed to addUserToGroup - Chat API rejected the request.");
                                        ((cknc) ckyxVar2.e.b()).d();
                                    }
                                } else {
                                    awtxVar = (awtx) erqt.q(elflVar);
                                }
                                awud awudVar = awtxVar.c;
                                if (awudVar == null) {
                                    awudVar = awud.a;
                                }
                                awuc b2 = awuc.b(awudVar.c);
                                if (b2 == null) {
                                    b2 = awuc.UNKNOWN_STATUS;
                                }
                                if (awuc.PENDING.equals(b2) || awuc.OK.equals(b2)) {
                                    i2++;
                                } else {
                                    ckyx.k(Level.WARNING, bsehVar2.C(), bsehVar2.ad(), "Failed to add user to group");
                                    ((cknc) ckyxVar2.e.b()).c(awtxVar);
                                }
                            }
                            return Boolean.valueOf(i2 == engwVar.size());
                        }
                    }, ckyxVar.c);
                }
                return a2.i(new eroh() { // from class: ckyh
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        boolean booleanValue = ((Boolean) obj2).booleanValue();
                        ConversationIdType conversationIdType = ConversationIdType.this;
                        bseh bsehVar2 = bsehVar;
                        if (booleanValue) {
                            ckyx.k(Level.FINE, conversationIdType, bsehVar2.ad(), "Users successfully queued to be added to RCS group conversation.");
                            return elfo.e(ceyt.i());
                        }
                        ckyx.k(Level.FINE, conversationIdType, bsehVar2.ad(), "Users not successfully queued to be added to RCS group conversation.");
                        return elfo.e(ceyt.k());
                    }
                }, ckyxVar.b);
            }
        }, this.c);
    }
}
