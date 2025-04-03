package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes2.dex */
final /* synthetic */ class aapa extends ffkh implements ffji {
    public aapa(Object obj) {
        super(1, obj, aapg.class, "onCancelClicked", "onCancelClicked(Lcom/google/android/apps/messaging/shared/api/messaging/MessageId;)V", 0);
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        MessageId messageId = (MessageId) obj;
        messageId.getClass();
        aapg aapgVar = (aapg) this.g;
        axol.k(aapgVar.b, null, new aaoz(messageId, aapgVar, null), 3);
        return ffcu.a;
    }
}
