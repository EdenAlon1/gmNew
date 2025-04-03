package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cktk extends ffhv implements ffjm {
    final /* synthetic */ cktv a;
    final /* synthetic */ ConversationIdType b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cktk(ffgu ffguVar, cktv cktvVar, ConversationIdType conversationIdType) {
        super(2, ffguVar);
        this.a = cktvVar;
        this.b = conversationIdType;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cktk) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        return cktv.c(this.b);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cktk cktkVar = new cktk(ffguVar, this.a, this.b);
        cktkVar.c = obj;
        return cktkVar;
    }
}
