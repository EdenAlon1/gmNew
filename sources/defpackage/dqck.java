package defpackage;

import android.os.IBinder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.photopicker.EmbeddedPhotoPickerSession;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqck implements View.OnAttachStateChangeListener {
    final /* synthetic */ SurfaceView a;
    final /* synthetic */ hho b;
    final /* synthetic */ hho c;
    final /* synthetic */ hho d;

    public dqck(SurfaceView surfaceView, hho hhoVar, hho hhoVar2, hho hhoVar3) {
        this.a = surfaceView;
        this.b = hhoVar;
        this.c = hhoVar2;
        this.d = hhoVar3;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        IBinder hostToken;
        view.getClass();
        if (dqco.b(this.b) == null) {
            hho hhoVar = this.b;
            hostToken = this.a.getHostToken();
            dqco.g(hhoVar, hostToken);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        view.getClass();
        try {
            EmbeddedPhotoPickerSession c = dqco.c(this.c);
            if (c != null) {
                c.close();
            }
        } catch (Throwable th) {
            ((enrr) ((enrr) ((enru) dqco.a.a()).i()).g(th).h("com/google/android/libraries/compose/cameragallery/ui/gallery/embedded/EmbeddedGalleryKt$EmbeddedGallery$6$1$1$1", "onViewDetachedFromWindow", 120, "EmbeddedGallery.kt")).q("Unable to close embedded picker session");
        }
        dqco.f(this.d, 0L);
        dqco.e(this.c, null);
        dqco.g(this.b, null);
    }
}
