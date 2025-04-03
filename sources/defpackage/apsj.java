package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class apsj extends ffhv implements ffjm {
    int a;
    final /* synthetic */ apsk b;
    final /* synthetic */ MessageIdType c;
    final /* synthetic */ MessageIdType d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public apsj(apsk apskVar, MessageIdType messageIdType, MessageIdType messageIdType2, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = apskVar;
        this.c = messageIdType;
        this.d = messageIdType2;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((apsj) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            MessageIdType messageIdType = this.c;
            MessageIdType messageIdType2 = this.d;
            this.a = 1;
            String[] strArr = bufy.a;
            buet buetVar = new buet();
            buetVar.d(messageIdType);
            buetVar.e(messageIdType2);
            buetVar.c();
            ensk h = apsk.a.h();
            h.Y(ente.a, "BugleDittoRcs");
            ((enrr) h.h("com/google/android/apps/messaging/shared/api/messaging/message/importmessages/ImportMessageHandlerImpl", "updateReplyMessage", 188, "ImportMessageHandlerImpl.kt")).D("UpdateReplyMessage: reply message is updated successfully with messageId: %s, repliedToMessageId: %s.", messageIdType, messageIdType2);
            if (ffcu.a == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new apsj(this.b, this.c, this.d, ffguVar);
    }
}
