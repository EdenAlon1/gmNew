package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class ckaa extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ckac b;
    final /* synthetic */ ConversationIdType c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ckaa(ckac ckacVar, ConversationIdType conversationIdType, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ckacVar;
        this.c = conversationIdType;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ckaa) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object i;
        ffhh ffhhVar = ffhh.a;
        int i2 = this.a;
        ffci.b(obj);
        if (i2 != 0) {
            i = ((ffch) obj).a;
        } else {
            ckac ckacVar = this.b;
            ConversationIdType conversationIdType = this.c;
            this.a = 1;
            i = ckacVar.i(conversationIdType, 2, this);
            if (i == ffhhVar) {
                return ffhhVar;
            }
        }
        ffci.b(i);
        return i;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ckaa(this.b, this.c, ffguVar);
    }
}
