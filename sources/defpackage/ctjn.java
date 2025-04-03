package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctjn extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ctko b;
    final /* synthetic */ MessageIdType c;
    final /* synthetic */ ConversationIdType d;
    final /* synthetic */ fbwv e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctjn(ctko ctkoVar, MessageIdType messageIdType, ConversationIdType conversationIdType, fbwv fbwvVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ctkoVar;
        this.c = messageIdType;
        this.d = conversationIdType;
        this.e = fbwvVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ctjn) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ctko ctkoVar = this.b;
            MessageIdType messageIdType = this.c;
            ConversationIdType conversationIdType = this.d;
            fbwv fbwvVar = this.e;
            eopx eopxVar = eopx.SHOWN;
            this.a = 1;
            if (ctkoVar.i(messageIdType, conversationIdType, fbwvVar, eopxVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ctjn(this.b, this.c, this.d, this.e, ffguVar);
    }
}
