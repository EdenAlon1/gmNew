package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ailt extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ailv b;
    final /* synthetic */ ConversationId c;
    final /* synthetic */ String d;
    final /* synthetic */ Recipient e;
    final /* synthetic */ String f;
    private /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ailt(ffgu ffguVar, ailv ailvVar, ConversationId conversationId, String str, Recipient recipient, String str2) {
        super(2, ffguVar);
        this.b = ailvVar;
        this.c = conversationId;
        this.d = str;
        this.e = recipient;
        this.f = str2;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ailt) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        if (this.a != 0) {
            ffci.b(obj);
        } else {
            ffci.b(obj);
            csll csllVar = (csll) this.b.c.b();
            ConversationId conversationId = this.c;
            String str = this.d;
            Recipient recipient = this.e;
            elfl c = csllVar.c(conversationId, str, recipient != null ? recipient.g() : null, this.f, false);
            c.getClass();
            this.a = 1;
            obj = fgfz.c(c, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        obj.getClass();
        return (Boolean) obj;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ailt ailtVar = new ailt(ffguVar, this.b, this.c, this.d, this.e, this.f);
        ailtVar.g = obj;
        return ailtVar;
    }
}
