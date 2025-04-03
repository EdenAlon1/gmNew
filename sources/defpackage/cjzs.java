package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjzs extends ffhv implements ffjm {
    final /* synthetic */ ckac a;
    final /* synthetic */ ConversationIdType b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjzs(ffgu ffguVar, ckac ckacVar, ConversationIdType conversationIdType) {
        super(2, ffguVar);
        this.a = ckacVar;
        this.b = conversationIdType;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cjzs) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        return ((bczy) this.a.b.b()).r(this.b);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cjzs cjzsVar = new cjzs(ffguVar, this.a, this.b);
        cjzsVar.c = obj;
        return cjzsVar;
    }
}
