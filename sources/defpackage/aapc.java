package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes2.dex */
final /* synthetic */ class aapc extends ffkh implements ffji {
    public aapc(Object obj) {
        super(1, obj, aapg.class, "onDownloadClicked", "onDownloadClicked(Lcom/google/android/apps/messaging/shared/api/messaging/MessageId;)V", 0);
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        MessageId messageId = (MessageId) obj;
        messageId.getClass();
        aapg aapgVar = (aapg) this.g;
        axol.k(aapgVar.b, null, new aapb(messageId, aapgVar, null), 3);
        return ffcu.a;
    }
}
