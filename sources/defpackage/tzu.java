package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tzu extends ffhv implements ffjm {
    int a;
    final /* synthetic */ tzv b;
    final /* synthetic */ ConversationIdType c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tzu(tzv tzvVar, ConversationIdType conversationIdType, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = tzvVar;
        this.c = conversationIdType;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((tzu) c((bvvl) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            tzv tzvVar = this.b;
            ConversationIdType conversationIdType = this.c;
            ffhd a = ekxi.a(tzvVar.a);
            tzt tztVar = new tzt(null, tzvVar, conversationIdType);
            this.a = 1;
            obj = ffra.a(a, tztVar, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        obj.getClass();
        return obj;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new tzu(this.b, this.c, ffguVar);
    }
}
