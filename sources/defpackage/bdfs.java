package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bdfs extends ffhv implements ffjm {
    final /* synthetic */ bdfv a;
    final /* synthetic */ ConversationIdType b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bdfs(ffgu ffguVar, bdfv bdfvVar, ConversationIdType conversationIdType) {
        super(2, ffguVar);
        this.a = bdfvVar;
        this.b = conversationIdType;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bdfs) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        return this.a.j(this.b);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        bdfs bdfsVar = new bdfs(ffguVar, this.a, this.b);
        bdfsVar.c = obj;
        return bdfsVar;
    }
}
