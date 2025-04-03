package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class curh extends ffhv implements ffjm {
    int a;
    final /* synthetic */ curi b;
    final /* synthetic */ MessageIdType c;
    final /* synthetic */ ConversationIdType d;
    final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public curh(curi curiVar, MessageIdType messageIdType, ConversationIdType conversationIdType, String str, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = curiVar;
        this.c = messageIdType;
        this.d = conversationIdType;
        this.e = str;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((curh) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        curi curiVar = this.b;
        MessageIdType messageIdType = this.c;
        ConversationIdType conversationIdType = this.d;
        String str = this.e;
        this.a = 1;
        Object a = ffra.a(ekxi.a(curiVar.b), new curg(null, curiVar, conversationIdType, str, messageIdType), this);
        return a == ffhhVar ? ffhhVar : a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new curh(this.b, this.c, this.d, this.e, ffguVar);
    }
}
