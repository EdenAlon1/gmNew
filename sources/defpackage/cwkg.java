package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cwkg extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cwkj b;
    final /* synthetic */ ConversationIdType c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cwkg(cwkj cwkjVar, ConversationIdType conversationIdType, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cwkjVar;
        this.c = conversationIdType;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cwkg) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        cwkj cwkjVar = this.b;
        ConversationIdType conversationIdType = this.c;
        this.a = 1;
        Object h = cwkjVar.h(conversationIdType, this);
        return h == ffhhVar ? ffhhVar : h;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cwkg(this.b, this.c, ffguVar);
    }
}
