package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final /* synthetic */ class yra implements ffxy, ffke {
    final /* synthetic */ yrg a;

    public yra(yrg yrgVar) {
        this.a = yrgVar;
    }

    @Override // defpackage.ffke
    public final ffbv b() {
        return new ffju(2, this.a, yrg.class, "onStateChanged", "onStateChanged(Lcom/google/android/libraries/compose/cameragallery/popupcamera/PopupCameraUiDataImpl;)V", 4);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof ffxy) && (obj instanceof ffke)) {
            return ffkj.e(b(), ((ffke) obj).b());
        }
        return false;
    }

    @Override // defpackage.ffxy
    public final /* synthetic */ Object fQ(Object obj, ffgu ffguVar) {
        dplw dplwVar = (dplw) obj;
        ensk e = yrg.a.e();
        e.Y(ente.a, "BugleSelfieGif");
        enrr enrrVar = (enrr) e.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/cameragallery/SelfieGifUiAdapterImpl", "onStateChanged", 128, "SelfieGifUiAdapterImpl.kt");
        Class<?> cls = dplwVar.getClass();
        int i = fflc.a;
        enrrVar.t("Selfie GIF popup state changed to %s", new ffkb(cls).c());
        boolean z = dplwVar instanceof dplj;
        yrg yrgVar = this.a;
        ajiy ajiyVar = null;
        if (z) {
            ajiy ajiyVar2 = yrgVar.f;
            if (ajiyVar2 == null) {
                ffkj.c("popupController");
            } else {
                ajiyVar = ajiyVar2;
            }
            ajiyVar.a();
            if (yrgVar.h) {
                ((adsd) yrgVar.e.b()).a(33);
                yrgVar.h = false;
            }
        } else {
            ajiy ajiyVar3 = yrgVar.f;
            if (ajiyVar3 == null) {
                ffkj.c("popupController");
            } else {
                ajiyVar = ajiyVar3;
            }
            ajiyVar.b(dplwVar);
        }
        return ffcu.a;
    }

    public final int hashCode() {
        return b().hashCode();
    }
}
