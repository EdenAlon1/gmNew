package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bfkp extends duav {
    @Override // defpackage.duav
    public final /* synthetic */ duap a() {
        return new bfkl(this);
    }

    public final void b(Function... functionArr) {
        Object apply;
        bfkp[] bfkpVarArr = new bfkp[2];
        for (int i = 0; i < 2; i++) {
            Function function = functionArr[i];
            String[] strArr = bfkq.a;
            apply = function.apply(new bfkp());
            bfkpVarArr[i] = (bfkp) apply;
        }
        ar(bfkpVarArr);
    }

    public final void c() {
        aq(new dtrx("parent_disallowed_conversations.conversation_id", 5));
    }

    public final void d(ConversationIdType conversationIdType) {
        aq(new dtrt("conversations._id", 1, Long.valueOf(bdgq.a(conversationIdType))));
    }

    public final void e(dtzj dtzjVar) {
        aq(new dtru("conversations._id", 3, dtzjVar));
    }
}
