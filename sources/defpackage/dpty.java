package defpackage;

import com.google.android.libraries.compose.cameragallery.ui.camera.inapp.CameraActivity;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpty implements adc {
    final /* synthetic */ dptz a;

    public dpty(dptz dptzVar) {
        this.a = dptzVar;
    }

    @Override // defpackage.adc
    public final void a() {
        dptz dptzVar = this.a;
        if (dptzVar.u) {
            return;
        }
        dptzVar.u = true;
        Object aX = dptzVar.aX();
        CameraActivity cameraActivity = (CameraActivity) dptzVar;
        akgb akgbVar = (akgb) aX;
        cameraActivity.o = (eg) akgbVar.f.b();
        cameraActivity.p = (dqli) akgbVar.bl.b();
        cameraActivity.q = (ffsk) akgbVar.N.b();
        cameraActivity.r = Optional.of((dptx) akgbVar.bm.b());
    }
}
