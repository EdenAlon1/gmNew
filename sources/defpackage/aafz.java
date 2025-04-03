package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aafz extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ffix b;
    final /* synthetic */ aafr c;
    final /* synthetic */ aagl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aafz(ffix ffixVar, aafr aafrVar, aagl aaglVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ffixVar;
        this.c = aafrVar;
        this.d = aaglVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aafz) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ffix ffixVar = this.b;
            if (ffixVar != null) {
                ffixVar.invoke();
                return ffcu.a;
            }
            ((enrr) aagl.a.h().h("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/progress/ProgressBarOverlayUiAdapter$createDownloadableUiData$1$1", "invokeSuspend", 280, "ProgressBarOverlayUiAdapter.kt")).t("Resuming file transfer for messageId=%s", this.c.a.b());
            elfl E = this.d.c.E(this.c.a.b());
            this.a = 1;
            obj = fgfz.c(E, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aafz(this.b, this.c, this.d, ffguVar);
    }
}
