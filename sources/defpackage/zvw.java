package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zvw extends ffhv implements ffjm {
    final /* synthetic */ zvz a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zvw(zvz zvzVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = zvzVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((zvw) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        try {
            zvz zvzVar = this.a;
            zvzVar.b.unregisterNetworkCallback(zvzVar.e);
        } catch (IllegalArgumentException e) {
            ((enrr) zvz.a.j().h("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/NetworkConnectionImpl$close$1", "invokeSuspend", 91, "NetworkConnectionImpl.kt")).t("Exception unregistering NetworkCallback", e);
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new zvw(this.a, ffguVar);
    }
}
