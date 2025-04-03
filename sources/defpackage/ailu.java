package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ailu extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ailv b;
    final /* synthetic */ String c;
    final /* synthetic */ String d;
    final /* synthetic */ ConversationIdType e;
    final /* synthetic */ ConversationId f;
    final /* synthetic */ Recipient g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ailu(ailv ailvVar, String str, String str2, ConversationIdType conversationIdType, ConversationId conversationId, Recipient recipient, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ailvVar;
        this.c = str;
        this.d = str2;
        this.e = conversationIdType;
        this.f = conversationId;
        this.g = recipient;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ailu) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ailv ailvVar = this.b;
            ConversationId conversationId = this.f;
            String str = this.d;
            Recipient recipient = this.g;
            String str2 = this.c;
            ffhd a = ekxi.a(ailvVar.b);
            ailt ailtVar = new ailt(null, ailvVar, conversationId, str, recipient, str2);
            this.a = 1;
            obj = ffra.a(a, ailtVar, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        if (!((Boolean) obj).booleanValue()) {
            ensk j = ailv.a.j();
            j.Y(ente.a, "Bugle");
            enrr enrrVar = (enrr) j;
            enrrVar.Y(cird.t, this.c);
            ((enrr) enrrVar.h("com/google/android/apps/messaging/navigation/targets/NotificationSettingsNavigationHandler$handleNotificationNavigation$1", "invokeSuspend", 116, "NotificationSettings.kt")).q("Error creating shortcut, can't open notification settings");
            return ffcu.a;
        }
        ensk h = ailv.a.h();
        h.Y(ente.a, "Bugle");
        enrr enrrVar2 = (enrr) h;
        enrrVar2.Y(cird.t, this.c);
        enrrVar2.Y(cird.v, Boolean.valueOf(((csll) this.b.c.b()).k(this.c)));
        ((enrr) enrrVar2.h("com/google/android/apps/messaging/navigation/targets/NotificationSettingsNavigationHandler$handleNotificationNavigation$1", "invokeSuspend", 127, "NotificationSettings.kt")).q("Shortcut was created. Will launch notification settings now.");
        this.b.b(this.d, this.e, this.c);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ailu(this.b, this.c, this.d, this.e, this.f, this.g, ffguVar);
    }
}
