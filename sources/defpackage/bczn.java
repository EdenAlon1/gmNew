package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bczn extends ffhv implements ffjm {
    final /* synthetic */ bczq a;
    final /* synthetic */ ConversationIdType b;
    final /* synthetic */ axcl c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bczn(ffgu ffguVar, bczq bczqVar, ConversationIdType conversationIdType, axcl axclVar) {
        super(2, ffguVar);
        this.a = bczqVar;
        this.b = conversationIdType;
        this.c = axclVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bczn) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        return this.a.a(this.b, this.c);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        bczn bcznVar = new bczn(ffguVar, this.a, this.b, this.c);
        bcznVar.d = obj;
        return bcznVar;
    }
}
