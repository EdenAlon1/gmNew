package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.HashSet;
import java.util.concurrent.Callable;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clan extends ceut {
    public static final entd a = entd.c("BugleGroupManagement");
    public final errl b;
    public final avkj c;
    public final ffbr d;
    public final clbd e;
    public final akzt f;
    private final errl g;

    public clan(errl errlVar, errl errlVar2, avkj avkjVar, ffbr ffbrVar, clbd clbdVar, akzt akztVar) {
        this.g = errlVar;
        this.b = errlVar2;
        this.c = avkjVar;
        this.d = ffbrVar;
        this.e = clbdVar;
        this.f = akztVar;
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("RecoverDisabledRcsGroupHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        return claq.a.getParserForType();
    }

    @Override // defpackage.ceut
    protected final /* bridge */ /* synthetic */ elfl j(ceuw ceuwVar, eyhs eyhsVar) {
        final claq claqVar = (claq) eyhsVar;
        final ConversationIdType b = bdgq.b(claqVar.c);
        if (!b.b()) {
            return elfo.g(new Callable() { // from class: claj
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    entd entdVar = clan.a;
                    bsob e = bsom.e();
                    e.z("RecoverdisabledRcsGroupHandler#getConversation-conversations1");
                    bskp bskpVar = bsom.c;
                    e.c(bskpVar.a, bskpVar.b, bskpVar.aa, bskpVar.ab, bskpVar.N);
                    final ConversationIdType conversationIdType = ConversationIdType.this;
                    e.i(new Function() { // from class: clai
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            bsol bsolVar = (bsol) obj;
                            entd entdVar2 = clan.a;
                            bsolVar.q(ConversationIdType.this);
                            bsolVar.j(2);
                            return bsolVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    return Optional.ofNullable((bseh) ((bskr) e.b().o()).cS());
                }
            }, this.g).i(new eroh() { // from class: clak
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    Optional optional = (Optional) obj;
                    boolean isEmpty = optional.isEmpty();
                    final clan clanVar = clan.this;
                    final ConversationIdType conversationIdType = b;
                    char c = 2;
                    if (isEmpty) {
                        ensz enszVar = (ensz) clan.a.j();
                        enszVar.Y(csux.o, conversationIdType.toString());
                        ((ensz) enszVar.h("com/google/android/apps/messaging/shared/rcs/groups/recovery/RecoverDisabledRcsGroupHandler", "processPendingWorkItemAsync", 108, "RecoverDisabledRcsGroupHandler.java")).q("Skipping recovering conversation because could not retrieve ConversationsTable bind data");
                        clanVar.f.e("Bugle.Rcs.Groups.Recovery.Disabled.Cause", 2);
                        return elfo.e(ceyt.k());
                    }
                    final String ad = ((bseh) optional.get()).ad();
                    String ac = ((bseh) optional.get()).ac();
                    if (emxe.c(ad)) {
                        ensz enszVar2 = (ensz) clan.a.j();
                        enszVar2.Y(csux.o, conversationIdType.toString());
                        enszVar2.Y(csux.J, ad);
                        ((ensz) enszVar2.h("com/google/android/apps/messaging/shared/rcs/groups/recovery/RecoverDisabledRcsGroupHandler", "processPendingWorkItemAsync", 125, "RecoverDisabledRcsGroupHandler.java")).q("Skipping conversation because we do not have valid group ID. Updating join state to CONVERSATION_JOIN_STATE_DIFFERENT_CONFIG");
                        String[] strArr = bsom.a;
                        bsoe bsoeVar = new bsoe();
                        bsoeVar.ap("RecoverDisabledRcsGroupHandler.processPendingWorkItemAsync-conversationw1");
                        bsoeVar.A(3);
                        bsoeVar.f(((bseh) optional.get()).C());
                        clanVar.f.e("Bugle.Rcs.Groups.Recovery.Disabled.Cause", 3);
                        return elfo.e(ceyt.i());
                    }
                    char c2 = 4;
                    if (emxe.c(ac)) {
                        ensz enszVar3 = (ensz) clan.a.j();
                        enszVar3.Y(csux.o, conversationIdType.toString());
                        enszVar3.Y(csux.J, ad);
                        ((ensz) enszVar3.h("com/google/android/apps/messaging/shared/rcs/groups/recovery/RecoverDisabledRcsGroupHandler", "processPendingWorkItemAsync", 145, "RecoverDisabledRcsGroupHandler.java")).q("Skipping conversation because we do not have valid conference URI.");
                        if (((bseh) optional.get()).m() == 4) {
                            String[] strArr2 = bsom.a;
                            bsoe bsoeVar2 = new bsoe();
                            bsoeVar2.ap("RecoverDisabledRcsGroupHandler#processPendingWorkItemAsync-conversationw2");
                            bsoeVar2.A(3);
                            bsoeVar2.f(((bseh) optional.get()).C());
                            clanVar.f.e("Bugle.Rcs.Groups.Recovery.Disabled.Cause", 4);
                            ((ensz) ((ensz) clan.a.j()).h("com/google/android/apps/messaging/shared/rcs/groups/recovery/RecoverDisabledRcsGroupHandler", "processPendingWorkItemAsync", 156, "RecoverDisabledRcsGroupHandler.java")).q("Updating join state to CONVERSATION_JOIN_STATE_DIFFERENT_CONFIG");
                        }
                        return elfo.e(ceyt.i());
                    }
                    bsob e = bsom.e();
                    e.z("conversationIsCorruptAndShouldNotBeRecovered");
                    bskp bskpVar = bsom.c;
                    int i = 0;
                    e.c(bskpVar.a, bskpVar.b);
                    e.i(new Function() { // from class: clam
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            bsol bsolVar = (bsol) obj2;
                            entd entdVar = clan.a;
                            bsolVar.E(ad);
                            return bsolVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    engw y = e.b().y();
                    enou enouVar = (enou) y;
                    if (enouVar.c > 1) {
                        HashSet hashSet = new HashSet();
                        int i2 = enouVar.c;
                        while (i < i2) {
                            bseh bsehVar = (bseh) y.get(i);
                            char c3 = c;
                            char c4 = c2;
                            clav clavVar = (clav) clanVar.e.a(bsehVar.M());
                            if (!clavVar.a.isEmpty()) {
                                clat clatVar = (clat) clavVar.a.get();
                                if (ad.equals(clatVar.c)) {
                                    if (hashSet.contains(clatVar.b)) {
                                        ensz enszVar4 = (ensz) clan.a.j();
                                        enszVar4.Y(csux.o, bsehVar.C().toString());
                                        enszVar4.Y(csux.J, ad);
                                        ((ensz) enszVar4.h("com/google/android/apps/messaging/shared/rcs/groups/recovery/RecoverDisabledRcsGroupHandler", "conversationIsCorruptAndShouldNotBeRecovered", 285, "RecoverDisabledRcsGroupHandler.java")).q("Skipping conversation because RCS group is forked.");
                                    } else {
                                        hashSet.add(clatVar.b);
                                        i++;
                                        c = c3;
                                        c2 = c4;
                                    }
                                }
                            }
                            return elfo.e(ceyt.k());
                        }
                    }
                    awui awuiVar = claqVar.d;
                    if (awuiVar == null) {
                        awuiVar = awui.a;
                    }
                    awwe awweVar = (awwe) awwf.a.createBuilder();
                    awweVar.copyOnWrite();
                    awwf awwfVar = (awwf) awweVar.instance;
                    ad.getClass();
                    awwfVar.b |= 1;
                    awwfVar.c = ad;
                    awui a2 = ((avkc) clanVar.d.b()).a(ac, true);
                    awweVar.copyOnWrite();
                    awwf awwfVar2 = (awwf) awweVar.instance;
                    a2.getClass();
                    awwfVar2.d = a2;
                    awwfVar2.b |= 2;
                    awwf awwfVar3 = (awwf) awweVar.build();
                    axag axagVar = (axag) axah.a.createBuilder();
                    axagVar.copyOnWrite();
                    axah axahVar = (axah) axagVar.instance;
                    ad.getClass();
                    axahVar.b |= 1;
                    axahVar.c = ad;
                    axah axahVar2 = (axah) axagVar.build();
                    axai axaiVar = (axai) axaj.a.createBuilder();
                    axaiVar.copyOnWrite();
                    axaj axajVar = (axaj) axaiVar.instance;
                    awwfVar3.getClass();
                    axajVar.c = awwfVar3;
                    axajVar.b |= 1;
                    axaiVar.copyOnWrite();
                    axaj axajVar2 = (axaj) axaiVar.instance;
                    awuiVar.getClass();
                    axajVar2.e = awuiVar;
                    axajVar2.b |= 4;
                    eyee byteString = axahVar2.toByteString();
                    axaiVar.copyOnWrite();
                    axaj axajVar3 = (axaj) axaiVar.instance;
                    axajVar3.b |= 2;
                    axajVar3.d = byteString;
                    return clanVar.c.f((axaj) axaiVar.build()).h(new emwl() { // from class: clal
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            awud awudVar = ((axal) obj2).c;
                            if (awudVar == null) {
                                awudVar = awud.a;
                            }
                            awuc awucVar = awuc.PENDING;
                            awuc b2 = awuc.b(awudVar.c);
                            if (b2 == null) {
                                b2 = awuc.UNKNOWN_STATUS;
                            }
                            String str = ad;
                            ConversationIdType conversationIdType2 = conversationIdType;
                            if (!awucVar.equals(b2)) {
                                awuc awucVar2 = awuc.OK;
                                awuc b3 = awuc.b(awudVar.c);
                                if (b3 == null) {
                                    b3 = awuc.UNKNOWN_STATUS;
                                }
                                if (!awucVar2.equals(b3)) {
                                    ensz enszVar5 = (ensz) clan.a.j();
                                    enszVar5.Y(csux.o, conversationIdType2.toString());
                                    enszVar5.Y(csux.J, str);
                                    ensz enszVar6 = (ensz) enszVar5.h("com/google/android/apps/messaging/shared/rcs/groups/recovery/RecoverDisabledRcsGroupHandler", "recoverDisabledRcsGroupWithChatApi", 213, "RecoverDisabledRcsGroupHandler.java");
                                    awua b4 = awua.b(awudVar.d);
                                    if (b4 == null) {
                                        b4 = awua.UNKNOWN_CAUSE;
                                    }
                                    clan clanVar2 = clan.this;
                                    enszVar6.t("Failed to recover disabled RCS group with ChatApi. Cause: %s", b4.name());
                                    clanVar2.f.e("Bugle.Rcs.Groups.Recovery.Disabled.Cause", 5);
                                    return ceyt.k();
                                }
                            }
                            ensk n = clan.a.n();
                            n.Y(csux.o, conversationIdType2.toString());
                            n.Y(csux.J, str);
                            ((ensz) n.h("com/google/android/apps/messaging/shared/rcs/groups/recovery/RecoverDisabledRcsGroupHandler", "recoverDisabledRcsGroupWithChatApi", 205, "RecoverDisabledRcsGroupHandler.java")).q("Successfully initiated recovering a disabled RCs group with ChatApi.");
                            return ceyt.i();
                        }
                    }, clanVar.b);
                }
            }, this.g);
        }
        ((ensz) ((ensz) a.j()).h("com/google/android/apps/messaging/shared/rcs/groups/recovery/RecoverDisabledRcsGroupHandler", "processPendingWorkItemAsync", 97, "RecoverDisabledRcsGroupHandler.java")).q("Skipping recovering conversation because conversation ID is empty");
        return elfo.e(ceyt.k());
    }
}
