package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cygg extends dtrs {
    final /* synthetic */ ConversationIdType a;
    final /* synthetic */ cygi b;

    public cygg(cygi cygiVar, ConversationIdType conversationIdType) {
        this.a = conversationIdType;
        this.b = cygiVar;
    }

    @Override // defpackage.dtrs
    public final /* bridge */ /* synthetic */ void gb(dtyq dtyqVar) {
        Runnable runnable = erry.a;
        long longValue = ((Long) cygi.a.e()).longValue();
        cygi cygiVar = this.b;
        cygiVar.b.a(elfl.g(cygiVar.d.schedule(runnable, longValue, TimeUnit.MILLISECONDS)), "NUDGE_BANNER_STATE_KEY".concat(this.a.toString()));
    }
}
