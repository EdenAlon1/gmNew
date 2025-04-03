package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yqm extends ffhv implements ffjn {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ yqq c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yqm(ffgu ffguVar, yqq yqqVar) {
        super(3, ffguVar);
        this.c = yqqVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        yqm yqmVar = new yqm((ffgu) obj3, this.c);
        yqmVar.d = (ffxy) obj;
        yqmVar.b = obj2;
        return yqmVar.b(ffcu.a);
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [ffxy, java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffxx ffygVar;
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ?? r9 = this.d;
            Boolean bool = (Boolean) this.b;
            boolean booleanValue = bool.booleanValue();
            ensk h = yqq.a.h();
            h.Y(ente.a, "BugleComposeRow2");
            ((enrr) h.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/cameragallery/CameraGalleryInputUiAdapter$uiData_delegate$lambda$7$$inlined$flatMapLatest$1", "invokeSuspend", 123, "CameraGalleryInputUiAdapter.kt")).t("CameraGalleryInputUiAdapter shouldShow %s", bool);
            if (booleanValue) {
                yqq yqqVar = this.c;
                ffygVar = new yqp(yqqVar.l, yqqVar);
            } else {
                ffygVar = new ffyg(null);
            }
            this.a = 1;
            if (ffyk.c(r9, ffygVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }
}
