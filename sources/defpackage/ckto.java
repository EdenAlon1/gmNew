package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckto extends ffhv implements ffjm {
    final /* synthetic */ ckte a;
    final /* synthetic */ ConversationIdType b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ckto(ffgu ffguVar, ckte ckteVar, ConversationIdType conversationIdType) {
        super(2, ffguVar);
        this.a = ckteVar;
        this.b = conversationIdType;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ckto) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        String[] strArr = bsom.a;
        bsoe bsoeVar = new bsoe();
        bsoeVar.ap("MmsGroupUpgradeDatabaseOperations#updateMmsGroupUpgradeStatus");
        bsoeVar.B(this.a);
        return Boolean.valueOf(bsoeVar.f(this.b));
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ckto cktoVar = new ckto(ffguVar, this.a, this.b);
        cktoVar.c = obj;
        return cktoVar;
    }
}
