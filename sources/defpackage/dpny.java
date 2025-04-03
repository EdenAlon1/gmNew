package defpackage;

import android.view.View;
import com.google.android.libraries.compose.cameragallery.ui.camera.inapp.CameraActivity;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpny extends ffhv implements ffjm {
    int a;
    final /* synthetic */ CameraActivity b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpny(CameraActivity cameraActivity, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cameraActivity;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dpny) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            dqli l = this.b.l();
            List list = CameraActivity.n;
            this.a = 1;
            obj = l.b(list, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        if (((Boolean) obj).booleanValue()) {
            this.b.m().a();
            View view = this.b.t;
            if (view == null) {
                ffkj.c("errorPromptView");
                view = null;
            }
            view.setVisibility(8);
            this.b.o();
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dpny(this.b, ffguVar);
    }
}
