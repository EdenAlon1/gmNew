package defpackage;

import android.app.admin.DevicePolicyManager;
import android.view.View;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpom implements dpnk {
    public final eg a;
    private adg b;
    private final ffbz c;

    public dpom(eg egVar) {
        egVar.getClass();
        this.a = egVar;
        this.c = ffca.a(new ffix() { // from class: dpok
            @Override // defpackage.ffix
            public final Object invoke() {
                Object systemService = dpom.this.a.getSystemService("device_policy");
                systemService.getClass();
                return (DevicePolicyManager) systemService;
            }
        });
    }

    @Override // defpackage.dpnk
    public final void a(View view) {
        if (this.b == null) {
            throw new IllegalStateException("onCreate() must be called before launch() is invoked");
        }
        if (((DevicePolicyManager) this.c.a()).getCameraDisabled(null)) {
            dskj.g(this.a, R.string.camera_disabled_by_device_policy);
            return;
        }
        kli b = kli.b(view, view.getWidth(), view.getHeight());
        adg adgVar = this.b;
        if (adgVar == null) {
            ffkj.c("launcher");
            adgVar = null;
        }
        adgVar.a(null, b);
    }

    @Override // defpackage.dpnk
    public final void b(final ffji ffjiVar) {
        this.b = this.a.h.b("compose_launch_camera_activity", dpol.a, new adf() { // from class: dpoj
            @Override // defpackage.adf
            public final void a(Object obj) {
                drnn drnnVar = (drnn) obj;
                if (drnnVar != null) {
                    ffji.this.invoke(drnnVar);
                }
            }
        });
    }
}
