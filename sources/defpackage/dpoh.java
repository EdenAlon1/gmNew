package defpackage;

import com.google.android.libraries.compose.cameragallery.ui.camera.inapp.CameraActivity;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpoh implements ffjm {
    final /* synthetic */ ffbz a;

    public dpoh(ffbz ffbzVar) {
        this.a = ffbzVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dpqe.a(null, CameraActivity.k(this.a).f, hfdVar, 0, 1);
        }
        return ffcu.a;
    }
}
