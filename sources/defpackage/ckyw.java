package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class ckyw implements Callable {
    final /* synthetic */ ConversationIdType a;
    final /* synthetic */ ckyx b;

    public ckyw(ckyx ckyxVar, ConversationIdType conversationIdType) {
        this.a = conversationIdType;
        this.b = ckyxVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        return ((bczy) this.b.d.b()).r(this.a);
    }
}
