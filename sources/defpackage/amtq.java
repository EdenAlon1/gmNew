package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Collection;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amtq implements amtn {
    private static final cskc a = cskc.g("Lighter", "LighterConversationManagerImpl");
    private final ayfy b;
    private final cqoh c;
    private final amua d;
    private final ffbr e;

    public amtq(ayfy ayfyVar, cqoh cqohVar, amua amuaVar, ffbr ffbrVar) {
        this.b = ayfyVar;
        this.c = cqohVar;
        this.d = amuaVar;
        this.e = ffbrVar;
    }

    @Override // defpackage.amtn
    public final void a(amts amtsVar) {
        int i = amtsVar.b;
        if ((i & 1) == 0) {
            throw new IllegalStateException("MessagesLighterConversation.business_id is empty.");
        }
        if ((i & 2) == 0) {
            throw new IllegalStateException("MessagesLighterConversation.hasConversationIdAsJsonString is empty.");
        }
        if (((Boolean) this.e.b()).booleanValue() && (amtsVar.b & 1024) == 0) {
            throw new IllegalStateException("MessagesLighterConversation.hasSyncTimestamp is empty.");
        }
        amua amuaVar = this.d;
        cetp cetpVar = new cetp();
        cetpVar.d = amtsVar.c;
        ((cevh) amuaVar.a.b()).a(ceyr.h("create_or_update_lighter_conversation", amtsVar, cetpVar.a()));
    }

    @Override // defpackage.amtn
    public final void b(final String str) {
        bsob e = bsom.e();
        e.z("LighterConversationManagerImpl#getExistingConversation");
        e.r();
        e.d();
        e.i(new Function() { // from class: amto
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bsol bsolVar = (bsol) obj;
                bsolVar.L(4);
                bsolVar.l();
                return bsolVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        btmp a2 = btmu.a();
        a2.r();
        a2.c(new Function() { // from class: amtp
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                btmt btmtVar = (btmt) obj;
                btmtVar.b(str);
                return btmtVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        e.G(dtvz.i(a2.b(), btmu.c.b, bsom.c.a).g());
        ConversationIdType conversationIdType = (ConversationIdType) Collection.EL.stream(e.b().f()).findFirst().orElse(bdgq.a);
        if (conversationIdType.b()) {
            a.r("Tried to delete a non existing conversation on Bugle.");
            return;
        }
        boolean z = false;
        while (!z) {
            try {
                ((cevh) this.d.a.b()).e("create_or_update_lighter_conversation", str);
            } catch (IndexOutOfBoundsException unused) {
                csjb c = a.c();
                c.I("Nothing to cancel in CreateOrUpdateLighterConversationQueue");
                c.r();
                z = true;
            }
        }
        ayfy ayfyVar = this.b;
        aygb f = aygc.f();
        f.f(eoko.CONVERSATION_FROM_LIST);
        f.c(this.c.f().toEpochMilli());
        f.b(conversationIdType);
        ayfyVar.b(f.a());
    }
}
