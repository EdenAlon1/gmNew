package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wre extends ffhv implements ffjm {
    final /* synthetic */ wqq a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wre(wqq wqqVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = wqqVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((wre) c((ffxy) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ((enrr) wrg.a.i().h("com/google/android/apps/messaging/conversation2/actions/adapter/ActionsUiAdapterImpl$startEmittingNow$2", "invokeSuspend", 90, "ActionsUiAdapterImpl.kt")).t("Flow for %s did not emit within timeout. Initial null ActionUiData will be used until it emits.", this.a.getClass().getSimpleName());
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new wre(this.a, ffguVar);
    }
}
