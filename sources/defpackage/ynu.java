package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ynu extends ffhv implements ffjm {
    final /* synthetic */ you a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ynu(you youVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = youVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ynu) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        dqmn dqmnVar = this.a.m.f;
        dqmnVar.h();
        ensk e = you.a.e();
        e.Y(ente.a, "BugleComposeRow2");
        ((enrr) e.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/text/DraftTextUiAdapterImpl$onDraftClearedForSending$1", "invokeSuspend", 343, "DraftTextUiAdapterImpl.kt")).q("DraftTextUiAdapterImpl.onDraftClearedForSending clearing text for sending");
        dqmnVar.e();
        this.a.k.incrementAndGet();
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ynu(this.a, ffguVar);
    }
}
