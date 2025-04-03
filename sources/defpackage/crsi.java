package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class crsi extends ffhv implements ffjm {
    int a;
    final /* synthetic */ crsl b;
    final /* synthetic */ ConversationIdType c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public crsi(crsl crslVar, ConversationIdType conversationIdType, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = crslVar;
        this.c = conversationIdType;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((crsi) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        crsl crslVar = this.b;
        ConversationIdType conversationIdType = this.c;
        this.a = 1;
        Object b = crslVar.b(conversationIdType, this);
        return b == ffhhVar ? ffhhVar : b;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new crsi(this.b, this.c, ffguVar);
    }
}
