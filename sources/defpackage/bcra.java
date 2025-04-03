package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bcra extends ffhv implements ffjm {
    final /* synthetic */ bcrd a;
    final /* synthetic */ ConversationIdType b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bcra(ffgu ffguVar, bcrd bcrdVar, ConversationIdType conversationIdType) {
        super(2, ffguVar);
        this.a = bcrdVar;
        this.b = conversationIdType;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bcra) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        return ((bczy) this.a.a.b()).r(this.b);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        bcra bcraVar = new bcra(ffguVar, this.a, this.b);
        bcraVar.c = obj;
        return bcraVar;
    }
}
