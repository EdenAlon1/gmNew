package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amng extends ffhv implements ffjm {
    final /* synthetic */ azcr a;
    final /* synthetic */ amnr b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amng(ffgu ffguVar, azcr azcrVar, amnr amnrVar) {
        super(2, ffguVar);
        this.a = azcrVar;
        this.b = amnrVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((amng) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        bsob e = bsom.e();
        e.z("matchByForeignKey");
        e.i(new amnh(this.a));
        e.z("DestinationConversationMatcher#matchByForeignKey");
        engw y = e.b().y();
        y.getClass();
        ArrayList arrayList = new ArrayList(ffdx.n(y, 10));
        enqv it = y.iterator();
        while (it.hasNext()) {
            arrayList.add(((bseh) it.next()).C());
        }
        if (arrayList.size() <= 1) {
            ConversationIdType conversationIdType = (ConversationIdType) ffdx.U(arrayList);
            if (conversationIdType == null) {
                return null;
            }
            ((akzt) this.b.b.b()).e("Bugle.Cme.Destination.Conversation.Match.Fallback", 6);
            return conversationIdType;
        }
        throw new IllegalStateException("DestinationToken should not map to multiple conversations.\nDestinationToken: " + this.a + "\nConversationIds: " + arrayList);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        amng amngVar = new amng(ffguVar, this.a, this.b);
        amngVar.c = obj;
        return amngVar;
    }
}
