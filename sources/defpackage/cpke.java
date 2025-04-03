package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpke {
    public static final entd a = entd.c("BugleTachygram");
    public final akzt b;
    public final errl c;
    public final errl d;
    private final ffbr e;

    public cpke(ffbr ffbrVar, akzt akztVar, errl errlVar, errl errlVar2) {
        this.e = ffbrVar;
        this.b = akztVar;
        this.c = errlVar;
        this.d = errlVar2;
    }

    public static ckjz a(String str, epby epbyVar) {
        ckjy w = ckjz.w();
        w.j(false);
        w.p(false);
        w.q(true);
        w.w(epbyVar);
        w.u(str);
        return w.D();
    }

    public final elfl b(ckjz ckjzVar) {
        return ((ckju) this.e.b()).d(ckjzVar).h(new emwl() { // from class: cpjx
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return Optional.ofNullable((ConversationIdType) obj);
            }
        }, this.d).h(new emwl() { // from class: cpjy
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                Optional optional = (Optional) obj;
                entd entdVar = cpke.a;
                if (optional.isEmpty()) {
                    ((ensz) ((ensz) cpke.a.j()).h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramDatabaseOperations", "getConversationBindData", 205, "TachygramDatabaseOperations.java")).q("Cannot fetch ConversationsTable.BindData because conversation ID lookup failed.");
                    return Optional.empty();
                }
                bseh bsehVar = (bseh) bsom.j((ConversationIdType) optional.get(), new Function() { // from class: cpjw
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        bseh bsehVar2 = (bseh) obj2;
                        entd entdVar2 = cpke.a;
                        return bsehVar2;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                if (bsehVar != null) {
                    return Optional.of(bsehVar);
                }
                ensz enszVar = (ensz) cpke.a.j();
                enszVar.Y(csux.o, ((ConversationIdType) optional.get()).toString());
                ((ensz) enszVar.h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramDatabaseOperations", "getConversationBindData", 217, "TachygramDatabaseOperations.java")).q("Could not get Conversation.BindData for an existing conversation.");
                return Optional.empty();
            }
        }, this.c);
    }

    public final elfl c(final String str, final eyee eyeeVar) {
        return elfo.f(new Runnable() { // from class: cpkc
            @Override // java.lang.Runnable
            public final void run() {
                entd entdVar = cpke.a;
                String[] strArr = bsom.a;
                bsoe bsoeVar = new bsoe();
                bsoeVar.ap("setGroupRoutingToken");
                final String str2 = str;
                bsoeVar.ad(new Function() { // from class: cpkb
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        bsol bsolVar = (bsol) obj;
                        entd entdVar2 = cpke.a;
                        bsolVar.E(str2);
                        return bsolVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                byte[] I = eyeeVar.I();
                int intValue = bsom.g().intValue();
                int intValue2 = bsom.g().intValue();
                if (intValue2 < 58120) {
                    dtub.w("tachygram_group_routing_info_token", intValue2);
                }
                if (intValue >= 58120) {
                    bsoeVar.a.put("tachygram_group_routing_info_token", I);
                }
                int e = bsoeVar.b().e();
                if (e == 0) {
                    ensz enszVar = (ensz) cpke.a.j();
                    enszVar.Y(csux.J, str2);
                    ((ensz) enszVar.h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramDatabaseOperations", "setGroupRoutingToken", 105, "TachygramDatabaseOperations.java")).q("Failed to update conversation(s) group routing token for tachygram group.");
                } else if (e > 1) {
                    ensz enszVar2 = (ensz) cpke.a.h();
                    enszVar2.Y(csux.J, str2);
                    ((ensz) enszVar2.h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramDatabaseOperations", "setGroupRoutingToken", 114, "TachygramDatabaseOperations.java")).q("Updated more than one conversation's tachygram group routing token.");
                }
            }
        }, this.c);
    }
}
