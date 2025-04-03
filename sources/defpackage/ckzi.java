package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class ckzi implements Callable {
    final /* synthetic */ ConversationIdType a;
    final /* synthetic */ ckzj b;

    public ckzi(ckzj ckzjVar, ConversationIdType conversationIdType) {
        this.a = conversationIdType;
        this.b = ckzjVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        return ((bczy) this.b.d.b()).r(this.a);
    }
}
