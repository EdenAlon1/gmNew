package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cghu implements Runnable {
    final /* synthetic */ cghv a;
    final /* synthetic */ cgho b;

    public cghu(cghv cghvVar, cgho cghoVar) {
        this.a = cghvVar;
        this.b = cghoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        efbd.b();
        String[] strArr = bvin.a;
        bvig bvigVar = new bvig();
        bvigVar.f("ParentDisallowedConversationDatabaseOperations#markConversationsAsAllowed");
        bvim bvimVar = new bvim();
        engr engrVar = new engr();
        Iterator it = this.b.b.iterator();
        while (it.hasNext()) {
            engrVar.h(String.valueOf(bdgq.a((ConversationIdType) it.next())));
        }
        bvimVar.aq(new dtrw("parent_disallowed_conversations.conversation_id", 3, bvim.at(engrVar.g()), true));
        bvigVar.a(bvimVar);
        bvigVar.d();
        cgho cghoVar = this.b;
        efbd.b();
        Iterator it2 = cghoVar.a.iterator();
        while (it2.hasNext()) {
            cggo.c((ConversationIdType) it2.next());
        }
    }
}
