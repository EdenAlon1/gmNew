package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bdfu extends ffhv implements ffjm {
    final /* synthetic */ bdfv a;
    final /* synthetic */ ConversationIdType b;
    final /* synthetic */ awui c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bdfu(ffgu ffguVar, bdfv bdfvVar, ConversationIdType conversationIdType, awui awuiVar) {
        super(2, ffguVar);
        this.a = bdfvVar;
        this.b = conversationIdType;
        this.c = awuiVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bdfu) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        return Boolean.valueOf(this.a.g(this.b, this.c));
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        bdfu bdfuVar = new bdfu(ffguVar, this.a, this.b, this.c);
        bdfuVar.d = obj;
        return bdfuVar;
    }
}
