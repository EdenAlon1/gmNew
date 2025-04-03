package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
final /* synthetic */ class apbi extends ffkh implements ffji {
    final /* synthetic */ apbk a;
    final /* synthetic */ MessageId b;
    final /* synthetic */ Optional c;
    final /* synthetic */ MessageIdType d;
    final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public apbi(apbk apbkVar, MessageId messageId, Optional optional, MessageIdType messageIdType, int i) {
        super(1, ffki.class, "unstar", "unstarMessage$lambda$1$unstar(Lcom/google/android/apps/messaging/shared/api/messaging/message/OptimisticBugleMessageRepository;Lcom/google/android/apps/messaging/shared/api/messaging/MessageId;Ljava/util/Optional;Lcom/google/android/apps/messaging/shared/datamodel/data/datatypes/MessageIdType;Lcom/google/common/logging/bugle/BugleStar$StarAction$Source;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        this.a = apbkVar;
        this.b = messageId;
        this.c = optional;
        this.d = messageIdType;
        this.e = i;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return apbk.aq(this.a, this.b, this.c, this.d, this.e, (ffgu) obj);
    }
}
