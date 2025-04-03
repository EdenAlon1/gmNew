package defpackage;

import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gallery.CameraActivity;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gallery.CameraContentItem;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Optional;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcei extends dcej implements dcqd {
    public final CameraActivity a;
    public final ctud b;
    public final ffbr c;
    public final sfy d;
    public final tam e;
    public dclx f;
    public abo g;
    public final dcpc h;
    private final cqoh j;

    public dcei(CameraActivity cameraActivity, cqoh cqohVar, ffbr ffbrVar, ctud ctudVar, Optional optional, tam tamVar, sfy sfyVar) {
        this.a = cameraActivity;
        this.j = cqohVar;
        this.c = ffbrVar;
        this.b = ctudVar;
        this.h = (dcpc) optional.get();
        this.e = tamVar;
        this.d = sfyVar;
    }

    private static dpgr d(epsw epswVar, dpgl dpglVar) {
        int a = epsq.a(epswVar.d);
        if (a == 0) {
            a = 1;
        }
        int i = a - 1;
        int i2 = i != 1 ? i != 2 ? 1 : 2 : 3;
        int a2 = epst.a(epswVar.e);
        if (a2 == 0) {
            a2 = 1;
        }
        int i3 = a2 - 1;
        return new dpgo(dpglVar, i2, i3 != 1 ? i3 != 2 ? 1 : 3 : 2, epswVar.f, null, null);
    }

    public final void a() {
        this.a.finish();
    }

    public final void b() {
        this.a.setResult(-1, new Intent().putExtra("attachment_queue_state_extra_key", ((dbxx) this.a).n));
    }

    @Override // defpackage.dcqd
    public final void c(Uri uri, String str, int i, int i2, long j, epsw epswVar) {
        Intent intent = new Intent();
        if (this.a.getIntent().getBooleanExtra("IS_USING_C2O_CAMERA_GALLERY", false)) {
            intent.putExtra("camera_gallery_item", new CameraContentItem(uri, str, i, i2, j, eohh.FULLSCREEN_CAMERA, TimeUnit.MILLISECONDS.toSeconds(this.j.f().toEpochMilli()), epswVar));
            if (!((Boolean) dcem.b.e()).booleanValue()) {
                intent.putExtra("attachment_queue_state_extra_key", ((dbxx) this.a).n);
            }
        } else {
            int a = epsv.a(epswVar.c);
            if (a == 0) {
                a = 1;
            }
            if (a == 2) {
                drkq drkqVar = drkq.a;
                String uri2 = uri.toString();
                Instant f = this.j.f();
                dpgr d = d(epswVar, dpgl.b);
                uri2.getClass();
                f.getClass();
                intent.putExtra("camera_gallery_item", new drni(drkqVar, uri2, null, null, i, i2, 0L, f, d, 8));
            } else if (a == 3) {
                drmo drmoVar = drmo.a;
                String uri3 = uri.toString();
                Instant f2 = this.j.f();
                dpgr d2 = d(epswVar, dpgl.b);
                Duration ofMillis = Duration.ofMillis(j);
                uri3.getClass();
                f2.getClass();
                ofMillis.getClass();
                intent.putExtra("camera_gallery_item", new drnl(drmoVar, uri3, null, null, i, i2, 0L, f2, d2, ofMillis, 8));
            }
        }
        this.a.setResult(-1, intent);
        a();
    }
}
