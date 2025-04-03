package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class crlr extends ffhv implements ffjm {
    final /* synthetic */ crlt a;
    final /* synthetic */ ConversationIdType b;
    final /* synthetic */ MessageIdType c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public crlr(ffgu ffguVar, crlt crltVar, ConversationIdType conversationIdType, MessageIdType messageIdType) {
        super(2, ffguVar);
        this.a = crltVar;
        this.b = conversationIdType;
        this.c = messageIdType;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((crlr) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        return this.a.f(this.b, 265, this.c);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        crlr crlrVar = new crlr(ffguVar, this.a, this.b, this.c);
        crlrVar.d = obj;
        return crlrVar;
    }
}
