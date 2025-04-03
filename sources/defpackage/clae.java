package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.concurrent.Callable;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clae extends ceut {
    public static final entd a = entd.c("BugleGroupManagement");
    public final errl b;
    public final cbgf c;
    public final akzt d;
    private final errl e;

    public clae(errl errlVar, errl errlVar2, cbgf cbgfVar, akzt akztVar) {
        this.e = errlVar;
        this.b = errlVar2;
        this.c = cbgfVar;
        this.d = akztVar;
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("RecoverChatApiToVanillaRcsDowngradedRcsGroupHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        return clag.a.getParserForType();
    }

    @Override // defpackage.ceut
    protected final /* bridge */ /* synthetic */ elfl j(ceuw ceuwVar, eyhs eyhsVar) {
        final ConversationIdType b = bdgq.b(((clag) eyhsVar).b);
        if (!b.b()) {
            return elfo.g(new Callable() { // from class: ckzz
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    entd entdVar = clae.a;
                    bsob e = bsom.e();
                    e.z("RecoverChatApiToVanillaRcsDowngradedRcsGroupHandler#getConversation");
                    e.f(new Function() { // from class: clab
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            entd entdVar2 = clae.a;
                            return new bskq[]{((bskp) obj).a, bsom.c.aa, bsom.c.ab};
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    final ConversationIdType conversationIdType = ConversationIdType.this;
                    e.i(new Function() { // from class: clac
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            bsol bsolVar = (bsol) obj;
                            entd entdVar2 = clae.a;
                            bsolVar.q(ConversationIdType.this);
                            return bsolVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    return Optional.ofNullable((bseh) ((bskr) e.b().o()).cS());
                }
            }, this.b).i(new eroh() { // from class: claa
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    Optional optional = (Optional) obj;
                    boolean isEmpty = optional.isEmpty();
                    final clae claeVar = clae.this;
                    final ConversationIdType conversationIdType = b;
                    if (isEmpty) {
                        ensk n = clae.a.n();
                        n.Y(csux.o, conversationIdType.toString());
                        ((ensz) n.h("com/google/android/apps/messaging/shared/rcs/groups/recovery/RecoverChatApiToVanillaRcsDowngradedRcsGroupHandler", "processPendingWorkItemAsync", 93, "RecoverChatApiToVanillaRcsDowngradedRcsGroupHandler.java")).q("Skipping recovering ChatAPI to Vanilla RCS downgraded conversation because could not retrieve ConversationsTable bind data");
                        claeVar.d.e("Bugle.Rcs.Groups.Recovery.Disabled.Cause", 2);
                        return elfo.e(ceyt.k());
                    }
                    String ad = ((bseh) optional.get()).ad();
                    String ac = ((bseh) optional.get()).ac();
                    if (emxe.c(ad)) {
                        ensk n2 = clae.a.n();
                        n2.Y(csux.o, conversationIdType.toString());
                        n2.Y(csux.J, ad);
                        ((ensz) n2.h("com/google/android/apps/messaging/shared/rcs/groups/recovery/RecoverChatApiToVanillaRcsDowngradedRcsGroupHandler", "processPendingWorkItemAsync", 110, "RecoverChatApiToVanillaRcsDowngradedRcsGroupHandler.java")).q("Skipping recovering ChatAPI to Vanilla RCS downgraded conversation because we do not have valid group ID.");
                        claeVar.d.e("Bugle.Rcs.Groups.Recovery.Disabled.Cause", 3);
                        return elfo.e(ceyt.k());
                    }
                    if (!emxe.c(ac)) {
                        ensk n3 = clae.a.n();
                        n3.Y(csux.o, conversationIdType.toString());
                        n3.Y(csux.J, ad);
                        ((ensz) n3.h("com/google/android/apps/messaging/shared/rcs/groups/recovery/RecoverChatApiToVanillaRcsDowngradedRcsGroupHandler", "processPendingWorkItemAsync", 137, "RecoverChatApiToVanillaRcsDowngradedRcsGroupHandler.java")).q("Bugle is using ChatAPI but the conversation was disabled due to a prior downgrade to Vanilla RCS. Enabling the group.");
                        return elfo.g(new Callable() { // from class: clad
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                String[] strArr = bsom.a;
                                bsoe bsoeVar = new bsoe();
                                bsoeVar.ap("YYYYY");
                                bsoeVar.A(0);
                                ConversationIdType conversationIdType2 = conversationIdType;
                                bsoeVar.f(conversationIdType2);
                                clae.this.c.d(conversationIdType2);
                                return ceyt.i();
                            }
                        }, claeVar.b);
                    }
                    ensk n4 = clae.a.n();
                    n4.Y(csux.o, conversationIdType.toString());
                    n4.Y(csux.J, ad);
                    ((ensz) n4.h("com/google/android/apps/messaging/shared/rcs/groups/recovery/RecoverChatApiToVanillaRcsDowngradedRcsGroupHandler", "processPendingWorkItemAsync", 124, "RecoverChatApiToVanillaRcsDowngradedRcsGroupHandler.java")).q("Skipping recovering ChatAPI to Vanilla RCS downgraded conversation because we do not have valid conference URI.");
                    claeVar.d.e("Bugle.Rcs.Groups.Recovery.Disabled.Cause", 4);
                    return elfo.e(ceyt.k());
                }
            }, this.e);
        }
        ((ensz) a.n().h("com/google/android/apps/messaging/shared/rcs/groups/recovery/RecoverChatApiToVanillaRcsDowngradedRcsGroupHandler", "processPendingWorkItemAsync", 80, "RecoverChatApiToVanillaRcsDowngradedRcsGroupHandler.java")).q("Skipping recovering ChatAPI to Vanilla RCS downgraded conversation because conversation ID is empty");
        return elfo.e(ceyt.k());
    }
}
