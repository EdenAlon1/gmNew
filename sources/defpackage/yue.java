package defpackage;

import android.view.View;
import com.google.android.apps.messaging.R;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yue implements ysi {
    private static final enru b = enru.c("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/shortcuts/location/LocationShortcutHandler");
    private final Optional c;
    private final ytq d;
    private final dsaq e;
    private final List f;

    public yue(Optional optional, ytq ytqVar, ysb ysbVar) {
        optional.getClass();
        this.c = optional;
        this.d = ytqVar;
        ((enrr) b.g().h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/shortcuts/location/LocationShortcutHandler", "<init>", 45, "LocationShortcutHandler.kt")).q("Checking to recover location picker result");
        yud yudVar = (yud) ytqVar;
        axol.k(yudVar.b, null, new ytv(yudVar, null), 3);
        this.e = new dsaq(R.drawable.quantum_gm_ic_place_vd_theme_24, new dsap(ysbVar.a(R.color.location_shortcut_background), new dszo(R.color.location_shortcut_icon_tint)));
        this.f = ffdx.b(dqlf.b);
    }

    @Override // defpackage.ysi
    public final int a() {
        return R.string.location_shortcut_title;
    }

    @Override // defpackage.ysi
    public final dsaq b() {
        return this.e;
    }

    @Override // defpackage.ysi
    public final List c() {
        return this.f;
    }

    @Override // defpackage.ysi
    @ffbs
    public final void d(View view) {
        kli a = view != null ? ysj.a(view) : null;
        yud yudVar = (yud) this.d;
        if (((atti) yudVar.i.b()).a() || !((cnpk) yudVar.h.h().c()).a()) {
            axol.k(yudVar.b, null, new yuc(yudVar, a, null), 3);
        } else {
            yudVar.c();
        }
    }

    @Override // defpackage.ysi
    public final boolean e() {
        return this.c.isPresent();
    }
}
