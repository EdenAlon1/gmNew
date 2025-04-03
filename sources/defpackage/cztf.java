package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cztf extends ffhv implements ffjm {
    final /* synthetic */ czth a;
    final /* synthetic */ ConversationIdType b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cztf(ffgu ffguVar, czth czthVar, ConversationIdType conversationIdType) {
        super(2, ffguVar);
        this.a = czthVar;
        this.b = conversationIdType;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cztf) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        int longValue = (int) ((Number) ctjd.bj.e()).longValue();
        return ((Boolean) ((cfup) ctjd.aW.get()).e()).booleanValue() ? ((bdmq) this.a.e.b()).J(ctrt.b(this.b, longValue).b()) : ((bdmq) this.a.e.b()).L(this.b, longValue);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cztf cztfVar = new cztf(ffguVar, this.a, this.b);
        cztfVar.c = obj;
        return cztfVar;
    }
}
