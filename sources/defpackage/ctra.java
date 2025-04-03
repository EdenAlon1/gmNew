package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctra extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ctrc b;
    final /* synthetic */ ConversationIdType c;
    final /* synthetic */ String d;
    final /* synthetic */ fbre e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctra(ctrc ctrcVar, ConversationIdType conversationIdType, String str, fbre fbreVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ctrcVar;
        this.c = conversationIdType;
        this.d = str;
        this.e = fbreVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ctra) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return null;
        }
        ctrc ctrcVar = this.b;
        ConversationIdType conversationIdType = this.c;
        String str = this.d;
        fbre fbreVar = this.e;
        this.a = 1;
        if (ctrcVar.h(conversationIdType, str, fbreVar, this) == ffhhVar) {
            return ffhhVar;
        }
        return null;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ctra(this.b, this.c, this.d, this.e, ffguVar);
    }
}
