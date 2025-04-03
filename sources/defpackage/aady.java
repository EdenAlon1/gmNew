package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes2.dex */
final /* synthetic */ class aady extends ffkh implements ffji {
    public aady(Object obj) {
        super(1, obj, aaee.class, "onCancelClicked", "onCancelClicked(Lcom/google/android/apps/messaging/shared/api/messaging/MessageId;)V", 0);
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        MessageId messageId = (MessageId) obj;
        messageId.getClass();
        aaee aaeeVar = (aaee) this.g;
        axol.k(aaeeVar.c, null, new aadx(messageId, aaeeVar, null), 3);
        return ffcu.a;
    }
}
