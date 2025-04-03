package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ydg extends ffhv implements ffjm {
    final /* synthetic */ ydq a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ydg(ffgu ffguVar, ydq ydqVar) {
        super(2, ffguVar);
        this.a = ydqVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ydg) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ConversationIdType b = bdgq.b(this.a.b.b());
        bsxw a = bsyb.a();
        a.z("drafts.queryOnConversationId");
        a.q();
        bsya bsyaVar = new bsya();
        bsyaVar.b(b);
        a.k(new bsxz(bsyaVar));
        return (bswn) dtub.c(a.b());
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ydg ydgVar = new ydg(ffguVar, this.a);
        ydgVar.b = obj;
        return ydgVar;
    }
}
