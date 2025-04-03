package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes2.dex */
final /* synthetic */ class aala extends ffkh implements ffjm {
    public aala(Object obj) {
        super(2, obj, aalh.class, "startRichCardAttachmentDownload", "startRichCardAttachmentDownload(Lcom/google/android/apps/messaging/shared/api/messaging/MessageId;Lcom/google/android/apps/messaging/shared/api/messaging/message/content/CardAttachment$CardAttachmentContent;)V", 0);
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        MessageId messageId = (MessageId) obj;
        apor aporVar = (apor) obj2;
        messageId.getClass();
        aporVar.getClass();
        aalh aalhVar = (aalh) this.g;
        alye alyeVar = aalhVar.e;
        if (!(alyeVar instanceof apxk)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        ((apxk) alyeVar).S(aalhVar.d, messageId, aporVar);
        return ffcu.a;
    }
}
