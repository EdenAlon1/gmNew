package defpackage;

import android.view.View;
import com.google.android.apps.messaging.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ytj implements ysi {
    private final ffbr b;
    private final ffbr c;
    private final ffbr d;
    private final ffbr e;
    private final dsaq f;
    private final aklh g;

    public ytj(ffbr ffbrVar, ffbr ffbrVar2, aklh aklhVar, ffbr ffbrVar3, ffbr ffbrVar4, ysb ysbVar, cqoh cqohVar) {
        aklhVar.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        cqohVar.getClass();
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.g = aklhVar;
        this.d = ffbrVar3;
        this.e = ffbrVar4;
        this.f = new dsaq(R.drawable.ic_compose_camera_gallery_unselected_v2, new dsap(ysbVar.a(R.color.camera_gallery_shortcut_background), new dszo(R.color.camera_gallery_shortcut_icon_tint)));
    }

    @Override // defpackage.ysi
    public final int a() {
        return R.string.camera_gallery_shortcut_title;
    }

    @Override // defpackage.ysi
    public final dsaq b() {
        return this.f;
    }

    @Override // defpackage.ysi
    public final /* synthetic */ List c() {
        return ffel.a;
    }

    @Override // defpackage.ysi
    @ffbs
    public final void d(View view) {
        if (!((atbo) this.d.b()).a() || !((atbq) this.e.b()).a()) {
            ((xie) this.b.b()).c(xia.a);
            return;
        }
        xpi a = this.g.a(eptm.PLUS_BUTTON, new ffix() { // from class: xpj
            @Override // defpackage.ffix
            public final Object invoke() {
                return ffcu.a;
            }
        });
        if (a.h()) {
            ((dsqt) this.c.b()).b(a);
        } else {
            a.g();
        }
    }

    @Override // defpackage.ysi
    public final boolean e() {
        return true;
    }
}
