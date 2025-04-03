package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aija extends ffhv implements ffjm {
    final /* synthetic */ aijb a;
    final /* synthetic */ ConversationIdType b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aija(ffgu ffguVar, aijb aijbVar, ConversationIdType conversationIdType) {
        super(2, ffguVar);
        this.a = aijbVar;
        this.b = conversationIdType;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aija) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        bseh r = ((bczy) this.a.b.b()).r(this.b);
        return this.a.a.a(this.b, r != null ? r.aa() : null, r != null ? r.am() : false);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        aija aijaVar = new aija(ffguVar, this.a, this.b);
        aijaVar.c = obj;
        return aijaVar;
    }
}
