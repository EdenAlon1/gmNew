package defpackage;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.compose.cameragallery.ui.camera.inapp.CameraActivity;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpnz extends ffhv implements ffjm {
    int a;
    final /* synthetic */ CameraActivity b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpnz(CameraActivity cameraActivity, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cameraActivity;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dpnz) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
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
            obj = l.a(list, true, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        if (((Map) obj).values().contains(false)) {
            ComposeView composeView = this.b.s;
            if (composeView == null) {
                ffkj.c("cameraComposeView");
                composeView = null;
            }
            composeView.setVisibility(8);
            final CameraActivity cameraActivity = this.b;
            dszy.c(cameraActivity.m(), null, new Integer(R.string.access_fullscreen_camera_permission_description), null, new Integer(R.string.open_settings), new View.OnClickListener() { // from class: dpnx
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CameraActivity cameraActivity2 = CameraActivity.this;
                    ffqy.d(cameraActivity2.n(), null, null, new dpny(cameraActivity2, null), 3);
                }
            }, 1);
        } else {
            this.b.o();
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dpnz(this.b, ffguVar);
    }
}
