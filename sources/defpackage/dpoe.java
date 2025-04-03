package defpackage;

import com.google.android.libraries.compose.cameragallery.ui.camera.inapp.CameraActivity;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpoe extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ffbz b;
    final /* synthetic */ CameraActivity c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpoe(ffbz ffbzVar, CameraActivity cameraActivity, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ffbzVar;
        this.c = cameraActivity;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dpoe) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            fgcq fgcqVar = CameraActivity.k(this.b).c;
            dpod dpodVar = new dpod(this.c, null);
            this.a = 1;
            if (ffyk.b(fgcqVar, dpodVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dpoe(this.b, this.c, ffguVar);
    }
}
