package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class adpz extends ffhv implements ffjm {
    final /* synthetic */ adqe a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adpz(adqe adqeVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = adqeVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((adpz) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ensk h = adqe.a.h();
        h.Y(ente.a, "BugleAccountSignOut");
        ((enrr) h.h("com/google/android/apps/messaging/gaia/signoutaccount/screen/SignOutAccountScreenUiAdapterImpl$onNegativeClick$1", "invokeSuspend", 99, "SignOutAccountScreenUiAdapterImpl.kt")).q("User clicked negative button on sign out screen");
        ((akzt) ((adpp) this.a.f.b()).b.b()).c("Bugle.SignOutAccount.BacksOutOfSignOutFlow.Count");
        this.a.e.h(aijc.a);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new adpz(this.a, ffguVar);
    }
}
