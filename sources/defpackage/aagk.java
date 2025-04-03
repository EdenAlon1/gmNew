package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes2.dex */
final /* synthetic */ class aagk extends ffkh implements ffji {
    public aagk(Object obj) {
        super(1, obj, aagl.class, "pauseFileTransfer", "pauseFileTransfer(Lcom/google/android/apps/messaging/shared/api/messaging/MessageId;)V", 0);
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        MessageId messageId = (MessageId) obj;
        messageId.getClass();
        axnw.h(((aagl) this.g).c.A(messageId));
        ((enrr) aagl.a.h().h("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/progress/ProgressBarOverlayUiAdapter", "pauseFileTransfer", 313, "ProgressBarOverlayUiAdapter.kt")).t("Pausing file transfer for messageId=%s", messageId);
        return ffcu.a;
    }
}
