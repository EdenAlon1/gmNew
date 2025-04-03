package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class crls extends ffhv implements ffjm {
    final /* synthetic */ crlt a;
    final /* synthetic */ ConversationIdType b;
    final /* synthetic */ MessageIdType c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public crls(crlt crltVar, ConversationIdType conversationIdType, MessageIdType messageIdType, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = crltVar;
        this.b = conversationIdType;
        this.c = messageIdType;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((crls) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
        return null;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        this.a.f(this.b, 232, this.c);
        return null;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new crls(this.a, this.b, this.c, ffguVar);
    }
}
