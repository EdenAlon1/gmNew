package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cuka extends ffhv implements ffjm {
    final /* synthetic */ cuke a;
    final /* synthetic */ ConversationIdType b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cuka(ffgu ffguVar, cuke cukeVar, ConversationIdType conversationIdType) {
        super(2, ffguVar);
        this.a = cukeVar;
        this.b = conversationIdType;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cuka) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        return ((bczy) this.a.c.b()).s(this.b);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cuka cukaVar = new cuka(ffguVar, this.a, this.b);
        cukaVar.c = obj;
        return cukaVar;
    }
}
