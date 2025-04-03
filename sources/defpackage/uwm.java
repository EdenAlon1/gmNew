package defpackage;

import android.content.Context;
import android.database.ContentObserver;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class uwm {
    public final Context a;
    public final ConversationIdType b;
    public final ContentObserver c;
    public final AtomicReference d;

    public uwm(elbx elbxVar, Context context, ConversationIdType conversationIdType, Executor executor, uwe uweVar) {
        this.a = context;
        this.b = conversationIdType;
        this.d = new AtomicReference(Optional.of(uweVar));
        uwl uwlVar = new uwl(this, elbxVar, executor);
        this.c = uwlVar;
        context.getContentResolver().registerContentObserver(bcqc.i(context), true, uwlVar);
    }
}
