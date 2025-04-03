package defpackage;

import com.google.android.libraries.compose.cameragallery.ui.camera.inapp.CameraActivity;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpof extends ffhv implements ffjm {
    /* synthetic */ Object a;
    final /* synthetic */ CameraActivity b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpof(CameraActivity cameraActivity, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cameraActivity;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dpof) c((dpse) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        if (!(((dpse) this.a) instanceof dpse)) {
            throw new ffcd();
        }
        this.b.j().finish();
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        dpof dpofVar = new dpof(this.b, ffguVar);
        dpofVar.a = obj;
        return dpofVar;
    }
}
