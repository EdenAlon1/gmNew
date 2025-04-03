package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ydh extends ffhv implements ffjm {
    final /* synthetic */ ydq a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ydh(ffgu ffguVar, ydq ydqVar) {
        super(2, ffguVar);
        this.a = ydqVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ydh) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object apply;
        ffci.b(obj);
        ensk e = ydq.a.e();
        e.Y(ente.a, "BugleComposeRow2");
        enrr enrrVar = (enrr) e;
        enrrVar.Y(csux.q, this.a.b);
        ((enrr) enrrVar.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/data/persistence/ConversationDraftPersistence$remove$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", 94, "ConversationDraftPersistence.kt")).q("Persistence removing draft");
        String[] strArr = bsyb.a;
        bsxs bsxsVar = new bsxs();
        bsxsVar.f("ConversationDraftPersistence.remove");
        apply = new ydi(this.a).apply(new bsya());
        bsxsVar.b = new bsxz((bsya) apply);
        return new Integer(bsxsVar.d());
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ydh ydhVar = new ydh(ffguVar, this.a);
        ydhVar.b = obj;
        return ydhVar;
    }
}
