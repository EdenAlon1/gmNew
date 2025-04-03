package defpackage;

import android.content.Intent;
import com.google.android.libraries.compose.cameragallery.ui.camera.inapp.CameraActivity;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpod extends ffhv implements ffjm {
    /* synthetic */ Object a;
    final /* synthetic */ CameraActivity b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpod(CameraActivity cameraActivity, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cameraActivity;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dpod) c((drnn) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        drnn drnnVar = (drnn) this.a;
        eg j = this.b.j();
        Intent intent = new Intent();
        intent.putExtra("camera_capture_key", drnnVar);
        j.setResult(-1, intent);
        j.finish();
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        dpod dpodVar = new dpod(this.b, ffguVar);
        dpodVar.a = obj;
        return dpodVar;
    }
}
