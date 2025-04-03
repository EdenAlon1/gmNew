package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bsci implements Supplier {
    final /* synthetic */ bscj a;

    public bsci(bscj bscjVar) {
        this.a = bscjVar;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        ConversationIdType conversationIdType = this.a.a;
        if (conversationIdType == null || conversationIdType.equals(bdgq.a)) {
            return null;
        }
        return Long.valueOf(bdgq.a(this.a.a));
    }
}
