package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wrf extends ffhv implements ffjn {
    /* synthetic */ Object a;

    public wrf(ffgu ffguVar) {
        super(3, ffguVar);
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        wrf wrfVar = new wrf((ffgu) obj3);
        wrfVar.a = (Throwable) obj2;
        return wrfVar.b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ((enrr) ((enrr) wrg.a.i()).g((Throwable) this.a).h("com/google/android/apps/messaging/conversation2/actions/adapter/ActionsUiAdapterImpl$startEmittingNow$3", "invokeSuspend", 99, "ActionsUiAdapterImpl.kt")).q("Ignoring exception from Action flow to avoid breaking all actions.");
        return ffcu.a;
    }
}
