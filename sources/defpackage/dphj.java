package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;

/* compiled from: PG */
/* loaded from: classes4.dex */
final /* synthetic */ class dphj implements ffxy, ffke {
    final /* synthetic */ dpif a;

    public dphj(dpif dpifVar) {
        this.a = dpifVar;
    }

    @Override // defpackage.ffke
    public final ffbv b() {
        return new ffju(2, this.a, dpif.class, "onCaptureEvent", "onCaptureEvent(Lcom/google/android/libraries/compose/cameragallery/ui/camera/inapp/CameraManager$CaptureEvent;)V", 4);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof ffxy) && (obj instanceof ffke)) {
            return ffkj.e(b(), ((ffke) obj).b());
        }
        return false;
    }

    @Override // defpackage.ffxy
    public final /* bridge */ /* synthetic */ Object fQ(Object obj, ffgu ffguVar) {
        dpif dpifVar = this.a;
        dpqk dpqkVar = (dpqk) obj;
        if (ffkj.e(dpifVar.g.c(), dpgw.a)) {
            if (dpqkVar instanceof dpqj) {
                ffqy.d(dpifVar.c, null, null, new dphc(dpifVar, dpqkVar, null), 3);
            }
        } else if (dpqkVar instanceof dpqh) {
            yqr yqrVar = dpifVar.l;
            if (yqrVar != null) {
                ((akzt) yqrVar.a.b()).c("Bugle.SelfieGif.Recording.Started.Count");
            }
            ffqy.d(dpifVar.b, null, null, new dphd(dpifVar, null), 3);
            dpifVar.j(100L, BasePaymentResult.ERROR_REQUEST_FAILED);
            dpifVar.g.f(dpgz.a);
        } else if (dpqkVar instanceof dpqi) {
            ffqy.d(dpifVar.b, null, null, new dphe(dpifVar, null), 3);
            dpifVar.j(25L, 125);
            dpifVar.h();
        } else if (dpqkVar instanceof dpqf) {
            dpifVar.l(0);
        } else if (dpqkVar instanceof dpqj) {
            drnn drnnVar = ((dpqj) dpqkVar).a;
            if (!(drnnVar instanceof drni)) {
                ((enrr) dpif.a.j().h("com/google/android/libraries/compose/cameragallery/popupcamera/PopupCameraController", "onCapture", 277, "PopupCameraController.kt")).t("Captured invalid media %s from PopupCamera", drnnVar);
                dpifVar.l(0);
            } else if (dpifVar.k) {
                dpifVar.d.e(drnnVar);
                yqr yqrVar2 = dpifVar.l;
                if (yqrVar2 != null) {
                    yqrVar2.a();
                }
                dpifVar.j = null;
                dpifVar.g();
            } else {
                dpifVar.j = drnnVar;
                dpifVar.g.f(new dpgx((drni) drnnVar));
            }
        } else {
            if (!(dpqkVar instanceof dpqg)) {
                throw new ffcd();
            }
            ((enrr) ((enrr) dpif.a.j()).g(((dpqg) dpqkVar).a).h("com/google/android/libraries/compose/cameragallery/popupcamera/PopupCameraController", "onCaptureEvent", 259, "PopupCameraController.kt")).q("Camera capture failed.");
            dpifVar.l(0);
        }
        return ffcu.a;
    }

    public final int hashCode() {
        return b().hashCode();
    }
}
