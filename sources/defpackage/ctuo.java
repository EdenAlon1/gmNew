package defpackage;

import android.net.Uri;
import android.os.Build;
import java.util.EnumMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctuo implements ctuk {
    public final Map a = new EnumMap(ctuf.class);
    private final eg b;
    private final cqoh c;
    private final ctuc d;
    private final ctun e;
    private adg f;
    private long g;

    public ctuo(eg egVar, cqoh cqohVar, ctuc ctucVar) {
        this.b = egVar;
        this.e = new ctun(egVar);
        this.c = cqohVar;
        this.d = ctucVar;
    }

    private final void m(ctuf ctufVar, ctuj ctujVar) {
        emxf.a(ctug.t.containsKey(ctufVar));
        ctum ctumVar = new ctum(ctujVar);
        String[] strArr = (String[]) ctug.t.get(ctufVar);
        if (strArr != null) {
            if (this.d.a(strArr)) {
                ctumVar.b();
                return;
            }
            this.g = this.c.a();
            this.a.put(ctufVar, ctumVar);
            if (ctufVar != ctuf.SCHEDULED_SEND_PERMISSIONS || Build.VERSION.SDK_INT < 31) {
                String[] b = this.d.b(strArr);
                ctun ctunVar = this.e;
                ctunVar.a.requestPermissions(b, ctufVar.q);
                return;
            }
            if (this.f == null) {
                eg egVar = this.b;
                this.f = egVar.h.b("PermissionHelperImpl#AlarmsSettingsLauncher", new ael(), new adf() { // from class: ctul
                    @Override // defpackage.adf
                    public final void a(Object obj) {
                        ade adeVar = (ade) obj;
                        ctum ctumVar2 = (ctum) ctuo.this.a.remove(ctuf.SCHEDULED_SEND_PERMISSIONS);
                        if (ctumVar2 == null) {
                            return;
                        }
                        if (adeVar.a == -1) {
                            ctumVar2.b();
                        } else {
                            ctumVar2.a();
                        }
                    }
                });
            }
            this.f.c(akuv.d("android.settings.REQUEST_SCHEDULE_EXACT_ALARM").a().setData(Uri.parse("package:".concat(String.valueOf(this.b.getPackageName())))));
        }
    }

    @Override // defpackage.ctuk
    public final void a(ctuj ctujVar) {
        m(ctuf.CALL_PHONE_PERMISSIONS, ctujVar);
    }

    @Override // defpackage.ctuk
    public final void b(ctuj ctujVar) {
        m(ctuf.CAMERA_GALLERY_ROLL_PERMISSIONS, ctujVar);
    }

    @Override // defpackage.ctuk
    public final void c(ctuj ctujVar) {
        m(ctuf.CAMERA_IMAGE_PERMISSIONS, ctujVar);
    }

    @Override // defpackage.ctuk
    public final void d(ctuj ctujVar) {
        m(ctuf.CAMERA_PERMISSIONS, ctujVar);
    }

    @Override // defpackage.ctuk
    public final void e(ctuj ctujVar) {
        m(ctuf.CAMERA_VIDEO_PERMISSIONS, ctujVar);
    }

    @Override // defpackage.ctuk
    public final void f(ctuj ctujVar) {
        m(ctuf.LOCATION_PERMISSIONS, ctujVar);
    }

    @Override // defpackage.ctuk
    public final void g(ctuj ctujVar) {
        m(ctuf.MINIMUM_REQUIRED_PERMISSIONS, ctujVar);
    }

    @Override // defpackage.ctuk
    public final void h(ctuf ctufVar, ctuj ctujVar) {
        m(ctufVar, ctujVar);
    }

    @Override // defpackage.ctuk
    public final void i(ctuj ctujVar) {
        m(ctuf.RECEIVE_WAP_PUSH_PERMISSIONS, ctujVar);
    }

    @Override // defpackage.ctuk
    public final void j(ctuj ctujVar) {
        m(ctuf.RECORD_AUDIO_PERMISSIONS, ctujVar);
    }

    @Override // defpackage.ctuk
    public final void k(ctuj ctujVar) {
        m(ctuf.STORAGE_PERMISSIONS, ctujVar);
    }

    @Override // defpackage.ctuk
    public final void l(int i) {
        for (ctuf ctufVar : ctuf.values()) {
            if (ctufVar.q == i) {
                for (ctuf ctufVar2 : ctuf.values()) {
                    if (ctufVar2.q == i) {
                        ctum ctumVar = (ctum) this.a.remove(ctufVar2);
                        if (ctumVar == null) {
                            return;
                        }
                        String[] strArr = (String[]) ctug.t.get(ctufVar2);
                        if (strArr != null && this.d.a(strArr)) {
                            ctumVar.b();
                            return;
                        }
                        if (this.c.a() - this.g >= 250) {
                            ctumVar.a();
                            return;
                        }
                        ctumVar.a.b();
                        ctuj ctujVar = ctumVar.a;
                        boolean e = ctujVar.e();
                        ctujVar.a();
                        if (e) {
                            ctid.d(this.e.a);
                            return;
                        }
                        return;
                    }
                }
                throw new IllegalArgumentException(String.format("Can't find RequestCode for code=%d.", Integer.valueOf(i)));
            }
        }
    }
}
